public class Casa
{
	String cor;
    Porta porta1;
    Porta porta2;
    Porta porta3;



    void pinta(String s)
    {
        this.cor = s;
    }
    int quantasPortasEstaoAbertas()
    {
        int cont = 0;
        if(this.porta1.estaAberta() == true)
            cont = 1;
        if(this.porta2.estaAberta() == true)
            cont += 1;
        if(this.porta3.estaAberta() == true)
            cont += 1;

        return cont;
    }
}
