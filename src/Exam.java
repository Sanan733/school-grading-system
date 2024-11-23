import java.util.Scanner;

public class  Exam implements Grading {

    @Override
    public void calculateGrade() {

    }
    @Override
    public void showDetails() {
        Scanner scanner = new Scanner(System.in);
        String name= scanner.nextLine();
        System.out.print("Telebenin adi ");
        int score= scanner.nextInt();
        System.out.println("Telebenin scoru ");
    }
}
