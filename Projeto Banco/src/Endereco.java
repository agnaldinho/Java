
public class Endereco {
	private String CEP;
	private String numero;
	private String endereco;
	private String cidade;
	private String estado;
	private String bairro;
	
	public void setCEP(String CEP) 
	{
		this.CEP = CEP;
	}
	public String getCEP() 
	{
		return this.CEP;
	}
	
	public void setEndereco(String endereco) 
	{
		this.endereco = endereco;
	}
	public String getEndereco() 
	{
		return this.endereco;
	}
	
	public void setNumero(String numero) 
	{
		this.numero = numero;
	}
	public String getNumero() 
	{
		return this.numero;
	}
	
	public void setBairro(String bairro) 
	{
		this.bairro = bairro;
	}
	public String getBairro() 
	{
		return this.bairro;
	}
	
	public void setCidade(String cidade) 
	{
		this.cidade = cidade;
	}
	public String getCidade() 
	{
		return this.cidade;
	}
	
	public void setEstado(String estado) 
	{
		this.estado = estado;
	}
	public String getEstado() 
	{
		return this.estado;
	}

}
