package example;

import java.util.HashMap;

public class GuessNumber {
    public String guess(int[] answer, int[] givenNumber) {
        HashMap<Integer, Integer> answerItemToIndex = new HashMap<>();
        for (int index = 0; index < answer.length; index++) {
            answerItemToIndex.put(answer[index], index);
        }

        int countCorrectPosition = 0;
        int wrongPositionCorrectNumber = 0;
        for (int index = 0; index < givenNumber.length; index++) {
            if (answerItemToIndex.containsKey(givenNumber[index])) {
                if (answerItemToIndex.get(givenNumber[index]) == index) {
                    countCorrectPosition++;
                } else {
                    wrongPositionCorrectNumber++;
                }
            }
        }
        return String.format("%dA%dB",countCorrectPosition, wrongPositionCorrectNumber);

    }
}
