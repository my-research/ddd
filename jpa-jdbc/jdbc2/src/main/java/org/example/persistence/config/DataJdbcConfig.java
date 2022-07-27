package org.example.persistence.config;

import java.util.ArrayList;
import java.util.List;
import org.example.persistence.util.converter.InfoReadingConverter;
import org.example.persistence.util.converter.InfoWritingConverter;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.convert.converter.Converter;
import org.springframework.data.jdbc.core.convert.JdbcCustomConversions;
import org.springframework.data.jdbc.repository.config.AbstractJdbcConfiguration;
import org.springframework.data.jdbc.repository.config.EnableJdbcAuditing;

@Configuration
@EnableJdbcAuditing
public class DataJdbcConfig extends AbstractJdbcConfiguration {

    @Override
    public JdbcCustomConversions jdbcCustomConversions() {
        List<Converter<?, ?>> converters = new ArrayList<>();
        converters.add(new InfoReadingConverter());
        converters.add(new InfoWritingConverter());
        return new JdbcCustomConversions(converters);
    }


}
