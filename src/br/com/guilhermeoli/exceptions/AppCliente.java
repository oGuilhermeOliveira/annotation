package br.com.guilhermeoli.exceptions;

import javax.swing.*;
import java.util.Scanner;

/**
 * @author guiol
 */
public class AppCliente {

    public static void main(String[] args) {
        String opcao = JOptionPane.showInputDialog(null,
                "Digite o código do cliente", "",
                JOptionPane.INFORMATION_MESSAGE);

        try {
            ClienteService.consutarCliente(opcao);
        } catch (ClienteNaoEncontradoException e) {
            System.out.println(e.getMessage());
        }
    }


}


