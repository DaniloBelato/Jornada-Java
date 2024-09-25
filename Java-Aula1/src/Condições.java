public class Condições {

    public static void main(String[] args) throws Exception {
        boolean cruzeiro = true;

        boolean atletico = false;

        if (cruzeiro && atletico) {
            System.out.println("Cruzeiro e Atletico são Grandes");
        } else if (cruzeiro || atletico) {
            System.out.println("Cruzeiro é Grande!!");
        } else {
            System.out.println("Atletico e grande");
        }
}
}

/* 
 * Operadores lógicos
 * && = AND
 * || = OR
 * ! = NOT
 */ 