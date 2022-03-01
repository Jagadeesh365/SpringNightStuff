package in.lpu.Bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("conn")
public class DbConn {
	// @Value("OracleDriver") //static values
	@Value("${dbdriver}")     //read data from the Enviroment memory
	private String drive;
	//@Value("jdbc:oracle") // static values
	@Value("${dburl}")      //read data from the Enviroment memory
	private String url;

	public DbConn() {
		super();
		System.out.println("FROM THE CONN_DEFAULTN COST");
	}

	@Override
	public String toString() {
		return "DbConn [drive=" + drive + ", url=" + url + "]";
	}

}
