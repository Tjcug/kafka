package kafka.examples;

import kafka.admin.AdminUtils;
import kafka.admin.RackAwareMode;
import kafka.utils.ZkUtils;
import org.apache.kafka.common.security.JaasUtils;

import java.util.Properties;

/**
 * locate kafka.examples
 * Created by 79875 on 2017/10/16.
 * Kafka工具操作类
 */
public class KafkaUtil {
    public static final String ZOOKEEPERConnect="root2:2181,root4:2181,root5:2181/kafka011";

    public static void createKafkTopic(String topic,int partitionsNum,int replicationFactor){
        ZkUtils zkUtils = ZkUtils.apply(ZOOKEEPERConnect, 30000, 30000, JaasUtils.isZkSecurityEnabled());
        // 创建一个单分区单副本名为t1的topic
        AdminUtils.createTopic(zkUtils, topic, partitionsNum, replicationFactor, new Properties(), RackAwareMode.Enforced$.MODULE$);
        zkUtils.close();
    }
}
