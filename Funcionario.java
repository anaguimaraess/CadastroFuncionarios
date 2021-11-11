import java.time.LocalDate;

public class Funcionario extends Pessoa {

    public float getSalario() {
        return this.salario -= calculaImposto();
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    protected float salario;

    @Override
    void imprimeDados() {
        System.out.println("==================");
        System.out.println("Nome: "+nome);
        System.out.println("Data nascimento: "+ LocalDate.of(dataNascimento.getAno(),
                dataNascimento.getMes(),
                dataNascimento.getDia()));
        System.out.println("Salario: "+ getSalario());
    }

    public float calculaImposto(){
        return this.salario * 0.03f;
    }
}
