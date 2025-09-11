import com.example.Feline;
import com.example.Lion;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import static org.junit.Assert.assertEquals;



@RunWith(Parameterized.class)
public class LionParameterizedTest {
    private final String sex;
    private final boolean expectedHaveMane;

    @Mock
    Feline feline;

    public LionParameterizedTest(String sex, boolean expectedHaveMane) {
        this.sex = sex;
        this.expectedHaveMane = expectedHaveMane;

    }

@Before
public void init() {
    MockitoAnnotations.initMocks(this);
}


    @Parameterized.Parameters(name = "Пол: {0}, Грива: {1}")
    public static Object[][] data() {
        return new Object[][]{
                {"Самец", true},
                {"Самка", false}
        };
    }

    @Test
    public void lionHaveManeTest() throws Exception {
        Lion lion = new Lion(sex, feline);
        boolean actualHaveMane = lion.doesHaveMane();
        assertEquals(expectedHaveMane, actualHaveMane);
    }


}
