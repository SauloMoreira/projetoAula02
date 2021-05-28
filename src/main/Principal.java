package main;

import entities.Funcionario;
import repositories.FuncionarioRepository;
import repositories.FuncionarioRepositoryCSV;
import repositories.FuncionarioRepositoryTXT;

import javax.swing.JOptionPane;

import entities.Funcao;

public class Principal {

	public static void main(String[] args) {

		Funcao funcao = new Funcao(1, "programador JR", "Programador de Sistemas JAVA");

		Funcionario funcionario = new Funcionario(1, "saulo Moreira", "123.456.789-00", "coti2021-001", 1000.0, funcao);
		String opcao = JOptionPane.showInputDialog("entre com a opção (txt) ou (csv)");
		FuncionarioRepository funcionarioRepository = null;
		if (opcao.equalsIgnoreCase("txt")) {
			funcionarioRepository = new FuncionarioRepositoryTXT();
		} else if (opcao.equalsIgnoreCase("csv")) {
			funcionarioRepository = new FuncionarioRepositoryCSV();
		} else {
			System.out.println("opção inválida");
		}
		
		if (funcionarioRepository != null) {
			
			try {
				funcionarioRepository.exportar(funcionario);
				System.out.println("exportado com sucesso");
			} catch (Exception e) {
			System.out.println("erro de exportação"+ e.getMessage());
			}
			
		}

	}

}
