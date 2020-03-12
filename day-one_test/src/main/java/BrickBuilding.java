public class BrickBuilding extends WoodenBuilding {
    @Override
    public void putTheDoor(int quantity) {
        quantity =5;
    }

    @Override
    public void build() {
        super.build();
        System.out.println("из кирпича");
    }

    @Override
    public void makeCommunications() {
        System.out.println("туалет в доме. Ура");
    }
}
