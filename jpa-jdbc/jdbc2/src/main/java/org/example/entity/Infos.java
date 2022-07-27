package org.example.entity;

import lombok.Value;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

@Value(staticConstructor = "of")
public class Infos {
    List<Info> infos;

    public void pop() {
        if (infos.isEmpty()) {
            return;
        }
        infos.remove(0);
    }
}
