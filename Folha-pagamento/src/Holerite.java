public class Holerite {

    Funcionario funcionario;
    double valorTotalHorasNormais;
    double valorTotalHorasExtras;
    double valorAdicionalFilhos;

    double calcularValorTotal (){
        return valorTotalHorasNormais+valorTotalHorasExtras+valorAdicionalFilhos;
    }

    void imprimirRelatorio (){
        System.out.printf("Funcionário %s%n",funcionario.nome );
        System.out.printf("Valor Total de Horas Normais trabalhadas: %.2f%n",valorTotalHorasNormais );
        System.out.printf("Valor Total de Horas Extras trabalhadas: %.2f%n",valorTotalHorasExtras);
        System.out.printf("Valor de Adicional de Filhos: %.2f%n",valorAdicionalFilhos );
        System.out.printf("Salário devido: %.2f%n",calcularValorTotal() );
    }

}
