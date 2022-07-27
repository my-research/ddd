package org.example.entity;

import java.util.List;
import java.util.UUID;
import lombok.Value;

@Value(staticConstructor = "of")
public class Infos {
    List<Info> infos;

    public void add() {
        infos.add(Info.of(UUID.randomUUID().toString()));
    }
}
