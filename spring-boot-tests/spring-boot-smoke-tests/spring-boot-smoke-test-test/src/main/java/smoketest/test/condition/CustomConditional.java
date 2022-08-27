package smoketest.test.condition;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

/**
 * @author: doudou
 * @since: 2021-03-25
 */
public class CustomConditional implements Condition {

	@Override
	public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
		// 获取到自定义注解中的 value 值
		String[] properties = (String[]) metadata.getAnnotationAttributes("smoketest.test.condition.ConditionalOnCustom").get("value");
		// 遍历自定义属性的 value 值
		for (String property : properties) {
			// 如果环境中的变量配置了 value 值，并且 equals("customBean") 则返回 true
			if ("customBean".equals(context.getEnvironment().getProperty(property))) {
				return true;
			}
		}
		return false;
	}

}
