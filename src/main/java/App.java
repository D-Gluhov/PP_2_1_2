import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean1 =
                (HelloWorld) applicationContext.getBean("helloworld");
        HelloWorld bean2 =
                (HelloWorld) applicationContext.getBean("helloworld");
        Cat cat1 = applicationContext.getBean(Cat.class);
        Cat cat2 = applicationContext.getBean("cat", Cat.class);
        System.out.println(bean1 == bean2);
        System.out.println(cat1 == cat2);
    }
}