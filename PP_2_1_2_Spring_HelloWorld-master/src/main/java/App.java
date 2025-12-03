import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);

        HelloWorld worldBean =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(worldBean.getMessage());

        HelloWorld worldBean2 =
                (HelloWorld) applicationContext.getBean("helloworld");

        Cat catBean = (Cat) applicationContext.getBean("cat");
        System.out.println(catBean.getName());

        Cat catBean2 = (Cat) applicationContext.getBean("cat");

        System.out.println(worldBean == worldBean2);
        System.out.println(catBean == catBean2);

    }
}
