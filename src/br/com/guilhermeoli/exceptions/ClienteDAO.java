package br.com.guilhermeoli.exceptions;

/**
 * @author guiol
 */
public class ClienteDAO {

    public static void consultarCliente(String codigo) throws ClienteNaoEncontradoException{
        //Buscar no banco
        boolean isCadastrado = false;

        if (!isCadastrado) {
            throw new ClienteNaoEncontradoException("Cliente não foi encontrado");
        }
    }
}
