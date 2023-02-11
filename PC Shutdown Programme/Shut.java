import java.io.IOException;

public class Shut {

	public static void main(String[] args) throws IOException {
		Runtime.getRuntime().exec("shutdown -s -t 0");
	}

}