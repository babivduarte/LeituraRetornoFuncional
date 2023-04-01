import LeituraRetorno.ProcessarBoletos;
import java.net.URI;
import java.net.URISyntaxException;

public class Main {
    public static void main(String[] args) throws URISyntaxException {
        var processador = new ProcessarBoletos(ProcessarBoletos::lerBancoBrasil);
        URI caminhoArquivo = Main.class.getResource("banco-brasil-1.csv").toURI();
        processador.processar(caminhoArquivo);
    }
}