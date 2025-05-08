import java.util.Scanner;

public class PGen {
    public static void main(String[] args) {
        System.out.println("=================================================================  ");
        System.out.println("     _____               ______      _______   ______    ___       ");
        System.out.println("    |  __ \\\\            /____//     ||_____//  | | \\ \\  | | |  ");
        System.out.println("    | |__) ||  _____   /// ____     |||____    | | |\\ \\ | | |    ");
        System.out.println("    |  ___//  /__/_/  |||  \\__\\\\\\   ||___||    | | | \\ \\| | |");
        System.out.println("    | ||              \\\\\\      |||  |||____    | | |  \\ \\ | | ");
        System.out.println("    |_||               \\\\\\____///   ||_____\\\\  |_|/    \\__|_/");
        System.out.println();
        System.out.println("=================================================================  ");
        System.out.println("                      Password Generator                           ");
        System.out.println("=================================================================  ");
        System.out.println();
        System.out.println("Bienvenue sur P-Gen,\nCeci est un générateur de mot de passe aléatoire.\n");
        System.out.println("Pour l'utiliser c'est très simple, laissez vous guider.");
        System.out.println("Cela ne prend que quelques secondes !");
        System.out.println();
        System.out.println("A tout moment, tapez 'quit' pour quitter ce programme.");
        System.out.println();
        System.out.println("-----------------------------------------------------------------");
        System.out.println();
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
            System.out.print("Définissez le nombre de caractères à inclure dans le mot de passe: ");
            String input = scanner.nextLine();

            // quitte le programme proprement
            if (input.equalsIgnoreCase("quit")) {
                System.out.println("\n----- Au revoir ! -----\n");
                System.exit(0);
            }

            try {
                int number = Integer.parseInt(input);

                if (number < 8 || number > 16) {
                    System.out.println("\n----- La longueur ne peut être inférieure à 8 et supérieure à 16 -----\n");
                } else {
                    return number;
                }
            } catch (NumberFormatException e) {
                System.out.println("\n----- Veuillez entrer un nombre valide -----\n");
            }
        } while (true);
    }

    public static boolean uppercaseChar(Scanner scanner) {
        // définit les critères de création du mot de passe
        do {
            // définit si l'utilisateur désire des lettres majuscules
            System.out.print("Inclure des lettres majuscules? (oui/non): ");
            String input = scanner.nextLine();

            // quitte le programme proprement
            if (input.equalsIgnoreCase("quit")) {
                System.out.println("Au revoir !");
                System.exit(0);
            }

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

            // quitte le programme proprement
            if (input.equalsIgnoreCase("quit")) {
                System.out.println("Au revoir !");
                System.exit(0);
            }
            
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
            
            // quitte le programme proprement
            if (input.equalsIgnoreCase("quit")) {
                System.out.println("Au revoir !");
                System.exit(0);
            }

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
