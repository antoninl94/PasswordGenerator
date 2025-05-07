import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("=================================================");
        System.out.println("   _____                                         ");
        System.out.println("  |  __ \\\\                                       ");
        System.out.println("  | |__) || _____   __                          ");
        System.out.println("  |  ___// / _\\ \\\\  \\ \\\\  \\\\//                           ");
        System.out.println("  | ||    / /__\\ \\\\  \\ \\\\  //                            ");
        System.out.println("  |_||   / /    \\ \\\\  \\ \\\\//                             ");
        System.out.println("=================================================");
        System.out.println("               Password Generator                 ");
        System.out.println("=================================================");
        while (true) {
            Scanner scanner = new Scanner(System.in);
            generator(scanner);
        }
    }

    public static void generator(Scanner scanner) {
        String baseString = "0123456789";
        StringBuilder deco = new StringBuilder("<-----");
        String uppercaseString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lowercaseString = "abcdefghijklmnopqrstuvwxyz";
        String specialString = "!@#$%^&*()-_=+<>?/";
        int length = passwordLength(scanner);
        scanner.nextLine();
        int dif = 16 - length;
        boolean uppercase = uppercaseChar(scanner);
        boolean lowercase = lowercaseChar(scanner);
        boolean special = specialChar(scanner);
        StringBuilder password = new StringBuilder(length);

        if (uppercase) {
            baseString += uppercaseString;
        }
        if (lowercase) {
            baseString += lowercaseString;
        }
        if (special) {
            baseString += specialString;
        }

        for (int x = 0; x < dif; x++) {
            deco.append("-");
        }

        for (int i = 0; i < length; i++) {
            int index = (int)(baseString.length() * Math.random());
            password.append(baseString.charAt(index));
        }
        System.out.println("\n=========================================================");
        System.out.println("\n-----> Voici votre mot de passe : "+password+" "+deco.toString());
        System.out.println("\n=========================================================\n");
    }

    public static int passwordLength(Scanner scanner) {
        // récupère la longueur du mot de passe définie par l'utilisateur
        do {
            // récupère l'input de l'utilisateur
            System.out.print("Définissez le nombre de caractères à inclure dans le mot de passe: ");
            // vérification de l'entrée utilisateur
            int number = scanner.nextInt();
            if (number < 8 || number > 16) {
                System.out.println("\n----- La longueur ne peut être inférieur à 8 et supérieur à 16 -----\n");
            } else {
                return number;
            }
        } while (true);
    }

    public static boolean uppercaseChar(Scanner scanner) {
        // définit les critères de création du mot de passe
        do {
            // définit si l'utilisateur désire des lettres majuscules
            System.out.print("Inclure des lettres majuscules? (oui/non): ");
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("oui")) {
                return true;
            } else if (input.equalsIgnoreCase("non")) {
                return false;
            } else {
                System.out.println("\n----- Veuillez répondre par oui ou par non -----\n");
            }
        } while (true);
    }

    public static boolean lowercaseChar(Scanner scanner) {
    // définit si l'utilisateur désire des lettres minuscules
        do {
            System.out.print("Inclure des lettres minuscules? (oui/non): ");
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("oui")) {
                return true;
            } else if (input.equalsIgnoreCase("non")) {
                return false;
            } else {
                System.out.println("\n------ Veuillez répondre par oui ou par non -----\n");
            }
        } while (true);
    }

    public static boolean specialChar(Scanner scanner) {
        do {
            // définit si l'utilisateur désire des caractères spéciaux
            System.out.print("Inclure des caractères spéciaux? (oui/non): ");
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("oui")) {
                return true;
            } else if (input.equalsIgnoreCase("non")) {
                return false;
            } else {
                System.out.println("\n----- Veuillez répondre par oui ou par non -----\n");
            }
        } while (true);
    }
}
