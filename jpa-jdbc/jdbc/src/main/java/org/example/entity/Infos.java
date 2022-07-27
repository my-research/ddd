package org.example.entity;

import java.util.List;
import lombok.Value;

@Value(staticConstructor = "of")
public class Infos {
    List<Info> infos;
}
