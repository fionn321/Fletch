abstract class MobileHomeDecorator implements MobileHome {

    protected MobileHome tempMobileHome;

    public MobileHomeDecorator(MobileHome newMobileHome){

        tempMobileHome = newMobileHome;

    }

    public String getDescription(){

        return tempMobileHome.getDescription();

    }

    public int getNumberOfRooms(){

        return tempMobileHome.getNumberOfRooms();

    }
    public int getMaxCapacity(){

        return tempMobileHome.getMaxCapacity();

    }

    public int getNumberOfShowers(){

        return tempMobileHome.getNumberOfShowers();
    }

    public double getCost(){

        return tempMobileHome.getCost();

    }


}
