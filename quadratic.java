import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class quadratic {
    private JPanel panel1;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JButton button1;
    private JTextArea textArea1;
    private JPanel panel2;
    private JPanel panel3;


    public quadratic() {
        textArea1.setLineWrap(true);
        textArea1.setWrapStyleWord(true);
        panel3.setPreferredSize(new Dimension(100, 85));
        panel2.setPreferredSize(new Dimension(300, 85));
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                try {
                    double a = Double.parseDouble(textField1.getText());
                    double b = Double.parseDouble(textField2.getText());
                    double c = Double.parseDouble(textField3.getText());

                    double d = (b * b - 4 * a * c);
                    double re = -b / (2 * a);
                    if (d >= 0) {  // i.e. "if roots are real"
                        textArea1.setText("The roots of "
                                + (textField1.getText().equals("0")? "":(textField1.getText().equals("1")? "x\u00b2":textField1.getText() + "x\u00b2"))
                                + (textField2.getText().equals("0")? "":" + " + (textField2.getText().equals("1")? "x":textField2.getText() + "x"))
                                + (textField3.getText().equals("0")? "":" + " + textField1.getText())
                                + " are:\n("+(Math.sqrt(d) / (2 * a) + re)
                                + ", 0) and ("
                                + (-Math.sqrt(d) / (2 * a) + re) + ", 0)");
                    } else {
                        textArea1.setText("The roots of "
                                + (textField1.getText().equals("0")? "":(textField1.getText().equals("1")? "x\u00b2":textField1.getText() + "x\u00b2"))
                                + (textField2.getText().equals("0")? "":" + " + (textField2.getText().equals("1")? "x":textField2.getText() + "x"))
                                + (textField3.getText().equals("0")? "":" + " + textField1.getText())
                                + " are:\n(" + (re + " + " + (Math.sqrt(-d) / (2 * a))
                                + "i") + ", 0) and (" + (re + " - " + (Math.sqrt(-d) / (2 * a)) + "i") + ", 0)");
                    }
                } catch (Exception ex) {
                    //ex.printStackTrace();
                    textArea1.setText("Invalid input!");
                }

            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("quadratic");
        frame.setContentPane(new quadratic().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
