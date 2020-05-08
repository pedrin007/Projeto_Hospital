package Principal;

public class Secretario extends Funcionario{
	private String num_ramal;
	
	public String getNum_ramal() {
		return num_ramal;
	}

	public void setNum_ramal(String num_ramal) {
		this.num_ramal = num_ramal;
	}

	public void status() {
		System.out.println("----------------------------------------------");
		System.out.println("O numero de ramal do secretario é: "+this.getNum_ramal());
		System.out.println("Nome do secretario: "+this.getNome());
		System.out.println("Salario total do secretario: "+this.getSalario());
	}
	
}
