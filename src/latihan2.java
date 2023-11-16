import java.util.Scanner;

public class latihan2 {
    private static String text = "";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int choice;
        do {
            System.out.println("=== MENU TEKS ANALYZER ===");
            System.out.println("1. Masukkan Teks");
            System.out.println("2. Hitung Jumlah Karakter");
            System.out.println("3. Hitung Jumlah Kata");
            System.out.println("4. Cari Kata dalam Teks");
            System.out.println("5. Keluar");
            System.out.print("Pilihan Anda: ");

            choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline character

            switch (choice) {
                case 1:
                    inputText(scanner);
                    break;
                case 2:
                    countCharacters();
                    break;
                case 3:
                    countWords();
                    break;
                case 4:
                    searchWord(scanner);
                    break;
                case 5:
                    System.out.println("Terima kasih telah menggunakan program Teks Analisis!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan pilih kembali.");
            }
        } while (choice != 5);

        scanner.close();
    }

    private static void inputText(Scanner scanner) {
        System.out.print("Masukkan teks: ");
        text = scanner.nextLine();
        System.out.println("Teks telah dimasukkan!\n");
    }

    private static void countCharacters() {
        System.out.println("Jumlah karakter dalam teks: " + text.length() + "\n");
    }

    private static void countWords() {
        String[] words = text.split("\\s+");
        System.out.println("Jumlah kata dalam teks: " + words.length + "\n");
    }

    private static void searchWord(Scanner scanner) {
        System.out.print("Masukkan kata yang ingin dicari: ");
        String searchWord = scanner.nextLine();

        String[] words = text.split("\\s+");
        int count = 0;
        for (String word : words) {
            if (word.equalsIgnoreCase(searchWord)) {
                count++;
            }
        }

        System.out.println("Kata '" + searchWord + "' ditemukan sebanyak " + count + " kali dalam teks.\n");
    }
}
