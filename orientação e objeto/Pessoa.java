package oo.exemplo01;

public class Pessoa {
    
    String nome;
    int idade;
    String endereço;
    float altura;
    
    public void andar(){
        System.out.println("Pessoa andando");
        
    }
    
    public void falar(){
        System.out.println("Pessoa falando");
    }
    
    public void comer(String comida){
        System.out.println("Pessoa comendo " + comida);
    }
    
    public static void main(String[] args){
        
        Pessoa p1 = new Pessoa();
        System.out.println(p1);
        
        p1.nome = "jónas";
        p1.idade = 19;
        p1.endereço = "maceio";
        p1.altura = 1.80f;
        
        System.out.println("Seu nome : " + p1.nome+"\n");
        System.out.println("Sua idade : " + p1.idade+"\n");
        System.out.println("Seu endereço : " + p1.endereço+"\n");
        System.out.println("Sua Altura : " + p1.altura+"\n");
        
        p1.andar();
        p1.falar();
        p1.comer("arroz");
        
        
    }
}
