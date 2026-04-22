package laptop;
class MacBook implements Laptop {
    int volume = 50;
    boolean isOn = false;

    @Override
    public void hidupkan() {
        isOn = true;
        System.out.println("MacBook dinyalakan");
    }

    @Override
    public void matikan() {
        isOn = false;
        System.out.println("MacBook dimatikan");
    }

    @Override
    public void volumeUp() {
        if (isOn) {
            volume += 5;
            System.out.println("Volume MacBook: " + volume);
        } else {
            System.out.println("Laptop masih OFF");
        }
    }

    @Override
    public void volumeDown() {
        if (isOn) {
            volume -= 5;
            System.out.println("Volume MacBook: " + volume);
        } else {
            System.out.println("Laptop masih OFF");
        }
    }
}
