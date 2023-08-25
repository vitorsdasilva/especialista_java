public class Funcionario {

    String nome;
    int quantidadeDeFilhos;

    boolean possuiFilho(){
        if (quantidadeDeFilhos > 0) {
            return true;
        } else {
            return false;
        }
    }


}
