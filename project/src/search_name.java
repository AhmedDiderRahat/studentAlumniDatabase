import java.sql.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.*;

public class search_name extends javax.swing.JFrame 
{
    public ResultSet rs, rs1, rs2;
    public Statement st, st1, st2;
    public String keys, srs;

    public search_name(String ip) throws SQLException 
    {
        keys = ip;
        srs = ip;
        
        initComponents();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        
        addToTable();
    }
    
    public ArrayList arr() throws SQLException 
    {
        DbConnect od = new DbConnect();
        st1 = od.con.createStatement();
        ArrayList<String> li = new ArrayList<String>();
        ArrayList<String> queue = new ArrayList<String>();
        try 
        {      
            String query;    
            query = "SELECT * FROM information" + " WHERE stduent_name LIKE \'%" + keys + "%\'";
            
            rs = st1.executeQuery(query);
            
            String id, name;
            
            while(rs.next()) 
            {
                 id = rs.getString("id");
                 name = rs.getString("stduent_name");
                
                 queue.add(id);
            }
            
        } catch (SQLException ex) 
        {
            System.out.println("1Exception: " + ex);
        }
        
        if(queue.isEmpty())
        {
            JOptionPane.showMessageDialog(null, "There is no such Name...!!!", "Warning" ,JOptionPane.ERROR_MESSAGE);
            home_in lo = new home_in();            
            this.dispose();
        }
       
        String element;
        Iterator<String> it = queue.iterator();
        
        int counter=1; String num=" ";
        while(it.hasNext())
        {
            element = it.next();
            keys = element;
            
            String query = "SELECT * FROM information" + " WHERE id = " + keys;
            rs = st1.executeQuery(query);
           
            if (rs.next()) 
            {
                String id, name, s1, s2,  s3, s4, f_name, m_name, dept, batch, dob, mobile_no, e_mail, bg, religion, pass_year, convocation_year;
                id = rs.getString("id");
                name = rs.getString("stduent_name");
                f_name = rs.getString("father_name");
                m_name = rs.getString("mother_name");
                mobile_no = rs.getString("mobile_no");
                e_mail = rs.getString("e_mail");
                dob = rs.getString("dob");
                bg = rs.getString("blood_group");
                religion = rs.getString("religion");
                pass_year = rs.getString("pass_year");
                convocation_year = rs.getString("convaction_year");

                char c1, c2, c3;
                c1 = id.charAt(0);
                c2 = id.charAt(1);
                s1 = c1 + "" + c2;
                
                if (id.charAt(3) == '1') 
                {
                    s2 = "Spring";
                } 
                else if (id.charAt(3) == '2') 
                {
                    s2 = "Summer";
                } 
                else 
                {
                    s2 = "Fall";
                }

                s2 = s2 + "'" + s1;

                if (id.charAt(5) == '2' && id.charAt(7) == '1') {
                    s3 = "English";
                } else if (id.charAt(5) == '2' && id.charAt(7) == '4') {
                    s3 = "Sociology";
                } else if (id.charAt(5) == '2' && id.charAt(7) == '2') {
                    s3 = "LLB";
                } else if (id.charAt(5) == '1' && id.charAt(7) == '1') {
                    s3 = "BBA";
                } else if (id.charAt(5) == '3' && id.charAt(7) == '2') {
                    s3 = "CSE"; 
                } else {
                    s3 = "other";
                }

                dept = s3;
                batch = s2;
                li.add("                -----------");
                li.add("                                                                      -------------------------------------------------------"); //li.add("------");
                
                num = counter + num;
                li.add("Student Number: ");
                li.add(num);
                counter++;
                num = " ";
                li.add("id");
                li.add(id);
                li.add("name");
                li.add(name);
                li.add("Father Name: ");
                li.add(f_name);
                li.add("Mother Name: ");
                li.add(m_name);
                li.add("Department: ");
                li.add(dept);
                li.add("Session: ");
                li.add(batch);
                li.add("Date of Birth: ");
                li.add(dob);
                li.add("Mobile: ");
                li.add(mobile_no);
                li.add("Em@il: ");
                li.add(e_mail);
                li.add("Blood Group: ");
                li.add(bg);
                li.add("Religion: ");
                li.add(religion);
                li.add("Passing Year: ");
                li.add(pass_year);
                li.add("Convocation Year: ");
                li.add(convocation_year);
            }
      
            String query1 = "SELECT * FROM addraess" + " WHERE st_id = " + keys;
            rs = st1.executeQuery(query1);

            String x1, x2 = "";
            if (rs.next()) 
            {
                li.add("                -----------");
                li.add("                                                                      -------------------------------------------------------"); //li.add("------");

                li.add("                           Permanent");
                li.add("Address");
                x2 = rs.getString("add_type");
                x2 = x2.trim();
                x1 = rs.getString("house");
                x1 = x1.trim();
                li.add("House No: ");
                li.add(x1);
                x1 = rs.getString("road");
                x1 = x1.trim();
                li.add("Road: ");
                li.add(x1);
                x1 = rs.getString("block");
                x1 = x1.trim();
                li.add("Block: ");
                li.add(x1);
                x1 = rs.getString("village");
                x1 = x1.trim();
                li.add("Village: ");
                li.add(x1);
                x1 = rs.getString("p_o");
                x1 = x1.trim();
                li.add("Post Office: ");
                li.add(x1);
                x1 = rs.getString("p_s");
                x1 = x1.trim();
                li.add("Police Station: ");
                li.add(x1);
                x1 = rs.getString("district");
                x1 = x1.trim();
                li.add("District: ");
                li.add(x1);
            }
            if (rs.next()) 
            {
                li.add("                -----------");
                li.add("                                                                      -------------------------------------------------------"); //li.add("------");
                li.add("                                 Present");
                li.add("Address");
                x1 = rs.getString("add_type");
                x1 = x1.trim();

                x1 = rs.getString("sab");
                x1 = x1.trim();
                if (x1.equals("Yes")) 
                {
                    li.add("Data Are: ");
                    li.add("Same As Above");
                } 
                else 
                {
                    li.add("House No: ");
                    x1 = rs.getString("house");
                    x1 = x1.trim();
                    li.add(x1);
                    li.add("Road: ");
                    x1 = rs.getString("road");
                    x1 = x1.trim();
                    li.add(x1);
                    li.add("Block: ");
                    x1 = rs.getString("block");
                    x1 = x1.trim();
                    li.add(x1);
                    li.add("Village: ");
                    x1 = rs.getString("village");
                    x1 = x1.trim();
                    li.add(x1);

                    li.add("Post Office: ");
                    x1 = rs.getString("p_o");
                    x1 = x1.trim();
                    li.add(x1);

                    li.add("Police Station: ");
                    x1 = rs.getString("p_s");
                    x1 = x1.trim();
                    li.add(x1);

                    li.add("District: ");
                    x1 = rs.getString("district");
                    x1 = x1.trim();
                    li.add(x1);
                }
            }

            // Academic Result:
            String query2 = "SELECT * FROM results" + " WHERE id = " + keys;
            rs = st1.executeQuery(query2);
            String x3;
            double d1, d2, m2, s2 = 0.0, c2 = 0.0;
            if (rs.next()) 
            {
                li.add("                -----------");
                li.add("                                                                      -------------------------------------------------------"); //li.add("------");

                d1 = rs.getFloat("re_1");
                d2 = rs.getFloat("ce_1");
                m2 = d1 * d2;
                s2 += m2;
                c2 += d2;
                d1 = rs.getFloat("re_2");
                d2 = rs.getFloat("ce_2");
                m2 = d1 * d2;
                s2 += m2;
                c2 += d2;
                d1 = rs.getFloat("re_3");
                d2 = rs.getFloat("ce_3");
                m2 = d1 * d2;
                s2 += m2;
                c2 += d2;
                d1 = rs.getFloat("re_4");
                d2 = rs.getFloat("ce_4");
                m2 = d1 * d2;
                s2 += m2;
                c2 += d2;
                d1 = rs.getFloat("re_5");
                d2 = rs.getFloat("ce_5");
                m2 = d1 * d2;
                s2 += m2;
                c2 += d2;
                d1 = rs.getFloat("re_6");
                d2 = rs.getFloat("ce_6");
                m2 = d1 * d2;
                s2 += m2;
                c2 += d2;
                d1 = rs.getFloat("re_7");
                d2 = rs.getFloat("ce_7");
                m2 = d1 * d2;
                s2 += m2;
                c2 += d2;
                d1 = rs.getFloat("re_8");
                d2 = rs.getFloat("ce_8");
                m2 = d1 * d2;
                s2 += m2;
                c2 += d2;
                d1 = rs.getFloat("re_9");
                d2 = rs.getFloat("ce_9");
                m2 = d1 * d2;
                s2 += m2;
                c2 += d2;
                d1 = rs.getFloat("re_10");
                d2 = rs.getFloat("ce_10");
                m2 = d1 * d2;
                s2 += m2;
                c2 += d2;
                d1 = rs.getFloat("re_11");
                d2 = rs.getFloat("ce_11");
                m2 = d1 * d2;
                s2 += m2;
                c2 += d2;
                d1 = rs.getFloat("re_12");
                d2 = rs.getFloat("ce_12");
                m2 = d1 * d2;
                s2 += m2;
                c2 += d2;

                s2 /= c2;
                String x4, tot = new Double(s2).toString();

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
                li.add("CGPA: ");
                li.add(x4);
            }

            String query3 = "SELECT * FROM activity" + " WHERE st_id = " + keys;
            rs = st1.executeQuery(query3);
            String x5;

            while (rs.next()) 
            {
                li.add("                -----------");
                li.add("                                                                      -------------------------------------------------------"); //li.add("------");

                x5 = rs.getString("club");
                x5 = x5.trim();
                li.add("Club Name: ");
                li.add(x5);
                x5 = rs.getString("designation");
                x5 = x5.trim();
                li.add("Designation: ");
                li.add(x5);
                x5 = rs.getString("year");
                x5 = x5.trim();
                li.add("Year: ");
                li.add(x5);
            }

            String query4 = "SELECT * FROM achivement" + " WHERE st_id = " + keys;
            rs = st1.executeQuery(query4);
            String x6 = "";

            boolean b1;
            while (rs.next()) 
            {
                li.add("                -----------");
                li.add("                                                                      -------------------------------------------------------"); //li.add("------");

                li.add("Achivements: ");

                b1 = rs.getBoolean("chancellor");
                if (b1) 
                {
                    x5 = "Chancellor's Award";
                    x6 = x5 + ", ";
                }

                b1 = rs.getBoolean("vc");
                if (b1) 
                {
                    x5 = "Vice Chancellor's Award";
                    x6 = x5 + ", " + x6;
                }

                b1 = rs.getBoolean("dean");
                if (b1) 
                {
                    x5 = "Dean's Award";
                    x6 = x5 + ", " + x6;
                }

                b1 = rs.getBoolean("dgree_honurs");
                if (b1) 
                {
                    x5 = "Degree with Honur's";
                    x6 = x5 + ", " + x6;
                }

                b1 = rs.getBoolean("not_applicable");
                if (b1) 
                {
                    x5 = "N/A";
                    x6 = x5 + ", " + x6;
                }

                int l1 = x6.length();
                String x7 = x6.substring(0, l1 - 2) + " " + x6.substring(l1);
                li.add(x7);
            }

            String query5 = "SELECT * FROM work_in" + " WHERE st_id = " + keys;
            rs = st1.executeQuery(query5);
            String x7;

            while (rs.next()) 
            {
                li.add("                -----------");
                li.add("                                                                      -------------------------------------------------------"); //li.add("------");

                x7 = rs.getString("type");
                x7 = x7.trim();

                if(x7.equals("Previous"))
                {
                      li.add("Past Work At: ");
                }
                else
                   li.add("Now Work At: "); 

                x7 = rs.getString("company");
                x7 = x7.trim();

                li.add(x7);

                x7 = rs.getString("designation");
                x7 = x7.trim();
                li.add("Designation: ");
                li.add(x7);
                x7 = rs.getString("year");
                x7 = x7.trim();
                li.add("Year: ");
                li.add(x7);
            }

            li.add("                -----------");
            li.add("                                                                      -------------------------------------------------------"); //li.add("------");

            li.add("");
            li.add("");
            li.add("");
            li.add("");
        }
        
        od.con.close();
        return li;
    }

    public void addToTable() throws SQLException 
    {
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        ArrayList<String> list = new ArrayList<String>();
        list = arr();
        Object rawData[] = new Object[2];
        for (int i = 0; i < list.size(); i += 2) 
        {
            rawData[0] = list.get(i);
            rawData[1] = list.get(i + 1);
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
        setPreferredSize(new java.awt.Dimension(1100, 650));
        setResizable(false);

        jTable1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "name", "option"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setMinimumSize(new java.awt.Dimension(10, 0));
        jTable1.setRowHeight(25);
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
            jTable1.getColumnModel().getColumn(0).setPreferredWidth(20);
            jTable1.getColumnModel().getColumn(1).setResizable(false);
            jTable1.getColumnModel().getColumn(1).setPreferredWidth(650);
        }

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Search Result For " + srs);

        back.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        back.setForeground(new java.awt.Color(102, 0, 102));
        back.setText("Back");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });

        logout.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        logout.setForeground(new java.awt.Color(102, 0, 102));
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
                .addComponent(back)
                .addGap(356, 356, 356)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 375, Short.MAX_VALUE)
                .addComponent(logout))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(logout, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addGap(25, 25, 25))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 521, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        // TODO add your handling code here:
        home_in ok = new home_in();
        this.dispose();
    }//GEN-LAST:event_backActionPerformed

    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed
        // TODO add your handling code here:
        login ko = new login();
        this.dispose();
    }//GEN-LAST:event_logoutActionPerformed

    public static void main(String args[]) 
    {
        java.awt.EventQueue.invokeLater(new Runnable() 
        {
            public void run() 
            {
//                try {
//                    new search_name("rahat").setVisible(true);
//                } catch (SQLException ex) {
//                    Logger.getLogger(search_name.class.getName()).log(Level.SEVERE, null, ex);
//                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back;
    public javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton logout;
    // End of variables declaration//GEN-END:variables
}
