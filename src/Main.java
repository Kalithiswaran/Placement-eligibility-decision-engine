import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input candidate details
        String name = scanner.next();
        double percentage = scanner.nextDouble();
        int backlogs = scanner.nextInt();
        int graduationYear = scanner.nextInt();

        // Create Candidate and Job objects
        Candidate candidate = new Candidate(
            name,
            percentage,
            backlogs,
            graduationYear
        );

        Job job = new Job(
            "Infosys",
            "Java Developer",
            65.0,
            0,
            2026
        );

        // Display the details
        System.out.println("Candidate: " + candidate.getName());
        System.out.println("Company: " + job.getCompany());
        System.out.println("Role: " + job.getRole());
        System.out.println("Minimum Percentage: " + job.getMinimumPercentage());
        System.out.println("Maximum Backlogs: " + job.getMaximumBacklogs());
        System.out.println("Required Graduation Year: " + job.getRequiredGraduationYear());

        scanner.close();
    }
}