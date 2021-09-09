public class EmailErrorHandler implements Receiver {
    private Receiver nextReceiver;

    @Override
    public boolean handleMessage(ChainMessage message) {
        if (message.getText().contains("Email")) {
            System.out.println("Email handler processing :: " + message.getMessagePriority() +
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
