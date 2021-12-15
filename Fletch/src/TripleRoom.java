public class TripleRoom extends MobileHomeDecorator {


    public TripleRoom(MobileHome newMobileHome) {
        super(newMobileHome);
    }

    public String getDescription(){


        return tempMobileHome.getDescription() + " has " + getNumberOfRooms() + " rooms";

    }


    public int getNumberOfRooms(){
        return tempMobileHome.getNumberOfRooms() + 1;

    }
    public int getMaxCapacity(){
        return tempMobileHome.getMaxCapacity() + 3;

    }

    public double getCost(){

        return tempMobileHome.getCost() + 25;

    }
}
