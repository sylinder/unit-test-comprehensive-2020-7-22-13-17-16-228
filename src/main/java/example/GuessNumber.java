package example;

import java.util.HashMap;
import java.util.HashSet;

public class GuessNumber {
    public String guess(int[] answer, int[] givenNumber) {
        HashMap<Integer, Integer> answerItemToIndex = new HashMap<>();
        for (int index = 0; index < answer.length; index++) {
            answerItemToIndex.put(answer[index], index);
        }


        int countCorrectPosition = 0;
        for (int index = 0; index < answer.length; index++) {
            if (answer[index] == givenNumber[index]) {
                countCorrectPosition++;
            }
        }



        if (countCorrectPosition == 4) {
            return "4A0B";
        }

        int newCountCorrectPosition = 0;
        int newWrongPositionCorrectNumber = 0;
        for (int index = 0; index < givenNumber.length; index++) {
            int tmp = givenNumber[index];
            if (answerItemToIndex.containsKey(tmp)) {
                if (answerItemToIndex.get(tmp) == index) {
                    newCountCorrectPosition++;
                } else {
                    newWrongPositionCorrectNumber++;
                }
            }
        }
        return String.format("%dA%dB",newCountCorrectPosition, newWrongPositionCorrectNumber);

//        if (countCorrectPosition == 1) {
//            int countWrongPositionCurrentNumber = 0;
//            for (int item : givenNumber) {
//                if (answerItemToIndex.containsKey(item)) {
//                    countWrongPositionCurrentNumber++;
//                }
//            }
//            return String.format("1A%dB",countWrongPositionCurrentNumber);
//        }

//        if (countCorrectPosition == 0) {
//            int countWrongPositionCurrentNumber = 0;
//            for (int index = 0; index < givenNumber.length; index++) {
//                if (answerItemToIndex.containsKey(givenNumber[index])) {
//                    countWrongPositionCurrentNumber++;
//                }
//            }
//            return String.format("0A%dB", countWrongPositionCurrentNumber);
//        }
//        return null;
    }
}
