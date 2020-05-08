package Principal;

import Principal.Gerente;
import Principal.Secretario;
import Principal.Telefonista;

public class Inicio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Gerente g = new Gerente();
		g.setNome("Pedro Henrique");
		g.setSalario(2.348);
		g.setLogin("g.pedroBradesco");
		g.setSenha("Bradesco124");
		g.status();
		g.aumentarSalario(5); // podemos dizer que o salario almentou em 5%
		
		Telefonista t = new Telefonista();
		t.setNome("Marcelo Souza");
		t.setSalario(953);
		t.setCod_estacao(153856);
		t.status();
		
		Secretario s = new Secretario();
		s.setNome("Jose Ricardo");
		s.setSalario(2.102);
		s.setNum_ramal("(22) 75395175");
		s.status();
	}
}
