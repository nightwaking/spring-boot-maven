import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

/**
 * 开启自动配置
 */
@SpringBootApplication
public class Application extends SpringBootServletInitializer {
		/**
		 * 修改启动类，继承SpringBootServletInitializer 并重写configure方法
		 * Application 会扫描Application同级及以下的所有包内注解
		 * @Service @Component @Controller @Repository不使用注解会出现 Bean未注册的错误
		 * @param application
		 * @return
		 */
		@Override
		protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
				return application.sources(Application.class);
		}

		/**
		 * 项目启动入口
		 * @param args
		 */
		public static void main(String[] args) {
				SpringApplication.run(Application.class, args);
		}
}
