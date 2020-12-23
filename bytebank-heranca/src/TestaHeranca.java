
public class TestaHeranca {

	public static void main(String[] args) {
		
		System.out.println("--------------------");
		System.out.println("Funcionario");
		Funcionario funcionario = new Funcionario();
		
		funcionario.setFuncional();
		funcionario.setNome("Funcionildo dos Santos");
		funcionario.setCpf("446.446.446-46");
		funcionario.setSalario(2000);
		
		System.out.println(funcionario.getBonificacao());
		System.out.println(funcionario.getFuncional());
		System.out.println(funcionario.getNome());
		System.out.println(funcionario.getCpf());
		
		System.out.println("--------------------");
		System.out.println("Gerente");
		Gerente gerente = new Gerente();
		
		gerente.setFuncional();
		gerente.setNome("Gerenildo dos Santos");
		gerente.setCpf("664.664.664-64");
		gerente.setSenha("67890");
		gerente.setSalario(7000);
		
		System.out.println(gerente.getNome());
		System.out.println(gerente.getFuncional());
		System.out.println(gerente.gerAuth("09876"));
		System.out.println(gerente.getBonificacao());
		
		
		

	
	}

}
