public class PlatinumTier extends MobileHomeDecorator {

    public PlatinumTier(MobileHome newMobileHome) {
        super(newMobileHome);
    }

    public String getDescription(){
        return "Platinum tier mobile Home" + tempMobileHome.getDescription();
    }

    public double getCost(){
        return tempMobileHome.getCost() + 100;
    }
}
