package kafka.examples;

/**
 * locate kafka.examples
 * Created by 79875 on 2017/10/16.
 */
public class KafkaProducerDemo {
    public static void main(String[] args) {
        boolean isAsync = args.length == 0 || !args[0].trim().equalsIgnoreCase("sync");
        Producer producerThread = new Producer(KafkaProperties.TOPIC, isAsync);
        producerThread.start();
    }
}
