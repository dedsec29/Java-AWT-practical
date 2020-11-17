import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class address extends JFrame implements ActionListener {

    private Container c;
    private JLabel title;
    private JLabel name;
    private JTextField tname;
    private JLabel flat_no;
    private JTextField tflat_no;
    private JLabel building_name;
    private JTextField tbuilding_name;
    private JLabel street;
    private JTextField tstreet;
    private JLabel city;
    private JTextField tcity;
    private JLabel pincode;
    private JTextField tpincode;
    private JLabel phone_no;
    private JTextField tphone_no;
    private JButton Proceed;
    private JButton reset;
    //private JLabel res;

    public address() {
        setTitle("Details");
        setBounds(300, 90, 600, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(true);
        c = getContentPane();
        c.setLayout(null);

        title = new JLabel("Details");
        title.setFont(new Font("Times New Roman", Font.PLAIN, 30));
        title.setSize(300, 30);
        title.setLocation(250, 30);
        c.add(title);

        name = new JLabel("Name");
        name.setFont(new Font("Times New Roman", Font.PLAIN, 15));
        name.setSize(100, 20);
        name.setLocation(100, 100);
        c.add(name);
        tname = new JTextField();
        tname.setFont(new Font("Times New Roman", Font.PLAIN, 15));
        tname.setSize(190, 20);
        tname.setLocation(200, 100);
        c.add(tname);

        flat_no = new JLabel("Flat_no");
        flat_no.setFont(new Font("Times New Roman", Font.PLAIN, 15));
        flat_no.setSize(100, 20);
        flat_no.setLocation(100, 150);
        c.add(flat_no);
        tflat_no = new JTextField();
        tflat_no.setFont(new Font("Times New Roman", Font.PLAIN, 15));
        tflat_no.setSize(150, 20);
        tflat_no.setLocation(200, 150);
        c.add(tflat_no);

        building_name = new JLabel("Building name");
        building_name.setFont(new Font("Times New Roman", Font.PLAIN, 15));
        building_name.setSize(100, 20);
        building_name.setLocation(100, 200);
        c.add(building_name);
        tbuilding_name = new JTextField();
        tbuilding_name.setFont(new Font("Times New Roman", Font.PLAIN, 15));
        tbuilding_name.setSize(150, 20);
        tbuilding_name.setLocation(200, 200);
        c.add(tbuilding_name);

        street = new JLabel("Street");
        street.setFont(new Font("Times New Roman", Font.PLAIN, 15));
        street.setSize(100, 20);
        street.setLocation(100, 250);
        c.add(street);
        tstreet = new JTextField();
        tstreet.setFont(new Font("Times New Roman", Font.PLAIN, 15));
        tstreet.setSize(150, 20);
        tstreet.setLocation(200, 250);
        c.add(tstreet);

        city = new JLabel("City");
        city.setFont(new Font("Times New Roman", Font.PLAIN, 15));
        city.setSize(100, 20);
        city.setLocation(100, 300);
        c.add(city);
        tcity = new JTextField();
        tcity.setFont(new Font("Times New Roman", Font.PLAIN, 15));
        tcity.setSize(150, 20);
        tcity.setLocation(200, 300);
        c.add(tcity);

        pincode = new JLabel("Pincode");
        pincode.setFont(new Font("Times New Roman", Font.PLAIN, 15));
        pincode.setSize(100, 20);
        pincode.setLocation(100, 350);
        c.add(pincode);
        tpincode = new JTextField();
        tpincode.setFont(new Font("Times New Roman", Font.PLAIN, 15));
        tpincode.setSize(100, 20);
        tpincode.setLocation(200, 350);
        c.add(tpincode);

        phone_no = new JLabel("Phone No");
        phone_no.setFont(new Font("Times New Roman", Font.PLAIN, 15));
        phone_no.setSize(100, 20);
        phone_no.setLocation(100, 400);
        c.add(phone_no);
        tphone_no = new JTextField();
        tphone_no.setFont(new Font("Times New Roman", Font.PLAIN, 15));
        tphone_no.setSize(150, 20);
        tphone_no.setLocation(200, 400);
        c.add(tphone_no);

        Proceed = new JButton("Proceed");
        Proceed.setFont(new Font("Times New Roman", Font.PLAIN, 15));
        Proceed.setSize(100, 20);
        Proceed.setLocation(150, 450);
        Proceed.addActionListener(this);
        c.add(Proceed);
        reset = new JButton("Reset");
        reset.setFont(new Font("Times New Roman", Font.PLAIN, 15));
        reset.setSize(100, 20);
        reset.setLocation(270, 450);
        reset.addActionListener(this);
        c.add(reset);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == Proceed) {
            if((tname.getText().isEmpty())||(tstreet.getText().isEmpty())||(tcity.getText().isEmpty())||(tpincode.getText().isEmpty())||(tphone_no.getText().isEmpty())||(tflat_no.getText().isEmpty())||(tbuilding_name.getText().isEmpty())){

                JOptionPane.showMessageDialog(c, "Enter all details");
            }
            else{
                dispose();
                //next frame
            }
        }
        if (e.getSource() == reset) {
            String def = "";
            tname.setText(def);
            tflat_no.setText(def);
            tbuilding_name.setText(def);
            tstreet.setText(def);
            tcity.setText(def);
            tpincode.setText(def);
            tphone_no.setText(def);

        }
    }
}

class Details {

    public static void main(String[] args) throws Exception {
        address f = new address();
    }
}