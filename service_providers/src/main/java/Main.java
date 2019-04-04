import voctrals.study.whatisspi.service.IHello;

import java.util.ServiceLoader;

/**
 * @author lei.liu
 * @since 19-4-4
 */
public class Main {


    public static void main(String[] args) {
        ServiceLoader<IHello> iHellos = ServiceLoader.load(IHello.class);

        for (IHello service : iHellos) {
            System.out.println(service.hello());
        }
    }

}
