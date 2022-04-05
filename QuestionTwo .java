import com.Attu.AttuCount;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class QuestionTwo {
    private JPanel framePanel;
    private JLabel headingLabel;
    private JPanel layoutPanel;
    private JTextField TotaltextField;
    private JTextField PercenttextField;
    private JLabel percentLabel;
    private JLabel TotalLabel;
    private JButton Calbtn;
    private JTextField CommisiontextField;
    private JButton resetButton;
    private JLabel CommisionLabel;
    private JPanel framePanel2;


    public QuestionTwo() {

        Calbtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
             double  GrossSalary, Percent, Total;
             GrossSalary = Double.parseDouble(TotaltextField.getText());
             Percent = Double.parseDouble(PercenttextField.getText()) / 100 * GrossSalary ;
             Total = GrossSalary - (GrossSalary * Percent);
             CommisiontextField.setText(String.valueOf(Total));

                Calbtn.addKeyListener(new KeyAdapter() {
                    public void keyTyped(KeyEvent e) {
                        char c = e.getKeyChar();
                        if (!((c >= '0') && (c <= '9') ||
                                (c == KeyEvent.VK_BACK_SPACE) ||
                                (c == KeyEvent.VK_DELETE))) {
                            //getToolkit().beep();
                            e.consume();

                        }
                    }
                });
            }
        });
//        TotaltextField.addKeyListener(new KeyAdapter() {
//            public void keyTyped(KeyEvent e) {
//                char c = e.getKeyChar();
//                if (!((c >= '0') && (c <= '9') ||
//                        (c == KeyEvent.VK_BACK_SPACE) ||
//                        (c == KeyEvent.VK_DELETE))) {
//                    //getToolkit().beep();
//                    e.consume();
//                }
//            }
//        });
        
        PercenttextField.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                if (!((c >= '0') && (c <= '9') ||
                        (c == KeyEvent.VK_BACK_SPACE) ||
                        (c == KeyEvent.VK_DELETE))) {
                    //getToolkit().beep();
                    e.consume();
                }
            }
        });

        resetButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                TotaltextField.setText("");
                PercenttextField.setText("");
                CommisiontextField.setText("");
                CommisiontextField.requestFocus();
            }
        });
    }

    private Toolkit getToolkit() {
        return null;
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Commission  App");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setContentPane(new QuestionTwo().framePanel);
        frame.setSize(880,550);
        frame.setLocationRelativeTo(null);
        frame.pack();
    }
}


