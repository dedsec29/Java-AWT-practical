import javax.swing.JOptionPane;

public class menu extends javax.swing.JFrame {
    public menu() {
        initComponents();
    }

    private void initComponents() {
        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        pizza1 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        pizza2 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        pizza3 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        sides1 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        sides2 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        sides3 = new javax.swing.JTextField();
        rbStandard = new javax.swing.JRadioButton();
        rbExpress = new javax.swing.JRadioButton();
        pizzaPrice1 = new javax.swing.JLabel();
        pizzaPrice2 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        pizzaPrice3 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        sidesPrice1 = new javax.swing.JLabel();
        sidesPrice2 = new javax.swing.JLabel();
        sidesPrice3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        naive = new javax.swing.JLabel();
        disc = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        delCharge = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        finalTotal = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(97, 212, 195));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Malgun Gothic Semilight", 0, 48)); // NOI18N
        jLabel1.setText("Menu");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(310, 10, 130, 65);

        jLabel2.setFont(new java.awt.Font("Franklin Gothic Book", 0, 14)); // NOI18N
        jLabel2.setText("Farm Fresh");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(40, 170, 72, 27);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel4.setText("Pizzas");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(27, 81, 86, 34);

        jLabel5.setFont(new java.awt.Font("Franklin Gothic Book", 0, 14)); // NOI18N
        jLabel5.setText("Margherita");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(40, 140, 72, 27);
        jPanel1.add(pizza1);
        pizza1.setBounds(161, 141, 90, 30);

        jLabel6.setText("Qty.");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(184, 124, 31, 13);
        jPanel1.add(pizza2);
        pizza2.setBounds(161, 174, 90, 30);

        jLabel7.setFont(new java.awt.Font("Franklin Gothic Book", 0, 14)); // NOI18N
        jLabel7.setText("Chef's Special");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(40, 210, 100, 27);
        jPanel1.add(pizza3);
        pizza3.setBounds(160, 210, 90, 30);

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel8.setText("Sides");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(27, 265, 86, 34);

        jLabel9.setFont(new java.awt.Font("Franklin Gothic Book", 0, 14)); // NOI18N
        jLabel9.setText("Garlic Bread");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(41, 351, 98, 27);
        jPanel1.add(sides1);
        sides1.setBounds(152, 304, 80, 30);

        jLabel10.setFont(new java.awt.Font("Franklin Gothic Book", 0, 14)); // NOI18N
        jLabel10.setText("Pasta");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(41, 310, 72, 27);
        jPanel1.add(sides2);
        sides2.setBounds(152, 345, 80, 30);

        jLabel11.setFont(new java.awt.Font("Franklin Gothic Book", 0, 14)); // NOI18N
        jLabel11.setText("Waffle");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(40, 390, 98, 27);
        jPanel1.add(sides3);
        sides3.setBounds(152, 388, 80, 30);

        buttonGroup1.add(rbStandard);
        rbStandard.setText("Standard Delivery (Guaranteed under 1 hour delivery)");
        jPanel1.add(rbStandard);
        rbStandard.setBounds(430, 140, 330, 21);

        buttonGroup1.add(rbExpress);
        rbExpress.setText("Express Deliery (Guaranteed under 30 min delivery)");
        jPanel1.add(rbExpress);
        rbExpress.setBounds(430, 180, 330, 21);

        pizzaPrice1.setText("159");
        jPanel1.add(pizzaPrice1);
        pizzaPrice1.setBounds(273, 143, 36, 13);

        pizzaPrice2.setText("229");
        jPanel1.add(pizzaPrice2);
        pizzaPrice2.setBounds(273, 170, 36, 27);

        jLabel14.setText("Price per qty (rs)");
        jPanel1.add(jLabel14);
        jLabel14.setBounds(250, 124, 90, 13);

        pizzaPrice3.setText("359");
        jPanel1.add(pizzaPrice3);
        pizzaPrice3.setBounds(273, 211, 36, 13);

        jLabel16.setText("Free");
        jPanel1.add(jLabel16);
        jLabel16.setBounds(390, 140, 36, 13);

        jLabel17.setText("+Rs 70 ");
        jPanel1.add(jLabel17);
        jLabel17.setBounds(380, 180, 50, 13);

        sidesPrice1.setText("99");
        jPanel1.add(sidesPrice1);
        sidesPrice1.setBounds(273, 318, 36, 13);

        sidesPrice2.setText("119");
        jPanel1.add(sidesPrice2);
        sidesPrice2.setBounds(273, 357, 36, 17);

        sidesPrice3.setText("109");
        jPanel1.add(sidesPrice3);
        sidesPrice3.setBounds(273, 390, 36, 17);

        jButton1.setText("Calculate Bill");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(120, 470, 130, 21);

        jButton2.setText("Pay Now");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(500, 470, 120, 21);

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));
        jPanel2.setLayout(null);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Total");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(10, 20, 40, 20);

        naive.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        naive.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(naive);
        naive.setBounds(80, 20, 90, 20);

        disc.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        disc.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(disc);
        disc.setBounds(80, 60, 90, 20);

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Discount");
        jPanel2.add(jLabel12);
        jLabel12.setBounds(10, 60, 60, 20);

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Delivery");
        jPanel2.add(jLabel13);
        jLabel13.setBounds(10, 80, 60, 20);

        delCharge.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        delCharge.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(delCharge);
        delCharge.setBounds(80, 80, 120, 20);

        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setText("---------------------------");
        jPanel2.add(jLabel24);
        jLabel24.setBounds(80, 110, 123, 13);

        finalTotal.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        finalTotal.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(finalTotal);
        finalTotal.setBounds(80, 130, 110, 20);

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Final");
        jPanel2.add(jLabel15);
        jLabel15.setBounds(10, 130, 60, 20);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(420, 250, 280, 180);

        jButton3.setText("Reset");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(120, 510, 130, 20);

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel18.setText("15% Discount on all orders above Rs. 1000!");
        jPanel1.add(jLabel18);
        jLabel18.setBounds(420, 230, 300, 17);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 769, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 565, Short.MAX_VALUE)
        );

        pack();
    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
        if (rbExpress.isSelected()==false && rbStandard.isSelected()==false) {
            JOptionPane.showMessageDialog(null, "Select a delivery tpye");
            return;
        }
        int p1,p2,p3,s1,s2,s3; //pizza, sides cost
        int qp1,qp2,qp3,qs1,qs2,qs3; //qty of pizza,sides
        // put error handling here in future
        p1 = Integer.parseInt(pizzaPrice1.getText());
        p2 = Integer.parseInt(pizzaPrice2.getText());
        p3 = Integer.parseInt(pizzaPrice3.getText());
        s1 = Integer.parseInt(sidesPrice1.getText());
        s2 = Integer.parseInt(sidesPrice2.getText());
        s3 = Integer.parseInt(sidesPrice3.getText());
        qp1 = (pizza1.getText().equals(""))?0:Integer.parseInt(pizza1.getText());
        qp2 = (pizza2.getText().equals(""))?0:Integer.parseInt(pizza2.getText());
        qp3 = (pizza3.getText().equals(""))?0:Integer.parseInt(pizza3.getText());
        qs1 = (sides1.getText().equals(""))?0:Integer.parseInt(sides1.getText());
        qs2 = (sides2.getText().equals(""))?0:Integer.parseInt(sides2.getText());
        qs3 = (sides3.getText().equals(""))?0:Integer.parseInt(sides3.getText());
        int sum = p1*qp1+p2*qp2+p3*qp3 + s1*qs1+s2*qs2+s3*qs3;
        int discount=0, delivery=0;
        naive.setText(sum+"");
        if (sum>1000)
            discount = (int) Math.floor(0.15*sum); //round to integer, 15% discount
        disc.setText("-"+discount);
        if (rbExpress.isSelected())
            delivery = 70;
        delCharge.setText("+"+delivery);
        int total = sum - discount + delivery;
        finalTotal.setText("Rs. "+total);
    }

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
        if (finalTotal.getText().equals(""))
            JOptionPane.showMessageDialog(null, "Calculate Bill First");
        else {
            int r = JOptionPane.showConfirmDialog(null, "Your bill is "+finalTotal.getText()+". Do you want to proceed?");
            if (r==0) {
                address a = new address();
                a.setVisible(true);
                this.dispose();
            }
        }
    }

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {
        pizza1.setText("");
        pizza2.setText("");
        pizza3.setText("");
        sides1.setText("");
        sides2.setText("");
        sides3.setText("");
        buttonGroup1.clearSelection();
        naive.setText("");
        disc.setText("");
        delCharge.setText("");
        finalTotal.setText("");
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new menu().setVisible(true);
            }
        });
    }

    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel delCharge;
    private javax.swing.JLabel disc;
    private javax.swing.JLabel finalTotal;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel naive;
    private javax.swing.JTextField pizza1;
    private javax.swing.JTextField pizza2;
    private javax.swing.JTextField pizza3;
    private javax.swing.JLabel pizzaPrice1;
    private javax.swing.JLabel pizzaPrice2;
    private javax.swing.JLabel pizzaPrice3;
    private javax.swing.JRadioButton rbExpress;
    private javax.swing.JRadioButton rbStandard;
    private javax.swing.JTextField sides1;
    private javax.swing.JTextField sides2;
    private javax.swing.JTextField sides3;
    private javax.swing.JLabel sidesPrice1;
    private javax.swing.JLabel sidesPrice2;
    private javax.swing.JLabel sidesPrice3;
}
