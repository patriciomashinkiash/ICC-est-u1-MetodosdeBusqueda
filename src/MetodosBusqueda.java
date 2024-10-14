public class MetodosBusqueda {
    
    public int busquedaSecuencial(int[] arreglo, int valorBuscado){

        int pos = -1;
        for(int i = 0; i <arreglo.length; i++){
            if(arreglo[i] == valorBuscado){
                pos = i;
            }
        }
        return pos;

    }

    public void printArreglo(int[] arreglo){

        for(int elem : arreglo){
            System.out.println(elem+" ");
        }

    }

}
