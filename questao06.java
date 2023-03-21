import java.util.ArrayList;
import java.util.List;

public class questao06 {
    public static void main(String[] args) {

        List<Integer> valores = new ArrayList<>();
        valores.add(1);
        valores.add(2);
        valores.add(3);
        valores.add(4);
        valores.add(5);
        valores.add(6);
        valores.add(7);
        valores.add(8);

        List<Integer> pares = new ArrayList<>();
        for (int valor : valores) {
            if (valor % 2 == 0) {
                pares.add(valor);
            }
        }

        List<Integer> impares = new ArrayList<>();
        for (int valor : valores) {
            if (valor % 2 != 0) {
                impares.add(valor);
            }
        }

        System.out.println("Coleção inicial: " + valores);
        System.out.println("Coleção de números pares: " + pares);
        System.out.println("Coleção de números ímpares: " + impares);
    }
}