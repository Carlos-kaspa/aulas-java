import java.util.Random;

public class Conta {
	
	private int agencia;
	private int conta;
	private int dac;
	private double saldo;
	private Cliente titular = new Cliente();
	
	public Conta(String nomeTitular) {
		this.agencia = setAgencia();
		this.conta = setConta();
		this.dac = setDac();
		this.titular.nome = nomeTitular;
	}
	
	//Getters
	public int getAgencia() {
		return this.agencia;
	}
	
	public int getConta() {
		return this.conta;
	}
	
	public int getDac() {
		return this.dac;
	}
	
	public double getSaldo() {
		return this.saldo;
	}
	
	public Cliente getTitular() {
		return this.titular;
	}
	
	//Setters
	
	private int setAgencia() {
		Random rd = new Random();
	   return this.agencia = rd.nextInt(1000);
	}
	
	private int setConta() {
		Random rd = new Random();
	    return this.conta = rd.nextInt(10000);
	}
	
	private int setDac() {
		Random rd = new Random();
	    return this.dac = rd.nextInt(100);
	}
	
	
	//Actions
	
	public void deposita(double valor , Conta destino) {
		if(valor > 0) {
			destino.saldo += valor;
			System.out.println("Deposito efetuado");
			return;
		} else {
			System.out.println("Insira um valor positivo");
			return;
		}
	}
	
	public boolean saca(double valor) {
		if(this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		} else {
			return false;
		}
	}
	
	public void transfere(double valor, Conta destino) {
		this.saca(valor);
		deposita(valor,destino);
	}
	

}
