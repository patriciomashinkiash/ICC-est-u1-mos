public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Metodo de ordenamiento seleccion");
        MetodosOrdenamiento mD = new MetodosOrdenamiento();

        int[] arreglo = {10,5,8,2,0};
        mD.sortByseleccion(arreglo, true);
        mD.printArreglo(arreglo);
        System.out.println();

        mD.sortByseleccion(arreglo, false);
        mD.printArreglo(arreglo);
            
    }
}
