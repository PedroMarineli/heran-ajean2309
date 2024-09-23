public class Vendedor extends Empregado{
    private double percentualComissao;

    public Vendedor(String nome, double salario, double percentualComissao) {
        super(nome, salario);
        this.percentualComissao = percentualComissao;
    }

    public double getPercentualComissao() {
        return percentualComissao;
    }

    public void setPercentualComissao(double percentualComissao) {
        this.percentualComissao = percentualComissao;
    }
}
