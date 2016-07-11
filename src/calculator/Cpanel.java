package calculator;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Alex on 09.07.2016.
 */
public class Cpanel extends JPanel {
    private String stringFNumber = "";
    private String stringOperation = "";
    private JTextField display;

    public Cpanel() {
        setLayout(null);
        display = new JTextField();
        display.setBounds(10, 10, 200, 20);
        display.setEditable(false);
        add(display);

        JPanel panelNumbers = new JPanel();
        panelNumbers.setBounds(10, 40, 300, 300);
        panelNumbers.setLayout(new GridLayout(4, 3, 5, 5));
        String[] stringNum = {"7", "8", "9", "4", "5", "6", "1", "2", "3", "0",};
        add(panelNumbers);

        ActionNumber actionNumber = new ActionNumber();
        for (int i = 0; i < 10; i++) {
            JButton button = new JButton(stringNum[i]);
            button.addActionListener(actionNumber);
            panelNumbers.add(button);


        }

        JPanel panelOperation = new JPanel();
        panelOperation.setBounds(330,40,100,300);
        panelOperation.setLayout(new GridLayout(5,1, 5, 5));
        String[] stringOp = {"+","-","/","*","="};
        add(panelOperation);
        ActionOperation actionOperation = new ActionOperation();
        for (int i = 0; i < 5; i++)
        {
            JButton button = new JButton(stringOp[i]);
            button.addActionListener(actionOperation);
            panelOperation.add(button);
        }

    }


    private class ActionNumber implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            display.setText(display.getText() + e.getActionCommand());
        }
    }

    private class ActionOperation implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            String s = e.getActionCommand();

            if (s.equals("="))
            {
                int   a = Integer.parseInt(stringFNumber);
                int   b = Integer.parseInt(display.getText());
                char op = stringOperation.charAt(0);
                int res = CalcAPI.FCalc(a, b, op);
                display.setText( "" + res );
            }
            else
            {
                stringFNumber = display.getText();
                stringOperation = s;
                display.setText("");
            }
        }
    }
}
