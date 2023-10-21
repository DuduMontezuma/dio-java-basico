public class Operadores {
    
    public static void main(String[] args){

        String concatenacao = "?";

        concatenacao = 1+1+1+"1";

        System.out.println(concatenacao);

        concatenacao = 1+"1"+1+1;

        System.out.println(concatenacao);

        concatenacao = 1+"1"+1+"1";

        System.out.println(concatenacao);

        concatenacao = "1"+1+1+1;

        System.out.println(concatenacao);

        concatenacao = "1"+(1+1+1);

        System.out.println(concatenacao);

        //Unário

        int numero = 5;

        numero = - numero;

        System.out.println(numero);

        numero = ++ numero;

        System.out.println(numero);
    }
}
