
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import javax.swing.DefaultListModel;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author impROS
 */
public class frmMain extends javax.swing.JFrame {

    /**
     * Creates new form frmMain
     */
    static DefaultListModel listModel = new DefaultListModel();
    
    ;

    public frmMain() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        cmbSporTuru = new javax.swing.JComboBox<>();
        txtSaat = new javax.swing.JTextField();
        txtLigAdi = new javax.swing.JTextField();
        txtTakimlar = new javax.swing.JTextField();
        txtOran = new javax.swing.JTextField();
        txtTahmin = new javax.swing.JTextField();
        txtSkor = new javax.swing.JTextField();
        cmbSonuc = new javax.swing.JComboBox<>();
        txtTarih = new javax.swing.JFormattedTextField();
        btnJsonConvert = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstMaclar = new javax.swing.JList<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtJsonData = new javax.swing.JTextArea();
        btnJsonArray = new javax.swing.JButton();
        btnCopy = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Free Betting Tips");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Spor Türü : ");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Tarih : ");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Saat : ");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Lig Adı : ");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Takımlar : ");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Oran : ");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Tahmin : ");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("Skor : ");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("Sonuc : ");

        cmbSporTuru.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Futbol", "Basketbol" }));

        txtSaat.setText("10.00");

        txtLigAdi.setText("Super Lig");

        txtTakimlar.setText("Fenerbahçe - Galatasaray");

        txtOran.setText("1.50");

        txtTahmin.setText("Üst Biter");

        txtSkor.setText("5-1");
        txtSkor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSkorActionPerformed(evt);
            }
        });

        cmbSonuc.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Bekleniyor", "Kazandı", "Kaybetti" }));

        txtTarih.setText("01.02.2018");

        btnJsonConvert.setText("Ekle");
        btnJsonConvert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnJsonConvertActionPerformed(evt);
            }
        });

        jScrollPane1.setViewportView(lstMaclar);

        txtJsonData.setColumns(20);
        txtJsonData.setRows(5);
        jScrollPane3.setViewportView(txtJsonData);

        btnJsonArray.setText("ConvertJSon Array");
        btnJsonArray.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnJsonArrayActionPerformed(evt);
            }
        });

        btnCopy.setText("Copy");
        btnCopy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCopyActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnJsonArray)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnCopy)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnJsonConvert)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtTakimlar, javax.swing.GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE)
                                    .addComponent(txtOran)
                                    .addComponent(txtTahmin)
                                    .addComponent(txtSkor)
                                    .addComponent(cmbSonuc, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtLigAdi)
                                    .addComponent(cmbSporTuru, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtSaat)
                                    .addComponent(txtTarih))))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 753, Short.MAX_VALUE))
                    .addComponent(jScrollPane3))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(cmbSporTuru, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(1, 1, 1)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtTarih, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(11, 11, 11)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtSaat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtLigAdi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtTakimlar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(11, 11, 11)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(txtTahmin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(11, 11, 11)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtOran, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(txtSkor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(cmbSonuc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(btnJsonConvert))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnJsonArray)
                    .addComponent(btnCopy))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtSkorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSkorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSkorActionPerformed

    private void btnJsonConvertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnJsonConvertActionPerformed
        // TODO add your handling code here:

        listModel.addElement(toJson().toString());
        lstMaclar.setModel(listModel);
    }//GEN-LAST:event_btnJsonConvertActionPerformed

    private void btnJsonArrayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnJsonArrayActionPerformed
        // TODO add your handling code here:
        JSONObject mac = new JSONObject();
        JSONArray arrMaclar = new JSONArray();
        JSONObject arrJsonData = new JSONObject();
        int size = lstMaclar.getModel().getSize(); // 4
        try {
            for (int i = 0; i < size; i++) {
                
                String strList = lstMaclar.getModel().getElementAt(i) + "";
                System.out.println(strList);
                mac = new JSONObject(strList);
                arrMaclar.put(mac);
            }
            
            arrJsonData.put("Maclar", arrMaclar);
        } catch (Exception ex) {
            System.out.println("Hata : " + ex.getCause());
        }
        String strRaw = arrJsonData.toString().replace("\"", "'");
        txtJsonData.setText(strRaw);
    }//GEN-LAST:event_btnJsonArrayActionPerformed
    private static Clipboard getSystemClipboard() {
        Toolkit defaultToolkit = Toolkit.getDefaultToolkit();
        Clipboard systemClipboard = defaultToolkit.getSystemClipboard();
        
        return systemClipboard;
    }

    public static void copy(String text) {
        Clipboard clipboard = getSystemClipboard();
        
        clipboard.setContents(new StringSelection(text), null);
    }
    private void btnCopyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCopyActionPerformed
        // TODO add your handling code here:
        copy(txtJsonData.getText());
    }//GEN-LAST:event_btnCopyActionPerformed
    private JSONObject toJson() {
        /*        
          String strTuru = mac.getString("tur");
                String strTarih = mac.getString("tarih");
                String strSaat = mac.getString("saat");
                String strLigAdi = mac.getString("ligAdi");
                String strTakimlar = mac.getString("takimlar");
                String strTahmin = mac.getString("tahmin");
                String strOran = mac.getString("oran");
                String strSkor = mac.getString("skor");
                String strSonuc = mac.getString("sonuc");
         */
        JSONObject jsonMac = new JSONObject();
        try {
            jsonMac.put("tur", cmbSporTuru.getItemAt(cmbSporTuru.getSelectedIndex()));
            jsonMac.put("tarih", txtTarih.getText());
            jsonMac.put("ligAdi", txtLigAdi.getText());
            jsonMac.put("takimlar", txtTakimlar.getText());
            jsonMac.put("saat", txtSaat.getText());
            jsonMac.put("oran", txtOran.getText());
            jsonMac.put("skor", txtSkor.getText());
            jsonMac.put("tahmin", txtTahmin.getText());
            jsonMac.put("sonuc", cmbSonuc.getItemAt(cmbSonuc.getSelectedIndex()));
        } catch (JSONException ex) {
            System.out.println("Hata : " + ex.getCause());
        }
        return jsonMac;
    }

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
            java.util.logging.Logger.getLogger(frmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>


        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmMain().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCopy;
    private javax.swing.JButton btnJsonArray;
    private javax.swing.JButton btnJsonConvert;
    private javax.swing.JComboBox<String> cmbSonuc;
    private javax.swing.JComboBox<String> cmbSporTuru;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private static javax.swing.JList<String> lstMaclar;
    private javax.swing.JTextArea txtJsonData;
    private javax.swing.JTextField txtLigAdi;
    private javax.swing.JTextField txtOran;
    private javax.swing.JTextField txtSaat;
    private javax.swing.JTextField txtSkor;
    private javax.swing.JTextField txtTahmin;
    private javax.swing.JTextField txtTakimlar;
    private javax.swing.JFormattedTextField txtTarih;
    // End of variables declaration//GEN-END:variables
}
