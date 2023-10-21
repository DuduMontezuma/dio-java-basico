public class OperadoresRelacionais {
    public static void main(String[] args) {
        int numero1 = 1;
        int numero2 = 2;
        
        boolean simNao = numero1 == numero2;

        if(numero1 < numero2){
            System.out.println("A nossa condição é verdadeira");
        }else
            System.out.println("A nossa condição é falsa");

        

        System.out.println("Numero 1 é igual a Número 2? "+ simNao);

        simNao = numero1 != numero2;

        System.out.println("Numero 1 é diferente de Número 2? "+ simNao);

        simNao = numero1 > numero2;

        System.out.println("Numero 1 é maior que Número 2? "+ simNao);

        simNao = numero1 < numero2;

        System.out.println("Numero 1 é menor que Número 2? "+ simNao);
    }
}
