package Controller;
import Kreis.PilhaString.StringsPilha;
import Kreis.PilhaInt.PilhaString;


public class HistoricoController {
	StringsPilha pilha = new StringsPilha();
	
	
    public static void inserirEndereco(String endereco, StringsPilha historico) throws Exception {
        if (!endereco.startsWith("http://") || !endereco.contains("www.")) {
            throw new Exception("Endereço inválido!");
        }
        historico.push(endereco);
    }

    public static String removerUltimoEndereco(StringsPilha historico) throws Exception {
        if (historico.isEmpty()) {
            throw new Exception("Histórico vazio!");
        }
        return historico.pop();
    }

    public static String consultarUltimoEndereco(StringsPilha historico) throws Exception {
        if (historico.isEmpty()) {
            throw new Exception("Histórico vazio!");
        }
        return historico.peek();
    }
}