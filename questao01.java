public class questao01 {
    public static void main (String[] args){
        int A = 5;
        int B = 10;
        int C = 100;
        System.out.println("A = " + A);
        System.out.println("B = " + B);
        System.out.println("C = " + C);
        System.out.println("======= resultados =======");
       
        if ((A % B) > 0){
            System.out.println("A é múltiplo de B");
        }
        if ((A % C) > 0){
            System.out.println("A é múltiplo de C");
        
            if ((B % A) > 0){            
            System.out.println("B é múltiplo de A");
        }
        if ((B % C) > 0){
            System.out.println("B é múltiplo de C");
        
        if ((C % A) > 0){
            System.out.println("C é múltiplo de A");
        }
        if ((C % B) > 0){
            System.out.println("C é múltiplo de B");
        }
        }
        }
        
    }
    
}
