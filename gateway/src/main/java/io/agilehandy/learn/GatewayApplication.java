package io.agilehandy.learn;

import org.springframework.cloud.gateway.filter.ratelimit.RateLimiter;
import org.springframework.cloud.gateway.filter.ratelimit.RedisRateLimiter;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Primary;
import reactor.core.publisher.Mono;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.gateway.filter.ratelimit.KeyResolver;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class GatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(GatewayApplication.class, args);
	}


//	@Bean
//	public RouteLocator myRoutes(RouteLocatorBuilder builder) {
//		return builder.routes()
//				.route("requestratelimiter_route", p -> p
//						.path("/example")
//						.filters(f -> f.requestRateLimiter(r -> r.setRateLimiter(myRateLimiter())))
//						.uri("http://example.org"))
//				.build();
//	}


	@Bean
	public MyRateLimiter myRateLimiter() {
		return new MyRateLimiter();
	}
}
