import java.util.Random;

public class Funcionario {
	
	private int funcional;
	private String nome;
	private String cpf;
	private double salario;
	
	
	
	public String getNome() {
		return this.nome;
	}
	
	public String getCpf() {
		return this.cpf;
	}
	
	public int getFuncional() {
		return this.funcional;
	}
	
	public double getBonificacao() {
		return this.salario*0.1;
	}
	
	public int setFuncional() {
		Random rd = new Random();
		return this.funcional = rd.nextInt(1000000);
	}
	
	public void setSalario(int salario) {
		this.salario = salario;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
		System.out.println("Nome alterado.");
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
		System.out.println("CPF alterado");
	}
	
}
