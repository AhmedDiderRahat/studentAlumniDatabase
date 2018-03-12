import java.sql.SQLException;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

public class permanent_address extends javax.swing.JFrame {

    public ArrayList<String> Relist;
    public String id;
    public permanent_address(String s_id) 
    {
        Relist = new ArrayList<String>();
        id = s_id;
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
        st_id2 = new javax.swing.JLabel();
        st_id9 = new javax.swing.JLabel();
        st_id10 = new javax.swing.JLabel();
        st_id11 = new javax.swing.JLabel();
        st_id12 = new javax.swing.JLabel();
        st_id13 = new javax.swing.JLabel();
        house = new javax.swing.JTextField();
        road = new javax.swing.JTextField();
        block = new javax.swing.JTextField();
        village = new javax.swing.JTextField();
        p_o = new javax.swing.JTextField();
        p_s = new javax.swing.JTextField();
        dis = new javax.swing.JTextField();
        next = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1100, 650));

        jLabel1.setFont(new java.awt.Font("Courier New", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 0, 102));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText(" Add Permanet Address");

        st_id1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        st_id1.setForeground(new java.awt.Color(102, 0, 102));
        st_id1.setText("Hose No :");

        st_id2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        st_id2.setForeground(new java.awt.Color(102, 0, 102));
        st_id2.setText("Road No :");

        st_id9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        st_id9.setForeground(new java.awt.Color(102, 0, 102));
        st_id9.setText("Block:");

        st_id10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        st_id10.setForeground(new java.awt.Color(102, 0, 102));
        st_id10.setText("Police Station:");

        st_id11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        st_id11.setForeground(new java.awt.Color(102, 0, 102));
        st_id11.setText("Post Office:");

        st_id12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        st_id12.setForeground(new java.awt.Color(102, 0, 102));
        st_id12.setText("Village or R/A:");

        st_id13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        st_id13.setForeground(new java.awt.Color(102, 0, 102));
        st_id13.setText("District:");

        house.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        road.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        block.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        village.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        p_o.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        p_s.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        dis.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        next.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        next.setForeground(new java.awt.Color(0, 153, 51));
        next.setText("Next");
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
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(st_id1, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(st_id2, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(st_id9, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(st_id12, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(st_id11, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(st_id13, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(st_id10, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(p_s, javax.swing.GroupLayout.PREFERRED_SIZE, 362, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(p_o, javax.swing.GroupLayout.PREFERRED_SIZE, 362, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(block, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(road, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(house, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(village, javax.swing.GroupLayout.PREFERRED_SIZE, 362, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dis, javax.swing.GroupLayout.PREFERRED_SIZE, 362, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(next)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(st_id1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(house, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(st_id2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(road, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(st_id9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(block, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(st_id12, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(village, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(st_id11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(p_o, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(st_id10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(st_id13, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(p_s, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dis, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(next)
                .addContainerGap(67, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(317, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(370, 370, 370))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(255, 255, 255))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(133, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextActionPerformed
        // TODO add your handling code here:
        ArrayList<String> list = new ArrayList<String>();
        String s1, s2, s3, s4, s5, s6, s7, s8, s9;
        
        s1 = id;
        s1 = "Permanent";
        list.add(s1);
        s1 = "No";
        list.add(s1);
        s1 = house.getText();
        s1 = s1.trim();
        list.add(s1);
        s1 = road.getText();
        s1 = s1.trim();
        list.add(s1);
        s1 = block.getText();
        s1 = s1.trim();
        list.add(s1);
        s1 = village.getText();
        s1 = s1.trim();
        list.add(s1);
        s1 = p_o.getText();
        s1 = s1.trim();
        list.add(s1);
        s1 = p_s.getText();
        s1 = s1.trim();
        list.add(s1);
        s1 = dis.getText();
        s1 = s1.trim();
        list.add(s1);
        
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
                JOptionPane.showMessageDialog(null, "Data Save Properly...!!!", "Warning" ,JOptionPane.INFORMATION_MESSAGE);
            
            address ob76 = new address(list, id);
            this.dispose();
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Fill Student Detail Properly...!!!", "Warning" ,JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_nextActionPerformed

    public static void main(String args[]) 
    {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new permanent_address("").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField block;
    private javax.swing.JTextField dis;
    private javax.swing.JTextField house;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton next;
    private javax.swing.JTextField p_o;
    private javax.swing.JTextField p_s;
    private javax.swing.JTextField road;
    private javax.swing.JLabel st_id1;
    private javax.swing.JLabel st_id10;
    private javax.swing.JLabel st_id11;
    private javax.swing.JLabel st_id12;
    private javax.swing.JLabel st_id13;
    private javax.swing.JLabel st_id2;
    private javax.swing.JLabel st_id9;
    private javax.swing.JTextField village;
    // End of variables declaration//GEN-END:variables
}
