package in.lpu.Bean.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;
//scan spring beans (classs)- using one package name
@ComponentScan(basePackages="in.lpu.Bean")
//Loding Properties file into Spring container
@PropertySource("classpath:App.properties")
public class Appconfig {

}
