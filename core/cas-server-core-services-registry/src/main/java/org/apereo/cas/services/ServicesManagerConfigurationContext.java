package org.apereo.cas.services;

import com.github.benmanes.caffeine.cache.Cache;
import lombok.Getter;
import lombok.experimental.SuperBuilder;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.Set;

/**
 * This is {@link ServicesManagerConfigurationContext}.
 *
 * @author Misagh Moayyed
 * @since 6.3.0
 */
@SuperBuilder
@Getter
public class ServicesManagerConfigurationContext {
    private final ServiceRegistry serviceRegistry;

    private final ConfigurableApplicationContext applicationContext;

    private final Set<String> environments;

    private final Cache<Long, RegisteredService> servicesCache;
}
