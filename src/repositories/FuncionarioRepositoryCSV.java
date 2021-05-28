package repositories;

import java.io.FileWriter;

import entities.Funcionario;

public class FuncionarioRepositoryCSV extends FuncionarioRepository {

	@Override
	public void exportar(Funcionario funcionario) throws Exception {

		FileWriter fileWriter = new FileWriter("c:\\temp\\funcionario.csv", true);
		String conteudo = funcionario.getId() + ";";
		conteudo += funcionario.getNome() + ";";
		conteudo += funcionario.getCpf() + ";";
		conteudo += funcionario.getMatricula() + ";";
		conteudo += funcionario.getSalario() + ";";
		conteudo += funcionario.getFuncao().getNome() + ";";
		conteudo += funcionario.getFuncao().getDescricao() + "\n";
		fileWriter.write(conteudo);
		fileWriter.flush();
		fileWriter.close();

	}

}
