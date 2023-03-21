import java.util.ArrayList;
public class questao07 {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();
        numeros.add(6);
        numeros.add(28);
        numeros.add(496);
        numeros.add(3554);
        numeros.add(5656);

        for (int numero : numeros) {
            int sum = 0;
           
        for (int i = 1; i < numero; i++) {
                if (numero % i == 0) {
                    sum += i;
                }
            }
            if (sum == numero) {
                System.out.println("\n É um numero perfeito:" +numero );
            }
 }
}
}
