/**
 * 
 * @author Jean Macena
 * @category Education, Development
 * https://instagram.com/inst_jm
 */
public class DesenvolvendoEm {
    /*
    * Variável local
    * - Uma variável declarada dentro do corpo de um método é chamada de variável local. Você consegue usar esta variável apenas dentro do método e outro método na classe não terá conhecimento de que essa variável existe.
    * - Uma variável local não pode ser definida como a palavra reservada "static".
    * 
    * Variável global
    * - Uma variável declarada dentro da classe mas fora do corpo de um método, é chamada variável global. Não é declarada como como static.
    * - É chamada variável global porque seu valor é especifico da instancia e não é compartilhado entre instâncias.
    *
    * Variável estática
    * - Uma variável que é considerada com static é chamada de variável estática. Ela não pode ser local.
    * - Você pode criar uma simples cópia de uma variável estática e compartilhar entre todas as instancias na classe.
    * - A alocação de memória para variáveis estáticas acontece apenas uma vez enquanto a classe é carregada em memória (1:1).
    */

    public static void main(String[] args) {

        // Variáveis do tipo primitivo Inteiro
        byte    varByte   = 8;      // Tamanho de 8  bits, Valor padrão é 0, Domínio de 3 posições
        short   varShort  = 16;     // Tamanho de 16 bits, Valor padrão é 0, Domínio de 5 posições
        int     varInt    = 32;     // Tamanho de 32 bits, Valor padrão é 0, Domínio de 10 posições
        long    varLong   = 64;     // Tamanho de 64 bits, Valor padrão é 0, Domínio de 19 posições

        System.out.println("varByte     " + varByte);
        System.out.println("varShort    " + varShort);
        System.out.println("varInt      " + varInt);
        System.out.println("varLong     " + varLong);
        
        // Variáveis do tipo primitivo com Ponto Flutuante, Reais, Fracionados
        float   varFloat  = 32.0f;  // Tamanho de 32 bits, Valor padrão é 0.0f ou 0.0F, Domínio de 10 posições
        double  varDouble = 64.0;   // Tamanho de 64 bits, Valor padrão é 0.0, Domínio de 19 posições
        
        System.out.println("varFloat    " + varFloat);
        System.out.println("varDouble   " + varDouble);        


        // Range de campos
        byte    varByteWeight  = 99;
        short   varShortWeight = 9999;
        int     varIntWeight   = 999999999;
        long    varLongWeight  = 999999999999999999L;
        
        System.out.println("varByteWeight  " + varByteWeight    + " , 2 colunas positivas");
        System.out.println("varShortWeight " + varShortWeight   + " , 4 colunas positivas");
        System.out.println("varIntWeight   " + varIntWeight     + " , 9 colunas positivas");
        System.out.println("varLongWeight  " + varLongWeight    + " , 18 colunas positivas");

        float   varFloatWeight  = 99999999999999999999999999999999999999.99f;
        double  varDoubleWeight = 99999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999.99;
        
        System.out.println("varFloatWeight   " + varFloatWeight     + " , 41 colunas positivas");
        System.out.println("varDoubleWeight  " + varDoubleWeight    + " , 311 colunas positivas");

        // Cálculo simples
        double varNumberOne = 2.0;
        double varNumberTwo = 25.0;
        double resultCalc = (varNumberOne * varNumberTwo);
        System.out.println("Resultado do Calculo : " + resultCalc);
        
        // Adicao ou Subtracao rapida na variavel
        varNumberTwo = varNumberTwo + 1;
        varNumberTwo += 1;
        varNumberTwo++;
        varNumberTwo--;        
    }

}
