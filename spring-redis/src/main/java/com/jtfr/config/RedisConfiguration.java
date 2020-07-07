package com.jtfr.config;

import java.io.Serializable;

import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.boot.autoconfigure.data.redis.RedisAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.lettuce.LettuceConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.GenericJackson2JsonRedisSerializer;
import org.springframework.data.redis.serializer.StringRedisSerializer;

import com.jtfr.entity.User2;

@Configuration
// @AutoConfigureAfter(RedisAutoConfiguration.class) // 自动注入在什么类加载前或者之后
public class RedisConfiguration {
	@Bean
	public RedisTemplate<String, Serializable> redisCacheTemplate(LettuceConnectionFactory redisConnectionFactory) {
		// 创建 RedisTemplate 对象，用于外面使用。
		RedisTemplate<String, Serializable> template = new RedisTemplate<>();
		GenericJackson2JsonRedisSerializer jackson2JsonRedisSerializer = new GenericJackson2JsonRedisSerializer();
		// 设置键（key）的序列化采用StringRedisSerializer。
		template.setKeySerializer(new StringRedisSerializer());
		// 设置值（value）的序列化采用jackson的序列化。
		template.setValueSerializer(jackson2JsonRedisSerializer);
		template.setHashKeySerializer(new StringRedisSerializer());
		template.setHashValueSerializer(jackson2JsonRedisSerializer);
		// 设置连接池
		template.setConnectionFactory(redisConnectionFactory);
		return template;
	}
	
	@Bean
	public User2 getUser2() {
		return new User2();
	}

}
