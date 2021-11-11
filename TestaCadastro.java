public class TestaCadastro {
    public static void main(String[] args) {

        Pessoa p1 = new Cliente();
        p1.nome = "joão";
        Data dtNascimento = new Data();
        dtNascimento.setAno(1991);
        dtNascimento.setDia(1);
        dtNascimento.setMes(6);
        p1.dataNascimento = dtNascimento;
        ((Cliente) p1).setCodigo(123);
        CadastroPessoas cadastro = new CadastroPessoas();
        cadastro.cadastraPessoa(p1);


        Pessoa p2 = new Funcionario();
        p2.nome = "maria";
        Data dtNascimento2 = new Data();
        dtNascimento2.setAno(2005);
        dtNascimento2.setDia(20);
        dtNascimento2.setMes(12);
        p2.dataNascimento = dtNascimento2;
        ((Funcionario)p2).setSalario(1000);
        CadastroPessoas cadastro2 = new CadastroPessoas();
        cadastro2.cadastraPessoa(p2);


        Pessoa p3 = new Gerente("Tecnologia");
        p3.nome = "blablah";
        Data dtNascimento3 = new Data();
        dtNascimento3.setAno(2001);
        dtNascimento3.setDia(13);
        dtNascimento3.setMes(8);
        p3.dataNascimento = dtNascimento3;
        ((Gerente)p3).setSalario(2000);
        CadastroPessoas cadastro3 = new CadastroPessoas();
        cadastro3.cadastraPessoa(p3);


        cadastro3.imprimeCadastro();
    }
}