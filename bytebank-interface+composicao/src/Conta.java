import java.util.Random;

public abstract class Conta {
	
	private double saldo;
	public int ag;
	public int conta;
	public String titular;
	
	//constructor
	public Conta(String titular) {
		this.setAgConta();
		this.setTitular(titular);
	}
	
	//getters
	public double getSaldo() {
		return this.saldo;
	}
	
	public String getDadosConta(Conta conta) {
		String MSG = "AG:" + conta.ag + "/" + "Conta:" + conta.conta;
		return MSG;
	}
	
	public String getTitular() {
		return this.titular;
	}
	
	//setters
	public void setTitular(String titular) {
		this.titular = titular;
	}
	
	public void setAgConta() {
		Random rd = new Random();
		this.ag = rd.nextInt(100);
		this.conta = rd.nextInt(100000);
	}
	
	
	//methods
	public void deposita(double valor) {
		this.saldo += valor;
	};
			
	public void saca(double valor) {
		if(this.getSaldo() >= valor) {
			this.saldo -= valor;
		} else {
			System.out.println("Saldo Insuficiente");
		}
	}
	
	public void transfere(double valor,Conta destino) {
		if(this.getSaldo() >= valor) {
			this.saca(valor);
			destino.deposita(valor);
		}
	}

}
