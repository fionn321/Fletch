public class SingleRoom extends MobileHomeDecorator {


    public SingleRoom(MobileHome newMobileHome) {
        super(newMobileHome);
    }

    public String getDescription(){
        return tempMobileHome.getDescription() + "\n Single Room";

    }


    public int getNumberOfRooms(){
        return tempMobileHome.getNumberOfRooms() + 1;

    }
    public int getMaxCapacity(){
        return tempMobileHome.getMaxCapacity() + 1;

    }

    public double getCost(){

        return tempMobileHome.getCost() + 10;

    }
}
