package example;

public class GuessNumber {
    public String guess(int[] answer, int[] givenNumber) {
        for (int index = 0; index < answer.length; index++) {
            if (answer[index] != givenNumber[index]) {
                return null;
            }
        }
        return "4A0B";
    }
}
