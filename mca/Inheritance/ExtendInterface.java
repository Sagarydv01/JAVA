interface Sports {
    void setHomeTeam(String name);
    void viewHomeTeam(String name);
}

interface Hockey extends Sports {
    void setHomeScore(int score);
    void viewHomeScore(int score);
    void setTeamName(String team);
    void viewTeamName(String team);    
}

interface Football extends Hockey {
    void setScore(int sc);
    void viewScore(int sc);
}

class Results implements Football {
    private int score;
    private int homeScore;
    private String homeTeam;
    private String teamName;

    public void setScore(int sc) {
        this.score = sc;
    }

    public void viewScore(int sc) {
        System.out.println("Score: " + sc);
    }

    public void setHomeScore(int score) {
        this.homeScore = score;
    }

    public void viewHomeScore(int score) {
        System.out.println("Home Score: " + score);
    }

    public void setTeamName(String team) {
        this.teamName = team;
    }

    public void viewTeamName(String team) {
        System.out.println("Team Name: " + team);
    }

    public void setHomeTeam(String name) {
        this.homeTeam = name;
    }

    public void viewHomeTeam(String name) {
        System.out.println("Home Team: " + name);
    }
}

public class ExtendInterface {
    public static void main(String[] args) {
        Results res1 = new Results();

        res1.setHomeScore(332);
        res1.setHomeTeam("Team X");
        res1.setScore(435);
        res1.viewHomeTeam("Team A");
        res1.viewHomeScore(335);
        res1.viewScore(644);
    }
}
