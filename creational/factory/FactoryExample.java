public class FactoryExample {
    public static void main(String[] args) {
        AbstractPhoneFactory factory = new SamsungPhoneFactory();
        Phone phone = factory.createPhone();
        phone.callThePolice();
    }
}
