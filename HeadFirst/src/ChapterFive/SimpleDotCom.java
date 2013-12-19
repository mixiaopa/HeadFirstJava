package ChapterFive;

public class SimpleDotCom {
    private int[] locationCells;
    private int numsOfHits;

    public void setLocationCells(int[] locationCells) {
        this.locationCells = locationCells;
    }

    public String checkYourself(String userGuess) {
        int guess = Integer.parseInt(userGuess);
        String result = "miss";

        for (int cell : locationCells) {
            if (guess == cell) {
                result = "hit";
                numsOfHits++;
                break;
            }
        }

        if (numsOfHits == locationCells.length) {
            result = "kill";
        }
        System.out.println(result);
        return result;
    }
}
