public class Ordenar {

    public static void main(String[] args) {
        int[] numeros = new int[]{9, 8, 4, 7, 2, 5, 6, 1, 3};
        int[] temporario = new int[1];
        System.out.println("Lista Desordenada: ");
        System.out.print("(" + numeros[0]+", ");
        System.out.print(numeros[1]+", ");
        System.out.print(numeros[2]+", ");
        System.out.print(numeros[3]+", ");
        System.out.print(numeros[4]+", ");
        System.out.print(numeros[5]+", ");
        System.out.print(numeros[6]+", ");
        System.out.print(numeros[7]+", ");
        System.out.println(numeros[8]+")");
        for (int x = 0; x < numeros.length ; ++x) {
            for (int i = x+1 ; i < numeros.length ; ++i) {
                    if (i != 9 && numeros[x] != numeros[i]) {
                    if (numeros[x] > numeros[i]) {
                        temporario[0] = numeros[x];
                        numeros[x] = numeros[i];
                        numeros[i] = temporario[0];
                    }
                }
            }
        }
        System.out.println("Lista Ordenada:");
        System.out.print("("+numeros[0]+", ");
        System.out.print(numeros[1]+", ");
        System.out.print(numeros[2]+", ");
        System.out.print(numeros[3]+", ");
        System.out.print(numeros[4]+", ");
        System.out.print(numeros[5]+", ");
        System.out.print(numeros[6]+", ");
        System.out.print(numeros[7]+", ");
        System.out.print(numeros[8]+")");
    }
}



