/**
 * 
 */
package gestioninscription;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Cursor;
import java.awt.Desktop;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.awt.image.RenderedImage;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.NoSuchElementException;
import java.util.StringTokenizer;
import java.util.Vector;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JToggleButton;
import javax.swing.JToolBar;
import javax.swing.KeyStroke;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.border.TitledBorder;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.plaf.basic.BasicBorders;
import javax.swing.table.TableColumn;

/**
 * <b>GestionInscriptionDessin est la classe qui gère l'interface graphique du projet </b>
 * <p>
 * <ul>
 * <li>	Il faudra aussi vérifier si au moins une autre implémentation d'une des méthode écrite est correcte</li>
 * </ul>
 * </p>
 * <p>
 * 
 * </p>
 * 
 * @see  GestionInscriptionDessin
 * 
 * @author Foze
 * 
  * @version 0.0
 */

public class GestionInscriptionDessin extends JFrame{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	final int DIVX = 4;
	final int DIVY = 16;
	final int R = 215;
	final int G = 235;
	final int B = 245;
	final Color COULEUR1 = new Color(R,G,B);
	private JLabel boutonArriere;
	
	private	JMenuBar menu = new JMenuBar();
	private	JMenu fichier = new JMenu("Fichier");
	private JMenu edition = new JMenu("Edition");
	private JMenu aide = new JMenu("Aide");
			
	private JMenuItem nouveau = new JMenuItem("Nouveau");		
	private JMenuItem consulter = new JMenuItem("Consulter");
	private JMenuItem quitter = new JMenuItem("Quitter");
	private JMenuItem modifier = new JMenuItem("Modifier");		
	private JMenuItem supprimer = new JMenuItem("Supprimer");
	private JMenuItem manuel = new JMenuItem("Manuel Utilisateur");
	private JMenuItem aPropos = new JMenuItem("A Propos");				
	
	private JToggleButton boutonNouveau = new JToggleButton(new ImageIcon("Images/save.png"));
	private JToggleButton boutonModifier = new JToggleButton(new ImageIcon("Images/load.png"));
	private JToggleButton boutonSupprimer = new JToggleButton(new ImageIcon("Images/supprimer.png"));
	private JToggleButton boutonQuitter = new JToggleButton(new ImageIcon("Images/exit.png"));
	private JToggleButton boutonConsulter = new JToggleButton(new ImageIcon("Images/open.png"));
	private JToggleButton boutonManuel = new JToggleButton(new ImageIcon("Images/manuel.png"));
	private JToggleButton boutonAPropos = new JToggleButton(new ImageIcon("Images/aPropos.png"));
	private JButton boutonEtudiants = new JButton(new ImageIcon("Images/tableEtudiants.png"));
	private JTable tableEtudiants;
	
	private JToolBar toolBar = new JToolBar();
	
	static String matricule = "";
			
	public GestionInscriptionDessin(){			
		
		nouveau.setCursor(new Cursor(12));
		consulter.setCursor(new Cursor(12));
		quitter.setCursor(new Cursor(12));
		modifier.setCursor(new Cursor(12));
		supprimer.setCursor(new Cursor(12));
		manuel.setCursor(new Cursor(12));
		aPropos.setCursor(new Cursor(12));
		
		boutonNouveau.setCursor(new Cursor(12));
		boutonConsulter.setCursor(new Cursor(12));
		boutonQuitter.setCursor(new Cursor(12));
		boutonModifier.setCursor(new Cursor(12));
		boutonSupprimer.setCursor(new Cursor(12));
		boutonManuel.setCursor(new Cursor(12));
		boutonAPropos.setCursor(new Cursor(12));
		boutonEtudiants.setCursor(new Cursor(12));
		
		quitter.setIcon(new ImageIcon("Images/exit.png"));
		consulter.setIcon(new ImageIcon("Images/open.png"));
		nouveau.setIcon(new ImageIcon("Images/save.png"));
		modifier.setIcon(new ImageIcon("Images/load.png"));
		supprimer.setIcon(new ImageIcon("Images/supprimer.png"));
		manuel.setIcon(new ImageIcon("Images/manuel.png"));
		aPropos.setIcon(new ImageIcon("Images/aPropos.png"));							
		
		fichier.setMnemonic('F');
		fichier.getAccessibleContext().setAccessibleDescription(
		        "operations usuelles: nouveau, consulter et quitter");
		fichier.setToolTipText(
		        "operations usuelles: nouveau, consulter et quitter");
						
		edition.setMnemonic('E');
		edition.getAccessibleContext().setAccessibleDescription(
		        "operations de modification et de suppression");
		edition.setToolTipText(
		        "operations de modification et de suppression");
				
		aide.setMnemonic('A');
		aide.getAccessibleContext().setAccessibleDescription(
		        "A propos et aide");		
		aide.setToolTipText(
		        "A propos et aide");
		
		nouveau.setAccelerator(KeyStroke.getKeyStroke(
		        KeyEvent.VK_N, ActionEvent.ALT_MASK));
		nouveau.setMnemonic(KeyEvent.VK_N);
		nouveau.getAccessibleContext().setAccessibleDescription(
		        "Enregistrement d'un nouvel étudiant");
		nouveau.setToolTipText(
		        "Enregistrement d'un nouvel étudiant");
		boutonNouveau.setToolTipText(
		        "Enregistrement d'un nouvel étudiant");
		
		consulter.setAccelerator(KeyStroke.getKeyStroke(
		        KeyEvent.VK_C, ActionEvent.ALT_MASK));
		consulter.setMnemonic(KeyEvent.VK_C);
		consulter.getAccessibleContext().setAccessibleDescription(
		        "Consulter la fiche d'un étudiant particulier");
		consulter.setToolTipText(
		        "Consulter la fiche d'un étudiant particulier");
		boutonConsulter.setToolTipText(
		        "Consulter la fiche d'un étudiant particulier");
		
		quitter.setAccelerator(KeyStroke.getKeyStroke(
		        KeyEvent.VK_Q, ActionEvent.ALT_MASK));
		quitter.setMnemonic(KeyEvent.VK_Q);
		quitter.setToolTipText("Quitter l'application");
		boutonQuitter.setToolTipText("Quitter l'application");
		
		modifier.setAccelerator(KeyStroke.getKeyStroke(
		        KeyEvent.VK_M, ActionEvent.ALT_MASK));
		modifier.setMnemonic(KeyEvent.VK_M);
		modifier.getAccessibleContext().setAccessibleDescription(
		        "Modifier les informations d'un étudiant particulier");
		modifier.setToolTipText(
		        "Modifier les informations d'un étudiant particulier");
		boutonModifier.setToolTipText(
		        "Modifier les informations d'un étudiant particulier");
		
		supprimer.setAccelerator(KeyStroke.getKeyStroke(
		        KeyEvent.VK_S, ActionEvent.ALT_MASK));
		supprimer.setMnemonic(KeyEvent.VK_S);
		supprimer.getAccessibleContext().setAccessibleDescription(
		        "Supprimer un etudiant dont le matricule est connu");
		supprimer.setToolTipText(
		        "Supprimer un etudiant dont le matricule est connu");
		boutonSupprimer.setToolTipText(
		        "Supprimer un etudiant dont le matricule est connu");
		
		aPropos.setAccelerator(KeyStroke.getKeyStroke(
		        KeyEvent.VK_A, ActionEvent.ALT_MASK));
		aPropos.setMnemonic(KeyEvent.VK_A);
		aPropos.getAccessibleContext().setAccessibleDescription(
		        "Affiche le à propos");
		aPropos.setToolTipText(
		        "Affiche le à propos");
		boutonAPropos.setToolTipText(
		        "Affiche le à propos");		
		
		manuel.setAccelerator(KeyStroke.getKeyStroke(
		        KeyEvent.VK_F1, ActionEvent.ALT_MASK));
		manuel.setMnemonic(KeyEvent.VK_F1);
		manuel.getAccessibleContext().setAccessibleDescription(
		        "Affiche l'aide du logiciel");
		manuel.setToolTipText(
		        "Affiche l'aide du logiciel");
		boutonManuel.setToolTipText(
		        "Affiche l'aide du logiciel");
				
		boutonEtudiants.setMnemonic('P');
		boutonEtudiants.getAccessibleContext().setAccessibleDescription(
		        "Affiche la liste de tous les étudiants");
		boutonEtudiants.setToolTipText(
		        "Affiche la liste de tous les étudiants");
		
		toolBar.add(boutonNouveau);
		toolBar.add(boutonConsulter);
		toolBar.add(boutonQuitter);
		toolBar.add(boutonModifier);
		toolBar.add(boutonSupprimer);
		toolBar.add(boutonManuel);
		toolBar.add(boutonAPropos);		
		toolBar.add(boutonEtudiants);
		toolBar.setFloatable(false);		
		add(toolBar,BorderLayout.NORTH);
		
		boutonArriere = new JLabel(new ImageIcon("Images/imag.png"));
		add(boutonArriere,BorderLayout.CENTER);				
		
		Dimension DIM = Toolkit.getDefaultToolkit().getScreenSize();					
		int HAUTEUR = (int) Math.round((1-2.0/DIVY)*DIM.height-45);
		int LARGEUR = (int) Math.round((1-2.0/DIVX)*DIM.width-100);
		
		String titre = "GESTION DES INSCRIPTIONS";
		String espace = "    ";
		setTitle(espace+titre);					
		
		setSize(LARGEUR,HAUTEUR);
		setLocationRelativeTo(null);
		this.setResizable(false);
		
		Container c = getContentPane();
		FlowLayout grille = new FlowLayout();
		c.setLayout(grille);
		c.setBackground(COULEUR1);				
		
		//gestion du menu
		fichier.add(nouveau);
		fichier.addSeparator();
		fichier.add(consulter);
		fichier.addSeparator();
		fichier.add(quitter);
		
		edition.add(modifier);
		edition.addSeparator();
		edition.add(supprimer);
		
		aide.add(manuel);
		aide.addSeparator();
		aide.add(aPropos);
		
		menu.add(fichier);
		menu.add(edition);
		menu.add(aide);
		setJMenuBar(menu);							
		
		//gestion des contours
		TitledBorder titre1 = new TitledBorder(titre);		
		titre1.setTitle(titre);
		titre1.setTitleColor(Color.blue);
		Font font1 = new Font("Engravers MT",Font.BOLD,10);
		titre1.setTitleFont(font1);		
		Color couleur = Color.blue;
		titre1.setBorder(new BasicBorders.FieldBorder(couleur,couleur,couleur,couleur));
		titre1.setTitleJustification(2);
		titre1.setTitlePosition(TitledBorder.BELOW_BOTTOM);
		getRootPane().setBorder(titre1);
		
		 setIconImage(Toolkit.getDefaultToolkit().getImage("Images/logo1.png"));		 		 		 		 		 	
		 
		 UIManager.LookAndFeelInfo[] listeLAF = UIManager.getInstalledLookAndFeels ();
		 try{
             UIManager.setLookAndFeel(listeLAF[3].getClassName());
             SwingUtilities.updateComponentTreeUI(GestionInscriptionDessin.this);
          }catch (Exception ex1) {        	  	
         }		 		 		 		
		 		 
		 setDefaultCloseOperation(EXIT_ON_CLOSE);		 
		 setVisible(true);
		 initialisation();
	}
	
	private void initialisation(){
		
		 //Gestion des consultations		 		 
		 consulter.addActionListener(new ActionListener(){
			 public void actionPerformed(ActionEvent arg0){
				consulterVoid();
			 }
		 });
		
		 boutonConsulter.addActionListener(new ActionListener(){
			 public void actionPerformed(ActionEvent arg0){
				consulterVoid();
			 }
		 });
		 
		 //Gestion des suppressions		 		 
		 supprimer.addActionListener(new ActionListener(){
			 public void actionPerformed(ActionEvent arg0){				
				 supprimerVoid();
			 }
		 });
		 
		 boutonSupprimer.addActionListener(new ActionListener(){
			 public void actionPerformed(ActionEvent arg0){				
				 	supprimerVoid();																
			 }
		 });
		 
		//Gestion des modifications		 		 
		 modifier.addActionListener(new ActionListener(){
			 public void actionPerformed(ActionEvent arg0){				
				 	modifierVoid();
					}
		 });
		 
		 boutonModifier.addActionListener(new ActionListener(){
			 public void actionPerformed(ActionEvent arg0){				
				 modifierVoid();
			 }
		 });		 
		 
		 //Gestion de l'A Propos		 		 		 
		 aPropos.addActionListener(new ActionListener(){
			   public void actionPerformed(ActionEvent arg0) {						 
				aProposVoid();
			   }
		 }); 
		 				 
		 boutonAPropos.addActionListener(new ActionListener(){
			   public void actionPerformed(ActionEvent arg0) {						 
				aProposVoid();
			   }
		 }); 
		
		 //Gestion de l'item quitter
		 quitter.addActionListener(new ActionListener(){
			 public void actionPerformed(ActionEvent arg0){
				 quitterVoid();			
			 }
		 });
		 
		 boutonQuitter.addActionListener(new ActionListener(){
			 public void actionPerformed(ActionEvent arg0){
				 quitterVoid();			
			 }
		 });
		 
		 //Gestion des nouveaux
		 nouveau.addActionListener(new ActionListener(){			 

			public void actionPerformed(ActionEvent arg0){
				 new GestionInscriptionDialog(true);				 
			 }
		 });
		 boutonNouveau.addActionListener(new ActionListener(){			 

				public void actionPerformed(ActionEvent arg0){
					 new GestionInscriptionDialog(true);				 
				 }
			 });
		 
		 //aide
		 manuel.addActionListener(new ActionListener(){			 			
				public void actionPerformed(ActionEvent arg0) {
					manuelVoid();				
				}					
			 });
		 
		 boutonManuel.addActionListener(new ActionListener(){			 			
			public void actionPerformed(ActionEvent arg0) {
				manuelVoid();				
			}					
		 });
		 
		 boutonEtudiants.addActionListener(new ActionListener(){			 			
				public void actionPerformed(ActionEvent arg0) {													
					String[] nomColonnes = {"Matricule","Noms","Prenoms","Age","Date de naissance","Pays"};
					int longueur = 0;
					try{
					   	 FileReader fr = new FileReader("Fichiers/Etudiants.txt");
						 BufferedReader br = new BufferedReader(fr);
						 						 
						 String ligne  = br.readLine();						 
						 try{														 
							 while(ligne!=null){
								 longueur++;
								 ligne  = br.readLine();
							 }
						 }catch(NoSuchElementException ex){							 
						 }	
						 
						 br.close();
						 fr.close();
					}
					catch(FileNotFoundException ex){						
					}
					catch(IOException ex){						
					}
					
					String[][] donnees = new String[longueur][6] ;
					try{
					   	 FileReader fr = new FileReader("Fichiers/Etudiants.txt");
						 BufferedReader br = new BufferedReader(fr);
						 						 
						 String ligne  = br.readLine();
						 int i =0,j=0;						 
						 try{
						 while(ligne!=null){
							 j=0;												 
							 StringTokenizer st = new StringTokenizer(ligne,"-");							 
							 while(j<6){
								 donnees[i][j] = st.nextToken();
								 j++;
							 }	
							 i++;
						     ligne  = br.readLine();
						 }
						 }catch(NoSuchElementException ex){							 
						 }
						 
						 br.close();
						 fr.close();
					}
					catch(FileNotFoundException ex){					
					}
					catch(IOException ex){				
					}										
					
					tableEtudiants = new JTable(donnees,nomColonnes);
					tableEtudiants.setEnabled(false);
					
					TableColumn column = null;
					for (int i = 0; i < 6; i++) {
					    column = tableEtudiants.getColumnModel().getColumn(i);
					    if (i == 0) {
					        column.setPreferredWidth(90); 
					    }else {
					    	if(i== 3){
					    		column.setPreferredWidth(40);
					    	}else{
					    		column.setPreferredWidth(150);
					    	}
					    }
					}
					
					tableEtudiants.setFont(new Font("Times New Roman",Font.PLAIN,16));
					JDialog dialog = new JDialog();
					dialog.setModal(true);
					dialog.setTitle("Tableau des étudiants");					
					dialog.setBounds(395,150,580,300);
					JScrollPane scrollPane = new JScrollPane(tableEtudiants);
					tableEtudiants.setFillsViewportHeight(true);
					dialog.add(scrollPane);					
				    dialog.setVisible(true);				    
				}					
			 });
	}
	
	private void aProposVoid(){
		ImageIcon img = new ImageIcon("Images/logo.png");			    
	    
	    String mess = "\nGESTION DES INSCRIPTIONS\n\n";
	    mess += "Ce logiciel est développé par TANKWA NKEPFOR KOEMAN,\n";
	    mess += "\tétudiant en 2013 à l'Ecole Polytechnique de Yaoundé.\n";
	    mess += "\n";
	    mess += "Version 0.0\n";
	    mess += "Distribution open source.\n";
	    mess += "Initialement induit dans le cadre d'un projet sous la demande\n";
	    mess += "de l'enseignant BATCHAKUI BARNABE.\n";
	    mess += "\n";
	    mess += "Pour des problèmes liés aux codes sources du logiciel, vous\n";
	    mess += "pouvez joindre la communauté developpez.com où le développeur se trouve\n\n";
	    			    
	    JOptionPane.showMessageDialog(null, mess, "   À propos",JOptionPane.INFORMATION_MESSAGE, img);			    
	    
	}
	
	private void quitterVoid(){
		System.exit(0);
	}
	
	private void manuelVoid(){
		File fichAide = new File("Fichiers/help/aide.chm");
		 try{
			 Desktop.getDesktop().open(fichAide);
		 }catch(IOException e){			 
		 }
	}
	
	private void modifierVoid(){
		matricule = "";				
		new ConsulterDialog();										
		if(!matricule.isEmpty()){
			final Etudiant etd1 = new Etudiant();
			Etudiant etd = new Etudiant();
			etd = etd.getEtudiant("Fichiers/Etudiants.txt",matricule);				
			final GestionInscriptionDialog dialog = new GestionInscriptionDialog(false);
			dialog.setTitle("    MODIFICATION   D'UN   ETUDIANT ");
			
			dialog.boutonEnregistrer2.setVisible(true);
			dialog.boutonEnregistrer.setVisible(false);
			dialog.boutonReprendre.setVisible(false);
															
			dialog.textFieldMatricule.setText(matricule);
			dialog.textFieldNom.setText(etd.getNom());
			dialog.textFieldPrenom.setText(etd.getPrenom());
							
			dialog.spinnerAge.setValue(etd.getAge());
			dialog.dateChooserAnnee.getDateEditor().setDate(etd.getDate());
			dialog.comboBoxPays.setSelectedItem(etd.getPays());
			dialog.listModel2.removeAllElements();
			dialog.fichPath = " ";
			for(int i=0;i<etd.getListUvs().size();i++){
				dialog.listModel2.addElement(etd.getListUvs().elementAt(i));
			}
			for(int i=0;i<etd.getListUvs().size();i++){
				dialog.listModel1.removeElement(etd.getListUvs().elementAt(i));
			}
			try{				
				dialog.labelPhoto1.setIcon(new ImageIcon(etd.getCheminPhoto()));
				dialog.fichPath = etd.getCheminPhoto();				
			}catch(NullPointerException ex){
				dialog.labelPhoto1.setIcon(new ImageIcon());
			}
			
			dialog.boutonEnregistrer2.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent arg0){
					if(dialog.listModel2.isEmpty()){
						JOptionPane.showMessageDialog(null, "L'étudiant doit être inscrit à au moins une matière", "  CHAMP INCORRECT",JOptionPane.INFORMATION_MESSAGE);
					}
					else{
						etd1.supprimeEtudiant("Fichiers/Etudiants.txt",matricule);																																
										 ArrayList<String> matieres = new ArrayList<String>();
										 if(!dialog.listModel2.isEmpty()){
										 for(int i = 0; i<dialog.listModel2.getSize();i++){							 
											 matieres.add(dialog.listModel2.elementAt(i).toString());							 
										 }
										 }else{
											 matieres.add(" ");
										 }
										 Vector<String> vectorListUvs = new Vector<String>(matieres);													 
										 
										 if(dialog.textFieldPrenom.getText().isEmpty()){
											 dialog.textFieldPrenom.setText(" ");
										 }
										 
										 if(dialog.fichPath.equals("Fichiers/Photos/nouvellePhoto.png")){
											 try{
												 	int valeur = (int) Math.floor((Math.random()*1000));
													BufferedImage image = ImageIO.read(new File("Fichiers/Photos/nouvellePhoto.png"));
													dialog.fichPath = "Fichiers/Photos/photo"+matricule+"_"+valeur+".png";
													ImageIO.write((RenderedImage) image,"png", new File(dialog.fichPath));
													
												}catch(NullPointerException ex){
													dialog.fichPath = " ";
												} catch (IOException e) {
													dialog.fichPath = " ";													
												}
											 }
										 
										 Etudiant etd = new  Etudiant(matricule,dialog.textFieldNom.getText(),dialog.textFieldPrenom.getText(),(int)dialog.spinnerAge.getValue(),dialog.dateChooserAnnee.getDate(),dialog.comboBoxPays.getSelectedItem().toString(),vectorListUvs,dialog.fichPath);
										 etd.ajouteEtudiant("Fichiers/Etudiants.txt",etd);						 
										 
										// Après enregistrement 						 
										 String mess = "MODIFICATION EFFECTUEE AVEC SUCCES";													 
										JOptionPane.showMessageDialog(null, mess,"MODIFICATION REUSSIE !",JOptionPane.INFORMATION_MESSAGE);
										dialog.fermerApplication();
							}
							}
						});
			
			dialog.textFieldNom.getDocument().addDocumentListener(new DocumentListener(){							
				public void changedUpdate(DocumentEvent arg0) {
					
					
				}
				
				public void insertUpdate(DocumentEvent arg0) {								
					if(!dialog.textFieldNom.getText().isEmpty()){
						dialog.boutonEnregistrer2.setEnabled(true);
					}
													
				}	
										
				public void removeUpdate(DocumentEvent arg0) {
					if(dialog.textFieldNom.getText().isEmpty()){
						dialog.boutonEnregistrer2.setEnabled(false);
					}							
				}
			});
		}		
		}
	
		private void consulterVoid(){
			matricule = "";				
			new ConsulterDialog();
			
			if(!matricule.isEmpty()){
			Etudiant etd = new Etudiant();				
			etd = etd.getEtudiant("Fichiers/Etudiants.txt",matricule);				
			
			GestionInscriptionDialog dialog = new GestionInscriptionDialog(false);					
			dialog.setTitle("    CONSULTATION   D'UN   ETUDIANT ");
			dialog.panel1.remove(dialog.labelAnnee);
			dialog.dateChooserAnnee.setVisible(false);
			dialog.comboBoxPays.setEnabled(false);				
			dialog.toggleButtonListUvs1.setVisible(false);
			dialog.toggleButtonListUvs2.setVisible(false);				
			dialog.panList1.setVisible(false);
			dialog.toggleButtonPhoto.setVisible(false);				
			dialog.annulerPhoto.setVisible(false);
			dialog.boutonEnregistrer.setVisible(false);
			dialog.boutonReprendre.setVisible(false);
			dialog.panelListUvs.setPreferredSize(new Dimension(180,150));
			dialog.panList2.setMinimumSize(new Dimension(175,150));
			dialog.panList2.setPreferredSize(new Dimension(175,150));								
			dialog.textFieldMatricule.setText(matricule);				
			dialog.textFieldNom.setText(etd.getNom());
			dialog.textFieldPrenom.setText(etd.getPrenom());
			dialog.textFieldNom.setEditable(false);
			dialog.textFieldPrenom.setEditable(false);								
			dialog.spinnerAge.setValue(etd.getAge());
			dialog.dateChooserAnnee.getDateEditor().setDate(etd.getDate());
			dialog.comboBoxPays.setSelectedItem(etd.getPays());
			dialog.listModel2.removeAllElements();
			for(int i=0;i<etd.getListUvs().size();i++){
				dialog.listModel2.addElement(etd.getListUvs().elementAt(i));
			}
			try{				
				dialog.labelPhoto1.setIcon(new ImageIcon(etd.getCheminPhoto()));				
			}catch(NullPointerException ex){
				dialog.labelPhoto1.setIcon(new ImageIcon());
			}				
		 }
		}
		
		private void supprimerVoid(){
			matricule = "";				
			new ConsulterDialog();										
			if(!matricule.isEmpty()){
				final Etudiant etd1 = new Etudiant();
				Etudiant etd = new Etudiant();
				etd = etd.getEtudiant("Fichiers/Etudiants.txt",matricule);										
				final GestionInscriptionDialog dialog = new GestionInscriptionDialog(false);
				dialog.setTitle("    SUPPRESSION   D'UN   ETUDIANT ");
				dialog.panel1.remove(dialog.labelAnnee);
				dialog.dateChooserAnnee.setVisible(false);
				dialog.comboBoxPays.setEnabled(false);				
				dialog.toggleButtonListUvs1.setVisible(false);
				dialog.toggleButtonListUvs2.setVisible(false);				
				dialog.panList1.setVisible(false);
				dialog.toggleButtonPhoto.setVisible(false);				
				dialog.annulerPhoto.setVisible(false);
				dialog.boutonSupprimer.setVisible(true);
				dialog.boutonEnregistrer.setVisible(false);
				dialog.boutonReprendre.setVisible(false);
				dialog.panelListUvs.setPreferredSize(new Dimension(180,150));
				dialog.panList2.setMinimumSize(new Dimension(175,150));
				dialog.panList2.setPreferredSize(new Dimension(175,150));												
				dialog.textFieldMatricule.setText(matricule);
				dialog.textFieldNom.setText(etd.getNom());
				dialog.textFieldPrenom.setText(etd.getPrenom());
				dialog.textFieldNom.setEditable(false);
				dialog.textFieldPrenom.setEditable(false);				
				dialog.spinnerAge.setValue(etd.getAge());
				dialog.dateChooserAnnee.getDateEditor().setDate(etd.getDate());
				dialog.comboBoxPays.setSelectedItem(etd.getPays());
				dialog.listModel2.removeAllElements();
				for(int i=0;i<etd.getListUvs().size();i++){
					dialog.listModel2.addElement(etd.getListUvs().elementAt(i));
				}
				try{					
					dialog.labelPhoto1.setIcon(new ImageIcon(etd.getCheminPhoto()));
				}catch(NullPointerException ex){
					dialog.labelPhoto1.setIcon(new ImageIcon());
				}
				dialog.boutonSupprimer.addActionListener(new ActionListener(){
					public void actionPerformed(ActionEvent arg0){
						int i = JOptionPane.showConfirmDialog(null,"Etes vous sûr de vouloir supprimer cet étudiant", "  ATTENTION  A  LA  SUPPRESSION",JOptionPane.INFORMATION_MESSAGE);
						if(i==0){
							etd1.supprimeEtudiant("Fichiers/Etudiants.txt",matricule);
							JOptionPane.showMessageDialog(null, "suppression effectuée avec succès", "  SUPPRESSION  REUSSIE",JOptionPane.INFORMATION_MESSAGE);
							dialog.fermerApplication();
						}
					}
				});												
			}
		}
}