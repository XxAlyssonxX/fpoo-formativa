package Usuario;

public class Usuario {
	private int id;
	private String nome;
	private String password;
	private String permissao;
	private String usuario;
	
	public Usuario(int id, String nome, String password, String permissao, String usuario) {
		this.id = id;
		this.nome = nome;
		this.password = password;
		this.permissao = permissao;
		this.usuario = usuario;
	}

	public Usuario() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPermissao() {
		return permissao;
	}

	public void setPermissao(String permissao) {
		this.permissao = permissao;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	
	
	
	
}
