package ml.pevgen.springaddextraconfigdemo.config;

import jakarta.annotation.PostConstruct;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "app.dynamic")
public class JavaConfig {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());
    private String propFileName;
    private String yamlFileName;

    @PostConstruct
    public void postConstruct() {
        logger.info("configDynamicFileName (prop)= {}", propFileName);
        logger.info("configDynamicFileName (yaml)= {}", yamlFileName);
    }

    public String getPropFileName() {
        return propFileName;
    }

    public void setPropFileName(String propFileName) {
        this.propFileName = propFileName;
    }

    public String getYamlFileName() {
        return yamlFileName;
    }

    public void setYamlFileName(String yamlFileName) {
        this.yamlFileName = yamlFileName;
    }
}
