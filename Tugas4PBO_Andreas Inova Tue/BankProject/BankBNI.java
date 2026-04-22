class BankBNI extends Bank {
    @Override
    void sukuBunga() {
        System.out.println("Suku bunga BNI adalah 4%");
    }

    @Override
    void transferUang(int jumlah, String rekeningTujuan, String bankTujuan) {
        System.out.println("Transfer Rp" + jumlah + " ke " + rekeningTujuan + " Bank BNI");
    }
}