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

        System.out.println(calculator.getKeypad().getType());

    }
}
