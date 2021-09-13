package b8_clean_code_and_refactoring.excercise.com.codegym;

public class TennisGame {
    public static final int LOVE = 0;
    public static final int FIFTEEN = 1;
    public static final int THIRTY = 2;
    public static final int FOURTY = 3;

    private static String getStringPlayerScore(String score, int tempScore) {
        switch (tempScore) {
            case LOVE:
                score += "Love";
                break;
            case FIFTEEN:
                score += "Fifteen";
                break;
            case THIRTY:
                score += "Thirty";
                break;
            case FOURTY:
                score += "Forty";
                break;
        }
        return score;
    }

    private static String getStringDeuce(int player1score) {
        String score;
        switch (player1score) {
            case LOVE:
                score = "Love-All";
                break;
            case FIFTEEN:
                score = "Fifteen-All";
                break;
            case THIRTY:
                score = "Thirty-All";
                break;
            case FOURTY:
                score = "Forty-All";
                break;
            default:
                score = "Deuce";
                break;

        }
        return score;
    }
    
    private static String getStringAdvantage(int player1Score, int player2Score) {
        String score;
        int minusResult = player1Score - player2Score;
        if (minusResult == 1) score = "Advantage player1";
        else if (minusResult == -1) score = "Advantage player2";
        else if (minusResult >= 2) score = "Win for player1";
        else score = "Win for player2";
        return score;
    }

    public static String getScore(String player1Name, String player2Name, int player1Score, int player2Score) {
        String score = "";
        int tempScore = 0;
        if (player1Score == player2Score) {
            score = getStringDeuce(player1Score);
        } else if (player1Score >= 4 || player2Score >= 4) {
            score = getStringAdvantage(player1Score, player2Score);
        } else {
            for (int i = 1; i < 3; i++) {
                if (i == 1) {
                    tempScore = player1Score;
                } else {
                    score += "-";
                    tempScore = player2Score;
                }
                score = getStringPlayerScore(score, tempScore);
            }
        }
        return score;
    }
}
