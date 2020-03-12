public class BlockBuilding extends BrickBuilding {
    private void elevator(){}
    private void escalator(int n){
        n=4;
    }
public String signaling="sistem";
    public BlockBuilding(String signaling){ //не отложилось в голове что сделали
        this.signaling= signaling;
    }

    private void ventilation(){}



    @Override
    public void makeCommunications() {
         ventilation();
         elevator();
    }

    @Override
    public void build() {
        super.build();
        System.out.println("строим из бетонных блоков");
        System.out.println("небоскребы");
    }
}
