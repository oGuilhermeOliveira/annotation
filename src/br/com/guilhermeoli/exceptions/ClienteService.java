package br.com.guilhermeoli.exceptions;

/**
 * @author guiol
 */
public class ClienteService {

    public static void consutarCliente(String opcao) {
    }

    public void consultarCliente(String codigo) throws ClienteNaoEncontradoException{
        ClienteDAO.consultarCliente(codigo);
    }
}
