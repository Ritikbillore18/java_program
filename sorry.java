 import java.util.Scanner;

public class Sorry {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your girlfriend's name: ");
        String name = sc.nextLine();
        
        String apologyMessage = "Dear " + name + ",\n\n" +
                                "I am really sorry for what happened. You are a lovely and beautiful person, " +
                                "and I deeply regret any pain or disappointment I may have caused you. " +
                                "Please forgive me. I value our relationship so much and will do my best " +
                                "to make things right.\n\n" +
                                "With all my love,\n Ritik";
        
        System.out.println("================================");
        System.out.println(apologyMessage);
        System.out.println("================================");
    }
}
