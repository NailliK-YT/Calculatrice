package ihm;

import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.GridLayout;
import java.awt.event.ActionListener;

public class PanelClavier extends JPanel implements ActionListener
{
    private JButton[] tabBoutons = new JButton[16];

    private PanelCalculatrice panelCalculatrice;

    public PanelClavier(PanelCalculatrice panelCalculatrice)
    {

        this.panelCalculatrice = panelCalculatrice;

        this.setLayout( new GridLayout(4, 4) );
        
        for (int i = 0; i < 10; i++)
        {
            tabBoutons[i] = new JButton(String.valueOf(i));
            this.add(tabBoutons[i]);
        }
        
        tabBoutons[10] = new JButton("+");
        tabBoutons[11] = new JButton("-");
        tabBoutons[12] = new JButton("*");
        tabBoutons[13] = new JButton("/");
        tabBoutons[14] = new JButton("=");
        tabBoutons[15] = new JButton("C");
        
        this.add(tabBoutons[10]);
        this.add(tabBoutons[11]);
        this.add(tabBoutons[12]);
        this.add(tabBoutons[13]);
        this.add(tabBoutons[14]);
        this.add(tabBoutons[15]);
    }

    @Override
    public void actionPerformed(java.awt.event.ActionEvent e)
    {
        JButton bouton = (JButton) e.getSource();
        String texteBouton = bouton.getText();
        if (texteBouton.equals("C"))
        {
            panelCalculatrice.panelResultat.resultat = "0";
            panelCalculatrice.panelResultat.labelResultat.setText(panelCalculatrice.panelResultat.resultat);
        }
        else if (texteBouton.equals("="))
        {
            panelCalculatrice.egale();
        }
        else
        {
            if (panelCalculatrice.panelResultat.resultat.equals("0"))
            {
                panelCalculatrice.panelResultat.resultat = texteBouton;
            }
            else
            {
                panelCalculatrice.panelResultat.resultat += texteBouton;
            }
            panelCalculatrice.panelResultat.labelResultat.setText(panelCalculatrice.panelResultat.resultat);
        }
    }
}
