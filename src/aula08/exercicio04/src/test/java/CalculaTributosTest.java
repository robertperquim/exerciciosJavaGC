import org.example.Classes.CalculaTributos;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CalculaTributosTest {

    CalculaTributos calculaTributos = new CalculaTributos();

    @DisplayName("Calcula Tributos test")
    @Test
    void calculaTributos(){
        Assertions.assertEquals(143.33, calculaTributos.calculaTributos(1,1000,72));
    }

    @DisplayName("Calcula Meses test")
    @Test
    void calculaMeses(){
        Assertions.assertEquals(12, calculaTributos.calculaMeses(1));
    }

    @DisplayName("Calcula juros de cada mes test")
    @Test
    void calculaJurosDeAnosParaMes(){
        Assertions.assertEquals(0.06, calculaTributos.jurosAnualParaMensal(72));
    }

    @DisplayName("Calcula Juros por Mes test")
    @Test
    void calculaJurosPorMes(){
        Assertions.assertEquals(60, calculaTributos.calculaJurosPorMes(1000, 72));
    }

    @DisplayName("Calcula Prestacao Sem Juros")
    @Test
    void calculaPrestacaoSemJuros(){
        Assertions.assertEquals(83.33, calculaTributos.calculaPrestacaoSemJuros(1000, 1));
    }
}
