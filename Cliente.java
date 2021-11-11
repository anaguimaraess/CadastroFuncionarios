import java.time.LocalDate;

public class Cliente extends Pessoa {
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    private int codigo;

    @Override
    void imprimeDados() {
        System.out.println("==================");
        System.out.println("Nome: "+nome);
        System.out.println("Data nascimento: "+ LocalDate.of(dataNascimento.getAno(),
                dataNascimento.getMes(),
                dataNascimento.getDia()));
        System.out.println("Codigo: "+ codigo);
    }
}