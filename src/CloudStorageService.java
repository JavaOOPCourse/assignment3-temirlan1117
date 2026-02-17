public class CloudStorageService extends Service
        implements PremiumFeature, Billable {

    // TODO: declare premium field
    boolean premium;

    // TODO: constructor
    public CloudStorageService(String serviceName, int serviceId) {
        super(serviceName, serviceId);
        this.premium = false;
    }

    @Override
    public void performService() {

        // TODO:
        if (!isActive()) {
            System.out.println("cloud service " + getServiceName() + " is inactive");
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

    @Override
    public void generateBill() {

        // TODO:
        System.out.println("generating cloud bill for service " + getServiceName() );
    }
}