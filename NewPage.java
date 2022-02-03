//import required classes and packages
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

//create NewPage class to create a new page on which user will navigate
class View extends JFrame implements ActionListener
{
    JButton b1;
    JButton b2;
    JLabel

    View()
    {
    b1 = new JButton("");

    }
}

class NewPage{
    public static void main(String arg[]) {
        try {
            View menu = new View();

            View.setVisible(true);
            View.setSize(800, 300);
        }
    }
}
