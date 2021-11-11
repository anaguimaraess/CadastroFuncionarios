public class Gerente extends Funcionario {

    private String area;

    public Gerente(String area) {
        this.area = area;
    }

    @Override
    void imprimeDados() {
        super.imprimeDados();
        System.out.println("Area: " + area);
    }

    @Override
    public float calculaImposto() {
        return this.salario * 0.05f;
    }
}
