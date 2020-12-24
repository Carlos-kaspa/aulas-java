

public class Gerente extends Funcionario implements UsuarioAutenticavel {
		
	private String senha;
	
	public boolean verificaSenha(String senha) {
		if(this.senha == senha) {
			return true;
		} else {
			return false;
		}
	}
	
	@Override
	public boolean hasSenha() {
		if(this.senha.lastIndexOf(senha) > 1) {
			return true;
		} else {
			return false;
		}
	}
	
	@Override
	public void setSenha(String senha) {
		this.senha = senha;
		System.out.println("Senha atualizada");
	}
	
	@Override
	public double getBonificacao() {
		return super.getBonificacao() + super.getSalario();
		//super. sendo a referencia à classe mãe (funcionario)
	}
}
