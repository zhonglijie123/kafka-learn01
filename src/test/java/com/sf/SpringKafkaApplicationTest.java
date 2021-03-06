package com.sf;

import org.apache.kafka.clients.producer.internals.Sender;
import org.junit.Before;
import org.junit.ClassRule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.kafka.config.KafkaListenerEndpointRegistry;
import org.springframework.kafka.listener.MessageListenerContainer;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.concurrent.TimeUnit;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringKafkaApplicationTest {

//  private static String BATCH_TOPIC = "batch.t";
//
//  @Autowired
//  private Sender sender;
//
//  @Autowired
//  private Receiver receiver;
//
//  @Autowired
//  private KafkaListenerEndpointRegistry kafkaListenerEndpointRegistry;
//
//  @ClassRule
//  public static KafkaEmbedded embeddedKafka = new KafkaEmbedded(1, true, BATCH_TOPIC);
//
//  @Before
//  public void setUp() throws Exception {
//    // wait until the partitions are assigned
//    for (MessageListenerContainer messageListenerContainer : kafkaListenerEndpointRegistry
//        .getListenerContainers()) {
//      ContainerTestUtils.waitForAssignment(messageListenerContainer,
//          embeddedKafka.getPartitionsPerTopic());
//    }
//  }
//
//  @Test
//  public void testReceive() throws Exception {
//    //
//    int numberOfMessages = Receiver.COUNT;
//    for (int i = 0; i < numberOfMessages; i++) {
//      sender.send(BATCH_TOPIC, "message " + i);
//    }
//
//    receiver.getLatch().await(10000, TimeUnit.MILLISECONDS);
//    assertThat(receiver.getLatch().getCount()).isEqualTo(0);
//  }
}