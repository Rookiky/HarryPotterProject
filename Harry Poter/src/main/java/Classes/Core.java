package Classes;
import java.lang.Math;

public enum Core {
            Phoenix_Feather,
            Dragon_HeartString,
            Owl_Feather,
            Snake_Body;


            public static Core[] list = Core.values();


            public static Core randomComponent() {
                    Core component = null;
                    int min = 0;
                    int max = 4;

                    int randomNumber = (int)Math.random() * (max - min + 1) + min;
                    component = list[randomNumber];
                    return component;
            }
}


