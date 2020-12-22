package bytebank;

public class ExercicioMinhaConta {

	public static void main(String[] args) {
		
		Cliente cliente1 = new Cliente();
		
		cliente1.nome = "Carlos Lima";
		cliente1.sexo = 'H';
		cliente1.profissao = "Desenvolvedor";
		cliente1.endereco = "Dr. Guedes Coelho, 78 AP 81";
		cliente1.estadoCivil = "Namorando a ruivinha";
				
		Conta conta1 = new Conta();
		
		conta1.titular = cliente1;
		conta1.agencia = 12;
		conta1.numero = 12345;
		
		conta1.deposita(1000);
		System.out.println(conta1.consultaSaldo(conta1));
		
		
		
		System.out.println("----------------------------");
		
		Cliente cliente2 = new Cliente();
		
		//utilizei metodos espec�ficos para cadastrar o cliente
		
		cliente2.insereNome("Monique Pereira Guimar�es");
		cliente2.insereSexo('G'); // de gostosa
		cliente2.insereEndereco("Av. Conselheiro Nebias, 669 AP 23 BLOCO 1");
		cliente2.insereProfissao("gostosa");
		cliente2.insereEstadoCivil("preenchida amorasamente pelo moreno");
		
		Conta conta2 = new Conta();
		
		conta2.titular = cliente2;
		
		conta2.deposita(55000);
		
		System.out.println(conta2.consultaSaldo(conta2));
		
		conta2.transfere(12000, conta1);
		
		System.out.println("-----------------------");
		
		System.out.println(conta1.consultaSaldo(conta1));
		System.out.println(conta2.consultaSaldo(conta2));
		
		
	}
}
		