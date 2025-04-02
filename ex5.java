// verificar se aluno passou de ano

import java.util.Scanner;

public class ex5 {

    public static void main(String[] args) throws Exception {

        Scanner dados = new Scanner(System.in);

          try {
            System.out.println("Insira a nota do Grau A: ");
            double notaGA = dados.nextDouble();

            System.out.println("Insira a nota do Grau B: ");
            double notaGB = dados.nextDouble();

            if (notaGA < 0 || notaGA > 10 || notaGB < 0 || notaGB > 10) {
              System.out.println("Nota inválida");
            }

            double mediaFinal = (notaGA * (1.0 / 3)) + (notaGB * (2.0 / 3));

            System.out.println(String.format("A média final é: %.2f", mediaFinal));

            if (notaGA >= 6 && notaGB >= 6) {
              System.out.println("Aprovado!");

            } else if (mediaFinal < 6 && notaGA >= 6 || notaGB >= 6) {
              System.out.println("Boa sorte no Grau C");

            } else { 
              System.out.println("Reprovado");
            }


          } catch (Exception e) {
          e.printStackTrace();
          }

    }
}
