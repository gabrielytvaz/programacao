package cinema;

public class Filme {

    String nome, genero, atores;
    float duração;
    int classificação;

    boolean verificaIdade(int idade) {
        if (idade < classificação) {
            return false;
        } else {
            return true;
        }
    }

    String verificaDur(int dur) {
        if (dur < 60) {
            return "curta";

        } else {
            return "longa";
        }
    }
}
