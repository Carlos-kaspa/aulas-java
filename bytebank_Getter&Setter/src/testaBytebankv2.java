
public class testaBytebankv2 {

	public static void main(String[] args) {
		
		Conta conta = new Conta();
		
		System.out.println(conta.getAgencia()+ "/" + conta.getConta());
		
		conta.deposita(200, conta);
		
		System.out.println(conta.getSaldo());		
			
	}
}
