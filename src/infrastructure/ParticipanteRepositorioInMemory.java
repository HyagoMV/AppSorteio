package infrastructure;

import java.util.List;

import application.ParticipanteRepositorio;
import domain.Email;
import domain.Nome;
import domain.Participante;
import domain.Score;

public class ParticipanteRepositorioInMemory implements ParticipanteRepositorio {

    @Override
    public List<Participante> bucaPorTodos() {
        return List.of(
            new Participante(new Nome("Aaaaaaaaaa Aaaaaaaaa"), new Email("a@a"), new Score(100)),
            new Participante(new Nome("Bbbbbbbbbb Bbbbbbbbbb"), new Email("b@b"), new Score(100)),
            new Participante(new Nome("Cccccccccc Cccccccccc"), new Email("c@c"), new Score(100)),
            new Participante(new Nome("Dddddddddd Dddddddddd"), new Email("d@d"), new Score(100)),
            new Participante(new Nome("Ffffffffff Ffffffffff"), new Email("e@e"), new Score(100))
        );
    }
    
}
