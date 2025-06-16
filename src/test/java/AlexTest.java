import com.example.Alex;
import com.example.Feline;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;

public class AlexTest {
    @Mock
    Feline feline;
    @Test
    public void sexAlexTest() throws Exception {
        Alex alex = new Alex(feline);
        boolean actual = alex.doesHaveMane();
        Assertions.assertTrue(actual);
    }
    @Test
    public void getKittensAlexTest() throws Exception {
        Alex alex = new Alex(feline);
        int actual = alex.getKittens();
        Assertions.assertEquals(0, actual);
    }
    @Test
    public void getFriendsAlexTest() throws Exception {
        Alex alex = new Alex(feline);
        String actual = alex.getFriends().toString();
        Assertions.assertEquals("[Марти, Глория, Мелман]", actual);
    }
    @Test public void getPlaceOfLivingAlexTest() throws Exception {
        Alex alex = new Alex(feline);
        String actual = alex.getPlaceOfLiving();
        Assertions.assertEquals("Нью-Йоркский зоопарк", actual);
    }
}
