import com.example.Feline;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Collections;

@ExtendWith(MockitoExtension.class)
public class FelineTest {

    @Test
    public void getFoodFelineTest() throws Exception {
        Feline feline = new Feline();
        String felineMeat = feline.eatMeat().toString();
        Assertions.assertEquals("[Животные, Птицы, Рыба]", felineMeat);
    }

    @Test
    public void getFamilyFelineTest(){
        Feline feline = new Feline();
        String felineFamily = feline.getFamily();
        Assertions.assertEquals("Кошачьи", felineFamily);
    }

    @Test
    public void getKittensWithoutParamsFelineTest(){
        Feline feline = new Feline();
        int felineKittens = feline.getKittens();
        Assertions.assertEquals(1, felineKittens);
    }

    @Test
    public void getKittensWithParamsFelineTest(){
        Feline feline = new Feline();
        int felineKittens = feline.getKittens(5);
        Assertions.assertEquals(5, felineKittens);
    }

}
