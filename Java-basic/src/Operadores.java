public class Operadores {

    public static void main(String[] args) throws Exception {
        String meuNome ="Danilo";
        String meuSobrenome = new String("Belato");
        System.out.println(meuNome.equals(meuSobrenome)); //FALSE
        System.out.println(meuNome.equals(meuNome)); //TRUE
    
}
}

 /* .equals() é utilizado para comparar o conteúdo de duas strings, ou seja, verificar 
 se os valores que essas strings armazenam são iguais. Diferente do operador ==, que compara
  se dois objetos ocupam o mesmo espaço na memória, o .equals() verifica se o conteúdo de duas 
  strings é idêntico, mesmo que estejam armazenadas em locais diferentes.  */