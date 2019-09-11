//Exercicio 1
import java.util.Scanner;
class Main {
  public static void main(String[] args) {

    float salario, salarioBr, salarioLq;
    int hora, inss;

    Scanner leia = new Scanner(System.in);
    System.out.println("Digite o valor do salário por hora:");
    salario = leia.nextFloat();
    System.out.println("Digite a quantidade horas trabalhadas no mês:");
    hora = leia.nextInt();
    System.out.println("Digite o valor percentual de desconto do INSS:");
    inss = leia.nextInt();

    salarioBr = salarioBruto(salario, hora);
    salarioLq = salarioLiquido(salarioBr, inss);

    System.out.println("Salário Bruto:" + salarioBr);
    System.out.println("Salário Líquido:" + salarioLq);

  }

  public static Float salarioBruto(float salario, int hora){

  return (salario * hora);

  }

  public static Float salarioLiquido(float salarioBruto, int inss){
  
  float desconto;

  desconto = (salarioBruto * inss)/100;
  
  return salarioBruto - desconto;

  }
}