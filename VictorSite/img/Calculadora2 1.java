
package calculadora2;

import javax.swing.JOptionPane;

/**
 *
 * @author victor.ramartinez
 */
public class Calculadora2 {

    public static void main(String[] args) {
       double numero;
       double numeroo;
       double resultado;
       String formula;
       
       //perguntar numeros para o usuario
       
       numero = Double.parseDouble(JOptionPane.showInputDialog("digite seu numero:")); 
       numeroo = Double.parseDouble(JOptionPane.showInputDialog("digite seu numero:"));
        
       // mostrar as opç~oes de operações disponiveis na calculadora
     Object[] options = {"soma","subtração","multiplicação","divisão",};
       
       JOptionPane.showOptionDialog(null,"escolha a operação","operacao",JOptionPane.DEFAULT_OPTION,JOptionPane.WARNING_MESSAGE,null,options,options[0]);
   
       
       
     // dar significado para cada tipo de operação
       double soma = (numero+numeroo); 
        double subtração = numero-numeroo;
         double multiplicação = numero*numeroo; 
          double divisão = numero/numeroo;
          
          
          // if para quando o usuario escolher a operação, algo errado 
     
      if (options.equals(soma)){
          resultado = soma;
      }else if (options.equals(subtração)){
          resultado = subtração;
      }else if (options.equals(multiplicação)){
          resultado = multiplicação;
      }else if (options.equals(divisão)){
          resultado = divisão;
      }
       
       //; mostrar o resultado na 

       

       
       
       
       
    }
    
}
