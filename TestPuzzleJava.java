public class TestPuzzleJava {
    public static void main(String[] args) {
        PuzzleJava pj = new PuzzleJava();
        System.out.println(pj.getTenRolls());
        System.out.println(pj.getRandomCharacter(pj.alphabet));
        System.out.println(pj.generatePassword());
    }
}
