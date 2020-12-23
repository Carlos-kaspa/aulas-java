public class ContaPoupanca extends Conta{
	
	public ContaPoupanca(String nomeTitular) {
		super(nomeTitular);
	}
	
	@Override
	public boolean saca(double valor) {
		double taxaSaque = 0.90;
		double valorSaqueCP = valor + taxaSaque;
		if(super.getSaldo() >= valorSaqueCP) {
			super.saca(valorSaqueCP); 
			System.out.println("Saque feito no valor de " + valor + ", foi cobrado a taxa de servi�o no valor de " + taxaSaque);
			return true;
		} else {
			System.out.println("O saldo em conta � inferior ao valor do saque com a taxa de saque (0,90 centavos)");
			return false;
		}
		
	}
}
