//Exercício 3
import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    
   double nota1, nota2, nota3, mediaFinal;

   Scanner leia = new Scanner(System.in);

   System.out.println("Digite a primeira nota: ");
     nota1 = leia.nextDouble();
   System.out.println("Digite a segunda nota: ");
     nota2 = leia.nextDouble();
   System.out.println("Digite a terceira nota: ");
     nota3 = leia.nextDouble();
  
   mediaFinal = calculaMedia(nota1, nota2, nota3);
   System.out.println(verificaMedia(mediaFinal));
    

  }

   public static Double calculaMedia(double notaUm, double notaDois, double notaTres){

     double media;
     media = (notaUm + notaDois + notaTres)/3;

     return media;
  }

  public static String verificaMedia(double mediaFinal){

  if(mediaFinal >= 6) {
    return "Aluno foi aprovado.";
  } else if(mediaFinal < 4) {
    return "Aluna foi reprovado.";
  } else {
    return "Aluno está na prova final.";
  }  
  
  }
}