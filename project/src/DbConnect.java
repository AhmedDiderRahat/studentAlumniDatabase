import java.sql.*;
import java.util.*;

public class DbConnect 
{
    public Connection con;
    public Statement st, st1;
    public ResultSet rs, rs1;
    
    public DbConnect()
    {
        try 
        {
            Class.forName("com.mysql.jdbc.Driver");
            
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student_alumni", "root", "");
            
            st = con.createStatement();  
        } catch (ClassNotFoundException | SQLException e) 
        {
            System.out.println("Exception" + e);
        }
    }
    
    public boolean getData(String s1, String s2) throws SQLException
    {
        int cnt = 0;
        try 
        {      
            String query = "select * from admin";
            rs = st.executeQuery(query);
           
            while(rs.next()) 
            {
                String user_name = rs.getString("user_name");
                String pass = rs.getString("password");

                if(user_name.equals(s1) && pass.equals(s2))
                {
                    cnt++;
                    break;
                }
            }
           
        } catch (SQLException ex) 
        {
             System.err.println("Exception: " + ex);
        }        
        
        con.close();
        if(cnt == 1)
            return true;
        else
            return false;
    }
    
    public void testInsert(String s1, String s2) throws SQLException
    {
        String query = " insert into admin (user_name, password)" + " values (?, ?)";

        PreparedStatement preparedStmt = con.prepareStatement(query);
        preparedStmt.setString (1, s1);
        preparedStmt.setString (2, s2);  
        preparedStmt.execute();    
        con.close();  
    }
    
    public void resultInsert(String s0, ArrayList list) throws SQLException
    {    
        String s, query;
        query = "insert into results (id, re_1, re_2, re_3, re_4, re_5, re_6, re_7, re_8, re_9, re_10, re_11, re_12, ce_1, ce_2, ce_3, ce_4, ce_5, ce_6, ce_7, ce_8, ce_9, ce_10, ce_11, ce_12)"  + " values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        
        Iterator<String> it = list.iterator();
        
        PreparedStatement preparedStmt1;
        preparedStmt1 = con.prepareStatement(query);
        preparedStmt1.setString(1, s0);
        
        int i=2;
        while(it.hasNext())
        {
            s = it.next();
            float d = Float.parseFloat(s);
            preparedStmt1.setFloat(i, d);
            i++;     
        }
        preparedStmt1.execute();
        con.close();
    }
   
    public void insertActivity(String s1, String s2, String s3, String s4) throws SQLException
    {
        String query = " insert into activity (st_id, club, designation, year)" + " values (?, ?, ?, ?)";

        PreparedStatement preparedStmt = con.prepareStatement(query);
        preparedStmt.setString (1, s1);
        preparedStmt.setString (2, s2);   
        preparedStmt.setString (3, s3);
        preparedStmt.setString (4, s4); 
        preparedStmt.execute();    
        con.close();  
    }
     
    public boolean insertAchivement(String s1, boolean s2, boolean s3, boolean s4, boolean s5, boolean  s6) throws SQLException
    {
        String query = "insert into achivement (st_id, chancellor, vc, dean, dgree_honurs, not_applicable)" + " values (?, ?, ?, ?, ?, ?)";

        PreparedStatement preparedStmt = con.prepareStatement(query);
        preparedStmt.setString (1, s1);
        preparedStmt.setBoolean(2, s2);   
        preparedStmt.setBoolean(3, s3);
        preparedStmt.setBoolean(4, s4); 
        preparedStmt.setBoolean(5, s5); 
        preparedStmt.setBoolean(6, s6); 
        
        preparedStmt.execute();    
        con.close();  
        return  true;            
    }
    
    public boolean insertAddress(ArrayList list, String temp) throws SQLException 
    {  
        String s, query = " insert into addraess(st_id, add_type, sab, house, road, block, village, p_o, p_s, district)" + "values(?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        Iterator<String> it = list.iterator();
       
        PreparedStatement sta = con.prepareStatement(query);
        sta.setString(1, temp);
        
        int i=2;
        while(it.hasNext())
        {
            s = it.next();
            sta.setString(i, s);
            i++; 
        }   
        sta.execute();    
        con.close();         
        return true;   
    }
    
    public boolean test_data(ArrayList list) throws SQLException
    {
        st1 = con.createStatement();
        int cnt = 0;
        try 
        {      
            String qry = "select * from information";
            rs1 = st1.executeQuery(qry);
           
            while(rs1.next())               
            {
                String id = rs1.getString("id");

                if(id.equals(list.get(0)))
                {
                    cnt++;
                    break;
                }
            }
           
        } catch (SQLException ex) 
        {
             System.err.println("Exception: " + ex);
        }    
    
        if(cnt == 1) 
        {     
            con.close(); 
            return true;  
        }
        else
            return false;
    }
    
    public void add_info(ArrayList list) throws SQLException 
    { 
        String s, query = " insert into information(id, stduent_name, father_name, mother_name, dob, mobile_no, e_mail, blood_group, religion, pass_year, convaction_year)" + "values(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        Iterator<String> it = list.iterator();
        PreparedStatement sta = con.prepareStatement(query);
        
        int i=1;
        while(it.hasNext())
        {
            s = it.next();         
            sta.setString(i++, s);        
        }
        
        sta.execute();
        con.close();
    }

    public boolean test_data2(String str) throws SQLException
    {
        st1 = con.createStatement();
        int cnt = 0;
        try 
        {      
            String qry = "select * from results";
            rs1 = st1.executeQuery(qry);
           
            while(rs1.next())               
            {
                String id = rs1.getString("id");
                if(id.equals(str))
                {
                    cnt++;
                    break;
                }
            }
           
        } catch (SQLException ex) 
        {
             System.err.println("Exception: " + ex);
        }    
    
        if(cnt == 1) 
        {     
            con.close(); 
            return true;  
        }
        else
            return false;
    }   
    
    public boolean isNumeric(ArrayList list) throws SQLException
    { 
        Iterator<String> it = list.iterator();
        String str;
        int c=0;
        while(it.hasNext())
        {
            str = it.next();
            try
            {
                  double d = Double.parseDouble(str);
            }
            catch(NumberFormatException nfe)
            {
                c++;
                break;
            }
        }
        con.close();
        if(c==0)
            return true;
        return false;
    }

    
    
    public void research_project_add(String id, ArrayList list) throws SQLException
    {
        String s, query = " insert into research_project(st_id, rp_type, rp_area, rp_title, supervisor, year, paper)" + "values(?, ?, ?, ?, ?, ?, ?)";
        Iterator<String> it = list.iterator();
        
        PreparedStatement sta = con.prepareStatement(query);
        sta.setString(1, id);  
        int i=2;
        while(it.hasNext())
        {
            s = it.next();         
            sta.setString(i++, s);     
        }
        sta.execute();
        con.close();
    }
       
    public void work_in(String id, String s1, String s2, String s3, String s4) throws SQLException
    {
        String query = " insert into work_in (st_id, type, company, designation, year)" + " values (?, ?, ?, ?, ?)";

        PreparedStatement preparedStmt = con.prepareStatement(query);
        preparedStmt.setString (1, id);
        preparedStmt.setString (2, s1);
        preparedStmt.setString (3, s2);   
        preparedStmt.setString (4, s3);
        preparedStmt.setString (5, s4); 
        preparedStmt.execute();    
        con.close();  
    }
}