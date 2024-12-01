import java.util.Scanner;
import java.util.Locale;
public class AboutMe {

    public static void main (String[] args) {
        Scanner sacnner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Qual seu nome ?: ");
        String nome = sacnner.next();

        System.out.println("Qual aeu sobrenome ?: ");
        String sobrenome = sacnner.next();
 
        System.out.println("Qual sua idade ?: ");
        int idade = sacnner.nextInt();

        System.out.println("Qual sua altura ?: ");
        Double altura = sacnner.nextDouble();

        System.out.println("Qual sua cor de olhos ?: ");
        String corOlhos = sacnner.next();

        System.out.println("Qual sua cor de cabelo ?: ");
        String corCabelo = sacnner.next();

        System.out.println("meu nome é "+ nome + " " + sobrenome + ", minha idade é " + idade + ", minha altura é " + altura + 
        ", minhas cores de olhos são " + corOlhos + ", minhas cores de cabelo são " + corCabelo);
    }
}