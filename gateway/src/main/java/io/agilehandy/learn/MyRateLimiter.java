package io.agilehandy.learn;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.gateway.filter.ratelimit.RateLimiter;
import org.springframework.context.annotation.Primary;
import reactor.core.publisher.Mono;

import java.util.HashMap;
import java.util.Map;



public class MyRateLimiter implements RateLimiter  {

    private final Logger logger = LoggerFactory.getLogger(MyKeyResolver.class);

    @Override
    public Mono<Response> isAllowed(String routeId, String id) {
        logger.info("Limit request for {} with key {}", routeId, id);
        Response r = new Response(true, new HashMap<>());
        return Mono.just(r);

    }

    @Override
    public Map getConfig() {
        return null;
    }

    @Override
    public Class getConfigClass() {
        return null;
    }

    @Override
    public Object newConfig() {
        return null;
    }
}
