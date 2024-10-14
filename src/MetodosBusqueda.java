public class MetodosBusqueda {
    
    public int busquedaSecuencial(int[] arreglo, int valorBuscado){

        int pos = -1;
        int cont = 0;

        for(int i = 0; i <arreglo.length; i++){
            cont++;
            if(arreglo[i] == valorBuscado){
                pos = i;
            break;
            }
        }

        return cont;

    }

    public void printArreglo(int[] arreglo){

        for(int elem : arreglo){
            System.out.println(elem+" ");
        }

    }

    public int busquedaBinaria(int[] arreglo, int value){

        int inicio = 0;
        int fin = arreglo.length -1;
        int cont=0;

        while (inicio <= fin) {
            cont++;
            int medio = inicio + (fin - inicio) /2;
            
            if(arreglo[medio] == value){
                //ELEMENTO ENCONTRADO
                return cont;
            }

            if(arreglo[medio] < value){
                inicio = medio+1;//BUSCAR EN LA MITAD DE LA DERECHA
            }else{
                fin = medio-1;//BUSCAR EN LA MITAD DE LA IZQUIERDA
            }
        }

        return cont;
    }

}
