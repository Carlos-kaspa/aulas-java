package bytebank;

public class Cliente {
	
	String nome;
	char sexo;
	String profissao;
	String endereco;
	String estadoCivil;
	int nascimento;
	
	
	public void insereNome (String novoNome) {
		
		this.nome = novoNome;
	}
	
	public void insereSexo(char Sexo) {
		
		this.sexo = Sexo;
	}
	
	public void insereProfissao(String Profissao) {
		
		this.profissao = Profissao;
	}
	
	public void insereEndereco(String Endereco) {
		
		this.endereco = Endereco;
	}
	
	public void insereEstadoCivil(String EstadoCivil) {
		
		estadoCivil = EstadoCivil;
	}
	
}
