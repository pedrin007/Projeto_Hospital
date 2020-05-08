package Principal;

public class Funcionario {
	private String nome;
	private double salario;	
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public void aumentarSalario(double novoSalario) {
		this.setSalario(this.getSalario() + novoSalario);
		System.out.println("O novo salario com o aumento ficou: "+this.getSalario());
	}
	
	@Override
	public String toString() {
		return "Funcionario [nome=" + nome + ", salario=" + salario + "]";
	}
}
