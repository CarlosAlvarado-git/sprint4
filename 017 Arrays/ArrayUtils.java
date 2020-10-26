public class ArrayUtils {
    String pp; 
    public int[] cloneArray(int[] lista){ 
        int[] list = new int[lista.length]; 
        for (int i=0; i<lista.length; i++) {
            list[i] = lista[i]; 
        } 
        return list;
    }
    public void makeHist(int[]lista) {
        int numero; 
        System.out.println("Elemento  Valor"); 
        for(int i=0; i < lista.length; i++){
            numero = lista[i];
            System.out.printf("%-10d  %-10d", i, numero); 
            for(int h = 0; h <= numero; h++){
                System.out.print("#"); 
            }
            System.out.print("\n");
        }
    }
    public boolean areFactors (int n, int[] lista){
        boolean factors = true;
        double mod = 0; 
        for (int i = 0; i < lista.length && factors == true; i++){
            mod = n % lista[i]; 
            if(mod != 0){
                factors = false; 
            }
        }
        return factors; 
    }
    public int whereIs(int n, int[] lista){
        int posicion = -1; 
        for (int i = 0; i < lista.length && posicion == -1; i++){
            if(n == lista[i]){
                posicion = i;  
            }
        }
        return posicion; 
    }


}
