package example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class GenerateNumberImplTest {

    @Test
    public void should_return_four_legal_int_number_between_0_and_9() {
        for (int i = 0; i < 100; i++) {
            checkAnswerValid();
        }
    }

    public void checkAnswerValid() {
        GenerateNumber generateNumber = new GenerateNumberImpl();
        int[] answer = generateNumber.getAnswer();
        Set<Integer> set = new HashSet<>();
        boolean isValid = true;
        for (int item : answer) {
            if (item < 0 || item > 9) {
                isValid = false;
            }
            set.add(item);
        }
        Assertions.assertEquals(4, set.size());
        Assertions.assertEquals(true, isValid);
    }
}