import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int row, column;
        System.out.println("Mayın Tarlasına Hoş Geldiniz ");
        System.out.println("Oynamak İstediğiniz Boyutları Giriniz ");
        System.out.println("Satır Sayısı : ");
        row = scanner.nextInt();
        System.out.println("Sütun Sayısı : ");
        column = scanner.nextInt();

        GameManager gameManager = new GameManager(row, column);
        gameManager.run();
    }
}