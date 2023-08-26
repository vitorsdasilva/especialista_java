public class ItemCardapio {

    String descricao;
    double preco;

    boolean possuiPrecoEntre(double precoMinimo,double precoMaximo){
            return preco >= precoMinimo && preco <= precoMaximo;

    }

    void imprimir() {
        System.out.println("Descrição do item: "+ descricao);

    }
}