//Exercicio 4
import java.util.Scanner;
class Main {
  public static void main(String[] args) {
  
   double nota1, nota2, nota3, maior;

   Scanner leia = new Scanner(System.in);

   System.out.println("Digite a primeira nota: ");
     nota1 = leia.nextDouble();
   System.out.println("Digite a segunda nota: ");
     nota2 = leia.nextDouble();
   System.out.println("Digite a terceira nota: ");
     nota3 = leia.nextDouble();

  maior = maiorNota(nota1, nota2, nota3);
  System.out.println("Maior nota:" + maior);
  System.out.println(numeroNota(nota1, nota2, nota3, maior));


  }

  public static double maiorNota(double notaUm, double notaDois, double notaTres){

  double maior;

  if(notaUm > notaDois && notaUm > notaTres) {
    maior = notaUm;
  }
  else if(notaDois > notaTres){
    maior = notaDois;
  }else{
    maior = notaTres;
  }
  
  return maior;
  
  }

  public static String numeroNota(double notaUm, double notaDois, double notaTres, double maior){
  
   if(maior == notaUm){
     return "Primeira Nota.";
   }else if(maior == notaDois){
     return "Segunda Nota.";
   }else{
     return "Terceira Nota.";
   }

  }


}