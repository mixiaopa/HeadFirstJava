package ChapterFive;

public class SimpleDotComTestDrive {
    public static void main(String[] args) {
        SimpleDotCom simpleDotCom = new SimpleDotCom();

        int[] locations = {2, 3, 4};
        simpleDotCom.setLocationCells(locations);

        String userGuess = "2";
        String result = simpleDotCom.checkYourself(userGuess);
        String testResult = "failed";

        if ("hit".equals(testResult)) {
            testResult = "passed";
        }
        System.out.println(testResult);
    }
}
