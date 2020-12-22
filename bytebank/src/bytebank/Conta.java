package bytebank;

public class Conta {
	
	private double saldo;
	int agencia;
	int numero;
	Cliente titular;
	
	public boolean saca(double valor) {
		
		if(this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		} else {	
			return false;
		}
		
	}
	
	public void deposita(double valor) {
		
		this.saldo += valor;
		
	} 
	
	public boolean transfere(double valor , Conta conta) {
		
		if(this.saldo >= valor) {
			this.saca(valor);
			conta.deposita(valor);
			return true;
		} else {
			return false;
		}
		
	}
	
	public String consultaSaldo(Conta conta) {
		
		String resposta = "";
		
		switch(conta.titular.sexo) {
		
		case 'H':
			resposta += conta.titular.nome + ", j� que o Sr se identifica sexualmente como um helic�ptero apache de ataque, o Sr. possui o saldo de: " + conta.saldo;
			return resposta;
			
		case 'M':
			resposta += "Sr. " + conta.titular.nome + ", seu saldo � de: " + conta.saldo;
			return resposta;
			
		case 'F':
			resposta += "Sr� " + conta.titular.nome + ", seu novo saldo � de: " + conta.saldo;
			return resposta;
		
		case 'G':
			resposta += "S� porque a Sr� � muito gostosa, seu saldo � de: " + conta.saldo;
			return resposta;
		default:
			resposta += "Seu saldo � de: " + conta.saldo;
			return resposta;
		}	
		
	}
}
