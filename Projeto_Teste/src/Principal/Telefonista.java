package Principal;

public class Telefonista extends Funcionario{
	private int cod_estacao;
	
	public int getCod_estacao() {
		return cod_estacao;
	}

	public void setCod_estacao(int cod_estacao) {
		this.cod_estacao = cod_estacao;
	}

	public void status() {
		System.out.println("----------------------------------------------");
		System.out.println("Nome do telefonista: "+this.getNome());
		System.out.println("Salario total do telefonista: "+this.getSalario());
		System.out.println("O codigo da estaçãoo é: "+this.getCod_estacao());
	}
	
}
