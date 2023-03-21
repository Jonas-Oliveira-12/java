import java.util.Scanner;  
public class questao05{
  public static void main(String[] args) {
    boolean[] respostas = new boolean[5];
    
    try (Scanner scanner = new Scanner(System.in)) {
      for (int i = 0; i < 5; i++) {
        String questao = "";
        switch (i) {
          case 0:
            questao = "Telefonou para a vítima?";
            break;
          case 1:
            questao = "Esteve no local do crime?";
            break;
          case 2:
            questao = "Mora perto da vítima?";
            break;
          case 3:
            questao = "Devia para a vítima?";
            break;
          case 4:
            questao = "Já trabalhou com a vítima?";
            break;
        }
        System.out.println(questao + " Digite S para sim ou N para não:");
        char answer = scanner.next().charAt(0); 
        if (answer == 'S' || answer == 's') { 
          respostas[i] = true;
        } else { 
          respostas[i] = false;
        }
      }
    }

    int respostapositiva = 0;
    for (int i = 0; i < 5; i++) {
      if (respostas[i]) {
        respostapositiva++;
      }
    }
    
    if (respostapositiva == 2) {
      System.out.println("Suspeita");
    } else if (respostapositiva >= 3 && respostapositiva <= 4) {
      System.out.println("Cúmplice");
    } else if (respostapositiva == 5) {
      System.out.println("Assassino");
    } else {
      System.out.println("Inocente");
    }
  }
}