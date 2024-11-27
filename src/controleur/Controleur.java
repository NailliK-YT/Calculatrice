package controleur;
import ihm.FrameCalculatrice;

public class Controleur
{
    public Controleur()
    {
        FrameCalculatrice frame = new FrameCalculatrice(this);
        frame.setVisible(true);
    }

    public static void main(String[] args)
    {
        new Controleur();
    }
    
}
