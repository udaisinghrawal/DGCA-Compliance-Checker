import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.lang.Exception;

class CreateLoginForm extends JFrame implements ActionListener {
    //initialize button, panel, label, and text field
    JButton b1;
    JPanel newPanel;
    JLabel userLabel, passLabel;
    final JTextField  textField1, textField2;

    //calling constructor
    CreateLoginForm() {

        //create label for username
        userLabel = new JLabel();
        userLabel.setText("Username");
        userLabel.setPreferredSize(new Dimension(200, 50));

        //create text field to get username from the user
        textField1 = new JTextField(15);
        textField1.setPreferredSize(new Dimension(200, 50));

        //create label for password
        passLabel = new JLabel();
        passLabel.setText("Password");
        passLabel.setPreferredSize(new Dimension(200, 50));

        //create text field to get password from the user
        textField2 = new JPasswordField(15);
        textField2.setPreferredSize(new Dimension(200, 50));

        //create submit button
        b1 = new JButton("SUBMIT");


        //create panel to put form elements
        newPanel = new JPanel(new GridLayout(3, 1));
        newPanel.add(userLabel);
        newPanel.add(textField1);
        newPanel.add(passLabel);
        newPanel.add(textField2);
        newPanel.add(b1);

        //set border to panel
        add(newPanel, BorderLayout.CENTER);

        //perform action on button click
        b1.addActionListener(this);
        setTitle("LOGIN FORM");
    }

    //define abstract method actionPerformed() which will be called on button click
    public void actionPerformed(ActionEvent ae) {
        String userValue = textField1.getText();        //get user entered username from the textField1
        String passValue = textField2.getText();        //get user entered password from the textField2

        //check whether the credentials are authentic or not
        if (userValue.equals("admin") && passValue.equals("password")) {  //if authentic, navigate user to a new page

            //create instance of the NewPage
            NewPage page = new NewPage();

            //make page visible to the user
        }
        else{
            //show error message
            System.out.println("Please enter valid username and password");
            JOptionPane.showMessageDialog(newPanel, "Please enter valid username and password", "Invalid Input", JOptionPane.ERROR_MESSAGE);
        }
    }
}
//create the main class
class LoginFormDemo {
    //main() method start
    public static void main(String arg[])
    {
        try
        {
            //create instance of the CreateLoginForm
            CreateLoginForm form = new CreateLoginForm();
            form.setSize(800,300);  //set size of the frame
            form.setVisible(true);  //make form visible to the user
            form.setLayout(new FlowLayout());
            form.pack();
        }
        catch(Exception e)
        {
            //handle exception
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
}

