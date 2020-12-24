
public class testaCCeCP {

	public static void main(String[] args) {
		
		ContaCorrente CC = new ContaCorrente("Carlos Lima");
		ContaCorrente CC2 = new ContaCorrente("Monique Guimarães");
		
		System.out.println("Dados conta corrente: " + CC.getDadosConta(CC));
		
	
		CC.deposita(100);
		
		CC.transfere(50, CC2);
		
		System.out.println("Saldo conta corrente: " + CC.getSaldo());	
		System.out.println("Saldo conta corrente 2 : " + CC2.getSaldo());
		
		ContaPoupanca CP = new ContaPoupanca("Carlos A G Lima");
		
		CC.transfere(30, CP);
			
		System.out.println("Dados conta poupança " + CP.getDadosConta(CP));
		
		
		System.out.println("Saldo conta corrente: " + CC.getSaldo());	
		System.out.println("Saldo conta poupança: " + CP.getSaldo());
		
		CC.saca(10);
		
		System.out.println(CC.getSaldo());

	}

}
