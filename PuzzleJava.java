import java.util.ArrayList;
import java.util.Random;

public class PuzzleJava {
    Random rand = new Random();
    char[] alphabet = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};

    ArrayList<Integer> getTenRolls() {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) arr.add(rand.nextInt(20) + 1);
        return arr;
    }

    char getRandomCharacter(char[] alphabet) {
        return alphabet[rand.nextInt(alphabet.length)];
    }

    String generatePassword() {
        String password = "";
        for (int i = 0; i < 8; i++) {
            password += getRandomCharacter(alphabet);
        }
        return password;
    }


}
