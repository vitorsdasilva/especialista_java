public class Principal {

    public static void main(String[] args) {

        double QuantidadeHorasNormaisTrabalhadas = 1;
        double ValorHoraNormal = 1;
        double QuantidadeHorasExtrasTrabalhadas = 1;
        double ValorHoraExtra =1;


        FolhaPagamento folhaPagamento = new FolhaPagamento();

        Funcionario funcionario = new Funcionario();
        funcionario.nome = "Vitor";
        funcionario.quantidadeDeFilhos=1;

        ContratoTrabalho contratoTrabalho = new ContratoTrabalho();
        contratoTrabalho.varFuncionario = funcionario;
        contratoTrabalho.valorHoraExtra = 2;
        contratoTrabalho.valorHoraNormal = 1;

        Holerite holerite = folhaPagamento.calcularSalario(QuantidadeHorasNormaisTrabalhadas,
                QuantidadeHorasExtrasTrabalhadas, contratoTrabalho);
        holerite.imprimirRelatorio();

    }
}
