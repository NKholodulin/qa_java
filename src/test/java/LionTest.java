import com.example.Feline;
import com.example.Lion;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
//import org.junit.jupiter.params.ParameterizedTest;
//import org.junit.jupiter.params.provider.CsvSource;


public class LionTest {
//   @ParameterizedTest
//   @CsvSource({
//           "Самец, true",
//           "Самка, false",
//           "Инопланетянин, Используйте допустимые значения пола животного - самец или самка"
//   })
    @Test
    public void sexMaleLionTest() throws Exception {
       Lion lion = new Lion("Самец");
       boolean actual = lion.doesHaveMane();
       Assertions.assertTrue(actual);
   }

    @Test
    public void sexFemaleLionTest() throws Exception {
        Lion lion = new Lion("Самка");
        boolean actual = lion.doesHaveMane();
        Assertions.assertFalse(actual);
    }

//    @Test
//    public void sexIncorrectLionTest() throws Exception {
//        Lion lion = new Lion("Инопланетянин");
//        Exception exception = Assertions.assertThrows(Exception.class, () -> lion.doesHaveMane());
////        Assertions.assertTrue(exception.getMessage().contains("Используйте допустимые значения пола животного - самец или самка"));
//    }
    @Test
    public void sexIncorrectLionTest(){
        Exception exception = Assertions.assertThrows(Exception.class, () -> {
           new Lion("Инопланетянин");
        });
        Assertions.assertEquals("Используйте допустимые значения пола животного - самец или самка", exception.getMessage());
    }


    @Test
    public void getKittensLionTest() {
        Feline feline = new Feline();
        Lion lion = new Lion(feline);
        int kittens = lion.getKittens();
        Assertions.assertEquals(1, kittens);
    }

    @Test
    public void getFoodLionTest() throws Exception {
        Feline feline = new Feline();
        Lion lion = new Lion(feline);
        String felineFood = lion.getFood().toString();
        Assertions.assertEquals("[Животные, Птицы, Рыба]", felineFood);
    }

}
