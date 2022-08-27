package smoketest.test.condition;

import org.springframework.stereotype.Component;

/**
 * @author: doudou
 * @since: 2021-03-25
 */
@Component
@ConditionalOnCustom({"smoketest.test.condition.bean"})
public class ConditionalUse {

}
