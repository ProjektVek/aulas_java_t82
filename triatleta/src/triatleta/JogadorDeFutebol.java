package triatleta;

public class JogadorDeFutebol extends Pessoa implements Corredor {

	public JogadorDeFutebol(String nome) {
		super(nome);
	}

	@Override
	public void cansou() {
		System.out.println("Fim de jogo!");
	}

	@Override
	public void aquecer() {
		System.out.println("Aquecendo no gramado...");
	}

	@Override
	public void correr() {
		System.out.println("Jogando Futebol...");
	}

}
