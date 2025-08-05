public class OperadoresRelacionais {
    public static void main(String[] args) {
    int numero1 = 1;
    int numero2 = 2;
    String nomeMasculino = "João";
    String nomeFeminino = "Joana";

    boolean simNao = numero1==numero2;
    System.out.println("São iguais? " + simNao);

    simNao = numero1!=numero2;
    System.out.println("São diferentes? " + simNao);

    if(nomeMasculino == nomeFeminino) {
        System.out.println("a nossa condição é verdadeira");
    }
    else {
        System.out.println("a nossa condição é falsa");
    }

    }
}
