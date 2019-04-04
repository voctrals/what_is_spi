package voctrals.study.whatisspi.service.impl;

import voctrals.study.whatisspi.service.IHello;

/**
 * @author lei.liu
 * @since 19-4-4
 */
public class BHello implements IHello {
    @Override
    public String hello() {
        return "Hello from bHello~~";
    }
}
