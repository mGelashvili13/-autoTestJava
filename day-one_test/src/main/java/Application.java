public class Application {
    public static void main(String[] args) {
        System.out.println("Hello");
BuildingIn woodenB=new WoodenBuilding();
BuildingIn brickB=new BrickBuilding();
BuildingIn blockB=new BlockBuilding("xxx");
BrickBuilding home=new BlockBuilding("yyy");
woodenB.build();
brickB.build();
brickB.makeCommunications();
blockB.makeCommunications();
blockB.build();
    }
}
