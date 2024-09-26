import java.util.Scanner;
import java.util.Locale;
public class AboutMe {

    public static void main (String[] args) {
        Scanner sacnner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Meu nome é: ");
        String nome = sacnner.next();

        System.out.println("Meu sobrenome é: ");
        String sobrenome = sacnner.next();
 
        System.out.println("Minha idade é: ");
        int idade = sacnner.nextInt();

        System.out.println("Minha altura é: ");
        Double altura = sacnner.nextDouble();

        System.out.println("Minhas cores de olhos são: ");
        String corOlhos = sacnner.next();

        System.out.println("Minhas cores de cabelo são: ");
        String corCabelo = sacnner.next();

        System.out.println("meu nome é "+ nome + " " + sobrenome + ", minha idade é " + idade + ", minha altura é " + altura + 
        ", minhas cores de olhos são " + corOlhos + ", minhas cores de cabelo são " + corCabelo);
    }
}