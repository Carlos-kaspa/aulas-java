
public class Gerente extends Funcionario {
	
	private String senhaGerente;
	
	public boolean gerAuth(String senhaGerente) {
		if(senhaGerente == this.senhaGerente) {
			return true;
		} else {
			return false;
		}
	}
	
	
	public void setSenha(String senha) {
		this.senhaGerente = senha;
		System.out.println("Senha atualizada");
	}
}
