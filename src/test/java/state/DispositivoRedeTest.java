package state;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DispositivoRedeTest {
    DispositivoRede dispositivoRede;

    @BeforeEach
    public void setUp() {
        dispositivoRede = new DispositivoRede();
    }

    // Dispositivo conectado

    @Test
    public void naoDeveConectarDispositivoConectado() {
        dispositivoRede.setEstado(DispositivoEstadoConectado.getInstance());
        assertFalse(dispositivoRede.conectar());
    }

    @Test
    public void deveReceberDadosDispositivoConectado() {
        dispositivoRede.setEstado(DispositivoEstadoConectado.getInstance());
        assertTrue(dispositivoRede.receberDados());
        assertEquals(DispositivoEstadoReceberDados.getInstance(), dispositivoRede.getEstado());
    }

    @Test
    public void deveEnviarDadosDispositivoConectado() {
        dispositivoRede.setEstado(DispositivoEstadoConectado.getInstance());
        assertTrue(dispositivoRede.enviarDados());
        assertEquals(DispositivoEstadoEnviarDados.getInstance(), dispositivoRede.getEstado());
    }

    @Test
    public void deveVerificarDadosDispositivoConectado() {
        dispositivoRede.setEstado(DispositivoEstadoConectado.getInstance());
        assertTrue(dispositivoRede.verificarDados());
        assertEquals(DispositivoEstadoVerificarDados.getInstance(), dispositivoRede.getEstado());
    }

    @Test
    public void deveDesconectarDispositivoConectado() {
        dispositivoRede.setEstado(DispositivoEstadoConectado.getInstance());
        assertTrue(dispositivoRede.desconectar());
        assertEquals(DispositivoEstadoDesconectado.getInstance(), dispositivoRede.getEstado());
    }

    // Dispositivo Desconectado

    @Test
    public void deveConectarDispositivoDesconectado() {
        dispositivoRede.setEstado(DispositivoEstadoDesconectado.getInstance());
        assertTrue(dispositivoRede.conectar());
        assertEquals(DispositivoEstadoConectado.getInstance(), dispositivoRede.getEstado());
    }

    @Test
    public void naoDeveReceberDadosDispositivoDesconectado() {
        dispositivoRede.setEstado(DispositivoEstadoDesconectado.getInstance());
        assertFalse(dispositivoRede.receberDados());
    }

    @Test
    public void naodeveDesconectarDispositivoDesconectado() {
        dispositivoRede.setEstado(DispositivoEstadoDesconectado.getInstance());
        assertFalse(dispositivoRede.desconectar());
    }


    @Test
    public void naoDeveEnviarDadosDispositivoDesconectado() {
        dispositivoRede.setEstado(DispositivoEstadoDesconectado.getInstance());
        assertFalse(dispositivoRede.enviarDados());
    }

    @Test
    public void naoDeveVerificarDadosDispositivoDesconectado() {
        dispositivoRede.setEstado(DispositivoEstadoDesconectado.getInstance());
        assertFalse(dispositivoRede.verificarDados());
    }

    // Dispositivo Recebendo Dados

    @Test
    public void deveDesconectarDispositivoRecebendoDados() {
        dispositivoRede.setEstado(DispositivoEstadoReceberDados.getInstance());
        assertTrue(dispositivoRede.desconectar());
        assertEquals(DispositivoEstadoDesconectado.getInstance(), dispositivoRede.getEstado());
    }

    @Test
    public void deveReceberDadosDispositivoRecebendoDados() {
        dispositivoRede.setEstado(DispositivoEstadoReceberDados.getInstance());
        assertTrue(dispositivoRede.receberDados());
        assertEquals(DispositivoEstadoReceberDados.getInstance(), dispositivoRede.getEstado());
    }

    @Test
    public void naoDeveConectarDispositivoRecebendoDados() {
        dispositivoRede.setEstado(DispositivoEstadoReceberDados.getInstance());
        assertFalse(dispositivoRede.conectar());
    }

    @Test
    public void deveVerificarDadosDispositivoRecebendoDados() {
        dispositivoRede.setEstado(DispositivoEstadoReceberDados.getInstance());
        assertTrue(dispositivoRede.verificarDados());
        assertEquals(DispositivoEstadoVerificarDados.getInstance(), dispositivoRede.getEstado());
    }

    @Test
    public void deveEnviarDadosDispositivoRecebendoDados() {
        dispositivoRede.setEstado(DispositivoEstadoReceberDados.getInstance());
        assertTrue(dispositivoRede.enviarDados());
        assertEquals(DispositivoEstadoEnviarDados.getInstance(), dispositivoRede.getEstado());
    }

    // Dispositivo Enviando Dados

    @Test
    public void naoDeveConectarDispositivoEnviandoDados() {
        dispositivoRede.setEstado(DispositivoEstadoEnviarDados.getInstance());
        assertFalse(dispositivoRede.conectar());
    }

    @Test
    public void deveDesconectarDispositivoEnviandoDados() {
        dispositivoRede.setEstado(DispositivoEstadoEnviarDados.getInstance());
        assertTrue(dispositivoRede.desconectar());
        assertEquals(DispositivoEstadoDesconectado.getInstance(), dispositivoRede.getEstado());
    }

    @Test
    public void deveReceberDadosDispositivoEnviandoDados() {
        dispositivoRede.setEstado(DispositivoEstadoEnviarDados.getInstance());
        assertTrue(dispositivoRede.receberDados());
        assertEquals(DispositivoEstadoReceberDados.getInstance(), dispositivoRede.getEstado());
    }

    @Test
    public void naoDeveVerificarDadosDispositivoEnviandoDados() {
        dispositivoRede.setEstado(DispositivoEstadoEnviarDados.getInstance());
        assertFalse(dispositivoRede.verificarDados());
    }

    @Test
    public void naoDeveEnviarDadosDispositivoEnviandoDados() {
        dispositivoRede.setEstado(DispositivoEstadoEnviarDados.getInstance());
        assertFalse(dispositivoRede.enviarDados());
    }

    // Dispositivo Verificando Dados

    @Test
    public void naoDeveConectarDispositivoVerificandoDados() {
        dispositivoRede.setEstado(DispositivoEstadoVerificarDados.getInstance());
        assertFalse(dispositivoRede.conectar());
    }

    @Test
    public void deveDesconectarDispositivoVerificandoDados() {
        dispositivoRede.setEstado(DispositivoEstadoVerificarDados.getInstance());
        assertTrue(dispositivoRede.desconectar());
        assertEquals(DispositivoEstadoDesconectado.getInstance(), dispositivoRede.getEstado());
    }

    @Test
    public void deveReceberDadosDispositivoVerificandoDados() {
        dispositivoRede.setEstado(DispositivoEstadoVerificarDados.getInstance());
        assertTrue(dispositivoRede.receberDados());
        assertEquals(DispositivoEstadoReceberDados.getInstance(), dispositivoRede.getEstado());
    }

    @Test
    public void naoDeveVerificarDadosDispositivoVerificandoDados() {
        dispositivoRede.setEstado(DispositivoEstadoVerificarDados.getInstance());
        assertFalse(dispositivoRede.verificarDados());
    }

    @Test
    public void naoDeveEnviarDadosDispositivoVerificandoDados() {
        dispositivoRede.setEstado(DispositivoEstadoVerificarDados.getInstance());
        assertFalse(dispositivoRede.enviarDados());
    }
}