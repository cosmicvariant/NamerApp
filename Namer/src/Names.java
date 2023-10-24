import javax.swing.*;

public class Names extends JFrame
{

    public static void main(String [] args)
    {
        new Names();
    }

    private JButton buttonOK;
    private JTextField textName;

    public Names()
    {
        this.setSize(325,100);
        this.setTitle("What is your name?");
        this.setDefaultCloseOperation(
                JFrame.EXIT_ON_CLOSE);

        JPanel panel1 = new JPanel();

        panel1.add(new JLabel("Enter your name: "));

        textName = new JTextField(15);
        panel1.add(textName);

        buttonOK = new JButton("OK");
        buttonOK.addActionListener(e -> buttonOKClick() );
        panel1.add(buttonOK);

        this.add(panel1);

        this.setVisible(true);
    }

    public void buttonOKClick()
    {
        String name = textName.getText();
        if (name.length() == 0)
        {
            JOptionPane.showMessageDialog(
                    Names.this,
                    "please enter name!",
                    "Name Required",
                    JOptionPane.INFORMATION_MESSAGE);
        }
        else
        {
            JOptionPane.showMessageDialog(
                    Names.this,
                    "Hello " + name,
                    "Salutations",
                    JOptionPane.INFORMATION_MESSAGE);
        }
        textName.requestFocus();
    }
}
