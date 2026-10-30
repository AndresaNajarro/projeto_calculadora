package calculadora;

/**
 * Classe responsável por realizar operações matemáticas básicas
 * utilizadas pelo aplicativo FinançApp.
 *
 * <p>Esta é a versão inicial do código, antes do processo de refatoração.
 * O comportamento será preservado após a refatoração.</p>
 *
 * @author Seu Nome
 * @version 1.0
 * @since 2026
 */
public class Calculadora {

    /**
     * Realiza uma operação matemática básica entre dois números inteiros.
     *
     * @param a  primeiro operando
     * @param b  segundo operando
     * @param op operador matemático: "+", "-", "*" ou "/"
     * @return o resultado da operação
     * @throws ArithmeticException se houver divisão por zero
     * @throws IllegalArgumentException se o operador for inválido
     */
    public int calc(int a, int b, String op) {
        if (op.equals("+")) {
            return a + b;
        } else if (op.equals("-")) {
            return a - b;
        } else if (op.equals("*")) {
            return a * b;
        } else if (op.equals("/")) {
            if (b == 0) {
                throw new ArithmeticException("Divisao por zero nao permitida.");
            }
            return a / b;
        } else {
            throw new IllegalArgumentException("Operacao invalida: " + op);
        }
    }
}