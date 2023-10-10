import org.example.Classes.OperacaoNumero;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class OperacaoNumerosTest {

    OperacaoNumero operacaoNumero = new OperacaoNumero();

    @DisplayName("Metodo 1")
    @Test
    void metodo1 (){
        int[] array  = {1,2,3,4,10};
        Assertions.assertEquals(20, operacaoNumero.somarNumeros(array));
    }

    @DisplayName("Metodo 2")
    @Test
    void metodo2 (){
        Assertions.assertTrue(operacaoNumero.ehPar(10));
        Assertions.assertFalse(operacaoNumero.ehPar(5));
    }

    @DisplayName("Metodo 3")
    @Test
    void metodo3 (){

        Assertions.assertThrows(IllegalArgumentException.class, () -> operacaoNumero.calcularFatorial(-5));

        Assertions.assertEquals(1, operacaoNumero.calcularFatorial(0));
        Assertions.assertEquals(1, operacaoNumero.calcularFatorial(1));
        Assertions.assertEquals(120, operacaoNumero.calcularFatorial(5));

    }

    @DisplayName("Metodo 4")
    @Test
    void metodo4 (){

        Assertions.assertTrue(operacaoNumero.ehPalindromo("ANA"));
        Assertions.assertFalse(operacaoNumero.ehPalindromo("Amo java"));
    }

    @DisplayName("Metodo 5")
    @Test
    void metodo5 (){
        Assertions.assertThrows(IllegalArgumentException.class, () -> operacaoNumero.calcularFatorial(-1));

        Assertions.assertEquals(0, operacaoNumero.calcularFibonacci(0));
        Assertions.assertEquals(1, operacaoNumero.calcularFibonacci(1));
        Assertions.assertEquals(55, operacaoNumero.calcularFibonacci(10));
    }

}
