
public class Variavel {
	
	//<tipo> <nomeDaVariavel> = alfanumerio;
	int nome; //não inicializada
	int nomeDaVariavel; // não inicializada
	double NomeDaVariavel = 2.05; // inicializada
	
	int _nome; //não inicializada  (Não é recomendado)
	int $nome; //não inicializada  (Não é recomendado)
	
	int i;
	int i1;
	
	//int class; Não declarar variáveis com nomes de palavras resevadas.
	
	//-----------------------------------------------------
	
	{ // Bloco 1
		
		int i = 5;
		
		  { // Bloco 2
			  
		    int j = 10;

		    System.out.print(i);

		    { // Bloco 3
		      System.out.print(i);
		      System.out.print(j);

		    }
		    
		    System.out.print(i);
		    System.out.print(j);

		  }
		  
		System.out.print(i);
		//System.out.print(j); // A variável "j" não foi declarada no Bloco 1

	}


	
	
}
