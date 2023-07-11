package client;

import java.awt.Font;
import java.awt.FontFormatException;
import java.io.IOException;
import java.io.InputStream;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.HashMap;
import java.util.Map;
import server.Translator;

public class JTranslator extends javax.swing.JFrame{

    Map<String, String> languages;
    
    public JTranslator() {
        initComponents();
        System.setProperty("file.encoding", "UTF-8");
        setLocationRelativeTo(null);
        setResizable(false);
        setTitle("Traductor con Chat GPT");
        InputStream fontStream = getClass().getResourceAsStream("/font/Arial Unicode MS Font.ttf");
        Font font = null;
        try {
            font = Font.createFont(Font.TRUETYPE_FONT, fontStream);   
        } catch (Exception ex) {
            font = new Font("Monospaced", Font.PLAIN, 14);
            ex.printStackTrace();
        //} catch (FontFormatException ex) { 
        //} catch (IOException ex) {
        }
        Font customFont = font.deriveFont(Font.PLAIN, 25);
        txtAreaInput.setFont(customFont);
        txtAreaOutput.setFont(customFont);
        //System.out.println(jTextArea1.getLocale());
        //jTextArea1.setText("你好");
        //مرحبا
        //
        //System.out.println("नमस्कार");
        //System.out.println("ñ");
        loadLanguages();
    }
    
    private void loadChatGPTAPI(){
        try {
            Registry registry = LocateRegistry.getRegistry();
            Translator translator = (JTranslator) registry.lookup("Translator");
            String result = translator.translate(Language.JA.toString(), "おやすみなさい", Language.ES.toString());
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    
    private void loadLanguages(){
        languages = new HashMap<>();
        languages.put("Inglés", Language.EN.toString());
        languages.put("Español", Language.ES.toString());
        languages.put("Francés", Language.FR.toString());
        languages.put("Alemán", Language.DE.toString());
        languages.put("Italiano", Language.IT.toString());
        languages.put("Portugués", Language.PT.toString());
        languages.put("Neerlandés", Language.NL.toString());
        languages.put("Ruso", Language.RU.toString());
        languages.put("Chino", Language.ZH.toString());
        languages.put("Japonés", Language.JA.toString());
        languages.put("Coreano", Language.KO.toString());
        languages.put("Árabe", Language.AR.toString());
        languages.put("Hindi", Language.HI.toString());
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        cbxLanguageInput = new javax.swing.JComboBox<>();
        cbxLanguageOutput = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAreaInput = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtAreaOutput = new javax.swing.JTextArea();
        btnTranslate = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Traductor");

        cbxLanguageInput.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        cbxLanguageInput.setForeground(new java.awt.Color(0, 51, 255));
        cbxLanguageInput.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Inglés", "Español", "Francés", "Alemán", "Italiano", "Portugués", "Neerlandés", "Ruso", "Chino", "Japonés", "Coreano", "Árabe", "Hindi" }));
        cbxLanguageInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxLanguageInputActionPerformed(evt);
            }
        });

        cbxLanguageOutput.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        cbxLanguageOutput.setForeground(new java.awt.Color(0, 51, 255));
        cbxLanguageOutput.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Inglés", "Español", "Francés", "Alemán", "Italiano", "Portugués", "Neerlandés", "Ruso", "Chino", "Japonés", "Coreano", "Árabe", "Hindi" }));
        cbxLanguageOutput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxLanguageOutputActionPerformed(evt);
            }
        });

        txtAreaInput.setColumns(20);
        txtAreaInput.setFont(new java.awt.Font("Monospaced", 0, 30)); // NOI18N
        txtAreaInput.setLineWrap(true);
        txtAreaInput.setRows(3);
        jScrollPane1.setViewportView(txtAreaInput);

        txtAreaOutput.setEditable(false);
        txtAreaOutput.setColumns(20);
        txtAreaOutput.setFont(new java.awt.Font("Monospaced", 0, 30)); // NOI18N
        txtAreaOutput.setLineWrap(true);
        txtAreaOutput.setRows(3);
        jScrollPane2.setViewportView(txtAreaOutput);

        btnTranslate.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnTranslate.setText("Traducir");
        btnTranslate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTranslateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 251, Short.MAX_VALUE)
                            .addComponent(cbxLanguageInput, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbxLanguageOutput, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(235, 235, 235)
                        .addComponent(jLabel1)))
                .addContainerGap(32, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(225, 225, 225)
                .addComponent(btnTranslate, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbxLanguageInput, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbxLanguageOutput, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnTranslate, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbxLanguageInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxLanguageInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxLanguageInputActionPerformed

    private void cbxLanguageOutputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxLanguageOutputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxLanguageOutputActionPerformed

    private void btnTranslateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTranslateActionPerformed
        String inputText = txtAreaInput.getText();
        String inputLang = languages.get(cbxLanguageInput.getSelectedItem().toString());
        
        System.out.println(inputLang);
    }//GEN-LAST:event_btnTranslateActionPerformed

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
            java.util.logging.Logger.getLogger(JTranslator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JTranslator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JTranslator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JTranslator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JTranslator().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnTranslate;
    private javax.swing.JComboBox<String> cbxLanguageInput;
    private javax.swing.JComboBox<String> cbxLanguageOutput;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea txtAreaInput;
    private javax.swing.JTextArea txtAreaOutput;
    // End of variables declaration//GEN-END:variables
}
