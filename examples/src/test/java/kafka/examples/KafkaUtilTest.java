package kafka.examples;

import org.junit.Test;

/**
 * locate kafka.examples
 * Created by 79875 on 2017/10/16.
 */
public class KafkaUtilTest {
    @Test
    public void createKafkTopic() throws Exception {
        KafkaUtil.createKafkTopic("topic1",4,1);
    }

}
