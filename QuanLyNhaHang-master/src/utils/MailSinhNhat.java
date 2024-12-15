package utils;

import dao.KhachHangDAO;
import dao.NhanVienDAO;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.JOptionPane;
import model.KhachHang;
import model.NhanVien;

public class MailSinhNhat {

    public static String a = "eaut2008@eaut.edu.vn";
    public static String b = "Babyshark";
    public static String c = "Nhà Hàng Nollowa Kính Chào Quý Khách!";
    public static KhachHangDAO khDAO = new KhachHangDAO();
    Date date = new Date();
    private static List<KhachHang> list = khDAO.selectAll();

    public static void gui() {

        Date date = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM");
//        String ngaysinh = formatter.format(date);
//        String ngaysinh2 = formatter.format(ngaysinh1);
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getNgaySinh().getMonth() + 1 == XDate.getNgayThangNam(XDate.minusMonth(date, 3))[1]) { 
            //+ date.getDate() +(31 * 24 * 60 * 60 * 1000)                           
                System.out.println(list.get(i).getHoTenKH());
                send(list.get(i).getEmail(),
                        String.valueOf(list.get(i).getNgaySinh().getDate() + 3),
                        String.valueOf(list.get(i).getNgaySinh().getMonth() + 1),
                        String.valueOf(list.get(i).getNgaySinh().getDate() - 4),
                        String.valueOf(list.get(i).getNgaySinh().getMonth() + 1));

            }

        }

    }

    public static void send(String mail, String ngsinhtrc, String thangtrc, String ngsinhsau, String thangsau) {

        try {

//          JOptionPane.showMessageDialog( "Mật Khẩu mới cửa bạn đã được gữi qua Email");
            Properties p = new Properties();
            p.put("mail.smtp.auth", "true");
            p.put("mail.smtp.starttls.enable", "true");
            p.put("mail.smtp.host", "smtp.gmail.com");
            p.put("mail.smtp.port", 587);
            String accountName = a;
            String accountPass = b;
            Session s = Session.getInstance(p, new javax.mail.Authenticator() {
                protected PasswordAuthentication getPasswordAuthentication() {
                    return new PasswordAuthentication(accountName, accountPass);
                }
            });

            String to = mail;
            String body = "Sắp đến sinh nhật của hãy đến nhà hàng đẹp và độc nhận được những ưu đãi vô cùng hấp dẫn. "
                    + "Đến Ngày " + ngsinhtrc + "-" + thangtrc + " Từ Ngày " + ngsinhsau + "-" + thangsau;
            Message msg = new MimeMessage(s);
            //Gán giá trị cho các thuộc tính
            msg.setFrom(new InternetAddress(a));
            msg.setRecipients(Message.RecipientType.TO, InternetAddress.parse(to));
            msg.setSubject(c);

            msg.setText(String.valueOf(body));
            //                DoiMatKhau doimk = new DoiMatKhau();
            //                doimk.setVisible(true);
            //                this.dispose();

            //
            Transport.send(msg);
//          JOptionPane.showMessageDialog(this, "bạn nhập sai thông tin vui lòng nhập lại");
            // TODO add your handling code here:
            //JOptionPane.showMessageDialog(null, "Mail was sent successfully", "Message", javax.swing.JOptionPane.INFORMATION_MESSAGE);
        } catch (MessagingException ex) {
            System.out.println("Chưa thiết lập quyền truy cập!!!\nVui lòng thiết lập tại https://www.google.com/settings/security/lesssecureapps v");

        }
    }
}
