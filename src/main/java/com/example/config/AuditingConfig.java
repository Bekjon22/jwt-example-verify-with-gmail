package com.example.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.domain.AuditorAware;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

import java.util.UUID;

/**
 * @author Bekjon Bakhromov
 * @created 23.02.2022-5:29 PM
 */

@Configuration
@EnableJpaAuditing
public class AuditingConfig  {

    @Bean
    AuditorAware<UUID> auditorAware() {
        return new AuditAwareImpl();
    }

}
