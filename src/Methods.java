
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

class Methods {
    public void passwordEdit(JFrame frame, String oldPass, String newPass){
        DB db = new DB();
        DB db2 = new DB();
        String query = "Call prcSign()";
        PreparedStatement prs = db.preBaglan(query);
        try {
            ResultSet rs = prs.executeQuery();
            while(rs.next()){
                if(!oldPass.equals(rs.getString("upassword"))){
                    JOptionPane.showMessageDialog(frame, "Parolanızı yanlış girdiniz...");
                }else if(!oldPass.equals(newPass)){
                    String quer = "CALL prcPasswordEdit(?)";
                    PreparedStatement prst = db2.preBaglan(quer);
                    prst.setString(1, newPass);
                    int update = prst.executeUpdate();
                    if(update > 0){
                        JOptionPane.showMessageDialog(frame, "Parolanız başarıyla değiştirildi...");
                    }else{
                        JOptionPane.showMessageDialog(frame, "Parola değiştirilemedi. Lütfen tekrar deneyiniz...");
                    }
                }else {
                    JOptionPane.showMessageDialog(frame, "Eski bir parolanızı girdiniz...");
                }
            }
        } catch (Exception e) {
            System.err.println("passwordEdit " + e);
        }finally{
            db.kapat();
            db2.kapat();
        }
}
    public void categoryAdd(JFrame Frame, String categoryName, String categoryStandNumber, String categoryStandAdress){
        DB db = new DB();
        String query = "CALL prcCategoryAdd(?,?,?)";
        try {
            if (categoryName.equals("") || categoryStandNumber.equals("") || categoryStandAdress.equals("")) {
                JOptionPane.showMessageDialog(Frame, "Lütfen boş alan bırakmayınız...");
            }else{
                PreparedStatement prs = db.preBaglan(query);
                prs.setString(1, categoryName);
                prs.setString(2, categoryStandNumber);
                prs.setString(3, categoryStandAdress);
                int add = prs.executeUpdate();
                if (add > 0) {
                    JOptionPane.showMessageDialog(Frame, "Kategori başarıyla eklendi...");
                }else{
                    JOptionPane.showMessageDialog(Frame, "Kategori eklenemedi. Lütfen tekrar deneyiniz...");
                }
            }
        } catch (Exception e) {
            System.err.println("categoryAdd " + e);
        } finally{
            db.kapat();
        }
    }
    public void bookAdd(JFrame Frame, String bookType, String bookName, String bookCommentary, String writerName, String publisher, String bookLang, String shelfNumber){
        DB db = new DB();
        String query = "CALL prcBookAdd(?,?,?,?,?,?,?)";
        try {
            if (bookType.equals("") || bookName.equals("") || writerName.equals("") || bookLang.equals("") || shelfNumber.equals("")) {
                JOptionPane.showMessageDialog(Frame, "Lütfen boş alan bırakmayınız...");
            }else{
                PreparedStatement prs = db.preBaglan(query);
                prs.setString(1, bookType);
                prs.setString(2, bookName);
                prs.setString(3, bookCommentary);
                prs.setString(4, writerName);
                prs.setString(5, publisher);
                prs.setString(6, bookLang);
                prs.setString(7, shelfNumber);
                int add = prs.executeUpdate();
                if (add > 0) {
                    JOptionPane.showMessageDialog(Frame, "Kitap başarıyla eklendi...");
                }else{
                    JOptionPane.showMessageDialog(Frame, "Kitap eklenemedi. Lütfen tekrar deneyiniz...");
                }
            }
        } catch (Exception e) {
            System.err.println("bookAdd " + e);
        } finally{
            db.kapat();
        }
    }
    public void categoryEdit(JFrame Frame, String categoryID, String categoryName, String categoryStandNumber, String categoryStandAdress){
        DB db = new DB();
        
        try {
                String query = "CALL prcCategoryEdit(?,?,?,?)";
                PreparedStatement prs = db.preBaglan(query);
                prs.setString(1, categoryID);
                prs.setString(2, categoryName);
                prs.setString(3, categoryStandNumber);
                prs.setString(4, categoryStandAdress);
                int uptade = prs.executeUpdate();
                if (uptade > 0) {
                        JOptionPane.showMessageDialog(Frame, "Kategori başarıyla güncellendi...");
                }else{
                        JOptionPane.showMessageDialog(Frame, "Kategori güncellenemedi. Lütfen tekrar deneyiniz...");
                    }
        
        } catch (Exception e) {
            System.err.println("categoryEdit " + e);
        } finally{
            db.kapat();
        }
        }
    public void bookEdit(JFrame Frame,String bookID, String bookType, String bookName, String bookCommentary, String writerName, String publisher, String bookLang, String shelfNumber){
        DB db = new DB();
        String query = "CALL prcBookEdit(?,?,?,?,?,?,?,?)";
        try {
            if (bookType.equals("") || bookName.equals("") || writerName.equals("") || bookLang.equals("") || shelfNumber.equals("")) {
                JOptionPane.showMessageDialog(Frame, "Lütfen boş alan bırakmayınız...");
            }else{
                PreparedStatement prs = db.preBaglan(query);
                prs.setString(1, bookID);
                prs.setString(2, bookType);
                prs.setString(3, bookName);
                prs.setString(4, bookCommentary);
                prs.setString(5, writerName);
                prs.setString(6, publisher);
                prs.setString(7, bookLang);
                prs.setString(8, shelfNumber);
                int update = prs.executeUpdate();
                if (update > 0) {
                    JOptionPane.showMessageDialog(Frame, "Kitap başarıyla güncellendi...");
                }else{
                    JOptionPane.showMessageDialog(Frame, "Kitap güncellenemedi. Lütfen tekrar deneyiniz...");
                }
            }
        } catch (Exception e) {
            System.err.println("bookEdit " + e);
        } finally{
            db.kapat();
        }
    }
    public void categoryDelete(JFrame Frame, String categoryID){
        DB db = new DB();
        
        try {
            String query = "CALL prcCategoryDelete(?)";
            PreparedStatement prs = db.preBaglan(query);
            prs.setString(1, categoryID);
            int delete = prs.executeUpdate();
            if (delete > 0) {
                JOptionPane.showMessageDialog(Frame, "Kategori başarıyla silindi...");
            }else{
                JOptionPane.showMessageDialog(Frame, "Kategori silinemedi. Lütfen tekrar deneyiniz...");
            }
        } catch (Exception e) {
            System.err.println("categoryDelete " + e);
        } finally{
            db.kapat();
        }
    }
    public void bookDelete(JFrame Frame, String bookID){
        DB db = new DB();
        
        try {
            String query = "CALL prcBookDelete(?)";
            PreparedStatement prs = db.preBaglan(query);
            prs.setString(1, bookID);
            int delete = prs.executeUpdate();
            if (delete > 0) {
                JOptionPane.showMessageDialog(Frame, "Kitap başarıyla silindi...");
            }else{
                JOptionPane.showMessageDialog(Frame, "Kitap silinemedi. Lütfen tekrar deneyiniz...");
            }
        } catch (Exception e) {
            System.err.println("bookDelete " + e);
        } finally{
            db.kapat();
        }
    }
    public ArrayList<Category> categoryFill(){
        ArrayList<Category> cgls = new ArrayList<>();
        DB db = new DB();
        String query = "CALL prcCategoryList()";
        PreparedStatement prs = db.preBaglan(query);
        
        try {
            ResultSet rs = prs.executeQuery();
            while (rs.next()) {                
                Category cg = new Category();
                cg.setCategoryID(rs.getString("cid"));
                cg.setCategoryName(rs.getString("cname"));
                cg.setCategoryStandNumber(rs.getString("csnumber"));
                cg.setCategoryStandAdress(rs.getString("csadress"));
                cgls.add(cg);
            }
        } catch (Exception e) {
            System.err.println("categoryFill " + e);
        } finally{
            db.kapat();
        }
        return cgls;
    }
    public ArrayList<Books> bookFill(){
        ArrayList<Books> bkls = new ArrayList<>();
        DB db = new DB();
        String query = "CALL prcBookList()";
        PreparedStatement prs = db.preBaglan(query);
        
        try {
            ResultSet rs = prs.executeQuery();
            while (rs.next()) {                
                Books bk = new Books();
                bk.setBookID(rs.getString("bid"));
                bk.setBookType(rs.getString("cname"));
                bk.setBookName(rs.getString("bname"));
                bk.setBookCommentary(rs.getString("bcommentary"));
                bk.setWriterName(rs.getString("wname"));
                bk.setBookPublisher(rs.getString("bpublisher"));
                bk.setBookLang(rs.getString("blang"));
                bk.setShelfNumber(rs.getString("snumber"));
                bkls.add(bk);
            }
        } catch (Exception e) {
            System.err.println("bookFill " + e);
        } finally{
            db.kapat();
        }
        return bkls;
    }
    public DefaultTableModel categoryTable(){
        DefaultTableModel table = new DefaultTableModel(){
        
        @Override
        public boolean isCellEditable(int row, int column){
        return false;
        }
    };
        table.addColumn("Kitap Türü");
        table.addColumn("Stand No");
        table.addColumn("Stand Adresi");
        
        ArrayList<Category> cgls = categoryFill();
        
        for (Category item : cgls) {
            table.addRow(new String[]{item.getCategoryName(), item.getCategoryStandNumber(), item.getCategoryStandAdress()} );
        }
        return table;
    }
    public DefaultTableModel bookTable(){
        DefaultTableModel table = new DefaultTableModel(){
        
        @Override
        public boolean isCellEditable(int row, int column){
        return false;   
        }
    };
        table.addColumn("Kitap Türü");
        table.addColumn("Kitap Adı");
        table.addColumn("Açıklama");
        table.addColumn("Kitap Yazarı");
        table.addColumn("Yayınevi");
        table.addColumn("Kitap Dili");
        table.addColumn("Raf No");
        
        ArrayList<Books> bkls = bookFill();
        
        for (Books item : bkls) {
            table.addRow(new String[]{item.getBookType(), item.getBookName(), item.getBookCommentary(), item.getWriterName(), item.getBookPublisher(), item.getBookLang(), item.getShelfNumber()});
        }
        
       return table;
    }
    public ArrayList<String> comboCategoryFill(JComboBox comboBox){
        ArrayList<String> ccgls = new ArrayList<>();
        DB db = new DB();
        String query = "CALL prcCategoryList()";
        DefaultComboBoxModel combo = new DefaultComboBoxModel<>();
        
        
        try {
            PreparedStatement prs = db.preBaglan(query);
            ResultSet rs = prs.executeQuery();
            while (rs.next()) {                
                combo.addElement(rs.getString("cname"));
                ccgls.add(rs.getString("cid"));
                
            }
            comboBox.setModel(combo);
        } catch (Exception e) {
            System.err.println("comboCategoryFill " + e);
        } finally{
            db.kapat();
        }
        return ccgls;
}
    public ArrayList<String> bookTypeSearch(String bookType, JTable tableReport){
         DB db = new DB();
         ArrayList<String> plt = new ArrayList<>();
         String query = "SELECT * FROM category  as c INNER JOIN books as b ON c.cid = b.btype and c.cname LIKE '%"+bookType+"%'";
         DefaultTableModel table = new DefaultTableModel(){
         @Override
        public boolean isCellEditable(int row, int column){
        return false;   
        }
    };
         
         table.addColumn("Kitap Türü");
         table.addColumn("Kitap Adı");
         table.addColumn("Açıklama");
         table.addColumn("Kitap Yazarı");
         table.addColumn("Yayınevi");
         table.addColumn("Kitap Dili");
         table.addColumn("Raf No");
         
         
         try {
            ResultSet rs = db.baglan().executeQuery(query);
            while (rs.next()) {                
                table.addRow(new String[]{rs.getString("cname"), rs.getString("bname"),rs.getString("bcommentary"), rs.getString("wname"),rs.getString("bpublisher"),rs.getString("blang"),rs.getString("snumber")});
                plt.add(rs.getString("bid"));
            }
        } catch (Exception e) {
            System.err.println("bookTypeSearch  " + e);
        } finally{
             db.kapat();
        }
         tableReport.setModel(table);
         return plt;
    }
    public ArrayList<String> bookNameSearch( String bookName, JTable tableReport){
         DB db = new DB();
         ArrayList<String> pln = new ArrayList<>();
         String query = "SELECT * FROM category  as c INNER JOIN books as b ON c.cid = b.btype and bname LIKE '%"+bookName+"%'";
         DefaultTableModel table = new DefaultTableModel(){
         @Override
        public boolean isCellEditable(int row, int column){
        return false;   
        }
    };
         table.addColumn("Kitap Türü");
         table.addColumn("Kitap Adı");
         table.addColumn("Açıklama");
         table.addColumn("Kitap Yazarı");
         table.addColumn("Yayınevi");
         table.addColumn("Kitap Dili");
         table.addColumn("Raf No");
         
         
         try {
            ResultSet rs = db.baglan().executeQuery(query);
            while (rs.next()) {                
                table.addRow(new String[]{rs.getString("cname"), rs.getString("bname"),rs.getString("bcommentary"), rs.getString("wname"),rs.getString("bpublisher"),rs.getString("blang"),rs.getString("snumber")});
                pln.add(rs.getString("bid"));
            }
        } catch (Exception e) {
            System.err.println("bookNameSearch  " + e);
        } finally{
             db.kapat();
        }
         tableReport.setModel(table);
         return pln;
    }
    public ArrayList<String> writerNameSearch(String writerName, JTable tableReport){
         DB db = new DB();
         ArrayList<String> plw = new ArrayList<>();
         String query = "SELECT * FROM category  as c INNER JOIN books as b ON c.cid = b.btype and wname LIKE '%"+writerName+"%'";
         DefaultTableModel table = new DefaultTableModel(){
         @Override
        public boolean isCellEditable(int row, int column){
        return false;   
        }
    };
         table.addColumn("Kitap Türü");
         table.addColumn("Kitap Adı");
         table.addColumn("Açıklama");
         table.addColumn("Kitap Yazarı");
         table.addColumn("Yayınevi");
         table.addColumn("Kitap Dili");
         table.addColumn("Raf No");
         
         
         try {
            ResultSet rs = db.baglan().executeQuery(query);
            while (rs.next()) {                
                table.addRow(new String[]{rs.getString("cname"), rs.getString("bname"),rs.getString("bcommentary"), rs.getString("wname"),rs.getString("bpublisher"),rs.getString("blang"),rs.getString("snumber")});
                plw.add(rs.getString("bid"));
            }
        } catch (Exception e) {
            System.err.println("writerNameSearch  " + e);
        } finally{
             db.kapat();
        }
         tableReport.setModel(table);
         return plw;
    }
}