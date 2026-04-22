import java.util.Scanner;

    public class Main {
    public static void main(String[] args) {
        MacBook laptop;
        
        // pilih jenis laptop (biar lebih fleksibel)
       laptop = new MacBook();

        Scanner input = new Scanner(System.in);
        String perintah;

        System.out.println("=== MENU LAPTOP ===");
        System.out.println("ON | OFF | UP | DOWN | EXIT");

        while (true) {
            System.out.print("Masukkan perintah: ");
            perintah = input.nextLine();

            if (perintah.equalsIgnoreCase("ON")) {
                laptop.hidupkan();
            } else if (perintah.equalsIgnoreCase("OFF")) {
                laptop.matikan();
            } else if (perintah.equalsIgnoreCase("UP")) {
                laptop.volumeUp();
            } else if (perintah.equalsIgnoreCase("DOWN")) {
                laptop.volumeUp();
            } else if (perintah.equalsIgnoreCase("EXIT")) {
                System.out.println("Program selesai");
                break;
            } else {
                System.out.println("Perintah tidak dikenali");
            }
        }

        input.close();
    }   
}

