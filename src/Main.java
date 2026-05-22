import strategy.ConexaoBanco;
import strategy.LoggerSistema;

public class Main {
    public static void main(String[] args) {
        LoggerSistema.getInstance().log("Pedido criado com sucesso");
        LoggerSistema.getInstance().log("Pagamento aprovado");
        LoggerSistema.getInstance().log("Erro ao calcular frete");

        ConexaoBanco banco1 = ConexaoBanco.getInstancia();

        banco1.conectar();

        banco1.executar("SELECT * FROM usuarios");

        banco1.desconectar();
    }
}