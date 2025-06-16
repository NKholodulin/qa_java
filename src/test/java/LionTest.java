import com.example.Feline;
import com.example.Lion;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class LionTest {

    @Test
    public void sexMaleLionTest() throws Exception {
        Feline feline = new Feline();
       Lion lion = new Lion("Самец", feline);
       boolean actual = lion.doesHaveMane();
       Assertions.assertTrue(actual);
   }

    @Test
    public void sexFemaleLionTest() throws Exception {
        Feline feline = new Feline();
        Lion lion = new Lion("Самка", feline);
        boolean actual = lion.doesHaveMane();
        Assertions.assertFalse(actual);
    }

    @Test
    public void sexIncorrectLionTest(){
        Feline feline = new Feline();
        Exception exception = Assertions.assertThrows(Exception.class, () -> {
           new Lion("Инопланетянин", feline);
        });
        Assertions.assertEquals("Используйте допустимые значения пола животного - самец или самка", exception.getMessage());
    }


    @Test
    public void getKittensLionTest() throws Exception {
        Feline feline = new Feline();
        Lion lion = new Lion("Самка", feline);
        int kittens = lion.getKittens();
        Assertions.assertEquals(1, kittens);
    }

    @Test
    public void getFoodLionTest() throws Exception {
        Feline feline = new Feline();
        Lion lion = new Lion("Самка", feline);
        String felineFood = lion.getFood().toString();
        Assertions.assertEquals("[Животные, Птицы, Рыба]", felineFood);
    }

}
