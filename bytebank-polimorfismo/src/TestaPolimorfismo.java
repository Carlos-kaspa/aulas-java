
public class TestaPolimorfismo {

	public static void main(String[] args) {
		
		Gerente gerente = new Gerente();
		
		gerente.setFuncional();
		gerente.setNome("Gerentenildo da Silveira");
		gerente.setSalario(5000);
		gerente.setSenha("09876");
		
		
		Designer designer = new Designer();
		
		designer.setFuncional();
		designer.setNome("Gostei Mas Aumenta a Fonte");
		designer.setSalario(2500);
		
		//devido à abstração da classe Funcionário, ela se torna inutilizável diretamente
		//e agora serve apenas de "molde" de "abstração" de um objeto, uma base para criação
		//de objetos concretos e funcionais.
//		Funcionario funcionario = new Funcionario();
//		
//		funcionario.setFuncional();
//		funcionario.setNome("Severino da Silva Sauro");
//		funcionario.setSalario(1800);
		
		
		ControleBonificacao contador = new ControleBonificacao();
		
		contador.registra(gerente);
		contador.registra(designer);
		//contador.registra(funcionario);
				
		System.out.println(contador.getSoma());
	}
}
