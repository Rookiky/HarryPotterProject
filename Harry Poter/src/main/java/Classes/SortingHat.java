package Classes;
import lombok.Getter;
import lombok.Setter;
import java.util.Scanner;

@Getter@Setter

public class SortingHat {

    public static House sortingHat() {
         House house;
         House[] list = House.values();
         int min = 0;
         int max = 4;

         int randomNumber = (int)Math.random() * (max - min + 1) + min;
         house = list[randomNumber];

         return house;
        }
    }
