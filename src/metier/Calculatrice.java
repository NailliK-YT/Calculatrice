package metier;

public abstract class Calculatrice 
{
    public static double addition(double a, double b) 
    {
        return a + b;
    }

    public static double soustraction(double a, double b) 
    {
        return a - b;
    }

    public static double multiplication(double a, double b) 
    {
        return a * b;
    }

    public static double division(double a, double b) 
    {
        if (b == 0) 
        {
            throw new ArithmeticException("Division par zéro impossible");
        }
        return a / b;
    }

    public static double puissance(double a, double b) 
    {
        if (b == 0) { return 1;}

        for (int i = 1; i < b; i++) 
        {
            a *= a;
        }

        return a;
    }

    public static double racineCarree(double a)
    {
        if (a < 0) 
        {
            throw new ArithmeticException("Racine carrée d'un nombre négatif impossible");
        }
        
        return Math.sqrt(a);
    }
}
