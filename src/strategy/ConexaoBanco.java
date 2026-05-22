package strategy;

public class ConexaoBanco {

    private static ConexaoBanco instancia;

    private String urlBanco;

    private ConexaoBanco() {
        ConfiguracaoSistema config = ConfiguracaoSistema.getInstancia();

        this.urlBanco = config.getUrlBancoDeDados();
    }

    public static ConexaoBanco getInstancia() {
        return instancia == null
                ? instancia = new ConexaoBanco()
                : instancia;
    }

    public void conectar() {
        System.out.println("conectou no banco " + this.urlBanco);
    }

    public void desconectar() {
        System.out.println("desconectou do banco " + this.urlBanco);
    }

    public void executar(String comando) {
        System.out.println("executando no banco " + comando);
    }



}
