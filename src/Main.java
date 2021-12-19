import application.GeradorSorteio;
import domain.Score;
import infrastructure.ParticipanteRepositorioInMemory;

public class Main {

	public static void main(String[] args) {
		var repositorio = new ParticipanteRepositorioInMemory();
		var geradorSorteio = new GeradorSorteio(new Score(100), repositorio);
		var ganhadores = geradorSorteio.sortear(2);

		ganhadores.forEach(System.out::println);
	}

}
