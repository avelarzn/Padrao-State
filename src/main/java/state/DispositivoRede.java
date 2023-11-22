package state;

public class DispositivoRede {

    private String enderecoIP;
    private EstadoConexao estado;

    public DispositivoRede() {this.estado = DispositivoEstadoConectado.getInstance();}

    public void setEstado(EstadoConexao estado) {this.estado = estado;}

    public boolean conectar() {return estado.conectar(this);}

    public boolean desconectar() {return estado.desconectar(this);}

    public boolean verificarDados() {return estado.verificarDados(this);}

    public boolean enviarDados() {return estado.enviarDados(this);}

    public boolean receberDados() {return estado.receberDados(this);}

    public String getEnderecoIP() {return enderecoIP;}
    public String getEnderecoIPEstado() {
        return estado.getEstado();
    }

    public void setEnderecoIP(String enderecoIP) {this.enderecoIP = enderecoIP;}

    public EstadoConexao getEstado() {
        return estado;
    }
}
