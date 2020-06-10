package ru.geekbrains.lesson8;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Window extends JFrame {
    public  Window() {
        JFrame frame = new JFrame("Текстовый редактор");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(500, 100, 400, 400);
        frame.setSize(800, 800);

        JMenuBar mainMenuBar = new JMenuBar();
        JMenu fileMenu = new JMenu("Файл");
        JMenu refMenu = new JMenu("Сравка");
        mainMenuBar.add(fileMenu);
        mainMenuBar.add(refMenu);
        JMenuItem fm1 = new JMenuItem("Открыть");
        JMenuItem fm2 = new JMenuItem("Сохранить как");
        JMenuItem fm3 = new JMenuItem("Выход");
        JMenuItem rm1 = new JMenuItem("Помощь");
        fileMenu.add(fm1);
        fileMenu.add(fm2);
        fileMenu.add(fm3);
        refMenu.add(rm1);

        fm3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        rm1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame helpFrame = new JFrame("Помощь");
                //helpFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                helpFrame.setBounds(750, 350, 400, 400);
                helpFrame.setSize(300, 300);
                helpFrame.setVisible(true);

            }
        });

        JPanel panel = new JPanel();
        JLabel label = new JLabel("Поиск");
        JTextField tf = new JTextField(10);
        JButton search = new JButton("Найти");
        JButton replace = new JButton("Заменить");
        panel.add(label);
        panel.add(tf);
        panel.add(search);
        panel.add(replace);

        JTextArea ta = new JTextArea();

        frame.getContentPane().add(BorderLayout.SOUTH, panel);
        frame.getContentPane().add(BorderLayout.NORTH, mainMenuBar);
        frame.getContentPane().add(BorderLayout.CENTER, ta);
        frame.setVisible(true);
    }
}
