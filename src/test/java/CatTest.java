import com.example.Cat;
import com.example.Feline;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Collections;

@ExtendWith(MockitoExtension.class)
public class CatTest {

    @Mock
    Feline feline;

    @Test
    public void getSoundCatTest(){
        Cat cat = new Cat(feline);
        String catSound = cat.getSound();
        Assertions.assertEquals("Мяу", catSound);
    }

    @Test
    public void getFoodCatTest() throws Exception {
        Cat cat = new Cat(feline);
        Mockito.when(cat.getFood()).thenReturn(Collections.singletonList("Хищник"));
        String catFood = cat.getFood().get(0);
        Assertions.assertEquals("Хищник", catFood);
    }
}
