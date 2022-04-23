package Lesson8.Iliya;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyWindow extends JFrame {
    public void init() {
        setVisible(true);
        setTitle("Test window");
        setSize(500, 500);
        setLocation(650, 250);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        GridLayout layout = new GridLayout(1, 2);
        JPanel panel = new JPanel(layout);

        JButton btn1 = new JButton("Выход");
        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        panel.add(btn1);

        JButton btn2 = new JButton("Кнопка 2");
        panel.add(btn2);

        add(panel, BorderLayout.SOUTH);

    }

}

