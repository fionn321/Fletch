public class FeatureFactory {

    public Features getFeature(String featureType){
        if(featureType == null){
            return null;
        }
        if(featureType.equalsIgnoreCase("BEACH")){
            return new Beach();
        } else if(featureType.equalsIgnoreCase("WASHING")){
            return new Beach();
        } else if(featureType.equalsIgnoreCase("SECENERY")){
            return new Beach();
        }
        return null;
    }
}
