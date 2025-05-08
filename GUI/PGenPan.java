package GUI;

import java.awt.Graphics;
import javax.swing.JPanel;

public class PGenPan extends JPanel{
  public void paintComponent(Graphics g) {
    System.out.println("Je suis exécutée !"); 
    g.drawString("Bienvenue sur P-Gen, \n" + //
            "Ceci est un générateur de mot de passe aléatoire.\n" + //
            "", 10, 20);
  }
}
