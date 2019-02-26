package hansabgroup.hansabmotorsgradle;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EntityScan // creates all the tables after a scan
@EnableJpaRepositories
@EnableJpaAuditing
@SpringBootApplication
public class HansabmotorsgradleApplication {

	public static void main(String[] args) {
		SpringApplication.run(HansabmotorsgradleApplication.class, args);
	}

}
