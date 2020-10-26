public class Prueba {

    public static void main(String[] arg) {
        int[] listazo = {1, 2, 3, 4};  

        System.out.println(listazo[0]);
        System.out.println(listazo[1]); 
        System.out.println(listazo[2]);
        System.out.println(listazo[3]);

        int[] listaN; 

        ArrayUtils prueba = new ArrayUtils();
        
        listaN = prueba.cloneArray(listazo); 
        System.out.println(listaN[0]);
        System.out.println(listaN[1]);
        System.out.println(listaN[2]);
        System.out.println(listaN[3]); 

        prueba.makeHist(listazo);

        System.out.println(prueba.areFactors(12, listazo));
        System.out.println(prueba.whereIs(3, listazo)); 
    }
    
}
