public class TestaPorta
{
	public static void main(String [] args)

    {
        Porta p1 = new Porta();

        p1.cor = " Marrom ";
        p1.dimensaoX = 2;
        p1.dimensaoY = 3;
        p1.dimensaoZ = 4;

        p1.pinta("Azul");
        p1.pinta("Verde");

        System.out.println("Cor da Porta: "+p1.cor);
        p1.abre();
        p1.fecha();

        if(p1.aberta)
        {
            System.out.println("Esta Aberta.");
        }
        else 
            System.out.println("Esta Fechada.");
	}
}
