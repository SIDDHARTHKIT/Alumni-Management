import java.io.IOException;
import java.util.*;

public class AlumniManager {
    private static final String CSV_FILE = "Alumni.csv";

    public void addAlumni(Alumni alumni) throws IOException {
        List<String[]> alumniData = CSVUtil.readCSV(CSV_FILE);
        alumniData.add(new String[] { alumni.getName(), String.valueOf(alumni.getGraduationYear()), alumni.getEmail(),
                alumni.getAchievements() });
        CSVUtil.writeCSV(CSV_FILE, alumniData);
    }

    public List<Alumni> getAllAlumni() throws IOException {
        List<Alumni> alumniList = new ArrayList<>();
        List<String[]> data = CSVUtil.readCSV(CSV_FILE);
        for (String[] row : data) {
            alumniList.add(new Alumni(row[0], Integer.parseInt(row[1]), row[2], row[3]));
        }
        return alumniList;
    }
}
