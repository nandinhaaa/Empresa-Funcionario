package model;
import java.util.ArrayList;
import java.util.List;

public class empresa {
		private String name;
		private String cnpj;
		private List<funcionario> funcionario;
		
		public empresa(String empNome, String empCnpj)
		{
			this.name = empNome;
			this.cnpj = empCnpj;
			this.funcionario = new ArrayList<funcionario>();
		}
		
		public void adicionaFuncionario(funcionario eFuncionario, int qtd)
		{
			if(this.funcionario.size() < qtd)
			{
				this.funcionario.add(eFuncionario);
			}
		}
		
		
		public String getNome()
		{
			return this.name;
		}
		
		public String getCnpj()
		{
			return this.cnpj;
		}
		
		public List<funcionario>getFuncionario()
		{
			return this.funcionario;
		}
		
		//setAll
		public void setNome(String eNome)
		{
			this.name = eNome;
		}
		
		public void setCnpj(String eCnpj)
		{
			this.cnpj = eCnpj;
		}
		
		public void setFuncionario(List<funcionario> eFuncionario)
		{
			this.funcionario = eFuncionario;
		}

	}
