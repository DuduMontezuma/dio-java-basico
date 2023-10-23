public class Comentarios {
    public static void main(String[] args) {
        //Olá, eu sou um comentário em uma única linha

        /*
         * Olá,
         * Eu sou um comentário
         * que posso ser mais detalhado
         * quando necessário
         */
    }

    /**
     * Este método foi elaborado as pressas
     * por isso eu abreviei o nome das variáveis
     * mas olha, ele tem como finalidade somar ou multiplicar
     * dois números
     */
    public int  somaMultiplica(int n, int x, String m){
        int r = 0; //r é igual ao resultado
        if (m == "M"){ // M = multiplicação
            r = n * x;
        }else{
            r = n +x; //se não soma mesmo
        }
        return r;

    }
}
