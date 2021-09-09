public class FaxErrorHandler implements Receiver {
    private Receiver nextReceiver;

    @Override
    public boolean handleMessage(ChainMessage message) {
        if (message.getText().contains("Fax")) {
            System.out.println("Fax handler processing :: " + message.getMessagePriority() +
                    " :: Text ::" + message.getText());
            return true;
        } else {
            if (nextReceiver != null) {
                nextReceiver.handleMessage(message);
            }
            return false;
        }
    }

    @Override
    public void nextErrorHandler(Receiver receiver) {
        this.nextReceiver = receiver;
    }
}
