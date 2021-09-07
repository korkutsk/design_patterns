public class DecoratorExample {
    public static void main(String[] args) {
        HelloMessage helloMessage = new HelloMessage();
        System.out.println(helloMessage.hello());
        GreetFatherDecorator decarator = new GreetFatherDecorator(helloMessage);
        System.out.println(decarator.hello());
    }
}
