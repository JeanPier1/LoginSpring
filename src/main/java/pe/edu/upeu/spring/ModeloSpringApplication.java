package pe.edu.upeu.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ModeloSpringApplication /* implements	CommandLineRunner*/{

//	@Autowired
//	private BCryptPasswordEncoder passednco;
	
	public static void main(String[] args) {
		SpringApplication.run(ModeloSpringApplication.class, args);
	}
//	@Override
//	public void run(String... args) throws Exception {
//		// TODO Auto-generated method stub
//		
//		String password = "123456";
//		
//		for (int i = 0; i < 4; i++) {
//			String passwordBycytp = passednco.encode(password);
////			System.out.println(passwordBycytp);
//		}
//	}

}
