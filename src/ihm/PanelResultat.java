package ihm;

import javax.swing.JPanel;
import javax.swing.JLabel;

public class PanelResultat extends JPanel
{

    private String resultat = "0";
    private JLabel labelResultat = new JLabel(resultat);

    public PanelResultat()
    {
        
        this.add(labelResultat);

    }
}
