package Pessoa;

public class Principal {

	public static void main(String[] args) {
		
		Fisica pessoa = new Fisica("Jonas","1234567","12345678");
		
		System.out.println("nome " + pessoa.getNome());
		System.out.println("cpf " + pessoa.getCpf());
		System.out.println("rg " + pessoa.getRg());
	}

}
