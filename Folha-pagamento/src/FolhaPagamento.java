public class FolhaPagamento {

    //Funcionario funcionario;

    Holerite calcularSalario(double QuantidadeHorasNormaisTrabalhadas,
                           double QuantidadeHorasExtrasTrabalhadas, ContratoTrabalho contratoTrabalho){
        /*
        double salarioDevido = QuantidadeHorasNormaisTrabalhadas * contratoTrabalho.valorHoraNormal +
                QuantidadeHorasExtrasTrabalhadas * contratoTrabalho.valorHoraExtra;
    */
        //funcionario = contratoTrabalho.varFuncionario;

        Holerite holerite = new Holerite();
        holerite.funcionario = contratoTrabalho.varFuncionario;
        holerite.valorTotalHorasNormais=QuantidadeHorasNormaisTrabalhadas * contratoTrabalho.valorHoraNormal;
        holerite.valorTotalHorasExtras=QuantidadeHorasExtrasTrabalhadas * contratoTrabalho.valorHoraExtra;

        double subtotal = holerite.valorTotalHorasNormais +  holerite.valorTotalHorasExtras;
        if (holerite.funcionario.possuiFilho()) {
            holerite.valorAdicionalFilhos = contratoTrabalho.calcularAdicionalFilho(subtotal);
        }

        return holerite;

    }
}
