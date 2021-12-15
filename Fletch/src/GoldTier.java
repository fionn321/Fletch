public class GoldTier extends MobileHomeDecorator {

    public GoldTier(MobileHome newMobileHome) {
        super(newMobileHome);
    }

    public String getDescription(){
        return "Gold tier mobile Home" + tempMobileHome.getDescription();
    }

    public double getCost(){
        return tempMobileHome.getCost() + 40;
    }
}
