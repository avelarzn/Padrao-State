package state;

public abstract class EstadoConexao {
    public abstract String getEstado();

    public boolean conectar(DispositivoRede dispositivoRede) {
        return false;
    }

    public boolean desconectar(DispositivoRede dispositivoRede) {
        return false;
    }

    public boolean verificarDados(DispositivoRede dispositivoRede) {
        return false;
    }

    public boolean enviarDados(DispositivoRede dispositivoRede) {
        return false;
    }

    public boolean receberDados(DispositivoRede dispositivoRede) {
        return false;
    }

}
