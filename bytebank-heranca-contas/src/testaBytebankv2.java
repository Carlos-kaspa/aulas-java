
public class testaBytebankv2 {

	public static void main(String[] args) {
	
		
		System.out.println("-----------------------");
		System.out.println("Criação da CC e CP");
		
		ContaCorrente CC = new ContaCorrente("Carlos A G Lima");
		CC.deposita(100, CC);
		
		
		ContaPoupanca CP = new ContaPoupanca("Carlos A G Lima");
		CP.deposita(200, CP);
		
		CP.saca(200);
		CP.saca(199);
		
		CC.saca(50);
		
		System.out.println(CP.getSaldo());
		System.out.println(CC.getSaldo());
		
		
	}
}
