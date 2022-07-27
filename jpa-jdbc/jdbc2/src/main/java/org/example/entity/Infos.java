package org.example.entity;

import lombok.Value;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

@Value(staticConstructor = "of")
public class Infos {
    List<Info> infos;

    public void pop(int startOffset, int publishOffset) {
        if (infos.isEmpty()) {
            return;
        }
        infos.remove(0);

        /*return infos.stream().filter(
                        i -> i.getSeq() > startOffset
                                && info.getSeq() <= publishOffset
                ).map(Info::toString)
                .collect(Collectors.toUnmodifiableList());*/
    }
}
