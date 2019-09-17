public class Porta
{
	boolean aberta;
    String cor;
    int dimensaoX;
    int dimensaoY;
    int dimensaoZ;

    void abre()
    {
        this.aberta = true;
    }
    void fecha()
    {
        this.aberta = false;
    }
    void pinta(String s)
    {
        this.cor = s;
    }
    boolean estaAberta()
    {
        if(aberta)
            return true;
		else
            return false;
    }
}
