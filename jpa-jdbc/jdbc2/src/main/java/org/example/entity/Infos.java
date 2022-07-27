package org.example.entity;

import lombok.Value;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

@Value(staticConstructor = "of")
public class Infos {
    List<Info> infos;

    public List<String> pop(int startOffset, int publishOffset) {
        if (infos.isEmpty()) {
            return new LinkedList<>();
        }
        Info info = infos.get(0);
        infos.remove(0);

        return infos.stream().filter(
                        i -> i.getSeq() > startOffset
                                && info.getSeq() <= publishOffset
                ).map(Info::toString)
                .collect(Collectors.toUnmodifiableList());
    }
}
