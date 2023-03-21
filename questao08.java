public class questao08 {
    public static void main(String[] args){

        double[] temperatura = {
      26.0, 
      28.0, 
      30.0, 
      32.0, 
      34.0, 
      36.0, 
      38.0,
      38.0, 
      36.0, 
      34.0, 
      32.0, 
      28.0 
    };

    double sum = 0;
    for (double temperaturaanual: temperatura) {
      sum += temperaturaanual;
    }
    double temperaturaanual = sum / temperatura.length;
    System.out.println("Temperatura media anual: " + temperaturaanual + " graus");

    String[] meses = {
      "Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outtubro", "Nevembro", "Dezembro"};
    for (int i = 0; i < temperatura.length; i++) {
            double mediaanual = 0;
      if (temperatura[i] > mediaanual) {
        System.out.println(meses[i] + " : " + temperatura[i] + " graus");
      }
    }
  }
}

    

