public class Bathrooms extends MobileHomeDecorator {

    public Bathrooms(MobileHome newMobileHome) {
        super(newMobileHome);
    }

    public String getDescription(){
        return "Description of Silver tier mobile Home " + tempMobileHome.getDescription();
    }

    public int getNumberOfShowers(){
        return tempMobileHome.getNumberOfShowers() + 1;
    }
}
