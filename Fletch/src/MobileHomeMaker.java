import java.util.Scanner;

public class MobileHomeMaker {


    public void mobileHomeMaker(){

        Scanner s = new Scanner(System.in);

        MobileHome mobileHome = new BasicMobileHome();
        System.out.println("How many rooms does your mobile home have");
        int numberOfRooms = s.nextInt();
        s.nextLine();

        System.out.println("What tier of accommodation is the mobile home Silver, Gold or Platinum");
        String tier = s.nextLine();
        for(int i = 0; i < 1; i++){

            if(tier.contains("Silver")){
                mobileHome = new SilverTier(mobileHome);
            } else if( tier.contains("Gold")){
                mobileHome = new GoldTier(mobileHome);
            } else if( tier.contains("Platinum")){
                mobileHome = new PlatinumTier(mobileHome);
            } else{
                System.out.println("Input is in the wrong format please enter Silver, Gold or Platinum");
                i--;
            }
        }


        System.out.println("Enter what type of rooms Single, Double, Triple or Quadruple one at a time");
        for(int i = 0; i < numberOfRooms; i++){
            String roomType = s.nextLine();
            if(roomType.contains("Single")){
                mobileHome = new SingleRoom(mobileHome);
            } else if( roomType.contains("Double")){
                mobileHome = new DoubleRoom(mobileHome);
            } else if( roomType.contains("Triple")){
                mobileHome = new TripleRoom(mobileHome);
            } else if( roomType.contains("Quadruple")){
                mobileHome = new QuadrupleRoom(mobileHome);
            } else{
                System.out.println("Input is in the wrong format please enter Single, Double, Triple or Quadruple");
                i--;
            }
        }

        System.out.println("How many bathrooms does the mobile home have");
        int numberOfBathrooms = s.nextInt();
        s.nextLine();
        for(int i = 0; i < numberOfBathrooms; i++){
            mobileHome = new Bathrooms(mobileHome);
        }


        FeatureFactory featureFactory = new FeatureFactory();
        System.out.println("Enter any of the following features the mobile home has access to: 1 Beach");
        String feature = s.nextLine();
        Features listOfFeatures = featureFactory.getFeature(feature);


        System.out.println(mobileHome.getDescription());
        System.out.println("The cost of the stay will be " + mobileHome.getCost());
        System.out.println("Max accommodation is " + mobileHome.getMaxCapacity());
        System.out.println("Number of showers is " + mobileHome.getNumberOfShowers());



        System.out.println("This mobileHome also has the following features " );
        listOfFeatures.description();
    }

}
