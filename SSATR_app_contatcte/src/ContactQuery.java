import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DoubleD
 */
public class ContactQuery {
    
    public void  insertContact(Contact cont){
        
        Connection con = myConnection.getConnection();
        PreparedStatement ps;
        
        try {
            ps = con.prepareStatement("INSERT INTO `mycontacts`(`Nume`, `Prenume`, `GrupC`, `Telefon`, `Email`, `Adresa`, `Imagine`, `UserId`) VALUES (?,?,?,?,?,?,?,?)");
            ps.setString(1, cont.getNume());
            ps.setString(2, cont.getPrenume());
            ps.setString(3, cont.getGrup());
            ps.setString(4, cont.getTelefon());
            ps.setString(5, cont.getEmail());
            ps.setString(6, cont.getAdresa());
            ps.setBytes(7, cont.getFoto());
            ps.setInt(8, cont.getUid());
            
            if (ps.executeUpdate() != 0){
                    JOptionPane.showMessageDialog(null, "Un nou contact a fost adăugat");
                
            }
                else{
                    JOptionPane.showMessageDialog(null, "Ceva nu a mers");
                    
                }
            
        } catch (SQLException ex) {
            Logger.getLogger(ContactQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
     
    }
    
    public void  editContact(Contact cont, boolean  withImage){
        
        Connection con = myConnection.getConnection();
        PreparedStatement ps;
        String updateQuery = "";
        
        if (withImage == true) // daca se doreste si modificarea imaginii de profil
        {
            updateQuery = "UPDATE `mycontacts` SET `Nume` = ?,`Prenume`= ?,`GrupC`= ?,`Telefon`= ?,`Email`= ?,`Adresa`= ?,`Imagine`= ? WHERE `id`= ?";
        
             try {
            ps = con.prepareStatement(updateQuery);
            ps.setString(1, cont.getNume());
            ps.setString(2, cont.getPrenume());
            ps.setString(3, cont.getGrup());
            ps.setString(4, cont.getTelefon());
            ps.setString(5, cont.getEmail());
            ps.setString(6, cont.getAdresa());
            ps.setBytes(7, cont.getFoto());
            ps.setInt(8, cont.getCid());
            
            if (ps.executeUpdate() != 0){
                    JOptionPane.showMessageDialog(null, "Contactul a fost editat cu succes");
                
            }
                else{
                    JOptionPane.showMessageDialog(null, "Ceva nu a mers");
                    
                }
            
        } catch (SQLException ex) {
            Logger.getLogger(ContactQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
        }else{
            updateQuery = "UPDATE `mycontacts` SET `Nume` = ?,`Prenume`= ?,`GrupC`= ?,`Telefon`= ?,`Email`= ?,`Adresa`= ? WHERE `id`= ?";
        
             try {
            ps = con.prepareStatement(updateQuery);
            ps.setString(1, cont.getNume());
            ps.setString(2, cont.getPrenume());
            ps.setString(3, cont.getGrup());
            ps.setString(4, cont.getTelefon());
            ps.setString(5, cont.getEmail());
            ps.setString(6, cont.getAdresa());            
            ps.setInt(7, cont.getCid());
            
            if (ps.executeUpdate() != 0){
                    JOptionPane.showMessageDialog(null, "Contactul a fost editat cu succes");
                
            }
                else{
                    JOptionPane.showMessageDialog(null, "Ceva nu a mers");
                    
                }
            
        } catch (SQLException ex) {
            Logger.getLogger(ContactQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
        }     
           
    }
    
     public void  deleteContact(int cid){
        
        Connection con = myConnection.getConnection();
        PreparedStatement ps;
        
        try {
            ps = con.prepareStatement(" DELETE FROM `mycontacts` WHERE `id`= ? ");
            ps.setInt(1, cid);
            
            
            if (ps.executeUpdate() != 0){
                    JOptionPane.showMessageDialog(null, "Contactul a fost sters");
                
            }
                else{
                    JOptionPane.showMessageDialog(null, "Ceva nu a mers");
                    
                }
            
        } catch (SQLException ex) {
            Logger.getLogger(ContactQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
     
    }
    
    
    // creez o lista cu contactele
    public ArrayList<Contact> contactList( int userId){
        
        ArrayList<Contact> clist = new ArrayList<Contact>();
        
        Connection con = myConnection.getConnection();
        Statement st;
        ResultSet rs;
        
        try {
            st = con.createStatement();
            rs = st.executeQuery("SELECT `id`, `Nume`, `Prenume`, `GrupC`, `Telefon`, `Email`, `Adresa`, `Imagine` FROM `mycontacts` WHERE userId = " + userId);
        
            Contact ct;
            
            while (rs.next()) {                
               ct = new Contact(rs.getInt("id"), 
                       rs.getString("Nume"), 
                       rs.getString("Prenume"), 
                       rs.getString("GrupC"), 
                       rs.getString("Telefon"), 
                       rs.getString("Email"), 
                       rs.getString("Adresa"), 
                       rs.getBytes("Imagine"), 
                       userId);
               
               clist.add(ct);
            }
            
            
            
        } catch (SQLException ex) {
            Logger.getLogger(ContactQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
       
        return clist;
    }
    
    
}
