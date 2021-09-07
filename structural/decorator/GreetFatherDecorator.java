public class GreetFatherDecorator implements Message {
    private Message message;

    public GreetFatherDecorator(Message message) {
        this.message = message;
    }

    @Override
    public String hello() {
        System.out.println("In decorator");
        String hello = message.hello();
        return hello + " father. !";
    }
}
