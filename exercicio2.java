//Exercicio 2
import java.util.Scanner;
class Main {
  public static void main(String[] args) {

    int qtVideos;
    float prVideos;

    Scanner leia = new Scanner(System.in);

    System.out.println("Digite a quantidade de vídeos na locadora: ");
    qtVideos = leia.nextInt();
    System.out.println("Digite o valor da locação: ");
    prVideos = leia.nextFloat();

    System.out.println("Faturamento Anual: " + faturamentoAnual(qtVideos, prVideos) + " reais.");
    System.out.println("Faturamento Mensal de Multas: " + faturamentoMultas(qtVideos, prVideos) + " reais.");

  }

  public static Float faturamentoAnual(int qtVideos, float prVideos){

  float faturamentoMensal, faturamentoAnual;

  faturamentoMensal = (qtVideos/3) * prVideos;
  faturamentoAnual = faturamentoMensal * 12;

  return faturamentoAnual;

  }

  public static Float faturamentoMultas(int qtVideos, float prVideos){

  int qtVideosAlugados;
  float valorMulta;

  valorMulta = (prVideos * 10) / 100;
  qtVideosAlugados = (qtVideos/3);

  return (qtVideosAlugados/10) * valorMulta;

  }
  
  public static Int reposicaoVideos(int qtVideos){

  int qtEstragados;

  qtEstragados = (qtVideos * 2)/100;

  return (qtVideos - qtEstragados) + (qtVideos/10);

  }
}