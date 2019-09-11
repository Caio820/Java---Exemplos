//Exercicio 5
import java.util.Scanner;
class Main {
  public static void main(String[] args) {
  
   double nota1, nota2, nota3;

   Scanner leia = new Scanner(System.in);

   System.out.println("Digite a primeira nota: ");
     nota1 = leia.nextDouble();
   System.out.println("Digite a segunda nota: ");
     nota2 = leia.nextDouble();
   System.out.println("Digite a terceira nota: ");
     nota3 = leia.nextDouble();
  
  System.out.println("Maior nota:" + maiorNota(nota1, nota2, nota3));
  System.out.println("Menor nota:" + menorNota(nota1, nota2, nota3));  

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

  public static Double menorNota(double notaUm, double notaDois, double notaTres){
   
  double menor;

  if(notaUm < notaDois && notaUm < notaTres) {
    menor = notaUm;
  }
  else if(notaDois < notaTres){
    menor = notaDois;
  }else{
    menor = notaTres;
  }

  return menor;

 }

}