
import java.awt.Component;
import java.awt.event.KeyEvent;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class FrontFrame extends javax.swing.JFrame {
    Methods method = new Methods();
    ArrayList<Category> catls = method.categoryFill();
    ArrayList<Books> bksls = method.bookFill();
    
    ArrayList<String> bkcatls;
    public FrontFrame() {
        initComponents();
        Methods m = new Methods();
        tableCategory.setModel(m.categoryTable());
        tableBooks.setModel(m.bookTable());
        
        setEnabled(false, panelCategoryEdit.getComponents());
        setEnabled(false, panelCategoryOperation.getComponents());
        setEnabled(false, panelDetails.getComponents());
        setEnabled(false, panelBook.getComponents());
        setEnabled(false, panelBookOperation.getComponents());
        
        
        
        bkcatls = m.comboCategoryFill(comboBoxCategory);
        


        
        
    }
    public void setEnabled(boolean enabled, Component[] comps) {
        for (Component comp : comps) {
            comp.setEnabled(enabled);
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        tabbedPaneLibrary = new javax.swing.JTabbedPane();
        panelBookQuery = new javax.swing.JPanel();
        panelFilters = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        radioButtonsBookType = new javax.swing.JRadioButton();
        radioButtonsBookName = new javax.swing.JRadioButton();
        radioButtonsWriterName = new javax.swing.JRadioButton();
        textSearch = new javax.swing.JTextField();
        buttonSearch = new javax.swing.JButton();
        labelDateWarning = new javax.swing.JLabel();
        panelDetails = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        textDetailBookType = new javax.swing.JTextField();
        textDetailBookName = new javax.swing.JTextField();
        textDetailCommentary = new javax.swing.JTextField();
        textDetailWriterName = new javax.swing.JTextField();
        textDetailPublisher = new javax.swing.JTextField();
        textDetailBookLang = new javax.swing.JTextField();
        textDetailShelfNumber = new javax.swing.JTextField();
        panelTableResult = new javax.swing.JPanel();
        scrollPaneTableResults = new javax.swing.JScrollPane();
        tableResults = new javax.swing.JTable();
        panelBookOperation = new javax.swing.JPanel();
        panelBook = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        textBookName = new javax.swing.JTextField();
        textCommentary = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        textWriterName = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        textPublisher = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        textBookLang = new javax.swing.JTextField();
        textShelfNumber = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        comboBoxCategory = new javax.swing.JComboBox();
        buttonBookEdit = new javax.swing.JButton();
        buttonBookAdd = new javax.swing.JButton();
        panelTableBooks = new javax.swing.JPanel();
        scrollPaneTableBooks = new javax.swing.JScrollPane();
        tableBooks = new javax.swing.JTable();
        panelTableBooksOperations = new javax.swing.JPanel();
        buttonTableBooksOperations = new javax.swing.JButton();
        buttonTableBooksDelete = new javax.swing.JButton();
        panelCategoryOperation = new javax.swing.JPanel();
        panelCategoryAdd = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        buttonCategoryAdd = new javax.swing.JButton();
        textCategoryNameAdd = new javax.swing.JTextField();
        textCategoryStandAdressAdd = new javax.swing.JTextField();
        textCategoryStandNumberAdd = new javax.swing.JTextField();
        panelTableCategory = new javax.swing.JPanel();
        scrollPaneCategory = new javax.swing.JScrollPane();
        tableCategory = new javax.swing.JTable();
        panelTableCategoryOperations = new javax.swing.JPanel();
        buttonTableCategoryEdit = new javax.swing.JButton();
        buttonTableCategoryDelete = new javax.swing.JButton();
        panelCategoryEdit = new javax.swing.JPanel();
        buttonCategoryEdit = new javax.swing.JButton();
        textCategoryStandAdressEdit = new javax.swing.JTextField();
        textCategoryStandNumberEdit = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        textCategoryNameEdit = new javax.swing.JTextField();
        panelUsersOptions = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        textOldPassword = new javax.swing.JPasswordField();
        textNewPassword = new javax.swing.JPasswordField();
        textNewPasswordRepeat = new javax.swing.JPasswordField();
        buttonPasswordEdit = new javax.swing.JButton();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelFilters.setBorder(javax.swing.BorderFactory.createTitledBorder("Filtreleme"));

        jLabel1.setText("Kriter:");

        jLabel2.setText("Arama:");

        buttonGroup1.add(radioButtonsBookType);
        radioButtonsBookType.setText("Kitap Türü");

        buttonGroup1.add(radioButtonsBookName);
        radioButtonsBookName.setText("Kitap Adı");

        buttonGroup1.add(radioButtonsWriterName);
        radioButtonsWriterName.setText("Yazar Adı");

        textSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                textSearchKeyPressed(evt);
            }
        });

        buttonSearch.setText("Ara");
        buttonSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSearchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelFiltersLayout = new javax.swing.GroupLayout(panelFilters);
        panelFilters.setLayout(panelFiltersLayout);
        panelFiltersLayout.setHorizontalGroup(
            panelFiltersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFiltersLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelFiltersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(panelFiltersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(panelFiltersLayout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addGap(18, 18, 18)
                            .addComponent(radioButtonsBookType)
                            .addGap(18, 18, 18)
                            .addComponent(radioButtonsBookName)
                            .addGap(18, 18, 18)
                            .addComponent(radioButtonsWriterName))
                        .addGroup(panelFiltersLayout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addGap(18, 18, 18)
                            .addComponent(textSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panelFiltersLayout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(labelDateWarning)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(buttonSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        panelFiltersLayout.setVerticalGroup(
            panelFiltersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFiltersLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelFiltersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(radioButtonsBookType)
                    .addComponent(radioButtonsBookName)
                    .addComponent(radioButtonsWriterName))
                .addGap(18, 18, 18)
                .addGroup(panelFiltersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGroup(panelFiltersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelFiltersLayout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(labelDateWarning))
                    .addGroup(panelFiltersLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(buttonSearch)))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        panelDetails.setBorder(javax.swing.BorderFactory.createTitledBorder("Detay"));

        jLabel3.setText("Kitap Türü:");

        jLabel4.setText("Kitap Adı:");

        jLabel5.setText("Açıklama:");

        jLabel6.setText("Yazar Adı:");

        jLabel7.setText("Yayın Evi:");

        jLabel8.setText("Kitap Dili:");

        jLabel9.setText("Raf No:");

        javax.swing.GroupLayout panelDetailsLayout = new javax.swing.GroupLayout(panelDetails);
        panelDetails.setLayout(panelDetailsLayout);
        panelDetailsLayout.setHorizontalGroup(
            panelDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDetailsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9))
                .addGap(18, 18, 18)
                .addGroup(panelDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textDetailBookType)
                    .addComponent(textDetailBookName)
                    .addComponent(textDetailWriterName)
                    .addComponent(textDetailCommentary)
                    .addComponent(textDetailPublisher)
                    .addComponent(textDetailBookLang)
                    .addComponent(textDetailShelfNumber))
                .addContainerGap())
        );
        panelDetailsLayout.setVerticalGroup(
            panelDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDetailsLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(panelDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(textDetailBookType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(textDetailBookName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(textDetailCommentary, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(textDetailWriterName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(textDetailPublisher, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(textDetailBookLang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(textDetailShelfNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelTableResult.setBorder(javax.swing.BorderFactory.createTitledBorder("Sonuçlar"));

        tableResults.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tableResults.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableResultsMouseClicked(evt);
            }
        });
        scrollPaneTableResults.setViewportView(tableResults);

        javax.swing.GroupLayout panelTableResultLayout = new javax.swing.GroupLayout(panelTableResult);
        panelTableResult.setLayout(panelTableResultLayout);
        panelTableResultLayout.setHorizontalGroup(
            panelTableResultLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(scrollPaneTableResults, javax.swing.GroupLayout.DEFAULT_SIZE, 536, Short.MAX_VALUE)
        );
        panelTableResultLayout.setVerticalGroup(
            panelTableResultLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(scrollPaneTableResults, javax.swing.GroupLayout.DEFAULT_SIZE, 502, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout panelBookQueryLayout = new javax.swing.GroupLayout(panelBookQuery);
        panelBookQuery.setLayout(panelBookQueryLayout);
        panelBookQueryLayout.setHorizontalGroup(
            panelBookQueryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBookQueryLayout.createSequentialGroup()
                .addGroup(panelBookQueryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panelFilters, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelDetails, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelTableResult, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelBookQueryLayout.setVerticalGroup(
            panelBookQueryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBookQueryLayout.createSequentialGroup()
                .addComponent(panelFilters, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panelDetails, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(panelTableResult, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        tabbedPaneLibrary.addTab("Kitap Sorgulama", panelBookQuery);

        panelBook.setBorder(javax.swing.BorderFactory.createTitledBorder("Kitap İşlemleri"));

        jLabel10.setText("Kitap Dili:");

        jLabel11.setText("Raf No:");

        jLabel12.setText("Kitap Türü:");

        jLabel13.setText("Kitap Adı:");

        jLabel14.setText("Açıklama:");

        jLabel15.setText("Yazar Adı:");

        jLabel16.setText("Yayın Evi:");

        comboBoxCategory.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        buttonBookEdit.setText("Düzenle");
        buttonBookEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonBookEditActionPerformed(evt);
            }
        });

        buttonBookAdd.setText("Ekle");
        buttonBookAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonBookAddActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelBookLayout = new javax.swing.GroupLayout(panelBook);
        panelBook.setLayout(panelBookLayout);
        panelBookLayout.setHorizontalGroup(
            panelBookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBookLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelBookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12)
                    .addComponent(jLabel13)
                    .addComponent(jLabel14)
                    .addComponent(jLabel15)
                    .addComponent(jLabel16)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11))
                .addGap(18, 18, 18)
                .addGroup(panelBookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelBookLayout.createSequentialGroup()
                        .addComponent(buttonBookAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                        .addComponent(buttonBookEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(textBookName)
                    .addComponent(textWriterName)
                    .addComponent(textCommentary)
                    .addComponent(textPublisher)
                    .addComponent(textBookLang)
                    .addComponent(textShelfNumber)
                    .addComponent(comboBoxCategory, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        panelBookLayout.setVerticalGroup(
            panelBookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBookLayout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(panelBookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(comboBoxCategory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelBookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(textBookName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelBookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(textCommentary, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelBookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(textWriterName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelBookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(textPublisher, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelBookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(textBookLang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelBookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(textShelfNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelBookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonBookEdit)
                    .addComponent(buttonBookAdd))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelTableBooks.setBorder(javax.swing.BorderFactory.createTitledBorder("Kitaplar"));

        tableBooks.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tableBooks.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableBooksMouseClicked(evt);
            }
        });
        scrollPaneTableBooks.setViewportView(tableBooks);

        javax.swing.GroupLayout panelTableBooksLayout = new javax.swing.GroupLayout(panelTableBooks);
        panelTableBooks.setLayout(panelTableBooksLayout);
        panelTableBooksLayout.setHorizontalGroup(
            panelTableBooksLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(scrollPaneTableBooks, javax.swing.GroupLayout.DEFAULT_SIZE, 549, Short.MAX_VALUE)
        );
        panelTableBooksLayout.setVerticalGroup(
            panelTableBooksLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(scrollPaneTableBooks, javax.swing.GroupLayout.DEFAULT_SIZE, 502, Short.MAX_VALUE)
        );

        panelTableBooksOperations.setBorder(javax.swing.BorderFactory.createTitledBorder("Satır İşlemleri"));

        buttonTableBooksOperations.setText("İşlemler");
        buttonTableBooksOperations.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonTableBooksOperationsActionPerformed(evt);
            }
        });

        buttonTableBooksDelete.setText("Sil");
        buttonTableBooksDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonTableBooksDeleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelTableBooksOperationsLayout = new javax.swing.GroupLayout(panelTableBooksOperations);
        panelTableBooksOperations.setLayout(panelTableBooksOperationsLayout);
        panelTableBooksOperationsLayout.setHorizontalGroup(
            panelTableBooksOperationsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTableBooksOperationsLayout.createSequentialGroup()
                .addComponent(buttonTableBooksOperations, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 106, Short.MAX_VALUE)
                .addComponent(buttonTableBooksDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panelTableBooksOperationsLayout.setVerticalGroup(
            panelTableBooksOperationsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTableBooksOperationsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelTableBooksOperationsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonTableBooksOperations, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonTableBooksDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panelBookOperationLayout = new javax.swing.GroupLayout(panelBookOperation);
        panelBookOperation.setLayout(panelBookOperationLayout);
        panelBookOperationLayout.setHorizontalGroup(
            panelBookOperationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBookOperationLayout.createSequentialGroup()
                .addGroup(panelBookOperationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panelBook, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelTableBooksOperations, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelTableBooks, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelBookOperationLayout.setVerticalGroup(
            panelBookOperationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBookOperationLayout.createSequentialGroup()
                .addComponent(panelBook, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panelTableBooksOperations, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(panelTableBooks, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        tabbedPaneLibrary.addTab("Kitap İşlemleri", panelBookOperation);

        panelCategoryAdd.setBorder(javax.swing.BorderFactory.createTitledBorder("Kategori Ekle"));

        jLabel17.setText("Kategori Adı:");

        jLabel18.setText("Stand No:");

        jLabel19.setText("Stand Adres:");

        buttonCategoryAdd.setText("Ekle");
        buttonCategoryAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCategoryAddActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelCategoryAddLayout = new javax.swing.GroupLayout(panelCategoryAdd);
        panelCategoryAdd.setLayout(panelCategoryAddLayout);
        panelCategoryAddLayout.setHorizontalGroup(
            panelCategoryAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCategoryAddLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelCategoryAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel18)
                    .addComponent(jLabel19)
                    .addComponent(jLabel17))
                .addGap(18, 18, 18)
                .addGroup(panelCategoryAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(textCategoryNameAdd, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE)
                    .addComponent(textCategoryStandNumberAdd, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textCategoryStandAdressAdd, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelCategoryAddLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(buttonCategoryAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(19, 19, 19))
        );
        panelCategoryAddLayout.setVerticalGroup(
            panelCategoryAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCategoryAddLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(panelCategoryAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(textCategoryNameAdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelCategoryAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(textCategoryStandNumberAdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelCategoryAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(textCategoryStandAdressAdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(buttonCategoryAdd)
                .addContainerGap(64, Short.MAX_VALUE))
        );

        panelTableCategory.setBorder(javax.swing.BorderFactory.createTitledBorder("Kategoriler"));

        tableCategory.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tableCategory.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableCategoryMouseClicked(evt);
            }
        });
        scrollPaneCategory.setViewportView(tableCategory);

        javax.swing.GroupLayout panelTableCategoryLayout = new javax.swing.GroupLayout(panelTableCategory);
        panelTableCategory.setLayout(panelTableCategoryLayout);
        panelTableCategoryLayout.setHorizontalGroup(
            panelTableCategoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(scrollPaneCategory, javax.swing.GroupLayout.DEFAULT_SIZE, 515, Short.MAX_VALUE)
        );
        panelTableCategoryLayout.setVerticalGroup(
            panelTableCategoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(scrollPaneCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );

        panelTableCategoryOperations.setBorder(javax.swing.BorderFactory.createTitledBorder("Satır İşlemleri"));

        buttonTableCategoryEdit.setText("Düzenle");
        buttonTableCategoryEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonTableCategoryEditActionPerformed(evt);
            }
        });

        buttonTableCategoryDelete.setText("Sil");
        buttonTableCategoryDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonTableCategoryDeleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelTableCategoryOperationsLayout = new javax.swing.GroupLayout(panelTableCategoryOperations);
        panelTableCategoryOperations.setLayout(panelTableCategoryOperationsLayout);
        panelTableCategoryOperationsLayout.setHorizontalGroup(
            panelTableCategoryOperationsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTableCategoryOperationsLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(buttonTableCategoryEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(buttonTableCategoryDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
        );
        panelTableCategoryOperationsLayout.setVerticalGroup(
            panelTableCategoryOperationsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTableCategoryOperationsLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(panelTableCategoryOperationsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonTableCategoryDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonTableCategoryEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelCategoryEdit.setBorder(javax.swing.BorderFactory.createTitledBorder("Kategori Düzenle"));

        buttonCategoryEdit.setText("Düzenle");
        buttonCategoryEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCategoryEditActionPerformed(evt);
            }
        });

        jLabel21.setText("Kategori Adı:");

        jLabel22.setText("Stand No:");

        jLabel23.setText("Stand Adres:");

        javax.swing.GroupLayout panelCategoryEditLayout = new javax.swing.GroupLayout(panelCategoryEdit);
        panelCategoryEdit.setLayout(panelCategoryEditLayout);
        panelCategoryEditLayout.setHorizontalGroup(
            panelCategoryEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCategoryEditLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelCategoryEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCategoryEditLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(buttonCategoryEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelCategoryEditLayout.createSequentialGroup()
                        .addGroup(panelCategoryEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel22)
                            .addComponent(jLabel23)
                            .addComponent(jLabel21))
                        .addGap(18, 18, 18)
                        .addGroup(panelCategoryEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(textCategoryNameEdit, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 249, Short.MAX_VALUE)
                            .addComponent(textCategoryStandNumberEdit, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textCategoryStandAdressEdit, javax.swing.GroupLayout.Alignment.LEADING))))
                .addContainerGap())
        );
        panelCategoryEditLayout.setVerticalGroup(
            panelCategoryEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCategoryEditLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(panelCategoryEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(textCategoryNameEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelCategoryEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(textCategoryStandNumberEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelCategoryEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23)
                    .addComponent(textCategoryStandAdressEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(buttonCategoryEdit)
                .addContainerGap(69, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panelCategoryOperationLayout = new javax.swing.GroupLayout(panelCategoryOperation);
        panelCategoryOperation.setLayout(panelCategoryOperationLayout);
        panelCategoryOperationLayout.setHorizontalGroup(
            panelCategoryOperationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCategoryOperationLayout.createSequentialGroup()
                .addGroup(panelCategoryOperationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelCategoryAdd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelCategoryEdit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelCategoryOperationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelCategoryOperationLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(panelTableCategoryOperations, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(panelTableCategory, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        panelCategoryOperationLayout.setVerticalGroup(
            panelCategoryOperationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCategoryOperationLayout.createSequentialGroup()
                .addComponent(panelCategoryAdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelCategoryEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(panelCategoryOperationLayout.createSequentialGroup()
                .addComponent(panelTableCategory, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panelTableCategoryOperations, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        tabbedPaneLibrary.addTab("Kategori İşlemleri", panelCategoryOperation);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Parola İşlemleri"));

        buttonPasswordEdit.setText("Değiştir");
        buttonPasswordEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonPasswordEditActionPerformed(evt);
            }
        });

        jLabel34.setText("Eski Parola:");

        jLabel35.setText("Yeni Parola:");

        jLabel36.setText("Yeni Parola Tekrar:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(buttonPasswordEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel36)
                            .addComponent(jLabel35)
                            .addComponent(jLabel34))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(textNewPasswordRepeat)
                            .addComponent(textNewPassword)
                            .addComponent(textOldPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel34)
                    .addComponent(textOldPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel35)
                    .addComponent(textNewPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel36)
                    .addComponent(textNewPasswordRepeat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(buttonPasswordEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(62, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panelUsersOptionsLayout = new javax.swing.GroupLayout(panelUsersOptions);
        panelUsersOptions.setLayout(panelUsersOptionsLayout);
        panelUsersOptionsLayout.setHorizontalGroup(
            panelUsersOptionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelUsersOptionsLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 482, Short.MAX_VALUE))
        );
        panelUsersOptionsLayout.setVerticalGroup(
            panelUsersOptionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelUsersOptionsLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 252, Short.MAX_VALUE))
        );

        tabbedPaneLibrary.addTab("Kullanıcı Ayarları", panelUsersOptions);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabbedPaneLibrary)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabbedPaneLibrary, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonPasswordEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonPasswordEditActionPerformed
        if (textNewPassword.getText().trim().equals("") || textNewPasswordRepeat.getText().trim().equals("") || textOldPassword.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(this, "Lütfen boş alan bırakmayınız.");
        } else if (textNewPassword.getText().trim().equals(textNewPasswordRepeat.getText().trim())) {
            Methods m = new Methods();
            m.passwordEdit(this, textOldPassword.getText().trim(), textNewPassword.getText().trim());
        } else {
            JOptionPane.showMessageDialog(this, "Yeni parolalar uyuşmuyor. Lütfen tekrar giriniz.");
        }
    }//GEN-LAST:event_buttonPasswordEditActionPerformed
    String catID = "";
    private void tableCategoryMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableCategoryMouseClicked
        catID = catls.get(tableCategory.getSelectedRow()).getCategoryID();

        setEnabled(true, panelTableCategoryOperations.getComponents());
    }//GEN-LAST:event_tableCategoryMouseClicked
    String editCatID = "";
    private void buttonTableCategoryEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonTableCategoryEditActionPerformed
        editCatID = catID;
        DB db = new DB();
        try {
            String query = "CALL prcCategoryGet(?)";
            PreparedStatement ps = db.preBaglan(query);
            ps.setString(1, editCatID);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                textCategoryNameEdit.setText(rs.getString("cname"));
                textCategoryStandNumberEdit.setText(rs.getString("csnumber"));
                textCategoryStandAdressEdit.setText(rs.getString("csadress"));

            }
        } catch (SQLException e) {
            System.err.println("categoryOperations " + e);
        } finally {
            db.kapat();
        }
        setEnabled(true, panelCategoryEdit.getComponents());
        setEnabled(false, panelCategoryOperation.getComponents());
    }//GEN-LAST:event_buttonTableCategoryEditActionPerformed
    ArrayList<String> categoryIDS = new ArrayList<>();
    private void buttonTableCategoryDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonTableCategoryDeleteActionPerformed
        Methods m = new Methods();
        int confirmed = JOptionPane.showConfirmDialog(this,
                "Silmek istediğinizden emin misiniz?", "Silme İşlemi",
                JOptionPane.YES_NO_OPTION);

        if (confirmed == JOptionPane.YES_OPTION) {

            method.categoryDelete(this, catID);
            setEnabled(false, panelCategoryOperation.getComponents());
            tableCategory.setModel(method.categoryTable());
            catID = "";
            catls = m.categoryFill();
            categoryIDS = m.comboCategoryFill(comboBoxCategory);

        }
    }//GEN-LAST:event_buttonTableCategoryDeleteActionPerformed

    private void buttonCategoryAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCategoryAddActionPerformed
         Methods m = new Methods();
         
          m.categoryAdd(this, textCategoryNameAdd.getText().trim(), textCategoryStandNumberAdd.getText().trim(), textCategoryStandAdressAdd.getText().trim());
            tableCategory.setModel(m.categoryTable());

            catls = m.categoryFill();
            categoryIDS = m.comboCategoryFill(comboBoxCategory);
            
    }//GEN-LAST:event_buttonCategoryAddActionPerformed
    
    private void buttonCategoryEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCategoryEditActionPerformed
        Methods m = new Methods();

        String name = textCategoryNameEdit.getText().trim();
        String snumber = textCategoryStandNumberEdit.getText().trim();
        String sadress = textCategoryStandAdressEdit.getText().trim();

        
        if (name.equals("") || snumber.equals("") || sadress.equals("")) {
            JOptionPane.showMessageDialog(this, "Lütfen boş alan bırakmayınız.");
        } else {
        m.categoryEdit(this,catID, name, snumber, sadress);
            editCatID = "";
            catID = "";
            tableCategory.setModel(m.categoryTable());
            textCategoryNameEdit.setText("");
            textCategoryStandNumberEdit.setText("");
            textCategoryStandAdressEdit.setText("");
     
            setEnabled(false, panelCategoryEdit.getComponents());
            categoryIDS = m.comboCategoryFill(comboBoxCategory);
        } 
    }//GEN-LAST:event_buttonCategoryEditActionPerformed
    String bkID = "";
    private void tableBooksMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableBooksMouseClicked
        bkID = bksls.get(tableBooks.getSelectedRow()).getBookID();

        setEnabled(true, panelTableBooksOperations.getComponents());
    }//GEN-LAST:event_tableBooksMouseClicked
    String editBookID = "";
    private void buttonTableBooksOperationsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonTableBooksOperationsActionPerformed
        editBookID = bkID;
        DB db = new DB();
        try {
            String query = "CALL prcBookGet(?)";
            PreparedStatement ps = db.preBaglan(query);
            ps.setString(1, editBookID);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                textBookName.setText(rs.getString("bname"));
                textCommentary.setText(rs.getString("bcommentary"));
                textWriterName.setText(rs.getString("wname"));
                textPublisher.setText(rs.getString("bpublisher"));
                textBookLang.setText(rs.getString("blang"));
                textShelfNumber.setText(rs.getString("snumber"));

            }
        } catch (SQLException e) {
            System.err.println("booksOperations " + e);
        } finally {
            db.kapat();
        }
        setEnabled(true, panelBook.getComponents());
        setEnabled(false, panelBookOperation.getComponents());
    }//GEN-LAST:event_buttonTableBooksOperationsActionPerformed

    private void buttonBookAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonBookAddActionPerformed
        Methods m = new Methods(); 
        if (textBookName.equals("") || textWriterName.equals("") || textPublisher.equals("") || textBookLang.equals("") || textShelfNumber.equals("")) {
            JOptionPane.showMessageDialog(this, "Lütfen boş alan bırakmayınız.");
        } else {
        m.bookAdd(this, bkcatls.get(comboBoxCategory.getSelectedIndex()) ,textBookName.getText().trim(), textCommentary.getText().trim(), textWriterName.getText().trim(), textPublisher.getText().trim(), textBookLang.getText().trim(), textShelfNumber.getText().trim());
        tableBooks.setModel(m.bookTable());

        bksls = m.bookFill();
            textBookName.setText("");
            textCommentary.setText("");
            textWriterName.setText("");
            textPublisher.setText("");
            textBookLang.setText("");
            textShelfNumber.setText("");
            setEnabled(false, panelBook.getComponents());
            
        }
    }//GEN-LAST:event_buttonBookAddActionPerformed
        
    private void buttonBookEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonBookEditActionPerformed
        Methods m = new Methods(); 
        if (textBookName.equals("") || textWriterName.equals("") || textPublisher.equals("") || textBookLang.equals("") || textShelfNumber.equals("")) {
            JOptionPane.showMessageDialog(this, "Lütfen boş alan bırakmayınız.");
        } else {
        m.bookEdit(this,editBookID, bkcatls.get(comboBoxCategory.getSelectedIndex()) ,textBookName.getText().trim(), textCommentary.getText().trim(), textWriterName.getText().trim(), textPublisher.getText().trim(), textBookLang.getText().trim(), textShelfNumber.getText().trim());
            editBookID = "";
            bkID = "";
            tableBooks.setModel(m.bookTable());
            textBookName.setText("");
            textCommentary.setText("");
            textWriterName.setText("");
            textPublisher.setText("");
            textBookLang.setText("");
            textShelfNumber.setText("");
            
            setEnabled(false, panelBook.getComponents());
            
        } 
    }//GEN-LAST:event_buttonBookEditActionPerformed

    private void buttonTableBooksDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonTableBooksDeleteActionPerformed
        Methods m = new Methods();
        int confirmed = JOptionPane.showConfirmDialog(this,
                "Silmek istediğinizden emin misiniz?", "Silme İşlemi",
                JOptionPane.YES_NO_OPTION);

        if (confirmed == JOptionPane.YES_OPTION) {

            method.bookDelete(this, bkID);
            setEnabled(false, panelBookOperation.getComponents());
            tableBooks.setModel(method.bookTable());
            bkID = "";
            bksls = m.bookFill();

        }
    }//GEN-LAST:event_buttonTableBooksDeleteActionPerformed
    String resultID = "";
    ArrayList<String> bksLS = new ArrayList<>();
    
    private void tableResultsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableResultsMouseClicked
        
        resultID = bksLS.get(tableResults.getSelectedRow());
        
        
        DB db = new DB();
        if (evt.getClickCount() == 2) {
        try {
            String query = "CALL prcBookGet(?)";
            PreparedStatement ps = db.preBaglan(query);
            ps.setString(1, resultID);
            
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                textDetailBookType.setText(rs.getString("cname"));
                textDetailBookName.setText(rs.getString("bname"));
                textDetailCommentary.setText(rs.getString("bcommentary"));
                textDetailWriterName.setText(rs.getString("wname"));
                textDetailPublisher.setText(rs.getString("bpublisher"));
                textDetailBookLang.setText(rs.getString("blang"));
                textDetailShelfNumber.setText(rs.getString("snumber"));

            }
            
        } catch (SQLException e) {
            System.err.println("tableResults " + e);
        } finally {
            db.kapat();
        }

        setEnabled(true, panelDetails.getComponents());
        }
    }//GEN-LAST:event_tableResultsMouseClicked

    private void buttonSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSearchActionPerformed
        Methods m = new Methods();
        

        String search = textSearch.getText();
        
        if (radioButtonsBookType.isSelected()) {
            
                
           bksLS = m.bookTypeSearch(search, tableResults);
                
            

        }else if (radioButtonsBookName.isSelected()) {
            

                
            bksLS = m.bookNameSearch(search, tableResults);
                
             
        } else if (radioButtonsWriterName.isSelected()) {
           

                
            bksLS = m.writerNameSearch(search, tableResults);
                
        
        } else {
            JOptionPane.showMessageDialog(this, "Lütfen bir kriter seçin...");
        }
        setEnabled(false, panelDetails.getComponents());
    }//GEN-LAST:event_buttonSearchActionPerformed

    private void textSearchKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textSearchKeyPressed
        Methods m = new Methods();
        
        if(evt.getKeyCode() == KeyEvent.VK_ENTER) {
        String search = textSearch.getText();

        if (radioButtonsBookType.isSelected()) {
            
                
            bksLS = m.bookTypeSearch(search, tableResults);
                
            

        }else if (radioButtonsBookName.isSelected()) {
            

                
            bksLS = m.bookNameSearch(search, tableResults);
                
             
        } else if (radioButtonsWriterName.isSelected()) {
           

                
            bksLS = m.writerNameSearch(search, tableResults);
                
        
        } else {
            JOptionPane.showMessageDialog(this, "Lütfen bir kriter seçin...");
        }
        setEnabled(false, panelDetails.getComponents());
        }
        
    }//GEN-LAST:event_textSearchKeyPressed


    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrontFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrontFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrontFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrontFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrontFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonBookAdd;
    private javax.swing.JButton buttonBookEdit;
    private javax.swing.JButton buttonCategoryAdd;
    private javax.swing.JButton buttonCategoryEdit;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton buttonPasswordEdit;
    private javax.swing.JButton buttonSearch;
    private javax.swing.JButton buttonTableBooksDelete;
    private javax.swing.JButton buttonTableBooksOperations;
    private javax.swing.JButton buttonTableCategoryDelete;
    private javax.swing.JButton buttonTableCategoryEdit;
    private javax.swing.JComboBox comboBoxCategory;
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
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelDateWarning;
    private javax.swing.JPanel panelBook;
    private javax.swing.JPanel panelBookOperation;
    private javax.swing.JPanel panelBookQuery;
    private javax.swing.JPanel panelCategoryAdd;
    private javax.swing.JPanel panelCategoryEdit;
    private javax.swing.JPanel panelCategoryOperation;
    private javax.swing.JPanel panelDetails;
    private javax.swing.JPanel panelFilters;
    private javax.swing.JPanel panelTableBooks;
    private javax.swing.JPanel panelTableBooksOperations;
    private javax.swing.JPanel panelTableCategory;
    private javax.swing.JPanel panelTableCategoryOperations;
    private javax.swing.JPanel panelTableResult;
    private javax.swing.JPanel panelUsersOptions;
    private javax.swing.JRadioButton radioButtonsBookName;
    private javax.swing.JRadioButton radioButtonsBookType;
    private javax.swing.JRadioButton radioButtonsWriterName;
    private javax.swing.JScrollPane scrollPaneCategory;
    private javax.swing.JScrollPane scrollPaneTableBooks;
    private javax.swing.JScrollPane scrollPaneTableResults;
    private javax.swing.JTabbedPane tabbedPaneLibrary;
    private javax.swing.JTable tableBooks;
    private javax.swing.JTable tableCategory;
    private javax.swing.JTable tableResults;
    private javax.swing.JTextField textBookLang;
    private javax.swing.JTextField textBookName;
    private javax.swing.JTextField textCategoryNameAdd;
    private javax.swing.JTextField textCategoryNameEdit;
    private javax.swing.JTextField textCategoryStandAdressAdd;
    private javax.swing.JTextField textCategoryStandAdressEdit;
    private javax.swing.JTextField textCategoryStandNumberAdd;
    private javax.swing.JTextField textCategoryStandNumberEdit;
    private javax.swing.JTextField textCommentary;
    private javax.swing.JTextField textDetailBookLang;
    private javax.swing.JTextField textDetailBookName;
    private javax.swing.JTextField textDetailBookType;
    private javax.swing.JTextField textDetailCommentary;
    private javax.swing.JTextField textDetailPublisher;
    private javax.swing.JTextField textDetailShelfNumber;
    private javax.swing.JTextField textDetailWriterName;
    private javax.swing.JPasswordField textNewPassword;
    private javax.swing.JPasswordField textNewPasswordRepeat;
    private javax.swing.JPasswordField textOldPassword;
    private javax.swing.JTextField textPublisher;
    private javax.swing.JTextField textSearch;
    private javax.swing.JTextField textShelfNumber;
    private javax.swing.JTextField textWriterName;
    // End of variables declaration//GEN-END:variables
}
