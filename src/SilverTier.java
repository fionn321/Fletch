public class SilverTier extends MobileHomeDecorator {

    public SilverTier(MobileHome newMobileHome) {
        super(newMobileHome);
    }

    public String getDescription(){
        return "Silver tier mobile Home" + tempMobileHome.getDescription();
    }

    public double getCost(){
        return tempMobileHome.getCost() + 0;
    }
}
