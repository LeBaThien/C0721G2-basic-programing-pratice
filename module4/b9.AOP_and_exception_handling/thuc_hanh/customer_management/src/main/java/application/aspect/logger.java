package application.aspect;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Aspect
@Component
public class logger {
    @AfterThrowing(pointcut = "execution(public * application.service.CustomerService.findAll(..))", throwing = "e")
    public void error(JoinPoint joinPoint, Exception e) {
        String className = joinPoint.getTarget().getClass().getSimpleName();
        String method = joinPoint.getSignature().getName();
        String args = Arrays.toString(joinPoint.getArgs());
        System.out.println(String.format("[CMS] co loi xay ra: %s.%s%s: %s", className, method, args, e.getMessage()));
    }
}
