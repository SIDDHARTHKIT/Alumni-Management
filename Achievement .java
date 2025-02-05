public class Achievement {
    private String alumniName;
    private String achievement;
    private String date;

    public Achievement(String alumniName, String achievement, String date) {
        this.alumniName = alumniName;
        this.achievement = achievement;
        this.date = date;
    }

    public String getAlumniName() {
        return alumniName;
    }

    public String getAchievement() {
        return achievement;
    }

    public String getDate() {
        return date;
    }

    @Override
    public String toString() {
        return alumniName + ", " + achievement + ", " + date;
    }
}

