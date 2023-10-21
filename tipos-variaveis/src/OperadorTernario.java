public class OperadorTernario {
    
    public static void main(String[] args) {
        int a, b;

        a = 5;
        b = 6;

        /*String resultado = "";
        //Condicional usando IF/ELSE

        if(a==b)
            resultado = "verdadeiro";
        else
            resultado = "falso";
        
        System.out.println(resultado);*/

        //Operador Ternário

        String resultado = a==b?"verdadeiro" : "falso";
        
        System.out.println(resultado);
    }
}
