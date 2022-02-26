
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

    
public class ProjectBill1 extends javax.swing.JFrame {

   Statement st, st1, st2, st3,st4;
   int x=0;
   
    public ProjectBill1() 
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
            st4=con.createStatement();
        }
        catch(Exception exp)
        {
            exp.printStackTrace();
        }
         
        jTextField1.setText("0");
        jTextField2.setText("");
        jTextField3.setText("");
        jTextField7.setText("0");
        jTextField4.setText("");
        jTextField5.setText("");
        jTextField8.setText("");
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

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        jComboBox3 = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
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
        jButton7 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jTextField9 = new javax.swing.JTextField();
        jTextField10 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jTextField11 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        area = new javax.swing.JTextArea();
        jLabel19 = new javax.swing.JLabel();
        jButton8 = new javax.swing.JButton();
        jLabel20 = new javax.swing.JLabel();
        jButton9 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximizedBounds(new java.awt.Rectangle(1346, 664, 664, 664));
        setMaximumSize(new java.awt.Dimension(1346, 664));
        setMinimumSize(new java.awt.Dimension(1346, 664));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(200, 162, 200));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 5, true));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("                  BILL ENTRY");

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel15.setText("-------------------------------------------------------------------------------------------------------------");

        jLabel1.setText("Bill No. :");

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField1KeyReleased(evt);
            }
        });

        jLabel2.setText("Date :");

        jComboBox1.setEditable(true);
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));

        jComboBox2.setEditable(true);
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" }));

        jComboBox3.setEditable(true);
        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2020", "2021", "2022" }));

        jLabel4.setText("Customer Name :");

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        jTextField2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField2KeyReleased(evt);
            }
        });

        jLabel5.setText("Customer Address :");

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

        jButton7.setBackground(new java.awt.Color(51, 0, 51));
        jButton7.setForeground(new java.awt.Color(255, 255, 255));
        jButton7.setText("New");
        jButton7.setBorderPainted(false);
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(51, 0, 51));
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Search");
        jButton2.setBorderPainted(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(51, 0, 51));
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Delete");
        jButton4.setBorderPainted(false);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jTextField6.setEnabled(false);

        jTextField7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField7ActionPerformed(evt);
            }
        });
        jTextField7.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField7KeyReleased(evt);
            }
        });

        jTextField8.setEnabled(false);

        jButton1.setBackground(new java.awt.Color(51, 0, 51));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Add to Bill");
        jButton1.setBorderPainted(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
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
        jTable1.setEnabled(false);
        jScrollPane1.setViewportView(jTable1);

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel12.setText("Total Amount :");

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel13.setText("Discount (Rs.) :");

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

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel14.setText("Net Amount :");

        jButton3.setBackground(new java.awt.Color(51, 0, 51));
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Pay Now");
        jButton3.setBorderPainted(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton5.setBackground(new java.awt.Color(51, 0, 51));
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("New Bill");
        jButton5.setBorderPainted(false);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setBackground(new java.awt.Color(51, 0, 51));
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setText("Back");
        jButton6.setBorderPainted(false);
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        area.setColumns(20);
        area.setRows(5);
        jScrollPane2.setViewportView(area);

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel19.setText("RECEIPT");

        jButton8.setBackground(new java.awt.Color(51, 0, 51));
        jButton8.setForeground(new java.awt.Color(255, 255, 255));
        jButton8.setText("Print");
        jButton8.setBorderPainted(false);
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton9.setBackground(new java.awt.Color(51, 0, 51));
        jButton9.setForeground(new java.awt.Color(255, 255, 255));
        jButton9.setText("Pay later");
        jButton9.setBorderPainted(false);
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(284, 284, 284)
                        .addComponent(jLabel3))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel15))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(153, 153, 153)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel13)
                                    .addComponent(jLabel12)
                                    .addComponent(jLabel14))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton9)
                                .addGap(18, 18, 18)
                                .addComponent(jButton5)
                                .addGap(18, 18, 18)
                                .addComponent(jButton6)
                                .addGap(25, 25, 25)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton8)))
                .addGap(201, 201, 201))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(80, 80, 80)
                                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(52, 52, 52)
                                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addGap(40, 40, 40)
                                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addComponent(jButton7)
                                .addGap(18, 18, 18)
                                .addComponent(jButton2)
                                .addGap(18, 18, 18)
                                .addComponent(jButton4))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel6)
                        .addGap(35, 35, 35)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(118, 118, 118)
                                .addComponent(jLabel8))
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(68, 68, 68)
                        .addComponent(jLabel9)
                        .addGap(76, 76, 76)
                        .addComponent(jLabel10)
                        .addGap(73, 73, 73)
                        .addComponent(jLabel11))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel4))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextField7, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 762, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 111, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 376, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(52, 52, 52))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel19)
                        .addGap(209, 209, 209))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel15)
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton7)
                    .addComponent(jButton2)
                    .addComponent(jButton4)
                    .addComponent(jLabel19))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 401, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(32, 32, 32)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(25, 25, 25)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel5)
                                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(38, 38, 38)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel11))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel12)
                                    .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel13)
                                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton8)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(jButton9)
                    .addComponent(jButton5)
                    .addComponent(jButton6))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
        float quantity=Float.parseFloat(jTextField7.getText());
        String unitt=jTextField8.getText();
        
        if(quantity==0 || unitt.equals("")==true)
        {
            JOptionPane.showMessageDialog(this, "Invalid entry.");
        }
        else
        {
        String pname=(String)jComboBox4.getSelectedItem();
        String bno=jTextField4.getText();
        float gst=Float.parseFloat(jTextField6.getText());
        float rate=Float.parseFloat(jTextField5.getText());
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
        
        sql="insert into bill1(billno, dt, cname, cadd, pname, bno, gst, rate, quantity, unit, amount, status) values("+billno+", '"+dt+"', '"+cname+"', '"+cadd+"', '"+pname+"', '"+bno+"', "+gst+", "+rate+", "+quantity+", '"+unit+"' ,"+amt+", 'nil')";
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
        jTextField7.setText("0");
        jTextField8.setText("");
     }
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
        {
            jTextField11.setText(net+"");
            jTextField9.setEnabled(false);
            jTextField11.setEnabled(false);
        }
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
            
            String sql="update bill1 set status='Paid', total="+total+", dis="+dis+", net="+net+" where billno="+billno;
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
            
            long bnum=Integer.parseInt(jTextField1.getText());
            
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
            area.setText(area.getText()+"                                                 NET AMOUNT : "+net+"\n");
            area.setText(area.getText()+"                                                 PAID.");
            
            
            FileWriter writr=new FileWriter(cname+"_Bill.txt",true);
            writr.write(area.getText());
            writr.close();
            jTextField1.setText("");
            jTextField2.setText("");
            jTextField3.setText("");
            jTextField9.setText("");
            jTextField10.setText("");
            jTextField11.setText("");
            
   
            
            long bnum1=bnum+1;
            
            String sql4="insert into billnum values ("+bnum1+")";
            int k=st4.executeUpdate(sql4);
            
            String sql3="delete from billnum where bnum="+bnum;
            int j=st.executeUpdate(sql3);
         
            jTextField1.setText("0");
            jTextField2.setText("");
            jTextField3.setText("");
            jTextField7.setText("0");
            jTextField9.setText("");
            jTextField10.setText("");
            jTextField11.setText("");
            
            jLabel20.setText("Paid");
            area.setEnabled(false);
            
        }
        catch(Exception exp)
        {
            exp.printStackTrace();
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jComboBox4FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jComboBox4FocusGained
    x=1;        
    }//GEN-LAST:event_jComboBox4FocusGained

    private void jComboBox4FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jComboBox4FocusLost
    x=0;        
    }//GEN-LAST:event_jComboBox4FocusLost

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
    try
    {
        int billno=Integer.parseInt(jTextField1.getText());
        
        
        String sql="select dt, cname, cadd, total, dis, net, status from bill1 where billno="+billno;
        ResultSet rs=st.executeQuery(sql);
        
        if(rs.next())
        {
            String dt=rs.getString(1);
            String cname=rs.getString(2);
            String cadd=rs.getString(3);
            float total=rs.getFloat(4);
            float dis=rs.getFloat(5);
            float net=rs.getFloat(6);
            String status=rs.getString(7);
            
            jTextField2.setText(cname);
            jTextField3.setText(cadd);
            jTextField9.setText(total+"");
            jTextField10.setText(dis+"");
            jTextField11.setText(net+"");
            jLabel20.setText(status);
            
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
            jTextField1.setText("0");
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
        
        jTextField1.setText("0");
        jTextField1.setEnabled(true);
        jTextField2.setText("");
        jTextField3.setText("");
        jTextField4.setText("");
        jTextField5.setText("");
        jTextField6.setText("");
        jTextField7.setText("0");
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

//        jTextField1.setText("0");
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
//        catch(Exception exp)
//        {
//            exp.printStackTrace();
//        }            
        
        new ProjectBill1().setVisible(true);      
        
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        
        new HomePage().setVisible(true);
        setVisible(false);
        
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jTextField7KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField7KeyReleased
        String PATTERN="^[0-9]{0,4}$";
        Pattern patt=Pattern.compile(PATTERN);
        Matcher match=patt.matcher(jTextField7.getText());
        float quantity=Float.parseFloat(jTextField7.getText());
        if(!match.matches() || quantity==0)
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

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
    
    try
    {
        String sql="select bnum from billnum";
        ResultSet rs=st.executeQuery(sql);
        long bnum;
        
        if(rs.next())    
        {
            bnum=rs.getLong(1);
            jTextField1.setText(""+bnum);
            jTextField1.setEnabled(false);
        }
        else
        {
            JOptionPane.showMessageDialog(this,"Empty bill database.");
        }
    }
    catch(Exception exp)
    {
        exp.printStackTrace();
    }
        
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        try {
           area.print();
           
       } 
        catch (PrinterException ex) {
           Logger.getLogger(ProjectBill1.class.getName()).log(Level.SEVERE, null, ex);
       }
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jTextField7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField7ActionPerformed
        
    }//GEN-LAST:event_jTextField7ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
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
            
            String sql="update bill1 set status='Unpaid', total="+total+", dis="+dis+", net="+net+" where billno="+billno;
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
            
            long bnum=Integer.parseInt(jTextField1.getText());
            
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
            area.setText(area.getText()+"                                                 NET AMOUNT : "+net+"\n");
            area.setText(area.getText()+"                                                 UNPAID.");
            
            FileWriter writr=new FileWriter(cname+"_Bill.txt",true);
            writr.write(area.getText());
            writr.close();
            jTextField1.setText("");
            jTextField2.setText("");
            jTextField3.setText("");
            jTextField9.setText("");
            jTextField10.setText("");
            jTextField11.setText("");
            
   
            
            long bnum1=bnum+1;
            
            String sql4="insert into billnum values ("+bnum1+")";
            int k=st4.executeUpdate(sql4);
            
            String sql3="delete from billnum where bnum="+bnum;
            int j=st.executeUpdate(sql3);
         
            jTextField1.setText("0");
            jTextField2.setText("");
            jTextField3.setText("");
            jTextField7.setText("0");
            jTextField9.setText("");
            jTextField10.setText("");
            jTextField11.setText("");
            
            jLabel20.setText("Unpaid");
            area.setEnabled(false);
            
        }
        catch(Exception exp)
        {
            exp.printStackTrace();
        }      
        
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

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
                new ProjectBill1().setVisible(true);
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
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
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
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
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
    // End of variables declaration//GEN-END:variables
}
