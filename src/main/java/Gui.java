import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created with IntelliJ IDEA.
 * User: obyte
 * Date: 31.05.13
 * Time: 1:13
 * To change this template use File | Settings | File Templates.
 */
public class Gui extends JFrame {

    private JLabel L1label;
    private JLabel A1label;
    private JLabel B1label;
    private JLabel L2label;
    private JLabel A2label;
    private JLabel B2label;

    private JTextField L1filed;
    private JTextField A1filed;
    private JTextField B1filed;
    private JTextField L2filed;
    private JTextField A2filed;
    private JTextField B2filed;

    private JButton calcButton;
    private JTextField answerField;
    private JPanel panel;
    private GridBagLayout layout;
    private GridBagConstraints gbc;

    private Processing pr;

    public Gui() {

        setTitle("DeltaE calculator");
        setLocation(200, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 400);
        setGui();
        setVisible(true);

        DigitKeyTyper digitKeyTyper = new DigitKeyTyper();
        L1filed.addKeyListener(digitKeyTyper);
        L2filed.addKeyListener(digitKeyTyper);
        A1filed.addKeyListener(digitKeyTyper);
        A2filed.addKeyListener(digitKeyTyper);
        B1filed.addKeyListener(digitKeyTyper);
        B2filed.addKeyListener(digitKeyTyper);

        answerField.setEditable(false);


        calcButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String l1Text = L1filed.getText();
                String l2Text = L2filed.getText();
                String b1Text = B1filed.getText();
                String b2Text = B2filed.getText();
                String a1Text = A1filed.getText();
                String a2Text = A2filed.getText();

                float l1 = Float.parseFloat(l1Text);
                float a1 = Float.parseFloat(a1Text);
                float b1 = Float.parseFloat(b1Text);
                float l2 = Float.parseFloat(l2Text);
                float a2 = Float.parseFloat(a2Text);
                float b2 = Float.parseFloat(b2Text);

                pr = new Processing(l1, a1, b1, l2, a2, b2);
                double dE = pr.calculateDe();

                answerField.setText(Double.toString(dE));
            }
        });
    }

    private void setGui() {
        L1label = new JLabel("L1");
        A1label = new JLabel("A1");
        B1label = new JLabel("B1");
        L2label = new JLabel("L2");
        A2label = new JLabel("A2");
        B2label = new JLabel("B2");
        L1filed = new JTextField(10);
        A1filed = new JTextField(10);
        B1filed = new JTextField(10);
        L2filed = new JTextField(10);
        A2filed = new JTextField(10);
        B2filed = new JTextField(10);
        answerField = new JTextField(15);
        calcButton = new JButton("Calculate");

        panel = new JPanel();
        gbc = new GridBagConstraints();
        layout = new GridBagLayout();

        panel.setLayout(layout);

        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.anchor = GridBagConstraints.CENTER;
        gbc.insets = new Insets(10, 10, 10, 10);
        panel.add(L1label, gbc);

        gbc.gridx++;
        panel.add(L1filed, gbc);

        gbc.gridx++;
        panel.add(A1label, gbc);

        gbc.gridx++;
        panel.add(A1filed, gbc);

        gbc.gridx++;
        panel.add(B1label, gbc);

        gbc.gridx++;
        panel.add(B1filed);


        gbc.gridx = 0;
        gbc.gridy++;
        panel.add(L2label,gbc);

        gbc.gridx++;
        panel.add(L2filed, gbc);

        gbc.gridx++;
        panel.add(A2label, gbc);

        gbc.gridx++;
        panel.add(A2filed, gbc);

        gbc.gridx++;
        panel.add(B2label, gbc);

        gbc.gridx++;
        panel.add(B2filed, gbc);


        /////////////
        gbc.gridx = 0;
        gbc.gridy++;
        panel.add(new JLabel(""),gbc);

        gbc.gridx++;
        panel.add(new JLabel("Delta E"),gbc);

        gbc.gridx++;
        panel.add(new JLabel(""),gbc);

        gbc.gridx++;
        panel.add(answerField,gbc);

        gbc.gridx++;
        panel.add(new JLabel(""),gbc);

        gbc.gridx++;
        panel.add(calcButton,gbc);

        add(panel);
        pack();
        setLocationRelativeTo(null);


    }
}
