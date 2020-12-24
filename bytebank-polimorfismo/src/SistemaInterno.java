
public class SistemaInterno {
	
	public boolean logIn(Gerente usuario , String senha) {
		if(usuario.verificaSenha(senha)) {
			return true;
		} else {	
			return false;
		}
	}
	
	public void autentica(Gerente usuario, String senha) {
		if(this.logIn(usuario, senha)) {
			System.out.println("Usu�rio Autenticado");
		} else {
			System.out.println("Acesso Negado");
		}
	}
}
