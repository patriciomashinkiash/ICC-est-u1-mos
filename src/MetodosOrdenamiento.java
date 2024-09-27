class MetodosOrdenamiento {

    public int[] sortByseleccion(int[] arreglo, boolean asen) {
        int tam = arreglo.length;

        // Recorrer el arreglo
        for (int i = 0; i < tam; i++) {
            int indice = i;
            for (int j = i + 1; j < tam; j++) {
                if (asen
                        ? arreglo[j] < arreglo[indice]
                        : arreglo[j] > arreglo[indice]) {
                    indice = j;
                }
            }
            // Intercambio del indice encontrado por el primero+gut 
            int aux = arreglo[indice];
            arreglo[indice] = arreglo[i];
            arreglo[i] = aux;
        }
        return arreglo;
    }

    public void printArreglo(int[] arreglo) {
        for (int elem : arreglo) {
            System.out.print(elem + " ");
        }
    }

}