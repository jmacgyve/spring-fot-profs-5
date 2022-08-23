package com.jmacgyve.chapter4.simplyEditor;

import org.springframework.beans.factory.config.CustomEditorConfigurer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.annotation.PostConstruct;
import java.util.Map;

@Configuration
public class Conf {

    @Bean
    @PostConstruct
    public CustomEditorConfigurer customEditorConfigurer() {
        CustomEditorConfigurer customEditorConfigurer = new CustomEditorConfigurer();
        customEditorConfigurer.setCustomEditors(Map.of(FullName.class, NamePropertyEditor.class));
        return customEditorConfigurer;
    }

    @Bean
    public CustomEditorExample exampleBean() {
        CustomEditorExample customEditorExample = new CustomEditorExample();
        return customEditorExample;
    }
}
