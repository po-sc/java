import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class GUI_Position {
    public GUI_Position() {
        JFrame frame = new JFrame();
        frame.setFont(new Font("Arial", Font.BOLD, 14));
        frame.setLayout(new BorderLayout());
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setSize(500, 300);

        JLabel b1 = new JLabel("NORTH", JLabel.CENTER);
        b1.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        frame.add(b1, BorderLayout.NORTH);
        b1.setToolTipText("Добро пожаловать в");
        b1.addMouseListener(new CustomMouseListener("Добро пожаловать в"));

        JLabel b2 = new JLabel("SOUTH", JLabel.CENTER);
        b2.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        frame.add(b2, BorderLayout.SOUTH);
        b2.setToolTipText("Добро пожаловать Абха");
        b2.addMouseListener(new CustomMouseListener("Добро пожаловать Абха"));

        JLabel b3 = new JLabel("EAST", JLabel.CENTER);
        b3.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        frame.add(b3, BorderLayout.EAST);
        b3.setToolTipText("Добро пожаловать в Дахране");
        b3.addMouseListener(new CustomMouseListener("Добро пожаловать в Дахране"));

        JLabel b4 = new JLabel("CENTER", JLabel.CENTER);
        b4.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        frame.add(b4, BorderLayout.CENTER);
        b4.setToolTipText("Добро пожаловать в");
        b4.addMouseListener(new CustomMouseListener("Добро пожаловать в"));

        JLabel b5 = new JLabel("WEST", JLabel.CENTER);
        b5.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        frame.add(b5, BorderLayout.WEST);
        b5.setToolTipText("Добро пожаловать в Джидда");
        b5.addMouseListener(new CustomMouseListener("Добро пожаловать в Джидда"));

        frame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new GUI_Position());
    }

    // Создаем собственный слушатель мыши
    static class CustomMouseListener extends MouseAdapter {
        private String message;

        public CustomMouseListener(String message) {
            this.message = message;
        }

        @Override
        public void mouseEntered(MouseEvent e) {
            JOptionPane.showMessageDialog(null, message);
        }
    }
}
