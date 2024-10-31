import java.util.List;

/**
 * Kelas RestaurantOrder digunakan untuk menghitung total biaya pesanan di restoran
 * berdasarkan kuantitas dan harga item dalam pesanan.
 */
public class Main {

    /**
     * Menghitung total biaya berdasarkan kuantitas dan harga item.
     *
     * @param quantities List yang berisi jumlah setiap item yang dipesan
     * @param prices List yang berisi harga per unit untuk setiap item yang dipesan
     * @return Total biaya dari seluruh item dalam pesanan
     * @throws IllegalArgumentException jika ukuran quantities dan prices tidak sama
     */
    public double calculateTotalCost(List<Integer> quantities, List<Double> prices) {
        if (quantities.size() != prices.size()) {
            throw new IllegalArgumentException("Ukuran quantities dan prices harus sama.");
        }

        double total = 0;
        for (int i = 0; i < quantities.size(); i++) {
            total += quantities.get(i) * prices.get(i);

            // Menghitung biaya total per item
        }
        return total;
    }

    private Object get(int i) {
        return null;
    }

    /**
     * Metode utama untuk menjalankan program dan mencetak total biaya dari sebuah pesanan.
     *
     * @param args Argumen baris perintah (tidak digunakan dalam program ini)
     */
    public static void main(String[] args) {
        List<Integer> quantities = List.of(2, 3, 1); // jumlah item pesanan
        List<Double> prices = List.of(10.0, 20.0, 15.0); // harga per item

        Main order = new Main();
        double totalCost = order.calculateTotalCost(quantities, prices);

        System.out.printf("Total biaya pesanan: Rp %.2f%n", totalCost);
    }
}
