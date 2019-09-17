public class TestaAluno
{
	public static void main (String [] args)
    {
        Aluno a1 = new Aluno();

        a1.nome = "Diego Cardoso";
        a1.CPF = "11111111111";

        Data d1 = new Data();
        d1.dia = 20;
        d1.mes = 10;
        d1.ano = 1991;
        a1.dataDeNascimento = d1;

        String dados = a1.imprimir();     
        System.out.println(dados);


    }
}
