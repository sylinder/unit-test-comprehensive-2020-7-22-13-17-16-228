package example;

public class GuessNumber {
    public String guess(int[] answer, int[] givenNumber) {
        int countCorrectPosition = 0;
        for (int index = 0; index < answer.length; index++) {
            if (answer[index] != givenNumber[index]) {
                break;
            }
            countCorrectPosition++;
        }
        if (countCorrectPosition == 4) {
            return "4A0B";
        }
        if (countCorrectPosition == 1) {
            return "1A0B";
        }
        return null;
    }
}
