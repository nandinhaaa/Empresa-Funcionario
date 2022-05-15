package model;

public class funcionario 
{
	private String name;
	private String cpf;
	private double wage;
	private empresa company;
	
	public funcionario(String fname)
	{
		this.name = fname;
	}
	
	public String getname()
	{
		return this.name;
	}
	
	public String getCpf()
	{
		return this.cpf;
	}
	
	public double getwage()
	{
		return this.wage;
	}
	
	public empresa company()
	{
		return this.company;
	}
	
	public void setname(String fname)
	{
		this.name = fname;
	}
	
	public void setCpf(String fCpf)
	{
		this.cpf = fCpf;
	}
	
	public void setwage(double fwage)
	{
		this.wage = fwage;
	}
	
	public void setempresa(empresa company)
	{
		this.company = company;
	}
}