
public class testaCCeCP {

	public static void main(String[] args) {
		
		ContaCorrente CC = new ContaCorrente("Carlos Lima");
		ContaCorrente CC2 = new ContaCorrente("Monique Guimarães");
		
		System.out.println(CC.getDadosConta(CC));
		
		CC.deposita(100);
		
		CC.transfere(50, CC2);
		
		System.out.println(CC.getSaldo());	
		System.out.println(CC2.getSaldo());
		
		ContaPoupanca CP = new ContaPoupanca("Carlos A G Lima");
		
		CC.transfere(30, CP);
		
		System.out.println(CP.getDadosConta(CP));
		
		System.out.println(CP.getSaldo());
		System.out.println(CC.getSaldo());	

	}

}
