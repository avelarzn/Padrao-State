package state;

public class DispositivoEstadoVerificarDados extends EstadoConexao{
    private DispositivoEstadoVerificarDados() {};
    private static DispositivoEstadoVerificarDados instance = new DispositivoEstadoVerificarDados();
    public static DispositivoEstadoVerificarDados getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Verificando dados";
    }

    public boolean receberDados(DispositivoRede dispositivoRede) {
        dispositivoRede.setEstado(DispositivoEstadoReceberDados.getInstance());
        return true;
    }

    public boolean desconectar(DispositivoRede dispositivoRede) {
        dispositivoRede.setEstado(DispositivoEstadoDesconectado.getInstance());
        return true;
    }
}
