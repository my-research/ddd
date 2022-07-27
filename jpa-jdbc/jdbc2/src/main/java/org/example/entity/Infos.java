package org.example.entity;

import java.util.List;
import lombok.Value;

@Value(staticConstructor = "of")
public class Infos {
    List<Info> infos;

    public String pop() {
        if (infos.isEmpty()) {
            return "empty";
        }
        Info info = infos.get(0);
        infos.remove(0);
        return info.toString();
    }
}
