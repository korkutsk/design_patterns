public interface Receiver {
    boolean handleMessage(ChainMessage message);

    void nextErrorHandler(Receiver receiver);
}
