public class Principal {

    public static void main(String[] args) {

        double QuantidadeHorasNormaisTrabalhadas = 1;
        double ValorHoraNormal = 1;
        double QuantidadeHorasExtrasTrabalhadas = 1;
        double ValorHoraExtra =1;

        FolhaPagamento folhaPagamento = new FolhaPagamento();
        double salarioDevido = folhaPagamento.calcularSalario(QuantidadeHorasNormaisTrabalhadas,
                ValorHoraNormal, QuantidadeHorasExtrasTrabalhadas, ValorHoraExtra);
        System.out.println(" Salário devido:" + salarioDevido );
    }
}
