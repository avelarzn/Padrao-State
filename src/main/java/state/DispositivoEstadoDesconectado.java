package state;

public class DispositivoEstadoDesconectado extends EstadoConexao{
    private DispositivoEstadoDesconectado() {};
    private static DispositivoEstadoDesconectado instance = new DispositivoEstadoDesconectado();
    public static DispositivoEstadoDesconectado getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Desconectado";
    }

    public boolean conectar(DispositivoRede dispositivoRede) {
        dispositivoRede.setEstado(DispositivoEstadoConectado.getInstance());
        return true;
    }
}
