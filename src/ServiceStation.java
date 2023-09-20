public class ServiceStation implements ServiceInterface {
    @Override
    public void check(Transport transport) {
        transport.service();
    }
}
