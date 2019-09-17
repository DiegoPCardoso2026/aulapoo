public class Produto
{
	double preco;
    String nome;

    void diminuir10()
    {
        double diminuir = (10 * this.preco) / 100;
        this.preco -= diminuir;
    }

    void aumentar25()
    {
        double aumentar = (25 * this.preco) / 100;
        this.preco += aumentar;
    }
}
