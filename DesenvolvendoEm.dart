/**
 * 
 * @author Jean Macena
 * @category Education, Development
 * https://instagram.com/inst_jm
 */
// https://dart.dev/guides/language/effective-dart
void main() {
  
  // Tipos de Variaveis
  String variavelTexto = "Jean";
  int numero = 1;
  double numeroFracionado = 10.5;
  bool condicao = true;
  var tipoAutomatico =  1;
  dynamic tudoDinamico = "A"; // = "A", 1

  print("
  Texto: (String) $variavelTexto, 
  Número: (int) $numero, 
  Número fracionado: (double) $numeroFracionado, 
  Condicão: (bool) $condicao, 
  VAR: (var) $tipoAutomatico, 
  Dinamica (dynamic): $tudoDinamico
  ");

  // Cálculo simples

  double num1 = 10.0;
  double num2 = 10.0;

  double result = (num1 * num2) - 30;
  print(result);

  num1 = num1 + 15;
  num1 += 15;
  num1++;
  num1--;

  // Comparadores Lógicos
  // >  maior
  // >= maior ou igual
  // <  menor
  // <= menor ou igual
  // == igual
  // != diferente

  bool result;
  int numberOne = 10;
  int numberTwo = 20;

  result = 10 > 20;
  print("O resultado da comparacão de ($numberOne (>) $numberTwo)  é : $result");

  result = 10 >= 20;
  print("O resultado da comparacão de ($numberOne (>=) $numberTwo) é : $result");

  result = 10 < 20;
  print("O resultado da comparacão de ($numberOne (<) $numberTwo)  é : $result");

  result = 10 <= 20;
  print("O resultado da comparacão de ($numberOne (<=) $numberTwo) é : $result");

  result = 10 == 20;
  print("O resultado da comparacão de ($numberOne (==) $numberTwo) é : $result");

  result = 10 != 20;
  print("O resultado da comparacão de ($numberOne (!=) $numberTwo) é : $result");

  // Operador OR (Um ou outro, ou os dois)
  bool testeOr = (false || true);
  print("OR: $testeOr");

  // Operador AND (Ambos os valores devem obter o mesmo resultado)
  // true   true  -> true
  // true   false -> false
  // false  true  -> false
  // false  false -> false
  bool testeAnd = (false && true);
  print("AND: $testeAnd");


  // Operadpr de Negacão !
  print(!true);
  print(!false);
}
