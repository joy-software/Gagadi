
package vue;

import static java.awt.Color.WHITE;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;

import controleur.ControlArticle;
import controleur.ControlClient;
import controleur.Controleur;

/**
 *
 * @author Paul Stephan
 */
public class I_tablePrincipale  {

   
	private static Object[][] data;
	private static Object[][] data1;
	private ArrayList<JButton> buts = new ArrayList<JButton>();
	private ControlArticle con = new ControlArticle();
	private ControlClient con1 = new ControlClient();
	private JFrame itablePrincipale = new JFrame();
    public I_tablePrincipale() {
        initComponents();
        itablePrincipale.setLocationRelativeTo(null);
        
        itablePrincipale.setBackground(WHITE);
        
        itablePrincipale.getContentPane().setBackground(WHITE);
                
         jTable2.setSurrendersFocusOnKeystroke(true); 
        
     
        jPanel6.setBackground(WHITE);
        
        buttonGroup1.add(ByNamArt);
        buttonGroup1.add(ByIdArt);
        
        buttonGroup2.add(RbByNamC);
        buttonGroup2.add(RbByIdC);
        
        buttonGroup3.add(RbByNamFour);
        buttonGroup3.add(RbByIdFour);
        
        buttonGroup4.add(jRadioButton7);
        buttonGroup4.add(jRadioButton8);
        
        buttonGroup5.add(RbByNamC1);
        buttonGroup5.add(RbByIdC1);
       
        Deconnexion.setBackground(WHITE);
        BtSearchArt.setBackground(WHITE);
        BtAjouterA.setBackground(WHITE);
        BtModifierA.setBackground(WHITE);
        
        jScrollPane2.setBackground(WHITE);
        
        jTabbedPane1.setBackground(WHITE);
        
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(I_tablePrincipale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(I_tablePrincipale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(I_tablePrincipale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(I_tablePrincipale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        itablePrincipale.setVisible(true);
    }

   
   /**
    * les getteurs et les setteurs
    * @return
    */
    public ControlArticle getCon() {
		return con;
	}

	public void setCon(ControlArticle con) {
		this.con = con;
	}

	public static void setrData(Object[][] dat) {
		data = dat;
	}



	@SuppressWarnings("serial")
	private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        buttonGroup5 = new javax.swing.ButtonGroup();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        TfSearchArt = new javax.swing.JTextField();
        TfSearchArt.addKeyListener(new KeyAdapter() {
        	@Override
        	public void keyReleased(KeyEvent arg0) {
        		try
        		{
        			con.typResearch(TfSearchArt, jTable2);
        		}
        		catch(Exception e)
        		{
        			Controleur.printStrace(e);
        		}
        	}
        });
        BtSearchArt = new javax.swing.JButton();
        ByNamArt = new javax.swing.JRadioButton();
        ByIdArt = new javax.swing.JRadioButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
       
        BtAjouterA = new javax.swing.JButton();
        BtAjouterA.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseClicked(MouseEvent arg0) {
        		try
        		{
        			con.DebutAjoutArticle(itablePrincipale,jTable2);

        		}
        		catch(Exception e)
        		{
        			Controleur.printStrace(e);
        		}
        	}
        });
        BtModifierA = new javax.swing.JButton();
        BtModifierA.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseClicked(MouseEvent arg0) {
        		try
        		{
        			con.DebutModifArticle(itablePrincipale,jTable2);

        		}
        		catch(Exception e)
        		{
        			Controleur.printStrace(e);
        		}
        	}
        });
        BtSuprimerA = new javax.swing.JButton();
        BtSuprimerA.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseClicked(MouseEvent arg0) {
            		try
            		{
            			con.DebutSupprimArticle(itablePrincipale,jTable2);

            		}
            		catch(Exception e)
            		{
            			Controleur.printStrace(e);
            		}
        	}
        });
      /*  testoooooooooonnnnnnnnnnnnnns oooooooooooooooooh xa marche oooooooooooooooooooooooohhhhhhhh     if(true)
        {
        	BtSuprimerA.setVisible(false);
        }
       //*/ 
        BtVendreA = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        TfRechC = new javax.swing.JTextField();
        BtRechC = new javax.swing.JButton();
        RbByNamC = new javax.swing.JRadioButton();
        RbByIdC = new javax.swing.JRadioButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        BtAjouC = new javax.swing.JButton();
        BtModifierC = new javax.swing.JButton();
        BtSupC = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        TfRechFour = new javax.swing.JTextField();
        BtRechFour = new javax.swing.JButton();
        RbByNamFour = new javax.swing.JRadioButton();
        RbByIdFour = new javax.swing.JRadioButton();
        BtAjouFour = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable4 = new javax.swing.JTable();
        BtModFour = new javax.swing.JButton();
        BtSupFour = new javax.swing.JButton();
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
        jPanel12 = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        jPanel14 = new javax.swing.JPanel();
        TfRechC1 = new javax.swing.JTextField();
        BtRechC1 = new javax.swing.JButton();
        RbByNamC1 = new javax.swing.JRadioButton();
        RbByIdC1 = new javax.swing.JRadioButton();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTable6 = new javax.swing.JTable();
        BtAjouC1 = new javax.swing.JButton();
        BtModifierC1 = new javax.swing.JButton();
        BtSupC1 = new javax.swing.JButton();
        jPanel15 = new javax.swing.JPanel();
        Deconnexion = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();

        itablePrincipale.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        itablePrincipale.setTitle("Menu Principale");
        itablePrincipale.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.disabledShadow"));
        itablePrincipale.setLocationByPlatform(true);
        itablePrincipale.setResizable(false);
        itablePrincipale.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        /**
         * ajout de boutons à notre ArrayList
         */
        buts.add(BtAjouterA);
        buts.add(BtModifierA);
        buts.add(BtSuprimerA);
        buts.add(BtVendreA);
        
        jTabbedPane1.setBackground(new java.awt.Color(255, 255, 255));
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
        BtSearchArt.setIcon(new javax.swing.ImageIcon("./Photo/rechercher.jpg")); // NOI18N
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
        ByNamArt.setSelected(true);
        ByNamArt.setText("Par nom");
        ByNamArt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ByNamArtActionPerformed(evt);
            }
        });
        jPanel1.add(ByNamArt, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 90, -1));

        ByIdArt.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.disabledShadow"));
        ByIdArt.setFont(new java.awt.Font("Arial Unicode MS", 0, 11)); // NOI18N
        ByIdArt.setText("Par code");
        jPanel1.add(ByIdArt, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 10, 120, -1));

        jScrollPane2.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.highlight"));

        jTable2.setAutoCreateRowSorter(true);
        jTable2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 255)));
        jTable2.setFont(new java.awt.Font("Arial Unicode MS", 0, 11)); // NOI18N
        
        String[] nomColonne = new String [] {"Code", "Nom", "Marque", "Prix Unitaire HT",
        		"Quantité", "Taux", "Prix Vente", "Prix Variable", "Remise",
        		"Prix TTC", "Stock min", "Benefice"};
        

    	/**
    	 * on remplit le tableau en faisant appel au controleur
    	 */
        //con.initData(data, 0);
        try
        {
        	data = con.chargerAticle(0);
        }
        catch(Exception e)
        {
        	Controleur.printStrace(e);
        }
		
        
		jTable2.setModel(new javax.swing.table.DefaultTableModel(data,nomColonne) {
            /**
			 * 
			 */
			private static final long serialVersionUID = 1L;
			@SuppressWarnings("rawtypes")
			Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Double.class, java.lang.Integer.class, java.lang.Double.class, java.lang.Double.class, java.lang.Boolean.class, java.lang.Double.class, java.lang.Double.class, java.lang.Double.class, java.lang.Integer.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false, false, false
            };

            @SuppressWarnings({ "unchecked", "rawtypes" })
			public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
		
		/**
		 * ajoute un listenner sur le tableau qui 
		 * s'enclenge lorsque clique sur un ligne de la table
		 */
		try
		{
			con.select(itablePrincipale,jTable2,buts);
		}
		catch(Exception e)
		{
			Controleur.printStrace(e);
		}
		
        jTable2.setDragEnabled(true);
        jTable2.setFillsViewportHeight(true);
        jScrollPane2.setViewportView(jTable2);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 1120, 360));

        BtAjouterA.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        BtAjouterA.setText("Ajouter");
        jPanel1.add(BtAjouterA, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 510, -1, -1));

        BtModifierA.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        BtModifierA.setText("Modifier");
        BtModifierA.setEnabled(false);
        jPanel1.add(BtModifierA, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 510, -1, -1));

        BtSuprimerA.setBackground(new java.awt.Color(255, 255, 255));
        BtSuprimerA.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        BtSuprimerA.setText("Suprimer");
        BtSuprimerA.setEnabled(false);
        BtSuprimerA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtSuprimerAActionPerformed(evt);
            }
        });
        jPanel1.add(BtSuprimerA, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 510, -1, -1));

        BtVendreA.setBackground(new java.awt.Color(255, 255, 255));
        BtVendreA.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        BtVendreA.setText("Vendre");
        BtVendreA.setEnabled(false);
        BtVendreA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtVendreAActionPerformed(evt);
            }
        });
        jPanel1.add(BtVendreA, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 510, -1, -1));

        jTabbedPane1.addTab("Articles", jPanel1);

        jPanel7.setBackground(new java.awt.Color(223, 241, 250));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel8.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.disabledShadow"));
        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Recherche", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.BELOW_TOP, null, new java.awt.Color(0, 102, 102)));
        jPanel8.setFont(new java.awt.Font("Arial Unicode MS", 0, 11)); // NOI18N
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TfRechC.setFont(new java.awt.Font("Cambria", 0, 11)); // NOI18N
        TfRechC.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel8.add(TfRechC, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 30, 790, 28));

        BtRechC.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.disabledShadow"));
        BtRechC.setFont(new java.awt.Font("Arial Unicode MS", 0, 11)); // NOI18N
        BtRechC.setIcon(new javax.swing.ImageIcon("./Photo/rechercher.jpg")); // NOI18N
        BtRechC.setActionCommand("Recherche");
        BtRechC.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel8.add(BtRechC, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 20, 80, 50));

        jPanel7.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, 1020, 90));

        RbByNamC.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.disabledShadow"));
        RbByNamC.setSelected(true);
        RbByNamC.setText("Par nom");
        RbByNamC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RbByNamCActionPerformed(evt);
            }
        });
        jPanel7.add(RbByNamC, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 90, -1));

        RbByIdC.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.disabledShadow"));
        RbByIdC.setFont(new java.awt.Font("Arial Unicode MS", 0, 11)); // NOI18N
        RbByIdC.setText("Par code");
        jPanel7.add(RbByIdC, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 10, 120, -1));

        jScrollPane3.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.highlight"));

        jTable3.setAutoCreateRowSorter(true);
        jTable3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 255)));
        jTable3.setFont(new java.awt.Font("Arial Unicode MS", 0, 11)); // NOI18N
        
        /**
    	 * on remplit le tableau en faisant appel au controleur
    	 */
        //con.initData(data, 0);
        try
        {
        	data1 = con1.chargerClient(0);
        }
        catch(Exception e)
        {
        	Controleur.printStrace(e);
        }
        
        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            data1,
            new String [] {
                "Code", "Nom", "Prenom", "Sexe", "Telephone", "email", "Adresse"
            }
        ) {
            @SuppressWarnings("rawtypes")
			Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            @SuppressWarnings({ "unchecked", "rawtypes" })
			public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable3.setDragEnabled(true);
        jTable3.setFillsViewportHeight(true);
        jScrollPane3.setViewportView(jTable3);

        jPanel7.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 1120, 360));

        BtAjouC.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        BtAjouC.setText("Ajouter");
        jPanel7.add(BtAjouC, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 510, -1, -1));

        BtModifierC.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        BtModifierC.setText("Modifier");
        BtModifierC.setEnabled(false);
        jPanel7.add(BtModifierC, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 510, -1, -1));

        BtSupC.setBackground(new java.awt.Color(255, 255, 255));
        BtSupC.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        BtSupC.setText("Suprimer");
        BtSupC.setEnabled(false);
        jPanel7.add(BtSupC, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 510, -1, -1));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1145, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, 1145, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 552, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, 552, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jTabbedPane1.addTab("Clients", jPanel2);

        jPanel5.setBackground(new java.awt.Color(197, 227, 227));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel9.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.disabledShadow"));
        jPanel9.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Recherche", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.BELOW_TOP, null, new java.awt.Color(0, 102, 102)));
        jPanel9.setFont(new java.awt.Font("Arial Unicode MS", 0, 11)); // NOI18N
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TfRechFour.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        TfRechFour.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel9.add(TfRechFour, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 30, 790, 28));

        BtRechFour.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.disabledShadow"));
        BtRechFour.setFont(new java.awt.Font("Arial Unicode MS", 0, 11)); // NOI18N
        BtRechFour.setIcon(new javax.swing.ImageIcon("./Photo/rechercher.jpg")); // NOI18N
        BtRechFour.setActionCommand("Recherche");
        BtRechFour.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel9.add(BtRechFour, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 20, 80, 50));

        jPanel5.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, 1020, 90));

        RbByNamFour.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.disabledShadow"));
        RbByNamFour.setSelected(true);
        RbByNamFour.setText("Par nom");
        RbByNamFour.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RbByNamFourActionPerformed(evt);
            }
        });
        jPanel5.add(RbByNamFour, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 90, -1));

        RbByIdFour.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.disabledShadow"));
        RbByIdFour.setFont(new java.awt.Font("Arial Unicode MS", 0, 11)); // NOI18N
        RbByIdFour.setText("Par code");
        jPanel5.add(RbByIdFour, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 10, 120, -1));

        BtAjouFour.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        BtAjouFour.setText("Ajouter");
        jPanel5.add(BtAjouFour, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 510, -1, -1));

        jScrollPane4.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.highlight"));

        jTable4.setAutoCreateRowSorter(true);
        jTable4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 255)));
        jTable4.setFont(new java.awt.Font("Arial Unicode MS", 0, 11)); // NOI18N
        jTable4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Code", "Nom", "Prenom", "Cathegorie", "Telephone", "Adresse", "email", "Pays"
            }
        ) {
            @SuppressWarnings("rawtypes")
			Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            
            @SuppressWarnings({ "unchecked", "rawtypes" })
			public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable4.setDragEnabled(true);
        jTable4.setFillsViewportHeight(true);
        jScrollPane4.setViewportView(jTable4);

        jPanel5.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 1120, 360));

        BtModFour.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        BtModFour.setText("Modifier");
        BtModFour.setEnabled(false);
        jPanel5.add(BtModFour, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 510, -1, -1));

        BtSupFour.setBackground(new java.awt.Color(255, 255, 255));
        BtSupFour.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        BtSupFour.setText("Suprimer");
        BtSupFour.setEnabled(false);
        jPanel5.add(BtSupFour, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 510, -1, -1));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1145, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 1145, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 552, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 552, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jTabbedPane1.addTab("Fournisseurs", jPanel3);

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
        jButton14.setIcon(new javax.swing.ImageIcon("./Photo/rechercher.jpg")); // NOI18N
        jButton14.setActionCommand("Recherche");
        jButton14.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel11.add(jButton14, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 20, 80, 50));

        jPanel10.add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, 1020, 90));

        jRadioButton7.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.disabledShadow"));
        jRadioButton7.setSelected(true);
        jRadioButton7.setText("Par nom");
        jRadioButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton7ActionPerformed(evt);
            }
        });
        jPanel10.add(jRadioButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 90, -1));

        jRadioButton8.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.disabledShadow"));
        jRadioButton8.setFont(new java.awt.Font("Arial Unicode MS", 0, 11)); // NOI18N
        jRadioButton8.setText("Par code");
        jPanel10.add(jRadioButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 10, 120, -1));

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
            @SuppressWarnings("rawtypes")
			Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Double.class, java.lang.Object.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            @SuppressWarnings({ "unchecked", "rawtypes" })
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

        jPanel13.setBackground(new java.awt.Color(142, 187, 231));
        jPanel13.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel14.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.disabledShadow"));
        jPanel14.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Recherche", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.BELOW_TOP, null, new java.awt.Color(0, 102, 102)));
        jPanel14.setFont(new java.awt.Font("Arial Unicode MS", 0, 11)); // NOI18N
        jPanel14.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TfRechC1.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        TfRechC1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel14.add(TfRechC1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 30, 790, 28));

        BtRechC1.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.disabledShadow"));
        BtRechC1.setFont(new java.awt.Font("Arial Unicode MS", 0, 11)); // NOI18N
        BtRechC1.setIcon(new javax.swing.ImageIcon("./Photo/rechercher.jpg")); // NOI18N
        BtRechC1.setActionCommand("Recherche");
        BtRechC1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel14.add(BtRechC1, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 20, 80, 50));

        jPanel13.add(jPanel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, 1020, 90));

        RbByNamC1.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.disabledShadow"));
        RbByNamC1.setSelected(true);
        RbByNamC1.setText("Par nom");
        RbByNamC1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RbByNamC1ActionPerformed(evt);
            }
        });
        jPanel13.add(RbByNamC1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 90, -1));

        RbByIdC1.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.disabledShadow"));
        RbByIdC1.setFont(new java.awt.Font("Arial Unicode MS", 0, 11)); // NOI18N
        RbByIdC1.setText("Par code");
        jPanel13.add(RbByIdC1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 10, 120, -1));

        jScrollPane6.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.highlight"));

        jTable6.setAutoCreateRowSorter(true);
        jTable6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 255)));
        jTable6.setFont(new java.awt.Font("Cambria", 0, 12)); // NOI18N
        jTable6.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Code", "Nom", "Prenom", "Login", "Mot de passe", "Type de Compte", "Sexe", "Telephone", "email", "Adresse"
            }
        ) {
            @SuppressWarnings("rawtypes")
			Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false
            };

            @SuppressWarnings({ "unchecked", "rawtypes" })
			public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable6.setDragEnabled(true);
        jTable6.setFillsViewportHeight(true);
        jScrollPane6.setViewportView(jTable6);

        jPanel13.add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 1120, 360));

        BtAjouC1.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        BtAjouC1.setText("Ajouter");
        jPanel13.add(BtAjouC1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 510, -1, -1));

        BtModifierC1.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        BtModifierC1.setText("Modifier");
        BtModifierC1.setEnabled(false);
        jPanel13.add(BtModifierC1, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 510, -1, -1));

        BtSupC1.setBackground(new java.awt.Color(255, 255, 255));
        BtSupC1.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        BtSupC1.setText("Suprimer");
        BtSupC1.setEnabled(false);
        jPanel13.add(BtSupC1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 510, -1, -1));

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1145, Short.MAX_VALUE)
            .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel12Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, 1145, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 552, Short.MAX_VALUE)
            .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel12Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, 552, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jTabbedPane1.addTab("Employés", jPanel12);

        jPanel15.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jTabbedPane1.addTab("Statistiques", jPanel15);

        itablePrincipale.getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 1150, 570));

        Deconnexion.setFont(new java.awt.Font("Arial Unicode MS", 0, 11)); // NOI18N
        Deconnexion.setIcon(new javax.swing.ImageIcon("./Photo/decon.JPG")); // NOI18N
        Deconnexion.setToolTipText("deconnexion");
        Deconnexion.setActionCommand("deconnexion");
        itablePrincipale.getContentPane().add(Deconnexion, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 10, 40, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon("./Photo/tofBD/The_Blacy!/exciting.png")); // NOI18N
        itablePrincipale.getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 0, 130, 120));

        jLabel2.setIcon(new javax.swing.ImageIcon("./Photo/tofBD/bien.JPG")); // NOI18N
        itablePrincipale.getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 0, 250, 120));

        jLabel3.setFont(new java.awt.Font("Cambria", 2, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Vous etes l'administrateur !!!");
        itablePrincipale.getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 100, 190, 30));

        jMenuBar1.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N

        jMenu1.setText("Fichier");
        jMenu1.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edition");
        jMenu2.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        jMenuBar1.add(jMenu2);

        jMenu3.setText("Aide");
        jMenu3.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        jMenuBar1.add(jMenu3);

        itablePrincipale.setJMenuBar(jMenuBar1);

        itablePrincipale.getAccessibleContext().setAccessibleDescription("");

        itablePrincipale.pack();
    }                     

    private void RbByNamCActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
    }                                        

    private void ByNamArtActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
    }                                        

    private void RbByNamFourActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // TODO add your handling code here:
    }                                           

    private void jRadioButton7ActionPerformed(java.awt.event.ActionEvent evt) {                                              
        // TODO add your handling code here:
    }                                             

    private void BtSearchArtActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // TODO add your handling code here:
    }                                           

    private void BtVendreAActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
    }                                         

    private void BtSuprimerAActionPerformed(java.awt.event.ActionEvent evt) {                                            
       
    }                                           

    private void RbByNamC1ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
    }                                         

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
            java.util.logging.Logger.getLogger(I_tablePrincipale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(I_tablePrincipale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(I_tablePrincipale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(I_tablePrincipale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
            	I_tablePrincipale nuv =  new I_tablePrincipale();
               nuv.itablePrincipale.setVisible(true);
            }
        });
    }

    private javax.swing.JButton BtAjouC;
    private javax.swing.JButton BtAjouC1;
    private javax.swing.JButton BtAjouFact;
    private javax.swing.JButton BtAjouFour;
    private javax.swing.JButton BtAjouterA;
    private javax.swing.JButton BtAnnFact;
    private javax.swing.JButton BtModFact;
    private javax.swing.JButton BtModFour;
    private javax.swing.JButton BtModifierA;
    private javax.swing.JButton BtModifierC;
    private javax.swing.JButton BtModifierC1;
    private javax.swing.JButton BtRechC;
    private javax.swing.JButton BtRechC1;
    private javax.swing.JButton BtRechFour;
    private javax.swing.JButton BtSearchArt;
    private javax.swing.JButton BtSupC;
    private javax.swing.JButton BtSupC1;
    private javax.swing.JButton BtSupFour;
    private javax.swing.JButton BtSuprimerA;
    private javax.swing.JButton BtVendreA;
    private javax.swing.JRadioButton ByIdArt;
    private javax.swing.JRadioButton ByNamArt;
    private javax.swing.JButton Deconnexion;
    private javax.swing.JRadioButton RbByIdC;
    private javax.swing.JRadioButton RbByIdC1;
    private javax.swing.JRadioButton RbByIdFour;
    private javax.swing.JRadioButton RbByNamC;
    private javax.swing.JRadioButton RbByNamC1;
    private javax.swing.JRadioButton RbByNamFour;
    private javax.swing.JTextField TfRechC;
    private javax.swing.JTextField TfRechC1;
    private javax.swing.JTextField TfRechFour;
    private javax.swing.JTextField TfSearchArt;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.ButtonGroup buttonGroup5;
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
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JRadioButton jRadioButton7;
    private javax.swing.JRadioButton jRadioButton8;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTabbedPane jTabbedPane1;
    private static javax.swing.JTable jTable2;
	private javax.swing.JTable jTable3;
    private javax.swing.JTable jTable4;
    private javax.swing.JTable jTable5;
    private javax.swing.JTable jTable6;
    private javax.swing.JTextField jTextField4;
    
}
