import java.util.List;

import testeHibernate.Controller.AlunoController;
import testeHibernate.model.Aluno;


public class teste {

	public static void main(String[] args) {
		//teste para salvar alunos no banco 
/*		Aluno a1 = new Aluno();
		a1.setNome("Nome1");
		a1.setIdade(1);
		a1.setMatricula("1");

		Aluno a2 = new Aluno();
		a2.setNome("Nome2");
		a2.setIdade(2);
		a2.setMatricula("2");

		Aluno a3 = new Aluno();
		a3.setNome("Nome3");
		a3.setIdade(3);
		a3.setMatricula("3");

		Aluno a4 = new Aluno();
		a4.setNome("Nome4");
		a4.setIdade(4);
		a4.setMatricula("4");

		AlunoController con = new AlunoController();
			con.salvar(a1);
			con.salvar(a2);
			con.salvar(a3);
			con.salvar(a4);		
*/
/*
 		// testando deleção
		Aluno a4 = new Aluno();
		a4.setNome("Nome4");
		a4.setIdade(4);
		a4.setMatricula("4");

		AlunoController con = new AlunoController();
			con.remover(a4);
*/
/*
		//executar teste listagem		
				AlunoController con = new AlunoController();
				List<Aluno> alunos = con.listar();

				for (int i = 0; 1 < alunos.size(); i++) {
					System.out.println(" Matricula: "+alunos.get(i).getMatricula() + " idade: "+alunos.get(i).getIdade() +" nome: "+alunos.get(i).getNome());
				}
*/
/*
		 // testando alteração
		Aluno a3 = new Aluno();
		a3.setNome("Nome10");
		a3.setIdade(10);
		a3.setMatricula("3");

		AlunoController con = new AlunoController();
			con.alterar(a3);
*/
	}
}