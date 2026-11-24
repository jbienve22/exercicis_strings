import java.util.Scanner;

void main() {
    Scanner sc = new Scanner(System.in);

    System.out.println("Quina és la capital de França?");
    System.out.println("a) Madrid");
    System.out.println("b) Roma");
    System.out.println("c) Berlín");
    System.out.println("d) París");

    String resposta = sc.nextLine();

    if (resposta.equals("d")) {
        System.out.println("Respuesta correcta!");
    } else if (resposta.equals("a") || resposta.equals("b") || resposta.equals("c")) {
        System.out.println("Respuesta incorrecta, la respuesta correcta es: d");
    } else {
        System.out.println("Respuesta no válida: a, b, c, d");
    }

    sc.close();
}
