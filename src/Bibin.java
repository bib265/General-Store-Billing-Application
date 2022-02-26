
import java.awt.print.PrinterException;
import java.io.FileWriter;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

    
public class Bibin extends javax.swing.JFrame {

   Statement st, st1, st2, st3;
   int x=0;
   
    public Bibin() 
    {
        initComponents();
         try
        {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            String url="jdbc:oracle:thin:@localhost";
            Connection con=DriverManager.getConnection(url,"System","bibin");
            st=con.createStatement();
            st1=con.createStatement();
            st2=con.createStatement();
            st3=con.createStatement();
        }
        catch(Exception exp)
        {
            exp.printStackTrace();
        }
        PBill1();
    }

private void PBill1()
{
    try
    {
        String sql="select pname from bill";
        
        ResultSet rs=st.executeQuery(sql);
        
        String pname="";
        
        while(rs.next())
        {
           pname=rs.getString(1);
           jComboBox4.addItem(pname);
        }
    }
    catch(Exception exp)
    {
        exp.printStackTrace();
    }
    
}
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        jComboBox3 = new javax.swing.JComboBox<>();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jComboBox4 = new javax.swing.JComboBox<>();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jTextField9 = new javax.swing.JTextField();
        jTextField10 = new javax.swing.JTextField();
        jTextField11 = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        area = new javax.swing.JTextArea();
        prnt = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Bill No. :");

        jLabel2.setText("Date :");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("                  BILL ENTRY");

        jLabel4.setText("Customer Name :");

        jLabel5.setText("Customer Address :");

        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField1KeyReleased(evt);
            }
        });

        jComboBox1.setEditable(true);
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));

        jComboBox2.setEditable(true);
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" }));

        jComboBox3.setEditable(true);
        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2020", "2021", "2022" }));

        jTextField2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField2KeyReleased(evt);
            }
        });

        jLabel6.setText("Product Name :");

        jLabel7.setText("Batch No. :");

        jLabel8.setText("Rate(Rs.) :");

        jLabel9.setText("GST(%) :");

        jLabel10.setText("Quantity :");

        jLabel11.setText("Unit :");

        jComboBox4.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jComboBox4FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jComboBox4FocusLost(evt);
            }
        });
        jComboBox4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jComboBox4MouseClicked(evt);
            }
        });
        jComboBox4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox4ActionPerformed(evt);
            }
        });

        jTextField4.setEnabled(false);
        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });

        jTextField5.setEnabled(false);

        jTextField6.setEnabled(false);

        jTextField7.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField7KeyReleased(evt);
            }
        });

        jTextField8.setEnabled(false);

        jButton1.setText("Add to Bill");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel12.setText("Total Amount :");

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel13.setText("Discount (Rs.) :");

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel14.setText("Net Amount :");

        jTextField10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField10ActionPerformed(evt);
            }
        });
        jTextField10.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField10KeyReleased(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel15.setText("-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

        jButton3.setText("Generate Reciept");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Product Name", "Batch No. ", "Rate (Rs.)", "GST(%)", "Quantity", "Unit", "Amount"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jButton2.setText("Search");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton4.setText("Delete");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("New Bill");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText("Back");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel19.setText("RECIEPT");

        area.setColumns(20);
        area.setRows(5);
        jScrollPane2.setViewportView(area);

        prnt.setText("PRINT");
        prnt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prntActionPerformed(evt);
            }
        });

        jButton7.setText("New");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(231, 231, 231)
                        .addComponent(jLabel3)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(273, 273, 273)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(149, 149, 149))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jTextField3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                                    .addComponent(jTextField2, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField1, javax.swing.GroupLayout.Alignment.LEADING))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jButton2)
                                        .addGap(18, 18, 18)
                                        .addComponent(jButton4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton7))
                                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(141, 141, 141)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel9))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextField7, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel11)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jButton1))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 730, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel14)
                                            .addComponent(jLabel13)
                                            .addComponent(jLabel12)
                                            .addComponent(jButton3))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(18, 18, 18)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(10, 10, 10)
                                                .addComponent(jButton5)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jButton6)))
                                        .addGap(5, 5, 5)))
                                .addGap(18, 18, 18)
                                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel19)
                                .addGap(198, 198, 198))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(prnt)
                                .addGap(164, 164, 164))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel15)
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2)
                    .addComponent(jButton4)
                    .addComponent(jLabel19)
                    .addComponent(jButton7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(58, 58, 58)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13)
                            .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14)))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 488, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton3)
                            .addComponent(jButton5)
                            .addComponent(jButton6))
                        .addGap(25, 25, 25))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(prnt)
                        .addGap(33, 33, 33))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed

    }//GEN-LAST:event_jTextField4ActionPerformed

    private void jComboBox4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox4ActionPerformed
    try
        {
            if(x==1)
            {
                String pn=(String)jComboBox4.getSelectedItem();
                String sql="select bno, rate, gst, unit from bill where pname='"+pn+"'";
        
                ResultSet rs=st.executeQuery(sql);
        
                if(rs.next())
                {
                    String bno=rs.getString(1);
                    float rate=rs.getFloat(2);
                    float gst=rs.getFloat(3);
                    String unit=rs.getString(4);
                    jTextField4.setText(bno);
                    jTextField5.setText(rate+"");
                    jTextField6.setText(gst+"");
                    jTextField8.setText(unit);
                    
                    
                }
            }
        }
        catch(Exception exp)
        {
            exp.printStackTrace();
        }
    }//GEN-LAST:event_jComboBox4ActionPerformed

    private void jComboBox4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jComboBox4MouseClicked

    }//GEN-LAST:event_jComboBox4MouseClicked

    float total=0;
    int count=0;
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
     try
     {
        String pname=(String)jComboBox4.getSelectedItem();
        String bno=jTextField4.getText();
        float gst=Float.parseFloat(jTextField6.getText());
        float rate=Float.parseFloat(jTextField5.getText());
        float quantity=Float.parseFloat(jTextField7.getText());
        String unit=jTextField8.getText();
        int billno=Integer.parseInt(jTextField1.getText());
        String dd=(String)jComboBox1.getSelectedItem();
        String mm=(String)jComboBox2.getSelectedItem();
        String yy=(String)jComboBox3.getSelectedItem();
        String cname=jTextField2.getText();
        String cadd=jTextField3.getText();
        float amount=rate*quantity+quantity*rate*(gst/100);
        float amt=quantity*rate+quantity*rate*(gst/100);
        
        String sql="select quantity from bill";
        ResultSet rs=st.executeQuery(sql);
        float quantity2,quantity3=0;
        
        if(rs.next())    
        {
            quantity2=rs.getFloat(1);
            quantity3=quantity2-quantity;  
        }
            
        String dt=dd+"-"+mm+"-"+yy;
        
        sql="insert into bill1(billno, dt, cname, cadd, pname, bno, gst, rate, quantity, unit, amount) values("+billno+", '"+dt+"', '"+cname+"', '"+cadd+"', '"+pname+"', '"+bno+"', "+gst+", "+rate+", "+quantity+", '"+unit+"' ,"+amt+")";
        int i=st.executeUpdate(sql);
        
        float tgst=(gst*rate)/100;
        total=total+rate*quantity+tgst*quantity;
        jTextField9.setText(total+"");
        sql="update bill set quantity="+quantity3+" where pname='"+pname+"'";
        st1.executeUpdate(sql);
        
        String[] columns={"Product Name","Batch no.","Rate(Rs.)","GST","Quantity","Unit","Amount"};
        DefaultTableModel model=new DefaultTableModel();
        model.setColumnIdentifiers(columns);     
        jTable1.setModel(model);
        
        sql="select pname, bno, rate, gst, quantity, unit from bill1 where billno="+billno;
        rs=st2.executeQuery(sql);
                
        Object[] obj=new Object[6];
        while(rs.next())
        {
            obj[0]=rs.getString(1);
            obj[1]=rs.getString(2);
            obj[2]=rs.getFloat(3);
            obj[3]=rs.getFloat(4);
            obj[4]=rs.getFloat(5);
            obj[5]=rs.getString(6);
            model.addRow(obj);
        }
        String sql2="insert into bill2 (total) values("+total+")";
        st2.executeUpdate(sql2);
        
        jTextField4.setText("");
        jTextField5.setText("");
        jTextField6.setText("");
        jTextField7.setText("");
        jTextField8.setText("");
     }
     catch(Exception exp)
     {
         exp.printStackTrace();
     }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField10ActionPerformed
        float dis=Float.parseFloat(jTextField10.getText());
        float total=Float.parseFloat(jTextField9.getText());
        float net=total-dis;
        
        if(net<=0)
            JOptionPane.showMessageDialog(this, "Re-enter Discount");
        else
            jTextField11.setText(net+"");
        
    }//GEN-LAST:event_jTextField10ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        try
        {
            String cname=jTextField2.getText();
            String cadd=jTextField3.getText();
            String dd=(String)jComboBox1.getSelectedItem();
            String mm=(String)jComboBox2.getSelectedItem();
            String yy=(String)jComboBox3.getSelectedItem();
            String dt=dd+"-"+mm+"-"+yy;
            int billno=Integer.parseInt(jTextField1.getText());
            float total=Float.parseFloat(jTextField9.getText());
            float dis=Float.parseFloat(jTextField10.getText());            
            float net=Float.parseFloat(jTextField11.getText());
            
           /* String pname=(String)jComboBox4.getSelectedItem();
            float gst=Float.parseFloat(jTextField6.getText());
            float rate=Float.parseFloat(jTextField5.getText());
            float quantity=Float.parseFloat(jTextField7.getText());
            String unit=jTextField8.getText();*/
            
            String sql="update bill1 set total="+total+", dis="+dis+", net="+net+" where billno="+billno;
            int i=st.executeUpdate(sql);
            
            String sql1="select billno, dt, cname, cadd, total, dis, net from bill2 where billno="+billno+"";
            ResultSet rs=st1.executeQuery(sql1);
            if(rs.next())
            {
                String sql2="update bill2 set billno="+billno+", dt='"+dt+"', cname='"+cname+"', cadd='"+cadd+"', dis="+dis+", net="+net+" where billno="+billno+"";
                st2.executeUpdate(sql2);
            }
            else
            {
                String sql2="insert into bill2 (billno, dt, cname, cadd, dis, net) values("+billno+",'"+dt+"','"+cname+"','"+cadd+"',"+dis+","+net+")";
                st2.executeUpdate(sql2);
            }
            
            //JOptionPane.showMessageDialog(this,"Bill details added");
            
            area.setText("****************************************************************");
            area.setText(area.getText()+"\n             BILL RECIEPT                  \n");
            area.setText(area.getText()+"****************************************************************\n");
            area.setText(area.getText()+"DATE : "+dt+"\n\n");
            area.setText(area.getText()+"BILL NO. : "+billno+"\n");
            area.setText(area.getText()+"CUSTOMER NAME : "+cname+"\n");
            area.setText(area.getText()+"CUSTOMER ADDRESS : "+cadd+"\n\n");
            area.setText(area.getText()+"****************************************************************\n");
            area.setText(area.getText()+" PRODUCT     QUANTITY       RATE    GST\n");
            area.setText(area.getText()+"****************************************************************\n");
            
            
            sql="select pname, bno, rate, gst, quantity, unit from bill1 where billno="+billno;
            rs=st2.executeQuery(sql);
                
            while(rs.next())
            {
                String pname=rs.getString(1);
                Float rate=rs.getFloat(3);
                Float gst=rs.getFloat(4);
                Float quantity=rs.getFloat(5);
                String unit=rs.getString(6);
                
                area.setText(area.getText()+" "+pname+"     "+quantity+" "+unit+"    "+rate+"    "+gst+"\n");
            }
            
            area.setText(area.getText()+"****************************************************************\n");
            area.setText(area.getText()+"                                                 TOTAL AMOUNT : "+total+"\n");
            area.setText(area.getText()+"                                                 DISCOUNT : "+dis+"\n");
            area.setText(area.getText()+"                                                 NET AMMOUNT : "+net+"\n");
            
            FileWriter writr=new FileWriter(cname+"_Bill.txt",true);
            writr.write(area.getText());
            writr.close();
            jTextField1.setText("");
            jTextField2.setText("");
            jTextField3.setText("");
            jTextField9.setText("");
            jTextField10.setText("");
            jTextField11.setText("");
            
            
        }
        catch(Exception exp)
        {
            exp.printStackTrace();
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jComboBox4FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jComboBox4FocusGained
    x=1;        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox4FocusGained

    private void jComboBox4FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jComboBox4FocusLost
    x=0;        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox4FocusLost

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
    try
    {
        int billno=Integer.parseInt(jTextField1.getText());

        String sql="select dt, cname, cadd, total, dis, net from bill1 where billno="+billno;
        ResultSet rs=st.executeQuery(sql);
        
        if(rs.next())
        {
            String dt=rs.getString(1);
            String cname=rs.getString(2);
            String cadd=rs.getString(3);
            float total=rs.getFloat(4);
            float dis=rs.getFloat(5);
            float net=rs.getFloat(6);
            
            jTextField2.setText(cname);
            jTextField3.setText(cadd);
            jTextField9.setText(total+"");
            jTextField10.setText(dis+"");
            jTextField11.setText(net+"");
            
            sql="select to_char(dt,'dd'), to_char(dt,'mon'), to_char(dt,'yyyy') from bill1 where billno="+billno;
            rs=st1.executeQuery(sql);
            if(rs.next())
            {
                int day=rs.getInt(1);
                String month=rs.getString(2);
                int year=rs.getInt(3);
                jComboBox1.setSelectedItem(day);
                jComboBox2.setSelectedItem(month);
                jComboBox3.setSelectedItem(year);
            }
            
            String[] columns={"Product Name","Batch no.","Rate(Rs.)","GST","Quantity","Unit","Amount"};
            DefaultTableModel model=new DefaultTableModel();
            model.setColumnIdentifiers(columns);     
            jTable1.setModel(model);
        
            sql="select pname , bno, rate, gst, quantity, unit, total  from bill1 where billno="+billno;
            rs=st.executeQuery(sql);
        
            Object[] obj=new Object[7];
            while(rs.next())
            {
                obj[0]=rs.getString(1);
                obj[1]=rs.getString(2);
                obj[2]=rs.getFloat(3);
                obj[3]=rs.getFloat(4);
                obj[4]=rs.getFloat(5);
                obj[5]=rs.getString(6);
                obj[6]=rs.getString(7);
                model.addRow(obj);
            }
        }
        else
        {
            jTextField1.setText("");
            jTextField2.setText("");
            jTextField3.setText("");
            jTextField9.setText("");
            jTextField10.setText("");
            jTextField11.setText("");
        
            String[] columns={"Product Name","Batch no.","Rate(Rs.)","GST","Quantity","Unit","Amount"};
            DefaultTableModel model=new DefaultTableModel();
            model.setColumnIdentifiers(columns);     
            jTable1.setModel(model);
        
            JOptionPane.showMessageDialog(this,"Bill Number "+billno+" not found.");
        }
         
        }
        catch(Exception exp)
        {
            exp.printStackTrace();
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
    try
    {
        int billno=Integer.parseInt(jTextField1.getText());
       
        String sql;
        ResultSet rs;
            
        sql="select pname, quantity from bill1 where billno="+billno;
        rs=st.executeQuery(sql);
               
        while(rs.next())
        {
            String pname=rs.getString(1);
            float quantity=rs.getFloat(2);
	
            sql="update bill set quantity=quantity+"+quantity+" where pname='"+pname+"'";
            st1.executeUpdate(sql);
        }
        
        
        sql="delete from bill1 where billno="+billno;
        int i=st2.executeUpdate(sql);
        
        String sql2="delete from bill2 where billno="+billno;
        st3.executeUpdate(sql2);
        
        
        JOptionPane.showMessageDialog(this, i+" product deleted");
        
        jTextField1.setText("");
        jTextField2.setText("");
        jTextField3.setText("");
        jTextField4.setText("");
        jTextField5.setText("");
        jTextField6.setText("");
        jTextField7.setText("");
        jTextField8.setText("");
        jTextField9.setText("");
        jTextField10.setText("");
        jTextField11.setText("");
        jComboBox1.setSelectedIndex(0);
        jComboBox2.setSelectedIndex(0);
        jComboBox3.setSelectedIndex(0);
        
        String[] columns={"Product Name","Batch no.","Rate(Rs.)","GST","Quantity","Unit","Amount"};
        DefaultTableModel model=new DefaultTableModel();
        model.setColumnIdentifiers(columns);     
        jTable1.setModel(model);
        
    }
    catch(Exception exp)
    {
        exp.printStackTrace();
    }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
//
//        jTextField1.setText("");
//        jTextField2.setText("");
//        jTextField3.setText("");
//        jTextField4.setText("");
//        jTextField5.setText("");
//        jTextField6.setText("");
//        jTextField7.setText("");
//        jTextField8.setText("");
//        jTextField9.setText("");
//        jTextField10.setText("");
//        jTextField11.setText("");
//        try
//        {
//            String[] columns={"Product Name","Batch no.","Rate(Rs.)","GST","Quantity","Unit","Amount"};
//            DefaultTableModel model=new DefaultTableModel();
//            model.setColumnIdentifiers(columns);
//            jTable1.setModel(model);
//        
//            String sql="select pname from bill1 where 1=2";
//            ResultSet rs=st.executeQuery(sql);
//        
//            Object[] obj=new Object[7];
//            while(rs.next())
//            {
//               obj[0]=rs.getString(1);
//               obj[1]=rs.getString(2);
//               obj[2]=rs.getFloat(3);
//               obj[3]=rs.getFloat(4);
//               obj[4]=rs.getInt(5);
//               obj[5]=rs.getString(6);
//               obj[6]=rs.getFloat(7);
//               model.addRow(obj);
//            }
//            total=0;
//        }
//       
        
        new ProjectBill1().setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        
        new HomePage().setVisible(true);
        setVisible(false);
        
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jTextField7KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField7KeyReleased
        String PATTERN="^[0-9]{0,4}$";
        Pattern patt=Pattern.compile(PATTERN);
        Matcher match=patt.matcher(jTextField7.getText());
        if(!match.matches())
        {
            jLabel16.setText("Invalid");
            jButton5.setEnabled(false);
            jButton6.setEnabled(false);
            jButton3.setEnabled(false);
            jButton1.setEnabled(false);
            
        }
        else
        {
            jLabel16.setText(null);
            jButton5.setEnabled(true);
            jButton6.setEnabled(true);
            jButton3.setEnabled(true);
            jButton1.setEnabled(true);
        } 
    }//GEN-LAST:event_jTextField7KeyReleased

    private void jTextField10KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField10KeyReleased
        
        String PATTERN="^[0-9]{0,3}$";
        Pattern patt=Pattern.compile(PATTERN);
        Matcher match=patt.matcher(jTextField10.getText());
        if(!match.matches())
        {
            jLabel17.setText("Invalid");
            jButton5.setEnabled(false);
            jButton6.setEnabled(false);
            jButton3.setEnabled(false);
            
        }
        else
        {
            jLabel17.setText(null);
            jButton5.setEnabled(true);
            jButton6.setEnabled(true);
            jButton3.setEnabled(true);
        }         
        
    }//GEN-LAST:event_jTextField10KeyReleased

    private void jTextField2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField2KeyReleased
        String PATTERN="^[A-Za-z]{0,30} [A-Za-z]{0,30}$";
        Pattern patt=Pattern.compile(PATTERN);
        Matcher match=patt.matcher(jTextField2.getText());
        if(!match.matches())
        {
            jLabel18.setText("Invalid");
            jButton5.setEnabled(false);
            jButton6.setEnabled(false);
            jButton3.setEnabled(false);
            jButton1.setEnabled(false);
            
        }
        else
        {
            jLabel18.setText(null);
            jButton5.setEnabled(true);
            jButton6.setEnabled(true);
            jButton3.setEnabled(true);
            jButton1.setEnabled(true);
        }
    }//GEN-LAST:event_jTextField2KeyReleased

    private void jTextField1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyReleased
        
    }//GEN-LAST:event_jTextField1KeyReleased

    private void prntActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prntActionPerformed
       try {
           area.print();
           
       } catch (PrinterException ex) {
           Logger.getLogger(ProjectBill1.class.getName()).log(Level.SEVERE, null, ex);
       }
    }//GEN-LAST:event_prntActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed

        jTextField1.setEnabled(false);
        
        
    }//GEN-LAST:event_jButton7ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ProjectBill1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProjectBill1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProjectBill1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProjectBill1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Bibin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea area;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JComboBox<String> jComboBox4;
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
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JButton prnt;
    // End of variables declaration//GEN-END:variables
}
