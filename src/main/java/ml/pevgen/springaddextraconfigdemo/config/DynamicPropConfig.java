package ml.pevgen.springaddextraconfigdemo.config;

import jakarta.annotation.PostConstruct;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * PropertySource works with *.properties files by default (!!!)
 * <p>
 * For using yaml-files with PropertySource, you need to add special {@link YamlPropertySourceFactory}
 */

@Configuration
@PropertySource("classpath:${app.dynamic.propFileName}")
@ConfigurationProperties(prefix = "app.dynamic.prop")
public class DynamicPropConfig {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());
    private String dynamicValue;

    @PostConstruct
    public void postConstruct() {
        logger.info("dynamicValue (prop) = {}", dynamicValue);
    }

    public String getDynamicValue() {
        return dynamicValue;
    }

    public void setDynamicValue(String dynamicValue) {
        this.dynamicValue = dynamicValue;
    }

}
