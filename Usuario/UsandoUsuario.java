package Usuario;

public class UsandoUsuario {

	public static void main(String[] args) {
		
		Usuario user = new Usuario(1,"joas", "12345678", "adm", "Jnsz");
		
		System.out.println(user.getId());
		System.out.println(user.getNome());
		System.out.println(user.getPassword());
		System.out.println(user.getPermissao());
		System.out.println(user.getUsuario());

	}

}
