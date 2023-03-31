package Classes;
import java.util.Scanner;

enum Pet {
    Owl,
    Cat,
    Rat,
    Toad;

    public static Pet[] petsList = Pet.values();

    public static Pet choosePet() {
        boolean cond = false;
        Pet choice = null;
        do {
            Scanner selectedPet = new Scanner(System.in);
            System.out.println("Young wizard, you will now be allow to choose your company pet:");
            int index = 0;
            for (index = 0; index < petsList.length; index++) {
                System.out.println(petsList[index]);
            }
            String petChoose = selectedPet.nextLine();

            switch (petChoose) {
                case "Owl":
                    choice = Pet.Owl;
                    cond = true;
                    break;
                case "Cat":
                    choice = Pet.Cat;
                    cond = true;
                    break;
                case "Rat":
                    choice = Pet.Rat;
                    cond = true;
                    break;
                case "Toad":
                    choice = Pet.Toad;
                    cond = true;
                    break;
            }
        } while (cond == false);

        return choice;

    }
}
