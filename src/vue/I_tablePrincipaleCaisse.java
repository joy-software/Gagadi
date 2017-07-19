

package vue;

import java.awt.Color;

/**
 *
 * @author Paul Stephan
 */
public class I_tablePrincipaleCaisse extends javax.swing.JFrame {

   
    public I_tablePrincipaleCaisse() {
        initComponents();
        this.getContentPane().setBackground(Color.WHITE);
        this.setLocationRelativeTo(null);
        jPanel1.setBackground(Color.WHITE);
    }

    
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        TfSearchArt = new javax.swing.JTextField();
        BtSearchArt = new javax.swing.JButton();
        ByNamArt = new javax.swing.JRadioButton();
        ByIdArt = new javax.swing.JRadioButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        BtVendreA = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jTextField4 = new javax.swing.JTextField();
        jButton14 = new javax.swing.JButton();
        jRadioButton7 = new javax.swing.JRadioButton();
        jRadioButton8 = new javax.swing.JRadioButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTable5 = new javax.swing.JTable();
        BtAjouFact = new javax.swing.JButton();
        BtModFact = new javax.swing.JButton();
        BtAnnFact = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        Deconnexion = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Paul Stephan\\WORKSPACE\\ProjetBD\\Photo\\tofBD\\bien.JPG")); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 0, 250, 120));

        jTabbedPane1.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N

        jPanel1.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.disabledShadow"));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel6.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.disabledShadow"));
        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Recherche", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.BELOW_TOP, null, new java.awt.Color(0, 102, 102)));
        jPanel6.setFont(new java.awt.Font("Arial Unicode MS", 0, 11)); // NOI18N
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TfSearchArt.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        TfSearchArt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel6.add(TfSearchArt, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 30, 790, 28));

        BtSearchArt.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.disabledShadow"));
        BtSearchArt.setFont(new java.awt.Font("Arial Unicode MS", 0, 11)); // NOI18N
        BtSearchArt.setForeground(javax.swing.UIManager.getDefaults().getColor("Button.highlight"));
        BtSearchArt.setIcon(new javax.swing.ImageIcon("C:\\Users\\Paul Stephan\\Documents\\NetBeansProjects\\projet BD\\Photo\\rechercher.jpg")); // NOI18N
        BtSearchArt.setActionCommand("Recherche");
        BtSearchArt.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        BtSearchArt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtSearchArtActionPerformed(evt);
            }
        });
        jPanel6.add(BtSearchArt, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 20, 80, 50));

        jPanel1.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, 1020, 90));

        ByNamArt.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.disabledShadow"));
        ByNamArt.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        ByNamArt.setText("Par nom");
        ByNamArt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ByNamArtActionPerformed(evt);
            }
        });
        jPanel1.add(ByNamArt, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 90, -1));

        ByIdArt.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.disabledShadow"));
        ByIdArt.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        ByIdArt.setText("Par code");
        jPanel1.add(ByIdArt, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 10, 120, -1));

        jScrollPane2.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.highlight"));
        jScrollPane2.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N

        jTable2.setAutoCreateRowSorter(true);
        jTable2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 255)));
        jTable2.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Code", "Nom", "Marque", "Prix Unitaire HT", "Quantité", "Taux", "Prix Vente", "Prix Variable", "Remise", "Prix UTC", "Prix TTC", "Stock min", "Benefice", "Image"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Double.class, java.lang.Integer.class, java.lang.Double.class, java.lang.Double.class, java.lang.Boolean.class, java.lang.Double.class, java.lang.Double.class, java.lang.Double.class, java.lang.Integer.class, java.lang.Double.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable2.setDragEnabled(true);
        jTable2.setFillsViewportHeight(true);
        jScrollPane2.setViewportView(jTable2);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 1120, 360));

        BtVendreA.setBackground(new java.awt.Color(255, 255, 255));
        BtVendreA.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        BtVendreA.setText("Vendre");
        BtVendreA.setEnabled(false);
        BtVendreA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtVendreAActionPerformed(evt);
            }
        });
        jPanel1.add(BtVendreA, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 510, -1, -1));

        jTabbedPane1.addTab("Articles", jPanel1);

        jPanel10.setBackground(new java.awt.Color(145, 188, 209));
        jPanel10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel11.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.disabledShadow"));
        jPanel11.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Recherche", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.BELOW_TOP, null, new java.awt.Color(0, 102, 102)));
        jPanel11.setFont(new java.awt.Font("Arial Unicode MS", 0, 11)); // NOI18N
        jPanel11.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextField4.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        jTextField4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel11.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 30, 790, 28));

        jButton14.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.disabledShadow"));
        jButton14.setFont(new java.awt.Font("Arial Unicode MS", 0, 11)); // NOI18N
        jButton14.setIcon(new javax.swing.ImageIcon("C:\\Users\\Paul Stephan\\Documents\\NetBeansProjects\\projet BD\\Photo\\rechercher.jpg")); // NOI18N
        jButton14.setActionCommand("Recherche");
        jButton14.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel11.add(jButton14, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 20, 80, 50));

        jPanel10.add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, 1020, 90));

        jRadioButton7.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.disabledShadow"));
        jRadioButton7.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        jRadioButton7.setText("Par nom");
        jRadioButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton7ActionPerformed(evt);
            }
        });
        jPanel10.add(jRadioButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 90, 20));

        jRadioButton8.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.disabledShadow"));
        jRadioButton8.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        jRadioButton8.setText("Par code");
        jPanel10.add(jRadioButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 10, 120, 20));

        jScrollPane5.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.highlight"));
        jScrollPane5.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N

        jTable5.setAutoCreateRowSorter(true);
        jTable5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 255)));
        jTable5.setFont(new java.awt.Font("Arial Unicode MS", 0, 11)); // NOI18N
        jTable5.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Code", "Magasin", "Montant", "Date", "Prenom caissiere", "Prenom Client"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Double.class, java.lang.Object.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable5.setDragEnabled(true);
        jTable5.setFillsViewportHeight(true);
        jScrollPane5.setViewportView(jTable5);

        jPanel10.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 1120, 360));

        BtAjouFact.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        BtAjouFact.setText("Ajouter");
        jPanel10.add(BtAjouFact, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 510, -1, -1));

        BtModFact.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        BtModFact.setText("Modifier");
        BtModFact.setEnabled(false);
        jPanel10.add(BtModFact, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 510, -1, -1));

        BtAnnFact.setBackground(new java.awt.Color(255, 255, 255));
        BtAnnFact.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        BtAnnFact.setText("Annuler");
        BtAnnFact.setEnabled(false);
        jPanel10.add(BtAnnFact, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 510, -1, -1));

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        jButton1.setText("Imprimer");
        jButton1.setEnabled(false);
        jPanel10.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 510, -1, -1));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1145, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, 1145, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 552, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, 552, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jTabbedPane1.addTab("Factures", jPanel4);

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 1150, 570));

        Deconnexion.setFont(new java.awt.Font("Arial Unicode MS", 0, 11)); // NOI18N
        Deconnexion.setIcon(new javax.swing.ImageIcon("C:\\Users\\Paul Stephan\\Documents\\NetBeansProjects\\projet BD\\Photo\\decon.JPG")); // NOI18N
        Deconnexion.setToolTipText("deconnexion");
        Deconnexion.setActionCommand("deconnexion");
        Deconnexion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeconnexionActionPerformed(evt);
            }
        });
        getContentPane().add(Deconnexion, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 10, 40, 40));

        jLabel3.setFont(new java.awt.Font("Cambria", 2, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Vous etes une Caissiere !!!");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 90, 180, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Paul Stephan\\Documents\\NetBeansProjects\\projet BD\\Photo\\tofBD\\The_Blacy!\\exciting.jpg")); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 0, 130, 120));

        jMenu1.setText("Fichier");
        jMenu1.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edition");
        jMenu2.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        jMenuBar1.add(jMenu2);

        jMenu3.setText("Aide");
        jMenu3.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        pack();
    }

    private void BtSearchArtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtSearchArtActionPerformed
        // TODO add your handling code here:
    }

    private void ByNamArtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ByNamArtActionPerformed
        // TODO add your handling code here:
    }

    private void BtVendreAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtVendreAActionPerformed
        // TODO add your handling code here:
    }

    private void jRadioButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton7ActionPerformed

    private void DeconnexionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeconnexionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DeconnexionActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(I_tablePrincipaleCaisse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(I_tablePrincipaleCaisse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(I_tablePrincipaleCaisse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(I_tablePrincipaleCaisse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new I_tablePrincipaleCaisse().setVisible(true);
            }
        });
    }

    private javax.swing.JButton BtAjouFact;
    private javax.swing.JButton BtAnnFact;
    private javax.swing.JButton BtModFact;
    private javax.swing.JButton BtSearchArt;
    private javax.swing.JButton BtVendreA;
    private javax.swing.JRadioButton ByIdArt;
    private javax.swing.JRadioButton ByNamArt;
    private javax.swing.JButton Deconnexion;
    private javax.swing.JTextField TfSearchArt;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton14;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JRadioButton jRadioButton7;
    private javax.swing.JRadioButton jRadioButton8;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable5;
    private javax.swing.JTextField jTextField4;
}
