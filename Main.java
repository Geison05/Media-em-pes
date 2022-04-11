import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    //Variavel 
    int numero = 0,
        poleg = 0,
        jarda = 0;
    double milha = 0.0;
  //Entrada 
  System.out.println("Digite um numero em pés : ");
  numero = input.nextInt();
  //Processamento
  poleg = numero *12;
  jarda = numero *3;
  milha = numero *1.760;
  //saida
  System.out.println("Em polegadas fica : "+ poleg);
  System.out.println("Em jarda fica : "+ jarda);
  System.out.println("Em milha fica : "+ milha);

  }
}