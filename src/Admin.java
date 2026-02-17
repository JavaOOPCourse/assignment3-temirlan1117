public class Admin extends User {

    // TODO: constructor
    public Admin(String name, int id){
        super(name, id);
    }

    @Override
    public void manageService(Service s) {

        // TODO:
        System.out.println("admin " + name + " manage" + s.getServiceName());
        if (!s.isActive()) {
            s.activateService();
        }

    }

    @Override
    public void useService(Service s) {

        // TODO:
        System.out.println("admin " + name + " use service" + s.getServiceName());
        s.performService();

    }
}