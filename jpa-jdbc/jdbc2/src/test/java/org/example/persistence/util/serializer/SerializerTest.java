package org.example.persistence.util.serializer;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import org.example.entity.Info;
import org.junit.jupiter.api.Test;

class SerializerTest {
    @Test
    void test() {
        Info base = Info.of("hello");
        String serialized = Serializer.getInstance().serialize(base);
        System.out.println("hello = " + serialized);

        Info deserialized = Serializer.getInstance().deserialize(serialized, Info.class);
        assertThat(deserialized).isEqualTo(base);
    }
}
