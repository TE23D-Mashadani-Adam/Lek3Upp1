import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Välkommen, välj attraktion!");
        System.out.println("1. Cirkarusellen" + "\n" + "2.Flygande mattan" + "\n" + "3.Pumpen" +
                "\n" + "4.Gå hem");

        String val = "";
        boolean correctVal = false;
        boolean access = false;
        while (!correctVal) {
            System.out.println("Ange val:");
            val = scanner.nextLine();
            if (val.equals("1") || val.equals("2") || val.equals("3") || val.equals("4")) {
                correctVal = true;
                break;
            } else {
                System.out.println("Välj från 1 till 4 är du snäll");
                correctVal = false;
            }
        }

        int ålder = 0;
        int längd = 0;
        int kuponger = 0;

        if (!val.equals("4")) {
            System.out.println("Välj ålder:");
            ålder = scanner.nextInt();
            System.out.println("Välj längd:");
            längd = scanner.nextInt();
            System.out.println("Hur många kuponger har du?:");
            kuponger = scanner.nextInt();
        }

        if (val.equals("1")) {
            access = true;
        } else if (val.equals("2") && ålder > 7 && längd > 139) {
            access = true;
        } else {
            access = false;
        }

        if (access && val.equals("1") && kuponger >= 1) {
            System.out.println("Välkommen till Cirkcarusellen");
        } else if (access && val.equals("2") && kuponger >= 2) {
            System.out.println("Välkommen till flygande mattan");
        } else if (access && val.equals("3") && ålder > 17 && kuponger >= 3) {
            System.out.println("Välkommen till pumpen");
        } else {
            System.out.println("Du uppfyller inte villkoren tyvärr!");
        }

    }
}
