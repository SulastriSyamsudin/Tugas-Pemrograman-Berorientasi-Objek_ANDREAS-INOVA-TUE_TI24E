package laptop;
    class Toshiba implements Laptop {
    int volume = 50;
    boolean isOn = false;

    @Override
    public void hidupkan() {
        isOn = true;
        System.out.println("Laptop Toshiba dinyalakan");
    }

    @Override
    public void matikan() {
        isOn = false;
        System.out.println("Laptop Toshiba dimatikan");
    }

    @Override
    public void volumeUp() {
        if (isOn) {
            volume += 10;
            System.out.println("Volume Toshiba: " + volume);
        } else {
            System.out.println("Laptop masih OFF");
        }
    }

    @Override
    public void volumeDown() {
        if (isOn) {
            volume -= 10;
            System.out.println("Volume Toshiba: " + volume);
        } else {
            System.out.println("Laptop masih OFF");
        }
    }
}
