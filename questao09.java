import java.util.Scanner;
        
public class questao09 {

  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
        System.out.print("Insira o valor da dívida: ");
        double ValordoDebito = scanner.nextDouble();

        System.out.println("Quantidade de Parcelas % de Juros sobre o valor inicial da dívida");
        System.out.println("1 PAR  0%");
        System.out.println("3 PAR  10%");
        System.out.println("6 PAR  15%");
        System.out.println("9 PAR  20%");
        System.out.println("12 PAr 25%");

        System.out.print("Insira a quantidade de parcelas: ");
        int NumeroDeParcelas = scanner.nextInt();

        double TaxadeJuros = 0;
        double ValordaParcela = 0;

        if (NumeroDeParcelas == 1) {
          TaxadeJuros = 0;
          ValordaParcela = ValordoDebito;
        } else if (NumeroDeParcelas == 3) {
          TaxadeJuros = 0.1;
          ValordaParcela = (ValordoDebito * (1 + TaxadeJuros)) / NumeroDeParcelas;
        } else if (NumeroDeParcelas == 6) {
          TaxadeJuros = 0.15;
          ValordaParcela = (ValordoDebito * (1 + TaxadeJuros)) / NumeroDeParcelas;
        } else if (NumeroDeParcelas == 9) {
          TaxadeJuros = 0.2;
          ValordaParcela = (ValordoDebito * (1 + TaxadeJuros)) / NumeroDeParcelas;
        } else if (NumeroDeParcelas == 12) {
          TaxadeJuros = 0.25;
          ValordaParcela = (ValordoDebito * (1 + TaxadeJuros)) / NumeroDeParcelas;
        } else {
          System.out.println("Quantidade de parcelas inválida.");
          return;
        }

        Double ValordoJuros = (ValordoDebito * TaxadeJuros);

        System.out.println("Valor da dívida: " + ValordoDebito);
        System.out.println("Valor dos juros: " + (ValordoDebito * TaxadeJuros));
        System.out.println("Quantidade de parcelas: " + NumeroDeParcelas);
        System.out.println("Valor da parcela: " + ValordaParcela);
        System.out.print("Valor geral(com juros aplicado)"+ (ValordoDebito+ValordoJuros));
    }
  }
}

    

