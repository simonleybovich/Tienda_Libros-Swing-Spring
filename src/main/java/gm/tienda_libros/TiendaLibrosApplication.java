package gm.tienda_libros;

import gm.tienda_libros.vista.LibroForm;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class TiendaLibrosApplication {

	public static void main(String[] args) {

		ConfigurableApplicationContext contextSpring =
				new SpringApplicationBuilder(TiendaLibrosApplication.class)
						.headless(false).web(WebApplicationType.NONE).run(args);
		// ejecutamos el codigo para cargar el formulario
		java.awt.EventQueue.invokeLater(()->{
			//obtenemos el objeto form a traves de spring
			LibroForm libroForm = contextSpring.getBean(LibroForm.class);
			libroForm.setVisible(true);
		});
	}

}
