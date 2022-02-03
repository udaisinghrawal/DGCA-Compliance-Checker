//import required classes and packages
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//create NewPage class to create a new page on which user will navigate
class View extends JFrame implements ActionListener {
    JButton b1, b2;
    JLabel  l1;
    final JTextField t1;

    View()
    {
        b1 = new JButton("Access list of pilots");
        b2 = null;
        l1 = null;
        t1 = null;

        b1.addActionListener(this);
        setTitle("Menu");
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        pilotlist page = new pilotlist();

    }
}

class NewPage{
    public static void main(String arg[]) {
        try {
            View menu = new View();

        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }}