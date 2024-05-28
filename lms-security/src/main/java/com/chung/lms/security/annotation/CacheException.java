package com.chung.lms.security.annotation;

import java.lang.annotation.*;

/**
 * 自定义缓存异常注解，有该注解的缓存方法会抛出异常
 */
@Documented
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface CacheException {
}
