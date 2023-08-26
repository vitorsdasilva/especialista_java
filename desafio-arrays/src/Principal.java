public class Principal {

    public static void main(String[] args) {

        Calendario calendario = new Calendario();

        int entrada =2;

        String mes = calendario.obterNomeMes(entrada);

        System.out.println(mes);
    }


}
