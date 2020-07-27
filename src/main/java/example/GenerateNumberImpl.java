package example;

import java.util.HashSet;
import java.util.Set;

public class GenerateNumberImpl implements GenerateNumber {
    @Override
    public int[] getAnswer() {
        int numberOfAnswer = 4;
        int[] answer = new int[numberOfAnswer];
        int index = 0;
        while (true) {
            int tmp = (int)(Math.random() * 10);
            if (!isContain(answer, tmp)) {
                answer[index++] = tmp;
            }
            if (index == 4)
                break;
        }
        return answer;
    }

    public boolean isContain(int[] answer, int number) {
        for (int item : answer) {
            if (item == number) {
                return true;
            }
        }
        return false;
    }
}
