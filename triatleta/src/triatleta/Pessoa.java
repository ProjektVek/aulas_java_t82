package triatleta;

public abstract class Pessoa {
	
	private String nome;
	
	public Pessoa(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void visualizar() {
        int largura = nome.length() + 4;
        String topo = "╔" + "═".repeat(largura) + "╗";
        String meio = "║  " + nome + "  ║";
        String base = "╚" + "═".repeat(largura) + "╝";
        
        System.out.println(topo);
        System.out.println(meio);
        System.out.println(base);
	}
	
	public abstract void cansou();
}
