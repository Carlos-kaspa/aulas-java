import java.util.Random;

public class Conta {
	
	private int agencia = setAgencia();	
	private int conta = setConta();
	private double saldo;
	private Cliente titular = new Cliente();
	
	//Getters
	public int getAgencia() {
		return this.agencia;
	}
	
	public int getConta() {
		return this.conta;
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
	   return this.conta = rd.nextInt(100);
	}
	
	private int setConta() {
		Random rd = new Random();
	    return this.conta = rd.nextInt(10000);
	}
	
	
	//Actions
	
	public void deposita(double valor , Conta destino) {
		destino.saldo += valor;
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
