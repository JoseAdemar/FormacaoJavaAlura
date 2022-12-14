
public class Gerente extends Funcionario implements Autenticavel {
    private AutenticacaoUtil autenticador;

    public Gerente() {
        this.autenticador = new AutenticacaoUtil();
    }

    @Override
    public double getBonificacao() {
        return 300;
    }
    @Override
    public int setSenha(int senha) {
        return this.autenticador.setSenha(senha);
    }

    @Override
    public boolean autentica(int senha) {
        return this.autenticador.autentica(senha);
    }
}
