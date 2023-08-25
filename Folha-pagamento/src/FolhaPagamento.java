public class FolhaPagamento {
    double calcularSalario(double QuantidadeHorasNormaisTrabalhadas, double ValorHoraNormal,
                           double QuantidadeHorasExtrasTrabalhadas, double ValorHoraExtra){

            /*parametros:
                  QuantidadeHorasNormaisTrabalhadas
                  QuantidadeHorasExtrasTrabalhadas
                  ValorHoraNormal
                  ValorHoraExtra

                  calcular as respectivas quantidades
                  de horas trabalhas pelos valores da hora,
                  somar os valores obtidos e retornar o resultado.
     */

        double salarioDevido = QuantidadeHorasNormaisTrabalhadas * ValorHoraNormal +
                QuantidadeHorasExtrasTrabalhadas * ValorHoraExtra;
        return salarioDevido;

    }
}
