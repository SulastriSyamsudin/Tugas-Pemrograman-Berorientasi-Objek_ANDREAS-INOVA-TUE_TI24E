public class Main {
    public static void main(String[] args) {

        Bank bank = new Bank();
        bank.transferUang(100000, "123456");
        bank.transferUang(200000, "123456", "BNI");
        bank.transferUang(300000, "123456", "BCA", "Bayar kuliah");
        bank.sukuBunga();

        System.out.println("----------------");

        BankBNI bni = new BankBNI();
        bni.transferUang(150000, "987654", "BNI");
        bni.sukuBunga();

        System.out.println("----------------");

        BankBCA bca = new BankBCA();
        bca.transferUang(250000, "567890", "BCA");
        bca.sukuBunga();

        System.out.println("----------------");

        int biaya = BiayaTransfer.hitungBiaya("BCA");
        System.out.println("Biaya transfer ke BCA: Rp" + biaya);

        System.out.println("Terima kasih sudah menggunakan layanan bank Indonesia");
    }
}