package org.example.persistence.util.serializer;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;
import org.example.entity.Info;

public class InfoDeserializer  implements JsonDeserializer<Info> {
    @Override
    public Info deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context)
            throws JsonParseException {
        String name = Serializer.getInstance()
                .deserialize(json.getAsJsonObject().get("name").getAsString(), String.class);

        return Info.of(name);
    }
}
