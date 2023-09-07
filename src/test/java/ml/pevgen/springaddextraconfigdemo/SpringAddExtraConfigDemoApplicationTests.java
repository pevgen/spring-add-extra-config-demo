package ml.pevgen.springaddextraconfigdemo;

import ml.pevgen.springaddextraconfigdemo.config.DynamicPropConfig;
import ml.pevgen.springaddextraconfigdemo.config.DynamicYamlConfig;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
class SpringAddExtraConfigDemoApplicationTests {

    @Autowired
    private DynamicYamlConfig dynamicYamlConfig;

    @Autowired
    private DynamicPropConfig dynamicPropConfig;

    @Test
    void should_load_dynamic_configs() {
        assertNotNull(dynamicPropConfig);
        assertNotNull(dynamicYamlConfig);
        assertEquals("prop.V3", dynamicPropConfig.getDynamicValue());
        assertEquals("yaml.V1", dynamicYamlConfig.getDynamicValue());
    }

}
