package repositories;

import java.io.FileWriter;

import entities.Funcionario;

public class FuncionarioRepositoryTXT extends FuncionarioRepository {

	@Override
	public void exportar(Funcionario funcionario) throws Exception {
		FileWriter fileWriter = new FileWriter("c:\\temp\\funcionarios.txt", true);
		fileWriter.write(funcionario.toString() + "\n");
		fileWriter.flush();
		fileWriter.close();
		
	}
	

}
