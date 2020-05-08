package Principal;

public class Gerente extends Funcionario{
	private String login;
	private String senha;
	
	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public void status() {
		System.out.println("----------------------------------------------");
		System.out.println("Nome do gerente: "+this.getNome());
		System.out.println("Salario total do gerente: "+this.getSalario());
		System.out.println("Login do gerente: "+this.getLogin());
		System.out.println("Senha do gerente: "+this.getSenha());
	}
}
