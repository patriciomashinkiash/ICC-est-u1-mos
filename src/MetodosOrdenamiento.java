class MetodosOrdenamiento{

    public int[] sortByseleccion(int[] arreglo){
        int tam = arreglo.length;

        //Recorrer el arreglo
        for(int i=0; i<tam;i++){
            int indice = i;
            for(int j=i+1;i<tam;j++){
                if(arreglo[j] > arreglo[indice]){
                    indice = j;
                }
            }
            //Intercambio del indice encontrado por el primero
            int aux = arreglo[indice];
            arreglo[indice] = arreglo[i];
            arreglo[i] = aux;
        }
        return arreglo;
    }

}