package state;

public class DispositivoEstadoConectado extends EstadoConexao{
    private DispositivoEstadoConectado() {};
    private static DispositivoEstadoConectado instance = new DispositivoEstadoConectado();
    public static DispositivoEstadoConectado getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Conectado";
    }

    public boolean desconectar(DispositivoRede dispositivoRede) {
        dispositivoRede.setEstado(DispositivoEstadoDesconectado.getInstance());
        return true;
    }

    public boolean verificarDados(DispositivoRede dispositivoRede) {
        dispositivoRede.setEstado(DispositivoEstadoVerificarDados.getInstance());
        return true;
    }

    public boolean enviarDados(DispositivoRede dispositivoRede) {
        dispositivoRede.setEstado(DispositivoEstadoEnviarDados.getInstance());
        return true;
    }

    public boolean receberDados(DispositivoRede DispositivoRede) {
        DispositivoRede.setEstado(DispositivoEstadoReceberDados.getInstance());
        return true;
    }

}
