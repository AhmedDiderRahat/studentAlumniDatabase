import java.sql.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import javax.swing.table.*;

public class show_result extends javax.swing.JFrame 
{
    public ResultSet rs;
    public Statement st, st1;
    public show_result() throws SQLException 
    {
        initComponents();
        addToTable();    
        this.setResizable(false);
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    public Vector arr() throws SQLException
    {
        DbConnect od = new DbConnect();
        st1 = od.con.createStatement();
        Vector<String> v = new Vector<String>(1,1);
        try 
        {      
            String query = "SELECT information.stduent_name, results.re_1, results.re_2, results.re_3,results.re_4, results.re_5,results.re_6, results.re_7,results.re_8, results.re_9,results.re_10, results.re_11,results.re_12, results.ce_1,results.ce_2, results.ce_3, results.ce_4, results.ce_5, results.ce_6, results.ce_7,results.ce_8,results.ce_9,results.ce_10,results.ce_11,results.ce_12 FROM information INNER JOIN results ON information.id=results.id";
            rs = st1.executeQuery(query);
           
            while(rs.next()) 
            {
                String name, cgpa, gd;
                double d1, d2, m2, y2 = 0.0, c2 = 0.0;
                
                name = rs.getString("information.stduent_name");
                d1 = rs.getFloat("results.re_1");
                d2 = rs.getFloat("results.ce_1");
                m2 = d1 * d2;
                y2 += m2;
                c2 += d2;
                d1 = rs.getFloat("results.re_2");
                d2 = rs.getFloat("results.ce_2");
                m2 = d1 * d2;
                y2 += m2;
                c2 += d2;
                d1 = rs.getFloat("results.re_3");
                d2 = rs.getFloat("results.ce_3");
                m2 = d1 * d2;
                y2 += m2;
                c2 += d2;
                d1 = rs.getFloat("results.re_4");
                d2 = rs.getFloat("results.ce_4");
                m2 = d1 * d2;
                y2 += m2;
                c2 += d2;
                d1 = rs.getFloat("results.re_5");
                d2 = rs.getFloat("results.ce_5");
                m2 = d1 * d2;
                y2 += m2;
                c2 += d2;
                d1 = rs.getFloat("results.re_6");
                d2 = rs.getFloat("results.ce_6");
                m2 = d1 * d2;
                y2 += m2;
                c2 += d2;
                d1 = rs.getFloat("results.re_7");
                d2 = rs.getFloat("results.ce_7");
                m2 = d1 * d2;
                y2 += m2;
                c2 += d2;
                d1 = rs.getFloat("results.re_8");
                d2 = rs.getFloat("results.ce_8");
                m2 = d1 * d2;
                y2 += m2;
                c2 += d2;
                d1 = rs.getFloat("results.re_9");
                d2 = rs.getFloat("results.ce_9");
                m2 = d1 * d2;
                y2 += m2;
                c2 += d2;
                d1 = rs.getFloat("results.re_10");
                d2 = rs.getFloat("results.ce_10");
                m2 = d1 * d2;
                y2 += m2;
                c2 += d2;
                d1 = rs.getFloat("results.re_11");
                d2 = rs.getFloat("results.ce_11");
                m2 = d1 * d2;
                y2 += m2;
                c2 += d2;
                d1 = rs.getFloat("results.re_12");
                d2 = rs.getFloat("results.ce_12");
                m2 = d1 * d2;
                y2 += m2;
                c2 += d2;
                
                y2 /= c2;
                
                String x4, tot = new Double(y2).toString();
                char ca1, ca2;
                int i = 0;
                x4 = " ";
       
                while (i < tot.length())
                {
                    ca1 = tot.charAt(i);
                    x4 = x4 + ca1;
                    i++;
                    if(i==5)
                        break;
                }
                if(tot.length() < 5)
                {
                    for(int k=0; k<5-tot.length(); k++)
                        x4 =  x4 + "0";
                }

                cgpa = x4;
                
                if(y2>4.00)
                    gd="N/A";
                else if(y2==4.00)
                    gd="A+";
                else if(y2>=3.75 && y2<4.00)
                    gd="A";
                else if(y2>=3.5 && y2<3.75)
                    gd="A-";
                else if(y2>=3.25 && y2<3.5)
                    gd="B+";
                else if(y2>=3.00 && y2<3.25)
                    gd="B";
                else if(y2>=2.75 && y2<3.00)
                    gd="B-";
                else if(y2>=2.5 && y2<2.75)
                    gd="C+";
                else if(y2>=2.25 && y2<2.5)
                    gd="C";
                else if(y2>=2.00 && y2<2.25)
                    gd="C-";
                else
                    gd="N/A";
                
                v.addElement(name);
                v.addElement(cgpa);
                v.addElement(gd);
            }
        } catch (SQLException ex) 
        {
             System.err.println("Exception: " + ex);
        }
        
        od.con.close();
        
        int size = v.capacity();
        String s1, s2, s3, s4, s5, s6, t1, t2, t3;
        double x1, x2, x3, x4;
        
        for(int i=0; i<size; i+=3)
        {    
            for(int j=i+3; j<size; j+=3)
            {
                s1 = v.elementAt(i);
                s2 = v.elementAt(i+1);
                s3 = v.elementAt(i+2);
                x1 = Double.parseDouble(s2);
                
                s4 = v.elementAt(j);
                s5 = v.elementAt(j+1);
                x2 = Double.parseDouble(s5);
                s6 = v.elementAt(j+2);

                if(x1 < x2)
                {
                    t1 = s1;
                    s1 = s4;
                    s4 = t1;
                    
                    t2 = s2;
                    s2 = s5;
                    s5 = t2;
                    
                    t3 = s3;
                    s3 = s6;
                    s6 = t3; 
                    
                    v.set(i, s1);
                    v.set(i+1, s2);
                    v.set(i+2, s3);
                    v.set(j, s4);
                    v.set(j+1, s5);
                    v.set(j+2, s6);
               }
            } 
        }
        
        return v;       
    }
  
    public void addToTable() throws SQLException
    {
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        
        Vector<String> list = arr();
        
        Object rawData[] = new Object[3];
        
        for(int i=0; i<list.capacity(); i+=3)
        {
            rawData[0] = list.get(i);
            rawData[1] = list.get(i+1);
            rawData[2] = list.get(i+2);
            model.addRow(rawData);          
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        back = new javax.swing.JButton();
        logout = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTable1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "name", "CGPA", "Great ponit"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setAutoscrolls(false);
        jTable1.setRequestFocusEnabled(false);
        jTable1.setRowHeight(25);
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
            jTable1.getColumnModel().getColumn(0).setPreferredWidth(300);
            jTable1.getColumnModel().getColumn(1).setResizable(false);
            jTable1.getColumnModel().getColumn(1).setPreferredWidth(200);
            jTable1.getColumnModel().getColumn(2).setResizable(false);
            jTable1.getColumnModel().getColumn(2).setPreferredWidth(100);
        }

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Result");

        back.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        back.setForeground(new java.awt.Color(0, 102, 0));
        back.setText("Back");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });

        logout.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        logout.setForeground(new java.awt.Color(0, 102, 0));
        logout.setText("LogOut");
        logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(back)
                .addGap(373, 373, 373)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 381, Short.MAX_VALUE)
                .addComponent(logout)
                .addGap(19, 19, 19))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(logout, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(37, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1027, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 387, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(140, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        // TODO add your handling code here:
        home_in ob64 = new home_in();
        this.dispose();
    }//GEN-LAST:event_backActionPerformed

    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed
        // TODO add your handling code here:
        login om = new login();
        this.dispose();
    }//GEN-LAST:event_logoutActionPerformed

    public static void main(String args[]) 
    {
        java.awt.EventQueue.invokeLater(new Runnable() 
        {
            public void run() 
            {
//                try {
//                    new show_result().setVisible(true);
//                } catch (SQLException ex) {
//                    Logger.getLogger(show_result.class.getName()).log(Level.SEVERE, null, ex);
//                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton logout;
    // End of variables declaration//GEN-END:variables
}
