import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner s = new Scanner(System.in);

        MetodosBusqueda mB = new MetodosBusqueda();

        int[] num = new int[100000];

        int[] arreglo = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        mB.printArreglo(arreglo);

        //BUSQUEDA SECUENCIA
        int posSec = mB.busquedaSecuencial(arreglo, 50);

        if(posSec !=-1){
            System.out.println("El valor se encuentra en la posicion: "+ posSec);
        }else{
            System.out.println("Valor no encontrado");
        }


        //BUSQUEDA BINARIA
        int posBin = mB.busquedaBinaria(arreglo, 70);

        if(posBin !=-1){
            System.out.println("El valor se encuentra en la posicion: "+ posBin);
        }else{
            System.out.println("Valor no encontrado");
        }


        for(int i = 0; i < num.length; i++ ){
            num[i] = i+1;
        }

        long startTime = System.nanoTime();
        int valSec = 45732;
        int comparacionesSec = mB.busquedaSecuencial(num, valSec);
        System.out.println("\nBúsqueda Secuencial:");
        System.out.println("Valor buscado: " + valSec);
        System.out.println("Número de comparaciones: " + comparacionesSec);
        long endTime = System.nanoTime();
        long totalTime = endTime - startTime;

        System.out.println("Tiempo de ejecucion: " + totalTime + " nanosegundos");

        
        long startTime1 = System.nanoTime();
        int valBin = 75224; 
        int comparacionesBin = mB.busquedaBinaria(num, valBin);
        System.out.println("\nBúsqueda Binaria:");
        System.out.println("Valor buscado: " + valBin);
        System.out.println("Número de comparaciones: " + comparacionesBin);
        long endTime1 = System.nanoTime();
        long totalTime1 = endTime1 - startTime1;

        System.out.println("Tiempo de ejecucion: " + totalTime1 + " nanosegundos");

    }
}
