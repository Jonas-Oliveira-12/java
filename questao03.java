public class questao03 {
    public static void main (String[] args) {
        int arquivo = 100;
        int internet = 20;

        int segundos = (arquivo /(internet/8));
 
        System.out.println("tempo de download é de : "+(segundos/60) + " minutos e " + (segundos%60) + " segundos");
        
    }
}
