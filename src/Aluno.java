public class Aluno
{
	String nome;
    String  CPF ;
    Data dataDeNascimento;

    String  imprimir ()
    {
        String aluno =  this . nome +  " \n "  +  this . CPF  +  " \n "  +  this . dataDeNascimento . imprimir ();
        return aluno;
    }
}
