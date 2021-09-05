public class MediatorExample {

    public static void main(String[] args) {
        Mediator mediator = new ConcreteMediator();
        ConcreteEmployee em1 = new ConcreteEmployee("Kolya", true, mediator);
        ConcreteEmployee em2 = new ConcreteEmployee("Mari", true, mediator);
        UnauthorizedEmployee rev = new UnauthorizedEmployee("Revenger", false, mediator);
        mediator.sendMessage(em1, em2, "Zradova");
        mediator.sendMessage(em2, em1, "hi");
        mediator.sendMessage(rev, em1, "ti che");
    }
}
