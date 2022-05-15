package view;

import java.util.Scanner;

import model.empresa;
import model.funcionario;

public class Main {
	// M�todo de entrada da aplica��o, que � executado quando rodamos o programa
    public static void main(String[] args) {
    	
    	int aux = 1;
        	
        try (Scanner entrada = new Scanner(System.in)) {
			System.out.print("Digite o nome da sua empresa: ");
			String ename = entrada.next();

			System.out.print("Digite o CNPJ da sua empresa: ");
			String cnpj = entrada.next();
			     
			empresa empresa1 = new empresa(ename, cnpj);
			
			System.out.println("");
			     
			System.out.print("Digite quantos funcionarios a empresa possui: ");
			int qtd = entrada.nextInt();
			
			System.out.println("");
			     
			do{
				
				System.out.print("Digite o nome do funcionario: ");
				String name = entrada.next();
			     
			    System.out.print("Digite o CPF do funcion�rio: ");
			    String cpf = entrada.next();

			    System.out.print("Digite o sal�rio do funcion�rio: ");
			    double wage = entrada.nextDouble();
			    
			    System.out.println("");
			         
			    funcionario funcionario1 = new funcionario(name);
			         
			    funcionario1.setCpf(cpf);
			    funcionario1.setwage(wage);
			    
			    System.out.println(empresa1.getNome());
			    System.out.println(empresa1.getCnpj());
			    System.out.println("");
			    

				System.out.println(funcionario1.getname());
				System.out.println(funcionario1.getCpf());
				System.out.println(funcionario1.getwage());
				System.out.println("");
				
				aux++;

			}while(aux <= qtd);
		}
    }
}