public class IssueRaiser {
    private Receiver receiver;

    public void setFirstReceiver(Receiver receiver) {
        this.receiver = receiver;
    }

    public void raiseMessage(ChainMessage message) {
        if (receiver != null) {
            receiver.handleMessage(message);
        }
    }
}
