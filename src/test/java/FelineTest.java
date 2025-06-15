import com.example.Feline;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;


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

//    @Test
//    public void getKittensWithParamsFelineTest(){
//        Feline feline = new Feline();
//        int felineKittens = feline.getKittens(5);
//        Assertions.assertEquals(5, felineKittens);
//    }

    @ParameterizedTest
   @CsvSource({
           "1, 1",
           "999, 999",
           "0, 0",
           "-1, -1",
   })
    public void getKittensParametrizedFelineTest(int count, int expected) throws Exception {
        Feline feline = new Feline();
        int actual = feline.getKittens(count);
        Assertions.assertEquals(expected, actual);
    }
}
