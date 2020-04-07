package com.kxj.config;/**
 * @author xiangjin.kong
 * @date 2020/4/7 14:24
 * @desc
 */

import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @ClassName KieConfig
 * @Description TODO
 * @Author kongxiangjin
 * @Date 2020/4/7 14:24
 * @Version 1.0
 **/
@Configuration
public class KieConfig {

    @Bean
    public KieContainer kieContainer() {
        return KieServices.Factory.get().getKieClasspathContainer();
    }
}
