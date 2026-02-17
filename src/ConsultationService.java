public class ConsultationService extends Service
        implements Billable {

    // TODO: constructor
    public ConsultationService(String serviceName, int serviceId) {
        super(serviceName, serviceId);
    }


    @Override
    public void performService() {

        // TODO:
        if (!isActive()) {
            System.out.println("consultation service " + getServiceName() + " is inactive");
            return;
        }

        System.out.println("starting online consultation " + getServiceName());

    }

    @Override
    public void generateBill() {

        // TODO:
        System.out.println("generating consultation bill for service " + getServiceName());
    }

}
