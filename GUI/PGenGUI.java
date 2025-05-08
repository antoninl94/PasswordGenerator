package GUI;
import javax.swing.JFrame;

public class PGenGUI extends JFrame {
  public PGenGUI() {
    this.setTitle("P-Gen : Password Generator");
    this.setVisible(true);
    this.setSize(600, 800);
    this.setLocationRelativeTo(null);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    this.setContentPane(new PGenPan());
  }
}
