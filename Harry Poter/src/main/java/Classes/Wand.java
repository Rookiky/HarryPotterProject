package Classes;
import lombok.Getter;
import lombok.Setter;
import java.util.Scanner;

@Getter@Setter

public class Wand {
    public Core core;
    int size;


    public Wand(int size, Core core) {
        this.size = size;
    }



    public static int size() {
        int min = 15;
        int max = 25;
        int wandSize = (int) (Math.random() * (max - min + 1)) + min;
        return wandSize;
    }



}
