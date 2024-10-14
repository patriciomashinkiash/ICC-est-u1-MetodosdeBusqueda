import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner s = new Scanner(System.in);

        MetodosBusqueda mB = new MetodosBusqueda();

        int[] arreglo = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        mB.printArreglo(arreglo);

        int posicion = mB.busquedaSecuencial(arreglo, 50);

        if(posicion !=-1){
            System.out.println("El valor se encuentra en la posicion: "+ posicion);
        }else{
            System.out.println("Valor no encontrado");
        }

    }
}
