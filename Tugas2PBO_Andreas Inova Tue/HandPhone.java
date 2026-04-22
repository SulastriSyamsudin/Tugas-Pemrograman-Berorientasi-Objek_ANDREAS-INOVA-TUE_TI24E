public class HandPhone {
    String jenis_hp;
    int tahun_pembuatan;

    // method setter (tidak perlu return, jadi pakai void)
    public void setDataHP(String jenis_hp, int tahun_pembuatan) {
        this.jenis_hp = jenis_hp;
        this.tahun_pembuatan = tahun_pembuatan;
    }

    // method getter jenis HP
    String getJenisHP() {
        return jenis_hp;
    }

    // method getter tahun pembuatan
    int getTahunPembuatan() {
        return tahun_pembuatan;
    }

    public static void main(String args[]) {
        HandPhone hp = new HandPhone();

        // isi data (langsung isi nilainya)
        hp.setDataHP("Android", 2022);

        // tampilkan hasil
        System.out.println(hp.getJenisHP());
        System.out.println(hp.getTahunPembuatan());
    }
}