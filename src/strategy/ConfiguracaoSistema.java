package strategy;

public class ConfiguracaoSistema {

    private static ConfiguracaoSistema instancia;
    private String urlBancoDeDados;
    private String nomeAplicacao;
    private String ambienteExecucao;
    private String chaveApi;

    private ConfiguracaoSistema() {
        this.urlBancoDeDados = "boligonemelhordoqueoarantes:5432";
        this.nomeAplicacao = "";
        this.ambienteExecucao = "dev";
        this.chaveApi = "biazottomelhorprofessortiraminhasfaltas";
    }

    public static ConfiguracaoSistema getInstancia() {
        return instancia == null
                ? instancia = new ConfiguracaoSistema()
                : instancia;
    }


    public String getUrlBancoDeDados() {
        return urlBancoDeDados;
    }

    public String getNomeAplicacao() {
        return nomeAplicacao;
    }

    public String getAmbienteExecucao() {
        return ambienteExecucao;
    }

    public String getChaveApi() {
        return chaveApi;
    }

}
