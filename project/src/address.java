import java.sql.SQLException;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class address extends javax.swing.JFrame 
{
    public ArrayList<String> Relist;
    public String id;

    public address(ArrayList Rlist, String s_id) 
    {
        Relist = new ArrayList<String>();
        id = s_id;
        Relist = Rlist;
        initComponents();
        this.setResizable(false);
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        st_id1 = new javax.swing.JLabel();
        st_id3 = new javax.swing.JLabel();
        st_id4 = new javax.swing.JLabel();
        st_id5 = new javax.swing.JLabel();
        st_id6 = new javax.swing.JLabel();
        st_id7 = new javax.swing.JLabel();
        road = new javax.swing.JTextField();
        p_o = new javax.swing.JTextField();
        house = new javax.swing.JTextField();
        village = new javax.swing.JTextField();
        p_s = new javax.swing.JTextField();
        st_id8 = new javax.swing.JLabel();
        block = new javax.swing.JTextField();
        district = new javax.swing.JTextField();
        st_id9 = new javax.swing.JLabel();
        sameAsBefor = new javax.swing.JComboBox();
        next = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1100, 650));

        jLabel1.setFont(new java.awt.Font("Courier New", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 0, 102));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText(" Add Present Address");

        st_id1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        st_id1.setForeground(new java.awt.Color(102, 0, 102));
        st_id1.setText(" Hose no. :");

        st_id3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        st_id3.setForeground(new java.awt.Color(102, 0, 102));
        st_id3.setText(" R/A or Village: ");

        st_id4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        st_id4.setForeground(new java.awt.Color(102, 0, 102));
        st_id4.setText(" Road:");

        st_id5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        st_id5.setForeground(new java.awt.Color(102, 0, 102));
        st_id5.setText(" District :");

        st_id6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        st_id6.setForeground(new java.awt.Color(102, 0, 102));
        st_id6.setText(" P / S: ");

        st_id7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        st_id7.setForeground(new java.awt.Color(102, 0, 102));
        st_id7.setText(" P / O: ");

        road.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        p_o.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        house.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        village.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        st_id8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        st_id8.setForeground(new java.awt.Color(102, 0, 102));
        st_id8.setText(" Block:");

        block.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        st_id9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        st_id9.setForeground(new java.awt.Color(102, 0, 102));
        st_id9.setText(" Same As Before: ");

        sameAsBefor.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        sameAsBefor.setForeground(new java.awt.Color(0, 102, 0));
        sameAsBefor.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "     Yes", "     No" }));

        next.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        next.setForeground(new java.awt.Color(0, 153, 0));
        next.setText("NEXT");
        next.setActionCommand("add_address");
        next.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(st_id5, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(st_id6, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(st_id7, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(st_id8, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(st_id3, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(st_id9, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(44, 44, 44)
                                .addComponent(sameAsBefor, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(st_id4, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(next, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(st_id1, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(48, 48, 48)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(road, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(house, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(block, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(p_o, javax.swing.GroupLayout.DEFAULT_SIZE, 320, Short.MAX_VALUE)
                                        .addComponent(village)
                                        .addComponent(p_s)
                                        .addComponent(district)))))
                        .addGap(107, 107, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(st_id9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sameAsBefor, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(st_id1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(house, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(st_id4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(road, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(st_id8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(block, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(st_id3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(village, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(st_id7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(p_o, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(st_id6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(p_s, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(st_id5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(district, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addComponent(next, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(102, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(310, 310, 310)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 454, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(258, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(216, 216, 216))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextActionPerformed

        String s1, s2, s3, s4, s5,s6, s7, s8, s9, s10;
        ArrayList<String> list = new ArrayList<String>();
        s2 = "Present";
        s3 = sameAsBefor.getSelectedItem().toString();
        s3 = s3.trim();
        if(s3.equals("Yes"))
        {
             DbConnect ob6 = new DbConnect();
             Relist.set(0, s2);
             Relist.set(1, s3);
             
             DbConnect ob5 = new DbConnect();
             boolean b3 = false;
            
              try 
              {
                  b3 = ob5.insertAddress(Relist, id);
              } catch (SQLException ex) 
              {
                    Logger.getLogger(address.class.getName()).log(Level.SEVERE, null, ex);
              }
              
              if(b3)
                  JOptionPane.showMessageDialog(null, "Data Save Properly...!!!", "Message" ,JOptionPane.INFORMATION_MESSAGE);
                
              add_result ob1 = new add_result(id);
              this.dispose();    
        }
        else
        {
            list.add(s2);
            list.add(s3);
            s4 = house.getText();
            s4 = s4.trim(); list.add(s4);
            s4 = road.getText();
            s4 = s4.trim(); list.add(s4);
            s4 = block.getText();
            s4 = s4.trim(); list.add(s4);
            s4 = village.getText();
            s4 = s4.trim(); list.add(s4);
            s4 = p_o.getText();
            s4 = s4.trim(); list.add(s4);
            s4 = p_s.getText();
            s4 = s4.trim(); list.add(s4);
            s4 = district.getText();
            s4 = s4.trim(); list.add(s4);
            
            Iterator<String> itr = list.iterator();
            int cnt=0;
            while(itr.hasNext())
            {
                s2 = itr.next();
                
                if(s2.isEmpty())
                {
                    cnt++;
                    break;
                }
            }
            
            if(cnt == 0)
            {
                DbConnect ob5 = new DbConnect();
                boolean b3 = false;
                try 
                {
                    b3 = ob5.insertAddress(list, id);
                } catch (SQLException ex) 
                {
                    Logger.getLogger(permanent_address.class.getName()).log(Level.SEVERE, null, ex);
                }
                if(b3)
                    JOptionPane.showMessageDialog(null, "Data Save Properly...!!!", "Message" ,JOptionPane.INFORMATION_MESSAGE);
                
                add_result ob1 = new add_result(id);
                this.dispose();
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Fill Student Detail Properly...!!!", "Warning" ,JOptionPane.ERROR_MESSAGE);
            }
        }   
    }//GEN-LAST:event_nextActionPerformed
 
    public static void main(String args[]) 
    {   
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               //new address().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField block;
    private javax.swing.JTextField district;
    private javax.swing.JTextField house;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton next;
    private javax.swing.JTextField p_o;
    private javax.swing.JTextField p_s;
    private javax.swing.JTextField road;
    private javax.swing.JComboBox sameAsBefor;
    private javax.swing.JLabel st_id1;
    private javax.swing.JLabel st_id3;
    private javax.swing.JLabel st_id4;
    private javax.swing.JLabel st_id5;
    private javax.swing.JLabel st_id6;
    private javax.swing.JLabel st_id7;
    private javax.swing.JLabel st_id8;
    private javax.swing.JLabel st_id9;
    private javax.swing.JTextField village;
    // End of variables declaration//GEN-END:variables
}
