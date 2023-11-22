package state;

public class DispositivoEstadoReceberDados extends EstadoConexao{
    private DispositivoEstadoReceberDados() {};
    private static DispositivoEstadoReceberDados instance = new DispositivoEstadoReceberDados();
    public static DispositivoEstadoReceberDados getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Recebendo Dados";
    }

    public boolean desconectar(DispositivoRede dispositivoRede) {
        dispositivoRede.setEstado(DispositivoEstadoDesconectado.getInstance());
        return true;
    }

    public boolean enviarDados(DispositivoRede dispositivoRede) {
        dispositivoRede.setEstado(DispositivoEstadoEnviarDados.getInstance());
        return true;
    }

    public boolean receberDados(DispositivoRede dispositivoRede) {
        dispositivoRede.setEstado(DispositivoEstadoReceberDados.getInstance());
        return true;
    }

    public boolean verificarDados(DispositivoRede dispositivoRede) {
        dispositivoRede.setEstado(DispositivoEstadoVerificarDados.getInstance());
        return true;
    }
}
