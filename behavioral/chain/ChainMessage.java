public class ChainMessage {
    private String text;
    private MessagePriority messagePriority;

    public ChainMessage(String text, MessagePriority messagePriority) {
        this.text = text;
        this.messagePriority = messagePriority;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public MessagePriority getMessagePriority() {
        return messagePriority;
    }

    public void setMessagePriority(MessagePriority messagePriority) {
        this.messagePriority = messagePriority;
    }
}
