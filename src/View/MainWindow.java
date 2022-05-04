/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;


/**
 *
 * @author dovah
 */
public class MainWindow extends javax.swing.JFrame {

    /**
     * Creates new form mainWindow
     */
    public static MainWindow window_ptr;
    public MainWindow() {
        initComponents();
        window_ptr = this;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainDesktop = new javax.swing.JDesktopPane();
        painel_desktop = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        btn_products = new javax.swing.JButton();
        btn_home = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btn_agend = new javax.swing.JButton();
        btn_about = new javax.swing.JButton();
        btn_contato = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        mainDesktop.setBackground(new java.awt.Color(32, 32, 35));
        mainDesktop.setLayout(new java.awt.GridLayout(1, 0));

        painel_desktop.setBackground(new java.awt.Color(32, 32, 35));

        javax.swing.GroupLayout painel_desktopLayout = new javax.swing.GroupLayout(painel_desktop);
        painel_desktop.setLayout(painel_desktopLayout);
        painel_desktopLayout.setHorizontalGroup(
            painel_desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        painel_desktopLayout.setVerticalGroup(
            painel_desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        mainDesktop.add(painel_desktop);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 3, new java.awt.Color(254, 230, 201)));

        btn_products.setBackground(new java.awt.Color(32, 32, 35));
        btn_products.setFont(btn_products.getFont().deriveFont(btn_products.getFont().getStyle() | java.awt.Font.BOLD, btn_products.getFont().getSize()+10));
        btn_products.setForeground(new java.awt.Color(255, 255, 255));
        btn_products.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/product.png"))); // NOI18N
        btn_products.setText("Produtos");
        btn_products.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_products.setFocusPainted(false);
        btn_products.setFocusable(false);
        btn_products.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_productsActionPerformed(evt);
            }
        });

        btn_home.setBackground(new java.awt.Color(32, 32, 35));
        btn_home.setFont(btn_home.getFont().deriveFont(btn_home.getFont().getStyle() | java.awt.Font.BOLD, btn_home.getFont().getSize()+10));
        btn_home.setForeground(new java.awt.Color(255, 255, 255));
        btn_home.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/home.png"))); // NOI18N
        btn_home.setText("Inicio");
        btn_home.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_home.setFocusPainted(false);
        btn_home.setFocusable(false);
        btn_home.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_homeActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/logo.png"))); // NOI18N

        btn_agend.setBackground(new java.awt.Color(32, 32, 35));
        btn_agend.setFont(btn_agend.getFont().deriveFont(btn_agend.getFont().getStyle() | java.awt.Font.BOLD, btn_agend.getFont().getSize()+10));
        btn_agend.setForeground(new java.awt.Color(255, 255, 255));
        btn_agend.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/agend.png"))); // NOI18N
        btn_agend.setText("Agendar");
        btn_agend.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_agend.setFocusPainted(false);
        btn_agend.setFocusable(false);
        btn_agend.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_agendActionPerformed(evt);
            }
        });

        btn_about.setBackground(new java.awt.Color(32, 32, 35));
        btn_about.setFont(btn_about.getFont().deriveFont(btn_about.getFont().getStyle() | java.awt.Font.BOLD, btn_about.getFont().getSize()+10));
        btn_about.setForeground(new java.awt.Color(255, 255, 255));
        btn_about.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/about.png"))); // NOI18N
        btn_about.setText("Sobre");
        btn_about.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_about.setFocusPainted(false);
        btn_about.setFocusable(false);
        btn_about.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_aboutActionPerformed(evt);
            }
        });

        btn_contato.setBackground(new java.awt.Color(32, 32, 35));
        btn_contato.setFont(btn_contato.getFont().deriveFont(btn_contato.getFont().getStyle() | java.awt.Font.BOLD, btn_contato.getFont().getSize()+10));
        btn_contato.setForeground(new java.awt.Color(255, 255, 255));
        btn_contato.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/contact.png"))); // NOI18N
        btn_contato.setText("Contato");
        btn_contato.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_contato.setFocusPainted(false);
        btn_contato.setFocusable(false);
        btn_contato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_contatoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel1)
                .addGap(10, 10, 10))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_products, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_about, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_agend, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_home, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_contato, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 63, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addComponent(btn_home, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_agend, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_products, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_about, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_contato, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(mainDesktop, javax.swing.GroupLayout.DEFAULT_SIZE, 665, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainDesktop, javax.swing.GroupLayout.DEFAULT_SIZE, 0, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_homeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_homeActionPerformed
        mainDesktop.removeAll();
        Inicio telaInicio = new Inicio();
        mainDesktop.add(telaInicio);
        
        telaInicio.setVisible(true);
        telaInicio.setSize(mainDesktop.getWidth(), mainDesktop.getHeight());
        
        
    }//GEN-LAST:event_btn_homeActionPerformed

    private void btn_productsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_productsActionPerformed
         mainDesktop.removeAll();
        Products screenProducts = new Products();
        mainDesktop.add(screenProducts);
        
        screenProducts.setVisible(true);
        screenProducts.setSize(mainDesktop.getWidth(), mainDesktop.getHeight());
        
    }//GEN-LAST:event_btn_productsActionPerformed

    private void btn_agendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_agendActionPerformed
        mainDesktop.removeAll();
        Agendar agendar = new Agendar();
        mainDesktop.add(agendar);
        agendar.setVisible(true);
        agendar.setSize(mainDesktop.getWidth(), mainDesktop.getHeight());
    }//GEN-LAST:event_btn_agendActionPerformed

    private void btn_aboutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_aboutActionPerformed
        mainDesktop.removeAll();
        About about = new About();
        mainDesktop.add(about);
        about.setVisible(true);
        about.setSize(mainDesktop.getWidth(), mainDesktop.getHeight());
        
    }//GEN-LAST:event_btn_aboutActionPerformed

    private void btn_contatoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_contatoActionPerformed
        mainDesktop.removeAll();
        Contact contato = new Contact();
        contato.setVisible(true);
        mainDesktop.add(contato);
        contato.setSize(mainDesktop.getWidth(), mainDesktop.getHeight());
    }//GEN-LAST:event_btn_contatoActionPerformed
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
        
          
        //</editor-fold>

        /* Create and display the form */
        System.setProperty("awt.useSystemAAFontSettings","on");
        System.setProperty("swing.aatext", "true");

        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainWindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_about;
    private javax.swing.JButton btn_agend;
    private javax.swing.JButton btn_contato;
    private javax.swing.JButton btn_home;
    private javax.swing.JButton btn_products;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JDesktopPane mainDesktop;
    private javax.swing.JPanel painel_desktop;
    // End of variables declaration//GEN-END:variables
}
