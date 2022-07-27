package org.example.persistence.util.serializer;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import java.lang.reflect.Type;
import org.example.entity.Info;

public class InfoSerializer implements JsonSerializer<Info> {
    @Override
    public JsonElement serialize(Info src, Type typeOfSrc, JsonSerializationContext context) {
        String info = Serializer.getInstance().serialize(src);

        JsonObject jsonObject = new JsonObject();

        jsonObject.addProperty("name", info);
        return jsonObject;
    }
}
