import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the beliefs:");

        String belief1 = getInput(scanner, "1. We believe in serve as the element that can bind MFI into a cohesive excellent organization", "We believe in serve as the element that can bind MFI into a cohesive excellent organization");
        String belief2 = getInput(scanner, "2. We believe that the disadvantaged should be given preferential attention and concern", "We believe that the disadvantaged should be given preferential attention and concern");
        String belief3 = getInput(scanner, "3. We believe that in order to serve our beneficiaries and society best, we have to be an excellent organization", "We believe that in order to serve our beneficiaries and society best, we have to be an excellent organization");
        String belief4 = getInput(scanner, "4. We believe that an excellent organization depends on the people comprising it", "We believe that an excellent organization depends on the people comprising it");
        String belief5 = getInput(scanner, "5. We believe in respecting the rights, enhancing the dignity, and nurturing the personal and professional development of each individual", "We believe in respecting the rights, enhancing the dignity, and nurturing the personal and professional development of each individual");
        String belief6 = getInput(scanner, "6. We believe in managing the resources of MFI prudently and judiciously so it can continue to serve more and better", "We believe in managing the resources of MFI prudently and judiciously so it can continue to serve more and better");
        String belief7 = getInput(scanner, "7. We know that MFI exists to serve the common good", "We know that MFI exists to serve the common good");

        System.out.println("=================\n");
        System.out.println("\nBeliefs:");
        System.out.println("1. " + belief1);
        System.out.println("2. " + belief2);
        System.out.println("3. " + belief3);
        System.out.println("4. " + belief4);
        System.out.println("5. " + belief5);
        System.out.println("6. " + belief6);
        System.out.println("7. " + belief7);
        System.out.println("=================");
    }

    private static String getInput(Scanner scanner, String prompt, String expectedInput) {
        String input;
        do {
            System.out.println(prompt + ": ");
            System.out.print("> ");
            input = scanner.nextLine();
        } while (input.isEmpty() || !input.equals(expectedInput));
    
        return input;
    }
    
}
