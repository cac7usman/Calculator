package calculator;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Alex on 09.07.2016.
 */
public class CFrame extends JFrame{
    public CFrame()  {
        setTitle("Калькулятор");
        setBounds(100, 100, 520, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        add(new Cpanel());
        setVisible(true);
    }
}
