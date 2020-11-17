import java.util.HashMap;
import javax.swing.JOptionPane;

public class login extends javax.swing.JFrame {
    static HashMap<String, String> userRecords = new HashMap<String, String>();

    public login() {
        userRecords.put("admin", "abc123");
        userRecords.put("admin1", "xyz123");
        userRecords.put("admin2", "apple123");
        initComponents();
    }

    private void initComponents() {
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        userF = new javax.swing.JTextField();
        passwordF = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(97, 212, 195));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 48)); // NOI18N
        jLabel1.setText("Pizza Hub");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(240, 30, 155, 75);

        jLabel2.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        jLabel2.setText("Tastiest Pizzas of all!");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(310, 90, 175, 35);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(null);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel4.setText("Username");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(136, 59, 80, 22);
        jPanel2.add(userF);
        userF.setBounds(265, 58, 110, 27);
        jPanel2.add(passwordF);
        passwordF.setBounds(265, 111, 110, 27);

        jLabel3.setFont(new java.awt.Font("Leelawadee UI", 0, 18)); // NOI18N
        jLabel3.setText("Login to Order Now!");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(123, 0, 215, 41);

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel5.setText("Password");
        jPanel2.add(jLabel5);
        jLabel5.setBounds(136, 115, 56, 17);

        jButton1.setText("Login");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1);
        jButton1.setBounds(242, 169, 78, 30);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 642, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 279, Short.MAX_VALUE))
        );
        pack();
    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
        String username  = userF.getText();
        String pass = new String(passwordF.getPassword());
        boolean giveAccess = userRecords.containsKey(username);
        if (giveAccess && pass.equals(userRecords.get(username))) {
            JOptionPane.showMessageDialog(null, "Login successful");
            menu a = new menu();
            a.setVisible(true);
            this.dispose();
        }
        else {
            JOptionPane.showMessageDialog(null, "Invalid credentials");
        }
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login().setVisible(true);
            }
        });
    }

    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField passwordF;
    private javax.swing.JTextField userF;
}