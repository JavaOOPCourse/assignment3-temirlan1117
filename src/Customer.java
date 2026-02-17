public class Customer extends User {

    // TODO: constructor
    public Customer(String name, int id){
        super(name,id);
    }

    @Override
    public void manageService(Service s) {

        // TODO:
        // print that customer cannot manage services
        System.out.println("customer " + name + " cannot manage services");
    }

    @Override
    public void useService(Service s) {

        // TODO:

        System.out.println("customer " + name + " use service " + s.getServiceName());

        s.performService();

    }
}