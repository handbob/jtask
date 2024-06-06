package jtask;

import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;

@SpringBootApplication
public class Main {
	public static int sum(int n) {
		int s = 0;
		for (int i = 1; i <= n; i++)
			s += i;
		return s;
	}

	public static void main(String[] args) {
		SpringApplication.run(Main.class, args);
	}
}
