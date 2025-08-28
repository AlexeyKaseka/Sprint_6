import com.example.Cat;
import com.example.Feline;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class CatTest {
 @Mock
    Feline feline;

 @Test
    public void catSoundTest() {

     Cat cat = new Cat(feline);
     String sound = cat.getSound();
     String expectedSound = "Мяу";
     assertEquals(expectedSound, sound);
 }

 @Test
    public void catFoodTest() throws Exception {
     List<String> predatorFood = Arrays.asList("Животные", "Птицы", "Рыба");
     when(feline.eatMeat()).thenReturn(predatorFood);
     Cat cat = new Cat(feline);
     List<String> actualFood = cat.getFood();
     assertEquals(actualFood, predatorFood);


 }



}
