package org.example.persistence.util.serializer;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import java.lang.reflect.Type;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import org.example.entity.Info;
import org.example.persistence.util.converter.InfoReadingConverter;

public class Serializer {

    private static final String EMPTY = "";
    private static Serializer serializer;
    private Gson gson;

    private Serializer() {
        this.build();
    }

    public static synchronized Serializer getInstance() {
        if (Serializer.serializer == null) {
            Serializer.serializer = new Serializer();
        }
        return Serializer.serializer;
    }

    public String serialize(Object object) {
        if (object == null) {
            return EMPTY;
        }
        if (EMPTY.equals(object)) {
            return EMPTY;
        }

        if (object instanceof String) {
            return (String) object;
        }

        return this.gson().toJson(object);
    }

    public <T> T deserialize(String aSerialization, final Class<T> aType) {
        return this.gson().fromJson(aSerialization, aType);
    }

    public <T> T deserialize(String json, Type typeOfT) {
        return this.gson().fromJson(json, typeOfT);
    }

    protected Gson gson() {
        return this.gson;
    }

    private void build() {
        this.gson = new GsonBuilder()
                .registerTypeAdapter(Date.class, new DateSerializer())
                .registerTypeAdapter(Date.class, new DateDeserializer())
                .registerTypeAdapter(LocalDateTime.class, new LocalDateTimeSerializer())
                .registerTypeAdapter(LocalDateTime.class, new LocalDateTimeDeserializer())
                .registerTypeAdapter(Info.class, new InfoSerializer())
                .registerTypeAdapter(Info.class, new InfoDeserializer())
                .serializeNulls()
                .create();
    }


    private static class LocalDateTimeSerializer implements JsonSerializer<LocalDateTime> {
        @Override
        public JsonElement serialize(LocalDateTime src, Type typeOfSrc, JsonSerializationContext context) {
            return new JsonPrimitive(src.format(DateTimeFormatter.ISO_DATE_TIME));
        }
    }

    private static class LocalDateTimeDeserializer implements JsonDeserializer<LocalDateTime> {
        @Override
        public LocalDateTime deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context)
                throws JsonParseException {
            return LocalDateTime.parse(json.getAsJsonPrimitive().getAsString(), DateTimeFormatter.ISO_DATE_TIME);
        }
    }


    private static class DateSerializer implements JsonSerializer<Date> {
        public JsonElement serialize(Date source, Type typeOfSource, JsonSerializationContext context) {
            return new JsonPrimitive(Long.toString(source.getTime()));
        }
    }

    private static class DateDeserializer implements JsonDeserializer<Date> {
        public Date deserialize(JsonElement json, Type typeOfTarget, JsonDeserializationContext context)
                throws JsonParseException {
            long time = Long.parseLong(json.getAsJsonPrimitive().getAsString());
            return new Date(time);
        }
    }


}