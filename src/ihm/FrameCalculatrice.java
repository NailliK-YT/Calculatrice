package ihm;

import controleur.Controleur;
import javax.swing.JFrame;

public class FrameCalculatrice extends JFrame
{
    private Controleur ctrl;
    public FrameCalculatrice(Controleur ctrl)
    {
        this.ctrl = ctrl;

        this.setTitle("Calculatrice");
        this.setSize(400, 400);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setContentPane(new PanelCalculatrice(ctrl));
    }
}
