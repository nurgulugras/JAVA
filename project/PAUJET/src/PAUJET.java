
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author acer
 */
public class PAUJET {
    private Connection con = null;
    private Statement statement = null;
    private PreparedStatement preparedStatement = null;
    
    /**
     *
     * @return
     */
    public ArrayList<Rezervasyonlar> RezervasyonGetir(){
        
        ArrayList<Rezervasyonlar> cikti=new ArrayList<>();
        String sorgu="SELECT * FROM rezervasyonlar WHERE uye='"+GirisEkrani.kullanici_adi+"'";
        try {
            preparedStatement = con.prepareStatement(sorgu);
            
            ResultSet rs = preparedStatement.executeQuery();
            while(rs.next()){
            int seferno=rs.getInt("sefer_no");
            int koltuk_no=rs.getInt("koltuk_no");
            String nereden=rs.getString("nereden");
            String nereye=rs.getString("nereye");
            String tarih=rs.getString("tarih");
            String kacta=rs.getString("kacta");
            String uye=rs.getString("uye");
            cikti.add(new Rezervasyonlar(seferno,koltuk_no,nereden,nereye,tarih,kacta,uye));
            }
            return cikti;
        } catch (SQLException ex) {
            Logger.getLogger(PAUJET.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
   public void uyeOl(String ad,String soyad,String dogum_yili,String ev_adresi,String is_adresi,String mail,String sifre){
       String sql= "INSERT INTO uyeler(uye_adi,uye_soyadi,dogum_tarihi,ev_adresi,is_adresi,mail,sifre) VALUES(?,?,?,?,?,?,?)";
        try {
            preparedStatement=con.prepareStatement(sql);
            preparedStatement.setString(1,ad);
            preparedStatement.setString(2,soyad);
            preparedStatement.setString(3,dogum_yili);
            preparedStatement.setString(4,ev_adresi);
            preparedStatement.setString(5,is_adresi);
            preparedStatement.setString(6,mail);
            preparedStatement.setString(7,sifre);
            preparedStatement.executeUpdate();
            
        } catch (SQLException ex) {
            Logger.getLogger(PAUJET.class.getName()).log(Level.SEVERE, null, ex);
        }
        
   }
   public void HavalimaniEkle(String hava_limani){
        
            String sql="insert into havalimanlari(hava_alani)values(?)";
        try {
            
            preparedStatement=con.prepareStatement(sql);
            preparedStatement.setString(1,hava_limani);
            preparedStatement.executeUpdate();
            
        } catch (SQLException ex) {
            Logger.getLogger(PAUJET.class.getName()).log(Level.SEVERE, null, ex);
        }
        
   }
    public void uyeGuncelle(int uye_id,String ad,String soyad,String dogum_yili,String ev_adresi,String is_adresi,String mail,String sifre){
          
        try {
            
            String sql="Update uyeler Set uye_adi=? , uye_soyadi=? , dogum_tarihi=? , ev_adresi=? , is_adresi=? , mail=? , sifre=? where uye_id= '"+uye_id+"'";
            preparedStatement=con.prepareStatement(sql);
            preparedStatement.setString(1, ad);
            preparedStatement.setString(2, soyad);
            preparedStatement.setString(3, dogum_yili);
            preparedStatement.setString(4, ev_adresi);
            preparedStatement.setString(5, is_adresi);
            preparedStatement.setString(6, mail);
            preparedStatement.setString(7, sifre);
            preparedStatement.executeUpdate();
            } catch (SQLException ex) {
            Logger.getLogger(PAUJET.class.getName()).log(Level.SEVERE, null, ex);
        }
   }
    public void HavaAlaniGüncelle(int hava_alani_id,String hava_alani){
        try {
            
            String sql="Update havalimanlari Set hava_alani=? where hava_alani_id= '"+hava_alani_id+"'";
            preparedStatement=con.prepareStatement(sql);
            preparedStatement.setString(1, hava_alani);
          
            preparedStatement.executeUpdate();
            } catch (SQLException ex) {
            Logger.getLogger(PAUJET.class.getName()).log(Level.SEVERE, null, ex);
        }
   }
    public void SeferGüncelle(int seferno,int tipno,String nereden,String nereye,String nezaman,String kacta)
    {
      try {
            
            String sql="Update seferler Set tipno=? nereden=? nereye=? nezaman=? kacta=? where seferno= '"+seferno+"'";
            preparedStatement=con.prepareStatement(sql);
            preparedStatement.setInt(1,tipno);
            preparedStatement.setString(2, nereden);
            preparedStatement.setString(3, nereye);
            preparedStatement.setString(4, nezaman);
            preparedStatement.setString(5, kacta);
            
            
          
            preparedStatement.executeUpdate();
            } catch (SQLException ex) {
            Logger.getLogger(PAUJET.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
   public boolean girisYap(String kullanici_adi,String parola){
       String sql= "Select * from uyeler where mail = ? and sifre = ?";
       
        try {
            preparedStatement = con.prepareStatement(sql);
            preparedStatement.setString(1, kullanici_adi);
            preparedStatement.setString(2, parola);
            
            ResultSet rs=preparedStatement.executeQuery();
            return rs.next();
        } catch (SQLException ex) {
            Logger.getLogger(PAUJET.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
   }
    public void listele(JComboBox cb){
        try{
            String sql="select * from havalimanlari";
            preparedStatement=con.prepareStatement(sql);
            preparedStatement.executeQuery();
            ResultSet rs=preparedStatement.executeQuery();
            while(rs.next()){
                String name=rs.getString("hava_alani");
                cb.addItem(name);
                
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
            
        }
    }
     public void listele1(JComboBox cb){
        try{
            String sql="select * from havalimanlari";
            preparedStatement=con.prepareStatement(sql);
            preparedStatement.executeQuery();
            ResultSet rs=preparedStatement.executeQuery();
            while(rs.next()){
                String name=rs.getString("hava_alani");
                cb.addItem(name);
                
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
            
        }
    }
     public void seferara(JTable tb,String nereden,String nereye,String tarih){
          try{
            statement=con.createStatement();
            preparedStatement.executeQuery();
            ResultSet rs=statement.executeQuery("SELECT s.seferno,h.tip,s.nereden,s.nereye,s.nezaman,s.kacta FROM seferler s INNER JOIN haraket_tipleri h ON h.tipno=s.tipno WHERE nereden LIKE '%" + nereden + "%' and  nereye LIKE '%" + nereye + "%'and  nezaman LIKE '%" + tarih + "%'");

            int sutunsayisi=rs.getMetaData().getColumnCount();
            int count = rs.getRow();
            DefaultTableModel model = new DefaultTableModel();
          
            for(int i=1;i<=sutunsayisi;i++)
            model.addColumn(rs.getMetaData().getColumnName(i));
      
            while(rs.next()){
            Object[] row=new Object[sutunsayisi];
            for(int i=1;i<=sutunsayisi;i++)
            row[i-1]=rs.getObject(i);
            model.addRow(row);
         }
             tb.setModel(model);
         }
         catch(Exception e){
             System.out.println("e");
          }
     }
     public void seferekle(int tipno,String nereden,String nereye,String nezaman,String kacta){
          
           String sql="INSERT INTO seferler(tipno, nereden, nereye,nezaman,kacta) VALUES (?,?,?,?,?)";
           try{
             
            preparedStatement=con.prepareStatement(sql);
            preparedStatement.setInt(1, tipno);
            preparedStatement.setString(2, nereden);
            preparedStatement.setString(3, nereye);
            preparedStatement.setString(4, nezaman);
            preparedStatement.setString(5, kacta);
            
            
            preparedStatement.executeUpdate();
         }
             
         
         catch(Exception e){
             System.out.println("e");
          }
     }
          public void koltuklar(JTable tb,int seferno){
          try{
            
            statement=con.createStatement();
            preparedStatement.executeQuery();
            ResultSet rs=statement.executeQuery("SELECT k.koltuk_no,k.seferno,k.fiyat FROM koltuklar k INNER JOIN seferler s ON s.seferno=k.seferno WHERE s.seferno="+seferno+"");

            int sutunsayisi=rs.getMetaData().getColumnCount();
            int count = rs.getRow();
            DefaultTableModel model = new DefaultTableModel();
          
            for(int i=1;i<=sutunsayisi;i++)
            model.addColumn(rs.getMetaData().getColumnName(i));
      
            while(rs.next()){
            Object[] row=new Object[sutunsayisi];
            for(int i=1;i<=sutunsayisi;i++)
            row[i-1]=rs.getObject(i);
            model.addRow(row);
         }

        
         tb.setModel(model);
         }
         catch(Exception e){
             System.out.println("e");}
     }
          public void RezevasyonGoruntule(JTable tb,String uye){
              try{
            
            statement=con.createStatement();
            preparedStatement.executeQuery();
            ResultSet rs=statement.executeQuery("SELECT r.sefer_no,r.koltuk_no,r.nereden,r.nereye,r.tarih,r.kacta,r.uye FROM rezervasyonlar r INNER JOIN uyeler u ON u.mail=r.uye WHERE r.uye="+uye+"");

            int sutunsayisi=rs.getMetaData().getColumnCount();
            int count = rs.getRow();
            DefaultTableModel model = new DefaultTableModel();
          
            for(int i=1;i<=sutunsayisi;i++)
            model.addColumn(rs.getMetaData().getColumnName(i));
      
            while(rs.next()){
            Object[] row=new Object[sutunsayisi];
            for(int i=1;i<=sutunsayisi;i++)
            row[i-1]=rs.getObject(i);
            model.addRow(row);
         }

        
         tb.setModel(model);
         }
         catch(Exception e){
             System.out.println("e");}
          }
           public void rezervasyon(JTable tb,int seferno,int koltukno,String nereden,String nereye,String tarih,String kacta,String uye){
               String sql="INSERT INTO rezervasyonlar(sefer_no, koltuk_no, nereden, nereye,tarih,kacta,uye) VALUES (?,?,?,?,?,?,?)";
          try{
            
            
            
            preparedStatement=con.prepareStatement(sql);
            preparedStatement.setInt(1, seferno);
            preparedStatement.setInt(2, koltukno);
            preparedStatement.setString(3, nereden);
            preparedStatement.setString(4, nereye);
            preparedStatement.setString(5, tarih);
            preparedStatement.setString(6, kacta);
            preparedStatement.setString(7, uye);
            
            preparedStatement.executeUpdate();
         }

        
         
   
         catch(Exception e){
             System.out.println("e");}
     }
   
   
    
    public PAUJET()
    {
        String url = "jdbc:mysql://" + Database.host + ":" + Database.port + "/" + Database.db_ismi+ "?useUnicode=true&characterEncoding=utf8";
        
         
        try {
            
            Class.forName("com.mysql.jdbc.Driver");
            
        } catch (ClassNotFoundException ex) {
            System.out.println("Driver Bulunamadi....");
        }
        
        
        try {
            con = DriverManager.getConnection(url, Database.kullanici_adi, Database.parola);
            System.out.println("Baglanti basarili...");
            
            
        } catch (SQLException ex) {
            System.out.println("Baglanti basarisiz...");
            //ex.printStackTrace();
        }
        
        
        
    }
   
    public static void main(String[] args){
        PAUJET islem=new PAUJET();
    }

    void rezervasyon(JTable tRezervasyon, int seferno, int koltukno, String toString, String toString0, String toString1, String format) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void seferara(JTable tSefer, String toString, String toString0, String toString1, String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    
    
    
    
}
