public class StreamingService extends Service
        implements PremiumFeature {

    // TODO: declare premium field
    boolean premium;

    // TODO: constructor
    public  StreamingService(String serviceName, int serviceId) {
        super(serviceName, serviceId);
        this.premium = false;
    }
    @Override
    public void performService() {

        // TODO:
        // check if service is active
        // print different message for premium and normal
        if (!isActive()) {
            System.out.println("service is inactive");
            return;
        }

        if (premium) {
            System.out.println("service in premium mode.");
        } else {
            System.out.println("service in normal mode.");
        }
    }



    @Override
    public void upgradeToPremium() {

        // TODO:
        if (!premium) {
            premium = true;
            System.out.println(getServiceName() + " upgraded to premium.");
        } else {
            System.out.println(getServiceName() + " is already premium.");
        }


    }
}