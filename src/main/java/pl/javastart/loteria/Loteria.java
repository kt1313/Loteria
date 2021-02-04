package pl.javastart.loteria;

import java.util.Collections;
import java.util.List;

public class Loteria {
    List<Integer> chosenNumbers;
    List<Integer> randomNumbers;



    private static List<Integer> getRandomNumbers() {
        int number;
        List<Integer> randomNumbers = null;
        for (int i = 1; i <= 6; i++) {
            number = (int) Math.random() * 48 + 1;
            randomNumbers.add(number);
        }
        return randomNumbers;
    }
//    static List<Integer> getRandomNumbers() {
//        List<Integer> numberList = IntStream.rangeClosed(1, 49)
//                .boxed()
//                .collect(Collectors.toList());
//        Collections.shuffle(numberList);
//        return numberList.subList(0, 6);
//    }

    private static List<Integer> compareNumbers(List<Integer> chosenNumbers, List<Integer> randomNumbers) {
        int matchedNumber = 0;
        List<Integer> matchedNumbers = null;
        for (Integer chosenNumber : chosenNumbers
        ) {
            for (Integer randomNumber : randomNumbers
            ) {
                if (chosenNumber == randomNumber) {
                    matchedNumber++;
                    matchedNumbers.add(chosenNumber);
                }
            }
        }
        return matchedNumbers;
    }
//    static List<Integer> getCommonElements(List<Integer> source, List<Integer> target) {
//        List<Integer> sourceCopy = new ArrayList<>(source);
//        sourceCopy.retainAll(target);
//        return sourceCopy;
//    }
}
