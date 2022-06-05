package controleur;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class App extends JMenuBar {

  public static void main(String[] args)
    {
      
      frame.setLocation(300, 300);
      frame.add(label);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setJMenuBar(new App());
      frame.setMinimumSize(new Dimension(1280, 720));
      frame.pack();
      frame.setVisible(true);
      
    }

    public App()
  {
      // Creation du menu Stagiaire
      JMenu menu_stagiaire = new JMenu("Stagiaire");
      JMenuItem item = new JMenuItem("Nouveau", 'N');
  
      menu_stagiaire.add(item = new JRadioButtonMenuItem("Inscription"));
      item.addActionListener(affiche_connexion);

      menu_stagiaire.add(item = new JRadioButtonMenuItem("Connexion"));
      item.addActionListener(affiche_connexion);

      menu_stagiaire.addSeparator();
      menu_stagiaire.add(item = new JMenuItem("Approuver une convention"));
      menu_stagiaire.add(item = new JMenuItem("Annuler une convention"));
      menu_stagiaire.add(item = new JMenuItem("Catalogue"));
      menu_stagiaire.add(item = new JMenuItem("Validations"));


      // Creation du menu Scolarite
      JMenu menu_scolarite = new JMenu("Scolarite");

      menu_scolarite.add(item = new JMenuItem("Inscription"));
      item.addActionListener(affiche_connexion);

      menu_scolarite.add(item = new JMenuItem("Connexion"));
      item.addActionListener(affiche_connexion);

      menu_scolarite.addSeparator();
      
      menu_scolarite.add(item = new JMenuItem("Approuver une convention"));


      // Creation du menu Entreprise
      JMenu menu_entreprise = new JMenu("Entreprise");
      
      menu_entreprise.add(item = new JRadioButtonMenuItem("Inscription"));
      item.addActionListener(affiche_connexion);

      menu_entreprise.add(item = new JRadioButtonMenuItem("Connexion"));
      item.addActionListener(affiche_connexion);

      menu_entreprise.addSeparator();
      menu_entreprise.add(item = new JMenuItem("Approuver une convention", new ImageIcon("../images/icon.png")));

      // ajout des menus à la barre de menus
      add(menu_stagiaire);
      add(menu_scolarite);
      add(menu_entreprise);
      
  }

  static JFrame frame = new JFrame("Gestion de stage");
  static JLabel label = new JLabel("Bienvenue, veuillez vous connecter", JLabel.CENTER);
  
  //agit lorsqu'on clique sur inscription ou connexion
  ActionListener affiche_connexion = new ActionListener()
  {
    public void actionPerformed(ActionEvent event)
    {
      frame.getContentPane().removeAll();
      frame.repaint(); // on supprime ce qu'il etait affiche precedemment

      Container content = frame.getContentPane();

      SpringLayout layout = new SpringLayout();
      content.setLayout(layout);
      Component case_nom = new JLabel("Nom :");
      Component nom = new JTextField(30);
      content.add(case_nom);
      content.add(nom);
      layout.putConstraint(SpringLayout.WEST, case_nom, 400, SpringLayout.WEST, content);
      layout.putConstraint(SpringLayout.NORTH, case_nom, 120, SpringLayout.NORTH, content);
      layout.putConstraint(SpringLayout.NORTH, nom, 220, SpringLayout.NORTH, content);
      layout.putConstraint(SpringLayout.WEST, nom, 100, SpringLayout.EAST, case_nom);


      SpringLayout layout2 = new SpringLayout();
      content.setLayout(layout2);
      Component case_prenom = new JLabel("Prenom :");
      Component prenom = new JTextField(30);
      content.add(case_prenom);
      content.add(prenom);
      
      layout2.putConstraint(SpringLayout.WEST, case_prenom, 400, SpringLayout.WEST, content);
      layout2.putConstraint(SpringLayout.NORTH, case_prenom, 170, SpringLayout.NORTH, content);
      layout2.putConstraint(SpringLayout.NORTH, prenom, 220, SpringLayout.NORTH, content);
      layout2.putConstraint(SpringLayout.WEST, prenom, 100, SpringLayout.EAST, case_prenom);

      SpringLayout layout3 = new SpringLayout();
      content.setLayout(layout3);
      Component case_mdp = new JLabel("Mot de passe :");
      Component mdp = new JTextField(30);
      content.add(case_mdp);
      content.add(mdp);
      layout3.putConstraint(SpringLayout.WEST, case_mdp, 400, SpringLayout.WEST, content);
      layout3.putConstraint(SpringLayout.NORTH, case_mdp, 220, SpringLayout.NORTH, content);
      layout3.putConstraint(SpringLayout.NORTH, mdp, 220, SpringLayout.NORTH, content);
      layout3.putConstraint(SpringLayout.WEST, mdp, 100, SpringLayout.EAST, case_mdp);

      String s_nom = ((JLabel) case_nom).getText();
      String s_prenom = ((JLabel) case_prenom).getText();
      String s_mdp  = ((JLabel) case_mdp).getText();
      frame.setVisible(false);
      frame.setVisible(true);
      //si il y avait une base de donnees on aurait verifie si un utilisateur possede ces identifiants avec des requetes SQL
    }
  };
    
}