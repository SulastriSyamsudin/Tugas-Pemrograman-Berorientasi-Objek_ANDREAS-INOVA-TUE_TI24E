class Bank {
    void transferUang(int jumlah, String rekeningTujuan) {
        System.out.println("Transfer Rp" + jumlah + " ke " + rekeningTujuan);
    }

    void transferUang(int jumlah, String rekeningTujuan, String bankTujuan) {
        System.out.println("Transfer Rp" + jumlah + " ke " + rekeningTujuan + " Bank " + bankTujuan);
    }

    void transferUang(int jumlah, String rekeningTujuan, String bankTujuan, String berita) {
        System.out.println("Transfer Rp" + jumlah + " ke " + rekeningTujuan +
                " Bank " + bankTujuan + " | Berita: " + berita);
    }

    void sukuBunga() {
        System.out.println("Suku bunga standar adalah 3%");
    }
}