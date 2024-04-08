package br.com.guilhermeoli;

/**
 * @author guiol
 */
@PrimeiraAnotacao(value = "Guilherme", bairros = "Teste", numeroCasa = 10)
public class ClasseComAnotacao {

    @PrimeiraAnotacao(value = "Guilherme", bairros = {"Teste", "Teste1"}, numeroCasa = 20, valores = 100)
    private String nome;

    public ClasseComAnotacao() {

    }

}
