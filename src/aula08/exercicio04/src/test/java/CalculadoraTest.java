import org.example.Classes.Calculadora;
import org.example.Exeptions.DivisaoPorZeroException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CalculadoraTest {
    Calculadora calculadora = new Calculadora();

    @DisplayName("Soma Test")
    @Test
    void somaTest(){
        Assertions.assertEquals(6, calculadora.soma(3,3));
        Assertions.assertEquals(1, calculadora.soma(-5,6));
    }

    @DisplayName("Subtracao Test")
    @Test
    void subtracaoTest(){
        Assertions.assertEquals(0, calculadora.subtrair(3,3));
        Assertions.assertEquals(-11, calculadora.subtrair(-6,5));
    }

    @DisplayName("Multiplicacao Test")
    @Test
    void multiplicacaoTest(){
        Assertions.assertEquals(9, calculadora.multiplicacao(3,3));
        Assertions.assertEquals(0, calculadora.multiplicacao(0,10000));
    }

    @DisplayName("Divisão Test")
    @Test
    void divisaoTest(){
        Assertions.assertThrows(DivisaoPorZeroException.class, () -> calculadora.divisao(5,0));
        Assertions.assertEquals(0, calculadora.divisao(0,10));
        Assertions.assertEquals(5, calculadora.divisao(10,2));
    }


    @DisplayName("Raiz Test")
    @Test
    void raizTest(){
        Assertions.assertEquals(4, calculadora.raiz(16, 2));
        Assertions.assertEquals(5, calculadora.raiz(25,2));
    }

    @DisplayName("Potencia Test")
    @Test
    void potenciaTest(){
        Assertions.assertEquals(64, calculadora.potencia(4, 3));
        Assertions.assertEquals(8, calculadora.potencia(2,3));
    }
}
