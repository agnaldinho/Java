import java.util.Random;
import java.util.Scanner;

public class Conta {
	Cliente cliente = new Cliente();
	
    private String numero;
    private int agencia = 2190;
    private double saldo;
    private int tipo;
    private double limite;
    private String senha;
    private double relatorio[];

    public void setNumero()
    {
    	Random rand = new Random();
        int numero = rand.nextInt(100) + 1124;
        int valor2 = rand.nextInt(10);
        this.numero = numero + "-" + valor2;
      
    }
    public String getNumero()
    {
        return this.numero;
    }
    
    public int getagencia() 
    {
    	return this.agencia;
    }

    public void setLimite(double salario) 
    { 
    	if(salario > 1200) 
    	{
    		this.limite = salario * 0.1;
    	}
    	else 
    	{
    		System.out.println(" Você não tem limite inicial!");
    	}
    }
    public double getLimite() 
    {
    	return this.limite;
    }

    public void setTipo(int Tipo) 
    {
    	this.tipo = Tipo;
    }
    public void getTipo() 
    {
    	String tipoEscrito = "";
    	if(this.tipo == 1) 
    	{
    		tipoEscrito = "Poupança";
    		
    	}
    	else if(this.tipo == 2) 
    	{
    		tipoEscrito = "Corrente";
    	}
    	System.out.println("Conta: "+ tipoEscrito);
    }

    public void setDeposito(double valor) 
    {
    	this.saldo =+ valor;
    }
    public double getDeposito() 
    {
    	return this.saldo;
    }
    public void setSaque(double valor) 
   {
	   if(this.saldo + limite >= valor) 
	   {
		   this.saldo -= valor;
		   System.out.println("Valor sacado com sucesso!");
	   }
	   else 
	   {
		   System.out.println("Saldo insuficiente");
	   }
   }
    
    public void setSenha(String senha) 
    {
    	this.senha = senha;
    }
    public String getSenha() 
    {
    	return this.senha;
    }

   public double ValorSaldo() 
   {
	   return this.saldo;
   }
   
   
   
}