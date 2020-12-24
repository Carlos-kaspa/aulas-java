
public class ContaCorrente extends Conta {
	
	public ContaCorrente(String titular) {
		super(titular);
	}
	
	@Override
	public void saca(double valor) {
		double taxa = 0.90;
		double valorFinal = valor + taxa;
		this.saca(valorFinal);
	}
	

	
}

