public class Ordenar {

    public static void main(String[] args) {
        int[] numeros = new int[]{9, 8, 4, 7, 2, 5, 6, 1, 3,33, 58, 20, 0};
        int[] temporario = new int[1];
        System.out.println("Lista Desordenada: ");
        for (int x = 0; x < numeros.length; ++x)
            System.out.print(numeros[x] + ", ");
        for (int x = 0; x < numeros.length; ++x) {
            for (int i = x + 1; i < numeros.length; ++i) {
                if (numeros[x] != numeros[i]) {
                    if (numeros[x] > numeros[i]) {
                        temporario[0] = numeros[x];
                        numeros[x] = numeros[i];
                        numeros[i] = temporario[0];
                    }
                }
            }
        }
        System.out.println("\n" + "Lista Ordenada:");
        for (int x = 0; x < numeros.length; ++x)
            System.out.print(numeros[x] + ", ");
    }
}



