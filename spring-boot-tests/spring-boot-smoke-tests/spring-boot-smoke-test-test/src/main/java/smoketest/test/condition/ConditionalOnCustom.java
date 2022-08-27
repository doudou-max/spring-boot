package smoketest.test.condition;

import org.springframework.context.annotation.Conditional;

import java.lang.annotation.*;

/**
 * @author: doudou
 * @since: 2021-03-25
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ ElementType.TYPE, ElementType.METHOD })
@Documented
@Conditional(CustomConditional.class)
public @interface ConditionalOnCustom {

    String[] value() default {};

}
