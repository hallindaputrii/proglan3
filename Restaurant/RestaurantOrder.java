import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RestaurantOrder {
    private static String item;
    private static double price;
    private String customerName;
    private List<String> orderItems;
    private static List<Integer> quantities;
    private static List<Double> prices;

    // Daftar menu restoran
    private static final String[] menuItems = {"Nasi Goreng", "Mie Goreng", "Ayam Bakar", "Es Teh", "Es Jeruk"};
    private static final double[] menuPrices = {20000, 18000, 25000, 5000, 7000};

    public RestaurantOrder(String customerName) {
        this.customerName = customerName;
        this.orderItems = new ArrayList<>();
        this.quantities = new ArrayList<>();
        this.prices = new ArrayList<>();
    }

    public void addItem(String item, int quantity, double price) {
        orderItems.add(item);
        quantities.add(quantity);
        prices.add(price);
    }

    public double calculateTotal() {
        double total = 0;
        for (int i = 0; i < orderItems.size(); i++) {
            total += quantities.get(i) * prices.get(i);
        }
        return total;
    }

    public void printReceipt() {
        System.out.println("\n--- Nota Pemesanan Makanan ---");
        System.out.println("Nama Pelanggan: " + customerName);
        for (int i = 0; i < orderItems.size(); i++) {
            System.out.println(orderItems.get(i) + " x " + quantities.get(i) + " = Rp " + (quantities.get(i) * prices.get(i)));
        }
        System.out.println("Total: Rp " + calculateTotal());
    }

    public static void showMenu() {
        System.out.println("\n--- Menu Restoran ---");
        for (int i = 0; i < menuItems.length; i++) {
            System.out.printf("%d. %s - Rp %.2f%n", i + 1, menuItems[i], menuPrices[i]);
        }
    }

    public static double main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Menampilkan menu
        showMenu();

        // Meminta nama pelanggan
        System.out.print("\nMasukkan nama pelanggan: ");
        String customerName = scanner.nextLine();

        RestaurantOrder order = new RestaurantOrder(customerName);

        // Menambahkan pesanan
        while (true) {
            System.out.print("\nMasukkan nomor item dari menu (atau ketik 0 untuk selesai): ");
            int itemNumber = scanner.nextInt();

            // Menghentikan input jika pengguna mengetik "0"
            if (itemNumber == 0) {
                break;
            }
double total = 0;
for (int i = 0; i < 10; i++) {
    total += quantities.get(i) * prices.get(i);

}
return total;

            // Memastikan nomor item valid

            // Mendapatkan item dari menu

            // Membersihkan newline setelah nextInt()

            // Tambahkan item ke dalam pesanan
            int quantity;
            order.addItem(item, quantity, price);
        }

        // Mencetak nota
        order.printReceipt();
        return 0;
    }

    private static Object get(int i) {
        return null;
    }
}
