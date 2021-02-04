package pl.javastart.loteria;

import java.util.List;

public class LoteriaResults {
    private List<Integer> userNumbers;
    private List<Integer> lotteryNumbers;
    private List<Integer> matchedNumbers;

    public LoteriaResults(List<Integer> userNumbers, List<Integer> lotteryNumbers, List<Integer> matchedNumbers) {
        this.userNumbers = userNumbers;
        this.lotteryNumbers = lotteryNumbers;
        this.matchedNumbers = matchedNumbers;
    }
    public List<Integer> getUserNumbers() {
        return userNumbers;
    }

    public void setUserNumbers(List<Integer> userNumbers) {
        this.userNumbers = userNumbers;
    }

    public List<Integer> getLotteryNumbers() {
        return lotteryNumbers;
    }

    public void setLotteryNumbers(List<Integer> lotteryNumbers) {
        this.lotteryNumbers = lotteryNumbers;
    }

    public List<Integer> getMatchedNumbers() {
        return matchedNumbers;
    }

    public void setMatchedNumbers(List<Integer> matchedNumbers) {
        this.matchedNumbers = matchedNumbers;
    }
}
