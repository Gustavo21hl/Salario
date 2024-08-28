package SistemaSalario;

import java.util.Scanner;

public class holherite {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		salariobruto salario = new salariobruto();
		valetransporte vale = new valetransporte();
		inss aposentadoria = new inss();
		descontos irrf = new descontos();
		salarioliquido liquido = new salarioliquido();
		dados_pessoais dados = new dados_pessoais();
		
		System.out.print("Nome: ");
		dados.setNome(scan.nextLine());

		System.out.print("Segundo Nome: ");
		dados.setSegundonome(scan.nextLine());
		
		System.out.print("CPF: ");
		dados.setCpf(scan.nextLine());
		
		System.out.print("Função: ");
		dados.setFuncao(scan.nextLine());
		
		System.out.print("Matrícula: ");
		dados.setMatricula(scan.nextLine());
		
		System.out.print("PIS: ");
		dados.setPis(scan.nextLine());
		
		System.out.print("Endereço: ");
		dados.setEndereco(scan.nextLine());
		
		System.out.print("Cidade: ");
		dados.setCidade(scan.nextLine());
		
		System.out.print("Estado: ");
		dados.setEstado(scan.nextLine());
		
		System.out.print("Insira seu salário: ");
		salario.setSalario(scan.nextDouble());

		System.out.print("Você recebe Vale Transporte? (1 - Sim | 2 - Não): ");
		vale.setVale(scan.nextDouble());
		
		vale.setVt(salario.getSalario());
		aposentadoria.setInss(salario.getSalario());
		irrf.setIrrf(salario.getSalario());
		liquido.setVt(vale.getResultado());
		liquido.setBruto(salario.getSalario());
		liquido.setDescontos(irrf.getCalculo());
		liquido.setInss(aposentadoria.getConta());
		
		System.out.println(
				"Nome: " + dados.getNome() + "\n" +
				"Segundo Nome: " + dados.getSegundonome() + "\n" +
				"CPF: " + dados.getCpf() + "\n" + 
				"Função: " + dados.getFuncao() + "\n" +
				"Matrícula: " + dados.getMatricula() + "\n" +
				"PIS: " + dados.getPis() + "\n" +
				"Endereço: " + dados.getEndereco() + "\n" +
				"Cidade: " + dados.getCidade() + "\n" +
				"Estado: " + dados.getEstado());
		
		System.out.println("\n\n");
		System.out.printf(
				"Valor total: %.2f\n", salario.getSalario());
		System.out.printf(
				"INSS: %.2f\n", aposentadoria.getConta());
		System.out.printf(
				"Vale Transporte: %.2f\n", vale.getResultado());
		System.out.printf(
				"IRRF: %.2f\n", irrf.getCalculo());
		System.out.printf(
				"Valor liquído: %.2f\n", liquido.getValorliquido());
	}

}



