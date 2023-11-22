package state;

public class DispositivoEstadoEnviarDados extends EstadoConexao{
    private DispositivoEstadoEnviarDados() {};
    private static DispositivoEstadoEnviarDados instance = new DispositivoEstadoEnviarDados();
    public static DispositivoEstadoEnviarDados getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Enviando Dados";
    }

    public boolean desconectar(DispositivoRede dispositivoRede) {
        dispositivoRede.setEstado(DispositivoEstadoDesconectado.getInstance());
        return true;
    }

    public boolean receberDados(DispositivoRede DispositivoRede) {
        DispositivoRede.setEstado(DispositivoEstadoReceberDados.getInstance());
        return true;
    }
}
