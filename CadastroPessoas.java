import java.util.ArrayList;
import java.util.List;

public class CadastroPessoas {

    private static int qtdAtual;
    static List<Pessoa> pessoas = new ArrayList<>();

    void cadastraPessoa(Pessoa pessoa){
        pessoas.add(pessoa);
        qtdAtual++;
    }

    void imprimeCadastro(){
        pessoas.forEach(pessoa -> {
            pessoa.imprimeDados();
        });
        System.out.println("");

        System.out.println("Quantidade de pessoas cadastradas: "+ qtdAtual);

    }
}