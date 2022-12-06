import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean1 = (HelloWorld) applicationContext.getBean("helloworld");
        HelloWorld bean2 = (HelloWorld) applicationContext.getBean("helloworld");

        Cat benCat1 = (Cat) applicationContext.getBean("This is a cat1");
        Cat benCat2 = (Cat) applicationContext.getBean("This is a cat2");


        System.out.println(bean1 == bean2);
        System.out.println(benCat1 == benCat2);

    }
}