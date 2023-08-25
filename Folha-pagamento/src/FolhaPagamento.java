public class FolhaPagamento {

    Funcionario funcionario;

    double calcularSalario(double QuantidadeHorasNormaisTrabalhadas,
                           double QuantidadeHorasExtrasTrabalhadas, ContratoTrabalho contratoTrabalho){

        double salarioDevido = QuantidadeHorasNormaisTrabalhadas * contratoTrabalho.valorHoraNormal +
                QuantidadeHorasExtrasTrabalhadas * contratoTrabalho.valorHoraExtra;

        funcionario = contratoTrabalho.varFuncionario;

        //Quando o funcionário possuir 1 ou mais filhos, você deve calcular um adicional de 10% no valor total do salário.

        if (funcionario.possuiFilho()){
            salarioDevido += contratoTrabalho.calcularAdicionalFilho(salarioDevido);
        }

        return salarioDevido;

    }
}
