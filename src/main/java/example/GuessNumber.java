package example;

import java.util.HashSet;

public class GuessNumber {
    public String guess(int[] answer, int[] givenNumber) {
        HashSet<Integer> hashSet = new HashSet<>();
        for (int item : answer) {
            hashSet.add(item);
        }
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

        if (countCorrectPosition == 0) {
            int countWrongPositionCurrentNumber = 0;
            for (int index = 0; index < givenNumber.length; index++) {
                if (hashSet.contains(givenNumber[index])) {
                    countWrongPositionCurrentNumber++;
                }
            }
            return String.format("0A%dB", countWrongPositionCurrentNumber);
        }
        return null;
    }
}
