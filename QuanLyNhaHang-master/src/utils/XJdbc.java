package utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class XJdbc {
    private static int PORT_NAME = 3307;
    private static Connection connect = null;
    public static Connection getSqlConnection(String user, String pass, String databaseName, int port) {
        String db_url = "";
        
        if (port == PORT_NAME) {
            db_url = "jdbc:mysql://localhost:" + port + "/" + databaseName;
        } else {
            db_url = "jdbc:sqlserver://localhost:" + port + ";databaseName=" + databaseName + ";";
        }

        try {
            closeConnection();
            connect = (Connection) DriverManager.getConnection(db_url, user, pass);
        } catch (SQLException ex) {
//            JOptionPane.showMessageDialog(null, "Lỗi kết nối: " + ex);
            System.out.println("Lỗi kết nối: " + ex);
        }
//        System.out.println(connect);
        return connect;
    }

    public static PreparedStatement getStmt(String sql, Object... args) {
//        Connection connect = getSqlConnection("sa", "Vubc12345", "qlnhahang", 1433);
        if(connect == null) {
            connect = getSqlConnection("root", "", "qlnhahang", PORT_NAME);
        }

        PreparedStatement pstmt = null;
        
        try {
            pstmt = sql.trim().startsWith("{") ? connect.prepareCall(sql) : connect.prepareStatement(sql);
            /* Minh bạch:
                if (sql.trim().startsWith("{")) {
                    pstmt = conn.prepareCall(sql);
                } 
                else {
                    pstmt = conn.prepareStatement(sql);
                } 
             */

            for (int i = 0; i < args.length; i++) {
                pstmt.setObject(i + 1, args[i]);
            }
        } catch (SQLException ex) {
//            JOptionPane.showMessageDialog(null, "Lỗi 'getStmt': " + ex);
            System.out.println("Lỗi 'getStmt': " + ex);
        }
        return pstmt;
    }

    
    public static ResultSet queryData(String sql, Object... args) {
        try {
            PreparedStatement stmt = getStmt(sql, args);
//            System.out.println(stmt);
            return stmt.executeQuery();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Lỗi 'queryData': " + ex);
            System.out.println("Lỗi 'queryData': " + ex);
            throw new RuntimeException(ex);
        }
//        return null;
    }

    public static int updateData(String sql, Object... args) {
        try {
            PreparedStatement stmt = getStmt(sql, args);
//            System.out.println(sql);
//            System.out.println(args[0]);
//            System.out.println(stmt);
            return stmt.executeUpdate();
        } catch (SQLException ex) {
//            JOptionPane.showMessageDialog(null, "Lỗi 'updateData': " + ex);
            System.out.println("Lỗi 'updateData': " + ex);
        }
        return 0;
    }

    public static Object value(String sql, Object... args) throws SQLException {
        ResultSet rs = queryData(sql, args);
        if (rs.next()){
            return rs.getObject(0);
        }
        
        rs.getStatement().getConnection().close();
        return null;
    }
    
    
    public static List<Object[]> valueList(String sql, int numCols, Object... args) {
        try {
            List<Object[]> list = new ArrayList<>();
            ResultSet rs = queryData(sql, args);
            if(rs == null) {
                return null;
            }
            while (rs.next()) {
                Object[] row = new Object[numCols];
                for (int i = 0; i < numCols; i++) {
                    row[i] = rs.getObject(i + 1);
                }
                list.add(row);
            }
            return list;
        } catch (Exception ex) {
//            JOptionPane.showMessageDialog(null, "Lỗi 'updateData': " + ex);
            System.out.println("Lỗi 'value': " + ex);
        }
        return null;
    }
    
    public static void closeConnection() {
         if (connect != null) {
            try {
                connect.close();
            } catch (SQLException ex) {
                System.out.println("Lỗi đóng kết nối: " + ex);
            }
        }
    }
}
