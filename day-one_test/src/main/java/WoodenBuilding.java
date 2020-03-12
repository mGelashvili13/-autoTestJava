public class WoodenBuilding implements BuildingIn {
     int nBars;

    public String name = "изба"; //не усвоила это

    @Override
    public void build() {
        System.out.println("строим из деревянных брусьев");
    }

    @Override
    public void insertWindow() {
        System.out.println("окна из слюды");
    }

    @Override
    public void putTheDoor(int quantity) {
        System.out.println("входная, в комнаты");
        quantity=3;
    }

    @Override
    public void makeCommunications() {
        System.out.println("вода в колодце!");
    }
}
