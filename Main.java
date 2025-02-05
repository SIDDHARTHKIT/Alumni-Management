import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AlumniManager alumniManager = new AlumniManager();
        EventManager eventManager = new EventManager();

        while (true) {
            System.out.println("1. Add Alumni");
            System.out.println("2. View Alumni");
            System.out.println("3. Add Event");
            System.out.println("4. View Events");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1: {
                    System.out.print("Enter name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter graduation year: ");
                    int graduationYear = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    System.out.print("Enter email: ");
                    String email = scanner.nextLine();
                    System.out.print("Enter achievements: ");
                    String achievements = scanner.nextLine();

                    try {
                        alumniManager.addAlumni(new Alumni(name, graduationYear, email, achievements));
                    } catch (IOException e) {
                        System.out.println("Error adding alumni.");
                    }
                    break;
                }
                case 2: {
                    try {
                        List<Alumni> alumniList = alumniManager.getAllAlumni();
                        for (Alumni alumni : alumniList) {
                            System.out.println(alumni);
                        }
                    } catch (IOException e) {
                        System.out.println("Error retrieving alumni.");
                    }
                    break;
                }
                case 3: {
                    System.out.print("Enter event name: ");
                    String eventName = scanner.nextLine();
                    System.out.print("Enter event date: ");
                    String eventDate = scanner.nextLine();
                    System.out.print("Enter event description: ");
                    String description = scanner.nextLine();

                    try {
                        eventManager.addEvent(new Event(eventName, eventDate, description));
                    } catch (IOException e) {
                        System.out.println("Error adding event.");
                    }
                    break;
                }
                case 4: {
                    try {
                        List<Event> eventList = eventManager.getAllEvents();
                        for (Event event : eventList) {
                            System.out.println(event);
                        }
                    } catch (IOException e) {
                        System.out.println("Error retrieving events.");
                    }
                    break;
                }
                case 5:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}



