public class DoubleRoom extends MobileHomeDecorator {


    public DoubleRoom(MobileHome newMobileHome) {
        super(newMobileHome);
    }

    public String getDescription(){
        return tempMobileHome.getDescription() + "\n Double Room";

    }


    public int getNumberOfRooms(){
        return tempMobileHome.getNumberOfRooms() + 1;

    }
    public int getMaxCapacity(){
        return tempMobileHome.getMaxCapacity() + 2;

    }

    public double getCost(){

        return tempMobileHome.getCost() + 20;

    }
}
