package example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class GuessNumberTest {

    @Test
    public void should_return_4A0B_when_guess_given_1234() {
        int[] answer = {1, 2, 3, 4};
        int[] givenNumber = {1, 2, 3, 4};
        GenerateNumber generateNumber = mock(GenerateNumber.class);
        when(generateNumber.getAnswer()).thenReturn(answer);
        GuessNumber guessNumber = new GuessNumber(generateNumber);
        String result = guessNumber.guess(givenNumber);
        Assertions.assertEquals("4A0B", result);
    }

    @Test
    public void should_return_1A0B_when_guess_given_1567() {
        int[] answer = {1, 2, 3, 4};
        int[] givenNumber = {1, 5, 6, 7};
        GenerateNumber generateNumber = mock(GenerateNumber.class);
        when(generateNumber.getAnswer()).thenReturn(answer);
        GuessNumber guessNumber = new GuessNumber(generateNumber);
        String result = guessNumber.guess(givenNumber);
        Assertions.assertEquals("1A0B", result);
    }

    @Test
    public void should_return_0A2B_when_guess_given_2478() {
        int[] answer = {1, 2, 3, 4};
        int[] givenNumber = {2, 4, 7, 8};
        GenerateNumber generateNumber = mock(GenerateNumber.class);
        when(generateNumber.getAnswer()).thenReturn(answer);
        GuessNumber guessNumber = new GuessNumber(generateNumber);
        String result = guessNumber.guess(givenNumber);
        Assertions.assertEquals("0A2B", result);
    }

    @Test
    public void should_return_1A2B_when_guess_given_0324() {
        int[] answer = {1, 2, 3, 4};
        int[] givenNumber = {0, 3, 2, 4};
        GenerateNumber generateNumber = mock(GenerateNumber.class);
        when(generateNumber.getAnswer()).thenReturn(answer);
        GuessNumber guessNumber = new GuessNumber(generateNumber);
        String result = guessNumber.guess(givenNumber);
        Assertions.assertEquals("1A2B", result);
    }

    @Test
    public void should_return_0A0B_when_guess_given_5678() {
        int[] answer = {1, 2, 3, 4};
        int[] givenNumber = {5, 6, 7, 8};
        GenerateNumber generateNumber = mock(GenerateNumber.class);
        when(generateNumber.getAnswer()).thenReturn(answer);
        GuessNumber guessNumber = new GuessNumber(generateNumber);
        String result = guessNumber.guess(givenNumber);
        Assertions.assertEquals("0A0B", result);
    }

    @Test
    public void should_return_0A4B_when_guess_given_4321() {
        int[] answer = {1, 2, 3, 4};
        int[] givenNumber = {4, 3, 2, 1};
        GenerateNumber generateNumber = mock(GenerateNumber.class);
        when(generateNumber.getAnswer()).thenReturn(answer);
        GuessNumber guessNumber = new GuessNumber(generateNumber);
        String result = guessNumber.guess(givenNumber);
        Assertions.assertEquals("0A4B", result);
    }


    @Test
    public void should_return_wrong_input_when_guess_given_1123() {
        int[] answer = {1, 2, 3, 4};
        int[] givenNumber = {1, 1, 2, 3};
        GenerateNumber generateNumber = mock(GenerateNumber.class);
        when(generateNumber.getAnswer()).thenReturn(answer);
        GuessNumber guessNumber = new GuessNumber(generateNumber);
        String result = guessNumber.guess(givenNumber);
        Assertions.assertEquals("Wrong Input，Input again", result);
    }

    @Test
    public void should_return_wrong_input_when_guess_given_12() {
        int[] answer = {1, 2, 3, 4};
        int[] givenNumber = {1,2};
        GenerateNumber generateNumber = mock(GenerateNumber.class);
        when(generateNumber.getAnswer()).thenReturn(answer);
        GuessNumber guessNumber = new GuessNumber(generateNumber);
        String result = guessNumber.guess(givenNumber);
        Assertions.assertEquals("Wrong Input，Input again", result);
    }
}