
package prova;

public class Exemplo19 {

    public static void mostraMsg(){
        System.out.println("Ola mundo");
    }
    
    public static void mostraMsg2(String msg){
        System.out.println(msg);
    }
    
    public static String mostraMsg3(){
        return "meu nome e jonas";
    }
    
    public static int somar (int a,int b){
        return a + b;
    }
    
    
    public static void main(String[] args) {
    mostraMsg();  
    
    mostraMsg2("2 msg ");
    mostraMsg2("3 msg");
        
    String retorno = mostraMsg3();
    
    System.out.println(retorno);
    
    System.out.println(mostraMsg3());
     
    System.out.println("A soma é : " + somar(10,20));
    
    }
    
}
