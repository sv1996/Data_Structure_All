package Class;

import java.util.Properties;

public class AnonymousDemo {

    public static void main(String[] args)
    {
        Properties p = System.getProperties();
        p.list(System.out);

    }
}
