
class Team {

    private String club;
    private String league;
    private int points;

    public Team(String club, String league, int points) {
        this.club = club;
        this.league = league;
        this.points = points;
    }

    public String getClub() {
        return club;
    }

    public void setClub(String club) {
        this.club = club;
    }

    public String getLeague() {
        return league;
    }

    public void setLeague(String league) {
        this.league = league;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        if (points < 0) {

            this.points = 0;
        } else {
            this.points = points;
        }
    }

    public void team_Status() {
        System.out.println(club + " from " + league + "  Current points: " + points);
    }
}

class Club extends Team {

    public String year;

    public Club(String club, String league, int points, String year) {
        super(club, league, points);
        this.year = year;
    }

    @Override
    public void team_Status() {
        System.out.println(getClub() + " from " + getLeague() + "  Current points: " + getPoints() + " Last won title in " + year);
    }
}

// class Match {
//     public void match(Club t1, Club t2) {
//         System.out.println("Upcoming fixture is between " + t1.getClub() + " and " + t2.getClub());
//     }
// }
class KoMatch {

    public void match(Club t1, Club t2) {
        System.out.println("First match of round of 16 is between " + t1.getClub() + " and " + t2.getClub());
    }
}

public class championLeague {

    public static void main(String[] args) {
        Club first_team = new Club("Liverpool", "Premier League", 18, "2019");
        Club second_team = new Club("Paris Saint Germain", "League 1", 17, "**Never won**");

        first_team.team_Status();
        // System.out.println(" ");
        second_team.team_Status();
        // System.out.println(" ");

        KoMatch match1 = new KoMatch();
        match1.match(first_team, second_team);
    }
}
