import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class BancoPrincipal {

	public static void main(String[] args) {
		int Escolhas,Escolhas1, Tipo, Login, Opcao, resposta1, resposta2;
		double ValorDeposito, ValorSaque;
		String NumeroConta, senha, Senha1;
		
		Conta conta = new Conta();
		Cliente cliente = new Cliente();
		Endereco endereco = new Endereco();
		 
		 Scanner scan = new Scanner(System.in);
		 JOptionPane.showMessageDialog(null,"Bem vindo! O que deseja fazer?");
		 Escolhas = Integer.parseInt(JOptionPane.showInputDialog("1 - Deseja criar uma conta. \n2 - Deseja entrar na conta."));
		 
		 while (Escolhas < 1 || Escolhas > 2) 
		 {
			 Escolhas = Integer.parseInt(JOptionPane.showInputDialog("Numero incorreto!, digite novamente: "));
		 }
		 
		 if(Escolhas == 1)
		 {
				 cliente.setCPF(JOptionPane.showInputDialog("Primeiramente precisamos do seu CPF: "));
				 
				 cliente.setNome(JOptionPane.showInputDialog("Digite seu nome: "));
				 
				 cliente.setSalario(Float.parseFloat(JOptionPane.showInputDialog("Digite seu salario: ")));
				 
				 endereco.setEndereco(JOptionPane.showInputDialog("Digite seu endereco: "));
				 
				 endereco.setNumero(JOptionPane.showInputDialog("Digite o numero: "));
				 
				 endereco.setBairro(JOptionPane.showInputDialog("Digite o Bairro: "));
				 
				 endereco.setCidade(JOptionPane.showInputDialog("Digite a cidade: "));
				 
				 endereco.setEstado(JOptionPane.showInputDialog("Digite o estado: "));
				 
				 Tipo = Integer.parseInt(JOptionPane.showInputDialog("Digite (1) = Poupança\nDigite (2) = Corrente"));
				 
				 while(Tipo <= 0 || Tipo >= 3) 
				 {
					 Tipo = Integer.parseInt(JOptionPane.showInputDialog("Digite (1) = Poupança\nDigite (2) = Corrente"));
				 }
				 conta.setTipo(Tipo);
			 
			 JOptionPane.showMessageDialog(null, "Agora so para confirmar!");
			 resposta1 = JOptionPane.showConfirmDialog(null,"CPF: " + cliente.getCPF() + "\nNome: " + cliente.getNome() + "\nSalario: " + cliente.getSalario());
			 resposta2 = JOptionPane.showConfirmDialog(null, "Endereço: " + endereco.getEndereco() + "\nNumero: " + endereco.getNumero() + "\nBairro: " + endereco.getBairro() +"\nCidade: " + endereco.getCidade() + "\nEstado:" + endereco.getEstado());
			 
			 if(resposta1 == JOptionPane.YES_OPTION && resposta2 == JOptionPane.YES_OPTION) 
			 {
				 	senha = JOptionPane.showInputDialog("Digite uma senha de 06 digitos: ");
				 	
		            while (senha.length() != 6)
		            {
		            	senha = JOptionPane.showInputDialog("ERRO! Digite uma senha de 06 digitos: ");
		            }
		         JOptionPane.showMessageDialog(null, "Senha criada com sucesso");
		         JOptionPane.showMessageDialog(null, "OK! Obrigado pelas confirmações Sua conta foi criada com sucesso!" );
		         JOptionPane.showMessageDialog(null, "Genrando os dados da conta....");
		         conta.setNumero();
		         
				 System.out.println("Agencia: " + conta.getagencia());
				 System.out.println("Numero: " + conta.getNumero());
				 conta.getTipo();
				 
				 conta.setLimite(cliente.getSalario());
				 System.out.printf("Limite: %.2f",conta.getLimite());
				 
				 System.out.println("\nDeseja entrar na conta?\n(1) - Sim\n(2) - Não");
				 Login = scan.nextInt();
				 
				 if(Login == 1) 
				 {
					 System.out.println("Digite seu numero de conta: ");
					 NumeroConta = scan.next();
					 
					 while(NumeroConta.length() != conta.getNumero().length()) 
						{
							System.out.println("Numero de conta incorreta, digite novamente:  ");
							NumeroConta = scan.next();
						}
					 
					 if(NumeroConta.equals(conta.getNumero())) 
					 {
						 System.out.println("Digite sua senha: ");
						 Senha1 = scan.next();
						 
						 while(Senha1.length() != senha.length()) 
						 {
							 System.out.println("Senha incorreta! Digite novamente: ");
							 Senha1 = scan.next();
						 } 
						 
						 
					 }
					 System.out.println("Bem vindo senhor(a)\n" + cliente.getNome());
					 do 
					 {
					 	System.out.println("Oque deseja fazer?\n(1) - Saldo		(2) - Extrato\n(3) - Depositar		(4) - Sacar\n(5) - Ver dados		(0) - Encerrar");
					 	Opcao = scan.nextInt();
					 	
					 	if(Opcao == 1) 
					 	{
					 		System.out.printf("Saldo: %.2f",conta.ValorSaldo(), conta.getLimite() );
					 		System.out.println("\n(9) - Menu anterior	(0) - Encerrar");
					 		Opcao = scan.nextInt();
					 	}
					 	
					 	else if(Opcao == 3) 
					 	{
					 		System.out.println("Valor: ");
					 		ValorDeposito = scan.nextDouble();
					 		conta.setDeposito(ValorDeposito + conta.ValorSaldo());
					 		System.out.println("Valor depositado com sucesso!");
					 		System.out.println("(9) - Menu anterior	(0) - Encerrar");
					 		Opcao = scan.nextInt();
					 	}
					 	else if(Opcao == 4) 
					 	{
					 		System.out.println("Valor: ");
					 		ValorSaque = scan.nextDouble();
					 		conta.setSaque(ValorSaque);
					 		System.out.println("\n(9) - Menu anterior	(0) - Encerrar");
					 		Opcao = scan.nextInt();
					 	}
					 	else if(Opcao == 5) 
					 	{
					 		System.out.println("Nome: " + cliente.getNome() + "  CPF: " + cliente.getCPF());
					 		System.out.println("Agencia: " + conta.getagencia() + "  Numero: " + conta.getNumero());
					 		conta.getTipo(); System.out.println("Limite inicial(Calculado 10% do salario): " + conta.getLimite());
					 		System.out.println("(9) - Menu anterior	(0) - Encerrar");
					 		Opcao = scan.nextInt();
					 		
					 	}
					 	
					 }while(Opcao != 0);
				 }
				 else if(Login == 2) 
				 {
					 System.out.println("Seja bem vindo ao nosso banco! e ate logo!");
				 }
			 }
			 else
			 {
				 JOptionPane.showMessageDialog(null, "Encerrando...., comeca denovo!");
			 } 
			 
		 }
		 if(Escolhas == 2) 
		 {
			 JOptionPane.showMessageDialog(null ,"Sistema indisponivel no momento!");
		 }
		 
		 
		 
	}

}


