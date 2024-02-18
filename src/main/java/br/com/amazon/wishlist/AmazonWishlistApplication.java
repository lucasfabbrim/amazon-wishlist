package br.com.amazon.wishlist;

import br.com.amazon.wishlist.modules.address.cep.VerifyZipCode;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;

@SpringBootApplication
public class AmazonWishlistApplication {

	public static void main(String[] args) throws IOException {
		SpringApplication.run(AmazonWishlistApplication.class, args);
	}

}
