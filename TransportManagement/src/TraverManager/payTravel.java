package TraverManager;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class payTravel {

    JFrame frame;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    payTravel window = new payTravel();
                    window.frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the application.
     */
    public payTravel() {
        initialize();
    }

    /**
     * Initialize the contents of the frame.
     */
    private void initialize() {
        frame = new JFrame();
        frame.getContentPane().setBackground(new Color(255, 255, 0));
        frame.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\raman\\OneDrive\\Desktop\\coding BCA\\2 semester\\Java\\TransportManagement\\src\\TraverManager\\icon.png"));
        frame.setBounds(100, 100, 996, 916);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);

        JLabel lblNewLabel = new JLabel("Scan & Pay");
        lblNewLabel.setBackground(new Color(0, 64, 128));
        lblNewLabel.setBounds(282, 22, 304, 52);
        lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 28));
        frame.getContentPane().add(lblNewLabel);

        JLabel lblNewLabel_1 = new JLabel("");
        lblNewLabel_1.setIcon(new ImageIcon(payTravel.class.getResource("/Images/pay.jpg")));
        lblNewLabel_1.setBounds(144, 85, 636, 605);
        frame.getContentPane().add(lblNewLabel_1);

        JButton Conform = new JButton("Conform");
        Conform.setBackground(new Color(0, 255, 64));
        Conform.setFont(new Font("Times New Roman", Font.BOLD, 23));
        Conform.setBounds(342, 748, 261, 52);
        Conform.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int option = JOptionPane.showConfirmDialog(frame, "Have you done the payment?", "Payment Confirmation", JOptionPane.YES_NO_OPTION);
                if (option == JOptionPane.YES_OPTION) {
                    JOptionPane.showMessageDialog(frame, "Payment Successful!");
                    frame.dispose();
                } else {
                    JOptionPane.showMessageDialog(frame, "Please complete the payment process.");
                }
            }
        });
        frame.getContentPane().add(Conform);
    }
}
