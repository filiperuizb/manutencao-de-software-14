package strategy;

public class LoggerSistema {
    private static LoggerSistema loggerSistema;

    public LoggerSistema() {
    }

    public static LoggerSistema getInstance(){
        if(loggerSistema == null){
            loggerSistema = new LoggerSistema();
        }
        return loggerSistema;
    }

    public void log(String mensagem){
        System.out.println(mensagem);
    }
}
