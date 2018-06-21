package com.fright.config;

import com.fright.model.sys.SysUser;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.domain.AuditorAware;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.security.core.context.SecurityContextHolder;

@EnableJpaAuditing
@Configuration
@EnableJpaRepositories(value = "com.fright.repository")
public class AuditorAwareConfig {
    @Bean
    public AuditorAware<Integer> createAuditorProvider() {
        return new SecurityAuditor();
    }

    public static class SecurityAuditor implements AuditorAware<Integer> {
        @Override
        public Integer getCurrentAuditor() {
            Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
            if(!(principal instanceof SysUser)) {
                return null;
            }
            SysUser user = (SysUser) principal;
            if(user ==null)
                return null;
            return user.getId();
        }
    }
}
