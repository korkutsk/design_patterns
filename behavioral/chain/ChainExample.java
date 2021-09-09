public class ChainExample {
    public static void main(String[] args) {
        Receiver faxHandler, emailHandler;

        IssueRaiser raiser = new IssueRaiser();
        faxHandler = new FaxErrorHandler();
        emailHandler = new EmailErrorHandler();
        raiser.setFirstReceiver(faxHandler);
        faxHandler.nextErrorHandler(emailHandler);
        emailHandler.nextErrorHandler(null);

        ChainMessage message1 = new ChainMessage("Fax is slow.", MessagePriority.NORMAL);
        ChainMessage m2 = new ChainMessage("Emails are not reaching.", MessagePriority.HIGH);
        ChainMessage m3 = new ChainMessage("In Email, CC field is disabled always.", MessagePriority.NORMAL);
        ChainMessage m4 = new ChainMessage("Fax is not reaching destinations.", MessagePriority.HIGH);
        raiser.raiseMessage(message1);
        raiser.raiseMessage(m2);
        raiser.raiseMessage(m3);
        raiser.raiseMessage(m4);
    }
}
