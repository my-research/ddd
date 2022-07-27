package org.example.persistence.util.serializer;

import org.example.entity.Info;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SerializerTest {
    @Test
    void test() {
        Info base = Info.of(1, "hello");
        String serialized = Serializer.getInstance().serialize(base);
        System.out.println("hello = " + serialized);

        Info deserialized = Serializer.getInstance().deserialize(serialized, Info.class);
        assertThat(deserialized).isEqualTo(base);
    }
}
