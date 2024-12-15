
package utils;

import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class XImage {

    public static Image getAppicon(String icon) {
        URL url = XImage.class.getResource("/QLNhaHang-G3/src/icon/");
        return new ImageIcon(url).getImage();
        /*
            public URL getResource(String resourceName)
            ImageIcon(URL location): Tạo ImageIcon từ URL đã cho.
            Image getImage(): Trả về hình ảnh của icon này
        */
    }

    public static void save(File src) {

        File dst = new File("images", src.getName());
        if (!dst.getParentFile().exists()) {
            dst.getParentFile().mkdirs(); // Tạo thư mục logos nếu chưa tồn tại
        }
        try {
            Path from = Paths.get(src.getAbsolutePath());
            Path to = Paths.get(dst.getAbsolutePath());
            /*
                System.out.println("src" + src.getAbsolutePath());
                System.out.println("dst" + dst.getAbsolutePath());
            */
            Files.copy(from, to, StandardCopyOption.REPLACE_EXISTING); // Copy file vào thư mục logos
        } catch (Exception ex) {
            System.out.println("Lỗi saveImage: " + ex);
        }
    }

    public static ImageIcon read(JLabel lblImage, String pathImg, String file) {
        File path = new File(file, pathImg);
        Image img = new ImageIcon(path.getAbsolutePath()).getImage();
        return new ImageIcon(img.getScaledInstance(lblImage.getWidth(), lblImage.getHeight(), Image.SCALE_SMOOTH));  
    }
    
    public static ImageIcon readImage(JLabel lblImage, String pathImg) {
        return read(lblImage, pathImg, "images");
    }
    
    public static ImageIcon readIcon(JLabel lblImage, String pathImg) {
        return read(lblImage, pathImg, "src/icon");
    }
    
    public static void setHinh(String hinh, JLabel lbl) {
        // Hiển thị hình và ghi tên hình vào tooltip của Label chứa hình
        if (hinh != null) {
            lbl.setText("");
            lbl.setToolTipText(hinh);
            lbl.setIcon(XImage.readImage(lbl, hinh));
        } else {
            lbl.setText("Chưa có hình");
        }
    }
    
    public static void setIcon(String hinh, JLabel lbl) {
        // Hiển thị hình và ghi tên hình vào tooltip của Label chứa hình
        if (hinh != null) {
            lbl.setText("");
            lbl.setToolTipText(hinh);
            lbl.setIcon(XImage.readIcon(lbl, hinh));
        } else {
            lbl.setText("Chưa có hình");
        }
    }
}
