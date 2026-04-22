class BiayaTransfer {
    static int hitungBiaya(String bankTujuan) {
        if (bankTujuan.equalsIgnoreCase("BNI")) {
            return 3000;
        } else if (bankTujuan.equalsIgnoreCase("BCA")) {
            return 5000;
        } else {
            return 7000;
        }
    }
}