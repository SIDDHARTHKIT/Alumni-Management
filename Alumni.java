public class Alumni {
    private String name;
    private int graduationYear;
    private String email;
    private String achievements;

    public Alumni(String name, int graduationYear, String email, String achievements) {
        this.name = name;
        this.graduationYear = graduationYear;
        this.email = email;
        this.achievements = achievements;
    }

    public String getName() {
        return name;
    }

    public int getGraduationYear() {
        return graduationYear;
    }

    public String getEmail() {
        return email;
    }

    public String getAchievements() {
        return achievements;
    }

    public void setAchievements(String achievements) {
        this.achievements = achievements;
    }

    @Override
    public String toString() {
        return name + ", " + graduationYear + ", " + email + ", " + achievements;
    }
}
