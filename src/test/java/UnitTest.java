import com.mocks.example.Calculator;
import com.mocks.example.Keypad;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;


@ExtendWith({MockitoExtension.class})
public class UnitTest {

    @Mock
    private Calculator calculator;

    @Test
    public void should_perform_addition(){

        Mockito.when(calculator.add(4, 5)).thenCallRealMethod();
        int answer = calculator.add(4, 5);

        Assertions.assertEquals(9, answer);

        Keypad keypad = Mockito.spy(Keypad.class);

        Mockito.when(calculator.getKeypad()).thenReturn(keypad);

        Assertions.assertEquals("Qwerty", calculator.getKeypad().getType());


        Mockito.doCallRealMethod().when(calculator).setName("Calculator");
        calculator.setName("Calculator");

        Mockito.verify(calculator, Mockito.times(1)).setName("Calculator");

        Mockito.when(calculator.getName()).thenReturn("Calculator");

        Assertions.assertEquals("Calculator", calculator.getName());


    }
}
