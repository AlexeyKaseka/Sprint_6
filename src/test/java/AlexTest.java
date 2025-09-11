import com.example.Alex;
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
public class AlexTest {

    @Mock
    Feline feline;

    @Test
    public void alexFriendsListTest() throws Exception {

        Alex alex = new Alex(feline);
        List<String> expectedFriends = Arrays.asList("Марти", "Глория", "Мелман");
        List<String> actualFriends = alex.getFriends();
        assertEquals(expectedFriends, actualFriends);
    }

    @Test
    public void alexPlaceOfLivingTest() throws Exception {
        Alex alex = new Alex(feline);
        String expectedPlace = "Нью-Йоркский зоопарк";
        String actualPlace = alex.getPlaceOfLiving();
        assertEquals(expectedPlace, actualPlace);

    }

    @Test
    public void alexKittensTest() throws Exception {
        Alex alex = new Alex(feline);
        int expectedKittens = 0;
        int actualKittens = alex.getKittens();
        assertEquals(expectedKittens, actualKittens);
    }

    @Test
    public void alexFoodTest() throws Exception {
        Alex alex = new Alex(feline);
        List<String> expectedFood = Arrays.asList("Животные", "Птицы", "Рыба");
        when(feline.getFood("Хищник")).thenReturn(expectedFood);
        List<String> actualFood = alex.getFood();
        assertEquals(expectedFood, actualFood);

    }

    @Test
    public void alexHaveManeTest() throws Exception {
        Alex alex = new Alex(feline);
        boolean expectedMane = true;
        boolean actualMane = alex.doesHaveMane();
        assertEquals(expectedMane, actualMane);

    }
}
