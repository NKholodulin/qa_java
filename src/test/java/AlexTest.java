import com.example.Alex;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AlexTest {
    @Test
    public void sexAlexTest() throws Exception {
        Alex alex = new Alex();
        boolean actual = alex.doesHaveMane();
        Assertions.assertTrue(actual);
    }
    @Test
    public void getKittensAlexTest() throws Exception {
        Alex alex = new Alex();
        int actual = alex.getKittens();
        Assertions.assertEquals(0, actual);
    }
    @Test
    public void getFriendsAlexTest() throws Exception {
        Alex alex = new Alex();
        String actual = alex.getFriends().toString();
        Assertions.assertEquals("[Марти, Глория, Мелман]", actual);
    }
    @Test public void getPlaceOfLivingAlexTest() throws Exception {
        Alex alex = new Alex();
        String actual = alex.getPlaceOfLiving();
        Assertions.assertEquals("Нью-Йоркский зоопарк", actual);
    }
}
