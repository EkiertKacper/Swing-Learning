import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {
    public MyFrame() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//Zamkniecie okna powoduje zamkniecie programu. Domyślnie jest "HIDE_ON_CLOSE".
        setTitle("Nazwa okna");//Ustawia nazwę okna

        setResizable(false);//Uniemożliwienie zmiany rozmiaru okna.
        setSize(500,500);//Ustawienie rozmiaru okna w px.

        Color c = new Color(211,211,211);//Nowy obiekt klasy Color.
        getContentPane().setBackground(c);//Ustawienie koloru okna. Można użyć również zapisu: "Color.black", lub "new Color(r,g,b)", lub "new Color(0x123456)" - hex.

        ImageIcon icon = new ImageIcon("src/icon.png");//Obiekt klasy ImageIcon zawierający ścieżkę obrazu.
        setIconImage(icon.getImage());//Ustawienie ikony.

        setVisible(true);//Ustawienie widzialności okna.
    }
}
