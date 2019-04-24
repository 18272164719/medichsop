package com.shyl.medicshopclient.aop;

import com.shyl.medicshopclient.config.DBTypeEnum;

import java.lang.annotation.*;

@Target({ElementType.METHOD,ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Ds {

    DBTypeEnum value() default DBTypeEnum.db1;
}
