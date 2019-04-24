package com.shyl.medicshopclient.aop;

import com.shyl.medicshopclient.config.DBContextHolder;
import com.shyl.medicshopclient.config.DBTypeEnum;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;


@Component
@Slf4j
@Order(-100)
@Aspect
public class DataSourceAspect {

    @Pointcut("@within(com.shyl.medicshopclient.aop.Ds) || @annotation(com.shyl.medicshopclient.aop.Ds)")
    public void pointCut() {
    }

    @Before("pointCut() && @annotation(Ds)")
    public void doBefore(JoinPoint point){
        //获得当前访问的class
        Class<?> clazz = point.getTarget().getClass();
        //获得访问的方法名
        String name = point.getSignature().getName();
        //得到方法的参数的类型
        Class[] argClass = ((MethodSignature)point.getSignature()).getParameterTypes();
        //默认数据库
        DBTypeEnum dataSource = DBTypeEnum.db1;

        // 得到访问的方法对象
        try {
            Method method = clazz.getMethod(name, argClass);
            // 判断是否存在@DS注解
            if(method.isAnnotationPresent(Ds.class)){
                Ds annotation = method.getAnnotation(Ds.class);
                dataSource = annotation.value();
            }
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
        DBContextHolder.setDbType(dataSource);

    }

    @After("pointCut()")
    public void doAfter(JoinPoint point){
        DBContextHolder.clearDbType();
    }
}
