//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Observer firstSubscriber = new FirstMessageSubscriber();
        Observer secondSubscriber = new SecondMessageSubscriber();
        Observer thirdSubscriber = new ThirdMessageSubscriber();

        Subject messagePublisher = new MessagePublisher();
        messagePublisher.register(firstSubscriber);
        messagePublisher.register(secondSubscriber);

        Message message = new Message("subscribed to the subject");

        messagePublisher.notifyUpdate(message);

        System.out.println("----------------------------------------------");

        messagePublisher.unregister(firstSubscriber);
        messagePublisher.register(thirdSubscriber);

        messagePublisher.notifyUpdate(message);
    }
}