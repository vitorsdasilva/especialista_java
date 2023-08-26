import java.util.Arrays;

public class Cardapio {

    ItemCardapio[] itens= new ItemCardapio[0];

    void adicionarItem(ItemCardapio item) {
        // TODO implementar inclusão de item do cardápio
        this.itens = Arrays.copyOf(this.itens,itens.length +1);

        this.itens[itens.length-1] = item;
    }

    void removerItem(int indice) {
        ItemCardapio[] novosItens = new ItemCardapio[this.itens.length-1];

        System.arraycopy(this.itens,0,novosItens,0, indice);
        System.arraycopy(this.itens,indice+1, novosItens,indice,novosItens.length-indice);

        itens = novosItens;
        // TODO implementar exclusão de item do cardápio da posição informada
    }

    void imprimirItensCardapio(double precoMinimo, double precoMaximo) {
        /*
        //assim
        for (int i=0; i < this.itens.length; i++) {
            if (itens[i].possuiPrecoEntre(precoMinimo, precoMaximo) ) {
                itens[i].imprimir();
            }
        }
         */

        //ou assim:

        for ( ItemCardapio item : itens) {
            if (item.possuiPrecoEntre(precoMinimo, precoMaximo)){
                item.imprimir();
            }
        }
    }


}