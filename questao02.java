public class questao02 {
    public static void main (String[] args) {

        double [] notas = new double [5];

        notas[0] = 10;
        notas[1] = 3;
        notas[2] = 8;
        notas[3] = 7;
        notas[4] = 6;

        System.out.print("Média geral da turma : "+(notas[0]+notas[1]+notas[2]+notas[3]+notas[4])/5);

        double menor = 10;

        for (int i=0; i<notas.length;i++) {
            if(menor > notas[i]){
                menor = notas[i];
            }
        }
        
        System.out.print("\nA menor média foi : "+menor);
       
        double maior = 0;

        for (int i=0; i<notas.length;i++) {
            if(maior < notas[i]){
                maior = notas[i];
            }
        }
        
        System.out.print("\nA maior média foi : "+maior);



    }
}
