package example;

import java.util.HashMap;

public class GuessNumber {
    private int[] answer;
    private static final String ERROR_MESSAGE = "Wrong Input，Input again";

    public GuessNumber(GenerateNumber generateNumber) {
        this.answer = generateNumber.getAnswer();
    }

    public String guess(int[] givenNumber) {
        if(!isInputValid(givenNumber)) {
            return ERROR_MESSAGE;
        }
        int[] result = countAandB(givenNumber);
        return String.format("%dA%dB",result[0], result[1]);

    }

    public int[] countAandB(int[] givenNumber) {
        HashMap<Integer, Integer> answerItemToIndex = new HashMap<>();
        for (int index = 0; index < answer.length; index++) {
            answerItemToIndex.put(answer[index], index);
        }

        int countOfA = 0;
        int countOfB = 0;
        for (int index = 0; index < givenNumber.length; index++) {
            if (answerItemToIndex.containsKey(givenNumber[index])) {
                if (answerItemToIndex.get(givenNumber[index]) == index) {
                    countOfA++;
                } else {
                    countOfB++;
                }
            }
        }
        return new int[] {countOfA, countOfB};
    }

    public boolean isInputValid(int[] givenNumber) {
        if (answer == null || givenNumber == null) {
            return false;
        }

        if (givenNumber.length != answer.length) {
            return false;
        }

        HashMap<Integer, Integer> givenNumberItemToCount = new HashMap<>();
        for (int item : givenNumber) {
            if (givenNumberItemToCount.containsKey((item))) {
                return false;
            }
            givenNumberItemToCount.put(item, 1);
        }
        return true;
    }
}
