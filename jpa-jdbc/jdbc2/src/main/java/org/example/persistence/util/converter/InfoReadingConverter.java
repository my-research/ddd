package org.example.persistence.util.converter;

import org.example.entity.Info;
import org.example.entity.Infos;
import org.example.persistence.util.serializer.Serializer;
import org.postgresql.util.PGobject;
import org.springframework.core.convert.converter.Converter;
import org.springframework.data.convert.ReadingConverter;

@ReadingConverter
public class InfoReadingConverter implements Converter<PGobject, Infos> {
    @Override
    public Infos convert(PGobject source) {
        String value = source.getValue();
        return Serializer.getInstance().deserialize(value, Infos.class);
    }
}
