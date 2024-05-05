package TraverManager;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

public class TravelManagement {

    private JFrame frmTourBooker;
    private JTextField fnametxt;
    private JTextField lnametxt;
    private JTextField addresstxt;
    private JTextField pincodetxt;
    private JTextField phonetxt;
    private JTextField emailtxt;
    private JTextArea noadultcount;
    private JTextArea nochildcount;
    private JTextArea noluguagecount;
    private JRadioButton TransTrain;
    private JRadioButton Transflight;
    private JRadioButton TransBus;
    private JRadioButton TransVan;
    private JCheckBox ExtKit;
    private JCheckBox ExtSecurity;
    private JCheckBox Extcare;
    private JTextArea Outputted;

    private final double TRAIN_ADULT_PRICE = 150;
    private final double TRAIN_CHILD_PRICE = 130;
    private final double FLIGHT_ADULT_PRICE = 5000;
    private final double FLIGHT_CHILD_PRICE = 3000;
    private final double BUS_ADULT_PRICE = 450;
    private final double BUS_CHILD_PRICE = 350;
    private final double VAN_ADULT_PRICE = 650;
    private final double VAN_CHILD_PRICE = 550;
    private final double TOOLKIT_PRICE = 50;
    private final double SECURITY_PRICE = 30;
    private final double CHILDCARE_PRICE = 150;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    TravelManagement window = new TravelManagement();
                    window.frmTourBooker.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the application.
     */
    public TravelManagement() {
        initialize();
    }

    /**
     * Initialize the contents of the frame.
     */
    private void initialize() {
        frmTourBooker = new JFrame();
        frmTourBooker.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\raman\\OneDrive\\Desktop\\coding BCA\\2 semester\\Java\\TransportManagement\\src\\TraverManager\\icon.png"));
        frmTourBooker.setTitle("Tour Booker");
        frmTourBooker.setBackground(new Color(0, 0, 0));
        frmTourBooker.getContentPane().setBackground(new Color(128, 0, 128));
        frmTourBooker.setBounds(100, 100, 1490, 1021);
        frmTourBooker.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frmTourBooker.getContentPane().setLayout(null);

        JPanel Title = new JPanel();
        Title.setBounds(28, 36, 1408, 105);
        Title.setBackground(new Color(0, 255, 64));
        Title.setBorder(new LineBorder(new Color(0, 0, 0), 5));
        frmTourBooker.getContentPane().add(Title);
        Title.setLayout(null);

        JLabel lblNewLabel = new JLabel("Trip Booker");
        lblNewLabel.setBackground(new Color(0, 255, 64));
        lblNewLabel.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 76));
        lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel.setBounds(10, 11, 1388, 83);
        Title.add(lblNewLabel);

        JPanel register = new JPanel();
        register.setBackground(new Color(0, 255, 255));
        register.setBorder(new LineBorder(new Color(0, 0, 0), 3));
        register.setBounds(28, 185, 361, 339);
        frmTourBooker.getContentPane().add(register);
        register.setLayout(null);

        JLabel registration = new JLabel("Registration");
        registration.setHorizontalAlignment(SwingConstants.CENTER);
        registration.setFont(new Font("Tahoma", Font.BOLD, 14));
        registration.setBounds(60, 11, 228, 30);
        register.add(registration);

        JLabel fname = new JLabel("First Name");
        fname.setFont(new Font("Tahoma", Font.BOLD, 15));
        fname.setBounds(23, 67, 96, 14);
        register.add(fname);

        JLabel lname = new JLabel("Last Name");
        lname.setFont(new Font("Tahoma", Font.BOLD, 15));
        lname.setBounds(23, 108, 96, 14);
        register.add(lname);

        JLabel address = new JLabel("Address");
        address.setFont(new Font("Tahoma", Font.BOLD, 15));
        address.setBounds(23, 152, 96, 14);
        register.add(address);

        JLabel pincode = new JLabel("PIN CODE");
        pincode.setFont(new Font("Tahoma", Font.BOLD, 15));
        pincode.setBounds(23, 201, 96, 14);
        register.add(pincode);

        JLabel phone = new JLabel("Phone No");
        phone.setFont(new Font("Tahoma", Font.BOLD, 15));
        phone.setBounds(23, 239, 96, 14);
        register.add(phone);

        JLabel email = new JLabel("Email");
        email.setFont(new Font("Tahoma", Font.BOLD, 15));
        email.setBounds(23, 287, 96, 14);
        register.add(email);

        fnametxt = new JTextField();
        fnametxt.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            }
        });
        fnametxt.setBounds(141, 66, 176, 20);
        register.add(fnametxt);
        fnametxt.setColumns(10);

        lnametxt = new JTextField();
        lnametxt.setColumns(10);
        lnametxt.setBounds(141, 107, 176, 20);
        register.add(lnametxt);

        addresstxt = new JTextField();
        addresstxt.setColumns(10);
        addresstxt.setBounds(141, 151, 176, 20);
        register.add(addresstxt);

        pincodetxt = new JTextField();
        pincodetxt.setColumns(10);
        pincodetxt.setBounds(141, 200, 176, 20);
        register.add(pincodetxt);

        phonetxt = new JTextField();
        phonetxt.setColumns(10);
        phonetxt.setBounds(141, 238, 176, 20);
        register.add(phonetxt);

        emailtxt = new JTextField();
        emailtxt.setColumns(10);
        emailtxt.setBounds(141, 286, 176, 20);
        register.add(emailtxt);

        JPanel Selector = new JPanel();
        Selector.setBackground(new Color(0, 128, 255));
        Selector.setBorder(new LineBorder(new Color(0, 0, 0), 4));
        Selector.setBounds(28, 587, 367, 349);
        frmTourBooker.getContentPane().add(Selector);
        Selector.setLayout(null);

        JLabel Member = new JLabel("Member Detail");
        Member.setHorizontalAlignment(SwingConstants.CENTER);
        Member.setFont(new Font("Tahoma", Font.BOLD, 14));
        Member.setBounds(64, 21, 228, 30);
        Selector.add(Member);

        JLabel noadult = new JLabel("No. of Adults");
        noadult.setFont(new Font("Tahoma", Font.BOLD, 15));
        noadult.setBounds(26, 73, 142, 30);
        Selector.add(noadult);

        JLabel nochild = new JLabel("No. of Children");
        nochild.setFont(new Font("Tahoma", Font.BOLD, 15));
        nochild.setBounds(26, 125, 142, 30);
        Selector.add(nochild);

        JLabel noluguage = new JLabel("No. of Luggage");
        noluguage.setFont(new Font("Tahoma", Font.BOLD, 15));
        noluguage.setBounds(26, 173, 132, 30);
        Selector.add(noluguage);

        JLabel mediccon = new JLabel("Anyone With Medical Condition?");
        mediccon.setFont(new Font("Tahoma", Font.BOLD, 15));
        mediccon.setBounds(26, 227, 298, 30);
        Selector.add(mediccon);

        JRadioButton medyes = new JRadioButton("Yes");
        medyes.setBounds(26, 264, 61, 23);
        Selector.add(medyes);

        JRadioButton medno = new JRadioButton("No");
        medno.setBounds(147, 264, 69, 23);
        Selector.add(medno);

        JPanel Booking = new JPanel();
        Booking.setBackground(new Color(255, 255, 128));
        Booking.setBorder(new LineBorder(new Color(0, 0, 0), 3));
        Booking.setBounds(440, 185, 473, 117);
        frmTourBooker.getContentPane().add(Booking);
        Booking.setLayout(null);

        JLabel Trips = new JLabel("Trips");
        Trips.setFont(new Font("Tahoma", Font.BOLD, 22));
        Trips.setBounds(10, 36, 74, 26);
        Booking.add(Trips);

        JComboBox tripselector = new JComboBox();
        tripselector.setModel(new DefaultComboBoxModel(new String[] {"-Select Trip-", "Yamuna Bank Trip - Rs. 2000", "Tokyo Trip - Rs. 10000", "Ayodhya Trip - Rs. 5000", "Uttrakhand Trip - Rs. 8000", "Kashmir Trip - Rs. 7000", "Wagah Trip - Rs. 3000"}));
        tripselector.setBounds(118, 36, 180, 22);
        Booking.add(tripselector);

        JPanel customize = new JPanel();
        customize.setBackground(new Color(255, 128, 192));
        customize.setBorder(new LineBorder(new Color(0, 0, 0), 3));
        customize.setBounds(452, 383, 473, 349);
        frmTourBooker.getContentPane().add(customize);
        customize.setLayout(null);

        JLabel customtitle = new JLabel("Customize");
        customtitle.setHorizontalAlignment(SwingConstants.CENTER);
        customtitle.setBounds(132, 11, 188, 27);
        customtitle.setFont(new Font("Tahoma", Font.BOLD, 22));
        customize.add(customtitle);

        JLabel Transportopt = new JLabel("Transportation");
        Transportopt.setHorizontalAlignment(SwingConstants.CENTER);
        Transportopt.setFont(new Font("Tahoma", Font.BOLD, 22));
        Transportopt.setBounds(10, 64, 188, 27);
        customize.add(Transportopt);

        TransTrain = new JRadioButton("Train");
        TransTrain.setBounds(46, 108, 81, 23);
        customize.add(TransTrain);

        Transflight = new JRadioButton("Flight");
        Transflight.setBounds(142, 108, 81, 23);
        customize.add(Transflight);

        TransBus = new JRadioButton("Bus");
        TransBus.setBounds(256, 108, 81, 23);
        customize.add(TransBus);

        TransVan = new JRadioButton("Van");
        TransVan.setBounds(343, 108, 81, 23);
        customize.add(TransVan);

        JLabel ExtrServ = new JLabel("Extra Service");
        ExtrServ.setHorizontalAlignment(SwingConstants.CENTER);
        ExtrServ.setFont(new Font("Tahoma", Font.BOLD, 22));
        ExtrServ.setBounds(10, 152, 188, 27);
        customize.add(ExtrServ);

        ExtKit = new JCheckBox("Tour Kit");
        ExtKit.setBounds(60, 186, 81, 23);
        customize.add(ExtKit);

        ExtSecurity = new JCheckBox("Security");
        ExtSecurity.setBounds(181, 186, 81, 23);
        customize.add(ExtSecurity);

        Extcare = new JCheckBox("Child Care");
        Extcare.setBounds(295, 186, 103, 23);
        customize.add(Extcare);

        ButtonGroup transportGroup = new ButtonGroup();
        transportGroup.add(TransTrain);
        transportGroup.add(Transflight);
        transportGroup.add(TransBus);
        transportGroup.add(TransVan);

        ButtonGroup medicalGroup = new ButtonGroup();
        medicalGroup.add(medyes);
        medicalGroup.add(medno);

        noadultcount = new JTextArea();
        noadultcount.setBounds(163, 78, 42, 22);
        Selector.add(noadultcount);

        nochildcount = new JTextArea();
        nochildcount.setBounds(165, 130, 42, 22);
        Selector.add(nochildcount);

        noluguagecount = new JTextArea();
        noluguagecount.setBounds(163, 181, 42, 22);
        Selector.add(noluguagecount);

        JButton Submitbtn = new JButton("Submit ");

        Submitbtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                double totalCost = 0;
                
                String firstName = fnametxt.getText();
                String lastName = lnametxt.getText();
                String address = addresstxt.getText();
                int pinCode = Integer.parseInt(pincodetxt.getText());
                String phone = phonetxt.getText();
                String email = emailtxt.getText();

                String tripSelect = tripselector.getSelectedItem().toString();
                String[] tripInfo = tripSelect.split(" - Rs\\. ");
                double tripCost = Double.parseDouble(tripInfo[1]);

                String transport = "";
                if (TransTrain.isSelected()) {
                    transport = "Train";
                    totalCost += TRAIN_ADULT_PRICE * Integer.parseInt(noadultcount.getText()) +
                            TRAIN_CHILD_PRICE * Integer.parseInt(nochildcount.getText());
                } else if (Transflight.isSelected()) {
                    transport = "Flight";
                    totalCost += FLIGHT_ADULT_PRICE * Integer.parseInt(noadultcount.getText()) +
                            FLIGHT_CHILD_PRICE * Integer.parseInt(nochildcount.getText());
                } else if (TransBus.isSelected()) {
                    transport = "Bus";
                    totalCost += BUS_ADULT_PRICE * Integer.parseInt(noadultcount.getText()) +
                            BUS_CHILD_PRICE * Integer.parseInt(nochildcount.getText());
                } else if (TransVan.isSelected()) {
                    transport = "Van";
                    totalCost += VAN_ADULT_PRICE * Integer.parseInt(noadultcount.getText()) +
                            VAN_CHILD_PRICE * Integer.parseInt(nochildcount.getText());
                }

                double extraCost = 0;
                if (ExtKit.isSelected()) {
                    extraCost += TOOLKIT_PRICE * (Integer.parseInt(noadultcount.getText()) + Integer.parseInt(nochildcount.getText()));
                }
                if (ExtSecurity.isSelected()) {
                    extraCost += SECURITY_PRICE * Integer.parseInt(noluguagecount.getText());
                }
                if (Extcare.isSelected()) {
                    extraCost += CHILDCARE_PRICE * Integer.parseInt(nochildcount.getText());
                }

                int noAdults = Integer.parseInt(noadultcount.getText());
                int noChildren = Integer.parseInt(nochildcount.getText());
                int noLuggage = Integer.parseInt(noluguagecount.getText());
                String medicalOption = medyes.isSelected() ? "Yes" : "No";

                Connection con = null;
                Statement stmt = null;
                try {
                    String url = "jdbc:mysql://localhost:3306/TravelManager";
                    String userName = "root";
                    String password = "root123";

                    con = DriverManager.getConnection(url, userName, password);
                    stmt = con.createStatement();

                    String query = "INSERT INTO Travellog (fname, lname, Address, PIN_Code, Phone, Email, TripSelect, Transport, ExtraCost, No_of_Adult, No_of_Child, NO_of_Luggage, med) VALUES ('" + firstName + "', '" + lastName + "', '" + address + "', " + pinCode + ", '" + phone + "', '" + email + "', '" + tripSelect + "', '" + transport + "', '" + extraCost + "', " + noAdults + ", " + noChildren + ", " + noLuggage + ", '" + medicalOption + "')";

                    stmt.executeUpdate(query);

                    String receipt="Selected Trip: " + tripSelect +
                            "\nName: " + firstName + " " + lastName +
                            "\nAddress: " + address +
                            "\nPin code: " + pinCode +
                            "\nPhone no.: " + phone +
                            "\nEmail: " + email +
                            "\nNo. of adults: " + noAdults +
                            "\nNo. of children: " + noChildren +
                            "\nNo. of luggage: " + noLuggage +
                            "\nAny medical condition: " + medicalOption +
                            "\nCost of selected trip: Rs. " + tripCost +
                            "\nCost of selected transport: Rs. " + totalCost +
                            "\nCost of extra services: Rs. " + extraCost +
                            "\nGrand total: Rs. " + (totalCost+tripCost+extraCost);
                    Outputted.setText(receipt);
                    System.out.println("Data inserted successfully");
                } catch (Exception ex) {
                    ex.printStackTrace();
                } finally {
                    try {
                        if (stmt != null) {
                            stmt.close();
                        }
                        if (con != null) {
                            con.close();
                        }
                    } catch (Exception ex) {
                        ex.printStackTrace();
                    }
                }
            }
        });


        Submitbtn.setBackground(new Color(0, 255, 255));
        Submitbtn.setBounds(109, 267, 89, 23);
        customize.add(Submitbtn);

        JButton ResetBtn = new JButton("Reset");
        ResetBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                fnametxt.setText("");
                lnametxt.setText("");
                addresstxt.setText("");
                pincodetxt.setText("");
                phonetxt.setText("");
                emailtxt.setText("");
                tripselector.setSelectedIndex(0);
                noadultcount.setText("");
                nochildcount.setText("");
                noluguagecount.setText("");
                transportGroup.clearSelection();
                medicalGroup.clearSelection();
                ExtKit.setSelected(false);
                ExtSecurity.setSelected(false);
                Extcare.setSelected(false);

                Outputted.setText("");
            }
        });
        ResetBtn.setBackground(new Color(255, 0, 0));
        ResetBtn.setBounds(231, 267, 89, 23);
        customize.add(ResetBtn);

        JPanel panel = new JPanel();
        panel.setBackground(new Color(255, 128, 64));
        panel.setBorder(new LineBorder(new Color(0, 0, 0), 4, true));
        panel.setBounds(962, 184, 502, 752);
        frmTourBooker.getContentPane().add(panel);
        panel.setLayout(null);

        JLabel Recipt = new JLabel("Receipt");
        Recipt.setHorizontalAlignment(SwingConstants.CENTER);
        Recipt.setFont(new Font("Tahoma", Font.BOLD, 29));
        Recipt.setBounds(159, 11, 185, 41);
        panel.add(Recipt);

        JButton Paybtn = new JButton("Pay Now");
        Paybtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                payTravel paymentWindow = new payTravel();
                paymentWindow.frame.setVisible(true);
            }
        });
        Paybtn.setFont(new Font("Tahoma", Font.PLAIN, 13));
        Paybtn.setBackground(new Color(0, 255, 0));
        Paybtn.setBounds(99, 681, 89, 23);
        panel.add(Paybtn);

        JButton Cancelbtn = new JButton("Cancel");
        Cancelbtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        Cancelbtn.setFont(new Font("Tahoma", Font.PLAIN, 13));
        Cancelbtn.setBackground(new Color(255, 0, 0));
        Cancelbtn.setBounds(326, 681, 89, 23);
        panel.add(Cancelbtn);
        
        Outputted = new JTextArea();
        Outputted.setBounds(58, 93, 414, 556);
        panel.add(Outputted);

        ResetBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                fnametxt.setText("");
                lnametxt.setText("");
                addresstxt.setText("");
                pincodetxt.setText("");
                phonetxt.setText("");
                emailtxt.setText("");
                tripselector.setSelectedIndex(0);
                noadultcount.setText("");
                nochildcount.setText("");
                noluguagecount.setText("");
                transportGroup.clearSelection();
                medicalGroup.clearSelection();
                ExtKit.setSelected(false);
                ExtSecurity.setSelected(false);
                Extcare.setSelected(false);
                Outputted.setText("");
            }
        });
    }
}
