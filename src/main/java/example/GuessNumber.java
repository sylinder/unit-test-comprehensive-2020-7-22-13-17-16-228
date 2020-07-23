package example;

import java.util.HashMap;

public class GuessNumber {
    public String guess(int[] answer, int[] givenNumber) {

        if (givenNumber.length != answer.length) {
            return "Wrong Input，Input again";
        }

        HashMap<Integer, Integer> givenNumberItemToCount = new HashMap<>();
        for (int item : givenNumber) {
            givenNumberItemToCount.put(item, givenNumberItemToCount.getOrDefault(item, 0) + 1);
        }
        for (int item : givenNumberItemToCount.keySet()) {
            if (givenNumberItemToCount.get(item) > 1) {
                return "Wrong Input，Input again";
            }
        }

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
