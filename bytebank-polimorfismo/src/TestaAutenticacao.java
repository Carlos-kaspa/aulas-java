
public class TestaAutenticacao {

	public static void main(String[] args) {


		Gerente gerente = new Gerente();
		
		gerente.setSenha("09876");
		
		SistemaInterno SI = new SistemaInterno();
		
		SI.autentica(gerente, "09876");

	}

}
