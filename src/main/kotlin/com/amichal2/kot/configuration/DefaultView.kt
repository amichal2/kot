package com.amichal2.kot.configuration

import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.context.annotation.Configuration
import org.springframework.core.Ordered


@Configuration
class DefaultView : WebMvcConfigurerAdapter() {

    override fun addViewControllers(registry: ViewControllerRegistry) {
        registry.addViewController("/").setViewName("forward:/index.html")
        registry.addViewController("/inventory").setViewName("forward:/index.html")
        registry.setOrder(Ordered.HIGHEST_PRECEDENCE)
        super.addViewControllers(registry)
    }
}
