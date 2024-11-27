package ihm;

import controleur.Controleur;
import javax.swing.JPanel;

public class PanelCalculatrice extends JPanel
{

    private Controleur ctrl;

    public PanelCalculatrice(Controleur ctrl)
    {
        this.ctrl = ctrl;

        this.add(new PanelResultat(), JPanel.TOP_ALIGNMENT);
        this.add(new PanelClavier(this), JPanel.BOTTOM_ALIGNMENT);
    }
    
}
