import java.util.Scanner;


public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Välkommen, välj attraktion!");
        System.out.println("1. Cirkarusellen" + "\n" + "2.Flygande mattan" + "\n" + "3.Pumpen" +
                "\n" + "4.Gå hem");

        boolean correctVal = false;
        while (!correctVal) {
            System.out.println("Ange val:");
            String val = scanner.nextLine();
            if (val.equals("1") || val.equals("2") || val.equals("3") || val.equals("4")) {
                correctVal = true;
                break;
            }else{
                System.out.println("Välj från 1 till 4 är du snäll");
                correctVal = false;
            }
        }

    }
}
