package io.agilehandy.learn;

import org.springframework.cloud.gateway.filter.ratelimit.RateLimiter;
import org.springframework.context.annotation.Primary;
import reactor.core.publisher.Mono;

import java.util.HashMap;
import java.util.Map;


public class MyRateLimiter implements RateLimiter  {
    @Override
    public Mono<Response> isAllowed(String routeId, String id) {
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
