package edabatch;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BatchIntegrationApplication {
	
/*@Bean
public InitializingBean init(DataSource dataSource) {

        ClassPathResource recordsSys = new ClassPathResource("schema-h2.sql");

        DataSourceInitializer dsi = new DataSourceInitializer();

        dsi.setDataSource(dataSource);
        dsi.setDatabasePopulator(new ResourceDatabasePopulator(true, true, "utf-8", recordsSys));
        dsi.setEnabled(true);

        return dsi;
}*/

 public static void main(String[] args) {
  SpringApplication.run(BatchIntegrationApplication.class, args);
 }
}
