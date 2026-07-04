import java.util.Scanner;

public class Rental {

    public void sewa() {

        try (Scanner input = new Scanner(System.in)) {

            Motor[] motor = {
                new Motor("Vario 160", 150000, "Honda"),
                new Motor("NMAX", 200000, "Yamaha"),
                new Motor("CBR150R", 250000, "Honda")
            };

            System.out.print("Nama Penyewa : ");
            String nama = input.nextLine();

            Pelanggan pelanggan = new Pelanggan(nama);

            System.out.println("\n===== DAFTAR MOTOR =====");
            for (int i = 0; i < motor.length; i++) {
                System.out.println((i + 1) + ".");
                motor[i].tampilkan();
                System.out.println("-------------------------");
            }

            try {

                System.out.print("Pilih Motor (1-3) : ");
                int pilih = input.nextInt();

                if (pilih >= 1 && pilih <= motor.length) {

                    System.out.print("Lama Sewa (Hari) : ");
                    int hari = input.nextInt();

                    int harga = motor[pilih - 1].getHarga();
                    int total = harga * hari;

                    System.out.println("\n===== STRUK PENYEWAAN =====");
                    System.out.println("Nama Penyewa : " + pelanggan.getNama());
                    System.out.println("Motor        : " + motor[pilih - 1].getNama());
                    System.out.println("Harga/Hari   : Rp" + harga);
                    System.out.println("Lama Sewa    : " + hari + " Hari");
                    System.out.println("---------------------------");
                    System.out.println("Total Bayar  : Rp" + total);
                    System.out.println("===========================");

                } else {

                    System.out.println("Pilihan motor tidak tersedia.");

                }

            } catch (Exception e) {

                System.out.println("Input harus berupa angka!");

            }

        }   

    }       

}           