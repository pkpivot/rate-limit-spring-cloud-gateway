package io.agilehandy.learn;

import org.apache.commons.logging.LogFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.gateway.filter.ratelimit.KeyResolver;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

@Component
public class MyKeyResolver implements KeyResolver {

    private final Logger logger = LoggerFactory.getLogger(MyKeyResolver.class);

    // Will impose a global rate limit since the key is always the same
    @Override
    public Mono<String> resolve(ServerWebExchange exchange) {
        logger.info("Remote address {}", exchange.getRequest().getRemoteAddress().getHostString());
        return Mono.just("1");
    }
}