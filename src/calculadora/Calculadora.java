package calculadora;

/**
 * Classe responsável por realizar operações matemáticas básicas
 * utilizadas pelo aplicativo FinançApp.
 *
 * <p>Versão refatorada: cada operação foi extraída em um método
 * privado próprio, os nomes foram melhorados e as condicionais
 * foram simplificadas com switch expression do Java 17.</p>
 *
 * @author Seu Nome
 * @version 2.0
 * @since 2026
 */
public class Calculadora {

    /**
     * Realiza uma operação matemática básica entre dois números inteiros.
     *
     * @param primeiroOperando  primeiro número da operação
     * @param segundoOperando   segundo número da operação
     * @param operador          operador matemático: "+", "-", "*" ou "/"
     * @return o resultado da operação
     * @throws ArithmeticException      se o operador for "/" e o segundo operando for zero
     * @throws IllegalArgumentException se o operador informado não for suportado
     */
    public int calc(int primeiroOperando, int segundoOperando, String operador) {
        return switch (operador) {
            case "+" -> somar(primeiroOperando, segundoOperando);
            case "-" -> subtrair(primeiroOperando, segundoOperando);
            case "*" -> multiplicar(primeiroOperando, segundoOperando);
            case "/" -> dividir(primeiroOperando, segundoOperando);
            default  -> throw new IllegalArgumentException("Operação inválida: " + operador);
        };
    }

    /**
     * Soma dois números inteiros.
     *
     * @param primeiroOperando primeiro número
     * @param segundoOperando  segundo número
     * @return a soma dos dois números
     */
    private int somar(int primeiroOperando, int segundoOperando) {
        return primeiroOperando + segundoOperando;
    }

    /**
     * Subtrai dois números inteiros.
     *
     * @param primeiroOperando primeiro número
     * @param segundoOperando  segundo número
     * @return a diferença entre os dois números
     */
    private int subtrair(int primeiroOperando, int segundoOperando) {
        return primeiroOperando - segundoOperando;
    }

    /**
     * Multiplica dois números inteiros.
     *
     * @param primeiroOperando primeiro número
     * @param segundoOperando  segundo número
     * @return o produto dos dois números
     */
    private int multiplicar(int primeiroOperando, int segundoOperando) {
        return primeiroOperando * segundoOperando;
    }

    /**
     * Divide dois números inteiros.
     *
     * @param dividendo número a ser dividido
     * @param divisor   número pelo qual o dividendo será dividido
     * @return o quociente da divisão inteira
     * @throws ArithmeticException se o divisor for zero
     */
    private int dividir(int dividendo, int divisor) {
        if (divisor == 0) {
            throw new ArithmeticException("Divisão por zero não é permitida.");
        }
        return dividendo / divisor;
    }
}