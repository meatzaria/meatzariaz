
package manipulação;

import java.util.Scanner;

/**
 *
 * @author victor.ramartinez
 */
public class Manipulação {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String nome;

  Scanner entrada = new Scanner(System.in);
    System.out.println("digite um nome: ");
    nome= entrada.nextLine();

        System.out.println("a palavras tem "+nome.length()+ " caracteres"); // numero de caracteres 
        System.out.println("numero de digitos: "+nome.trim().length());  //numero de digitos
        
        
System.out.println("o nome inicia com Sen: "+ nome.toUpperCase().startsWith("SEN"));    // se começa com Sen
System.out.println("o nome inicia com Nac: "+ nome.toUpperCase() .endsWith("NAC"));     // se termina com Nac
System.out.println("vogais:");           // vogais

        System.out.println("tudo em maiusculo!: "+nome.toUpperCase());
        
    }
    
}
