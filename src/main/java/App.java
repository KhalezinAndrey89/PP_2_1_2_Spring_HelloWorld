import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean1 = (HelloWorld) applicationContext.getBean("helloworld");
        HelloWorld bean2 = (HelloWorld) applicationContext.getBean("helloworld");

        Cat benCat1 = (Cat) applicationContext.getBean("cat");
        Cat benCat2 = (Cat) applicationContext.getBean("cat");

        System.out.println(bean1.equals(bean2));
        System.out.println(benCat1.equals(benCat2));

    }
}