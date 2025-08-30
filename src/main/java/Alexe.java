import com.example.Feline;
import com.example.Lion;

import java.util.Arrays;
import java.util.List;


public class Alexe extends Lion {

    public Alexe(Feline feline) throws Exception {
        super("Хищник", feline);

    }

    public List<String> getFriends() {

        return Arrays.asList("Марти", "Глория", "Мелман");
    }

    public String getPlaceOfLiving(){
        return "Нью-Йоркский зоопарк";

    }
@Override
    public int getKittens(){
        return 0;

}


}
