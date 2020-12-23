
public class ControleBonificacao {

	private double soma;
	
	public void registra(Funcionario funcionario) { //utiliza o conceito do polimorfismo para validar todas as classes herdadas de funcionario
		this.soma += funcionario.getBonificacao();
		System.out.println("Registrando " + funcionario.getNome() + ", com a bonificação de " + funcionario.getBonificacao());
		System.out.println("Soma parcial: " + this.soma);
		
	}
	
	public double getSoma() {
		return this.soma;
	}
}
