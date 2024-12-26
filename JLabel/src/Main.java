import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        ImageIcon image = new ImageIcon("src/icon.png");

        JLabel label = new JLabel();//Tworzy label.

        label.setText("Hello World");//Ustawia text labela.
        label.setIcon(image);//Ustawia ikone labela.
        label.setHorizontalTextPosition(JLabel.CENTER);//Ustawia pozycje tekstu wobec obrazka. Możliwości: "JLabel.LEFT", "JLabel.RIGHT", "JLabel.CENTER" - tekst na środku obrazka.
        label.setVerticalTextPosition(JLabel.TOP);//Możliwości: "BOTTOM", "CENTER","TOP".
        label.setForeground(new Color(0, 255, 0));//Ustawia kolor czcionki.
        label.setFont(new Font("sans-serif", Font.PLAIN, 20));//Ustawia czcionkę.
        label.setIconTextGap(100);//Ustawia przerwę miedzy obrazkiem a tekstem.

        label.setBackground(new Color(0, 0, 0));//Ustawia kolor tła
        label.setOpaque(true);//Pokazuje kolor tła

        label.setHorizontalAlignment(JLabel.CENTER);//Ustawia położenie tekstu i obrazka w labelu. jest też Vertical.


        //Poniższy kod zmieni zachowanie labela. Nie bedzie on zajmował jak największej przestrzeni tylko tą ustawioną.
//        frame.setLayout(null);//Zmienia layout
//        label.setBounds(100, 50, label.getPreferredSize().width, label.getPreferredSize().height);//Ustawia pozycję i rozmiar labela.



        Border border = BorderFactory.createLineBorder(new Color(0,255,0), 5);//Tworzy border
        label.setBorder(border);



        Frame frame = new Frame();
        frame.add(label);//Dodaje label do okna.
        frame.pack();//Ustawia rozmiar okna automatycznie
    }
}