package ru.geekbrains.lesson8;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Window extends JFrame {
    public  Window() {
        JFrame frame = new JFrame("Текстовый редактор");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 600);

        JMenuBar mb = new JMenuBar();
        JMenu m1 = new JMenu("Файл");
        JMenu m2 = new JMenu("Сравка");
        mb.add(m1);
        mb.add(m2);
        JMenuItem m11 = new JMenuItem("Открыть");
        JMenuItem m12 = new JMenuItem("Сохранить как");
        JMenuItem m13 = new JMenuItem("Выход");
        JMenuItem m21 = new JMenuItem("Помощь");
        m1.add(m11);
        m1.add(m12);
        m1.add(m13);
        m2.add(m21);

        m13.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        m21.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame helpFrame = new JFrame("Помощь");
                //helpFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                helpFrame.setSize(300, 300);
                helpFrame.setVisible(true);

            }
        });

        JPanel panel = new JPanel();
        JLabel label = new JLabel("Поиск");
        JTextField tf = new JTextField(10);
        JButton send = new JButton("Найти");
        JButton reset = new JButton("Удалить");
        panel.add(label);
        panel.add(tf);
        panel.add(send);
        panel.add(reset);

        JTextArea ta = new JTextArea();

        frame.getContentPane().add(BorderLayout.SOUTH, panel);
        frame.getContentPane().add(BorderLayout.NORTH, mb);
        frame.getContentPane().add(BorderLayout.CENTER, ta);
        frame.setVisible(true);
    }
}
