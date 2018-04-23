package kz.kaznitu.footballplayer;

import kz.kaznitu.footballplayer.models.Club;
import kz.kaznitu.footballplayer.repositories.ClubRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FootballPlayerApplication implements CommandLineRunner {

	@Autowired
	ClubRepository clubRepository;

	public static void main(String[] args) {
		SpringApplication.run(FootballPlayerApplication.class, args);
	}

	@Override
	public void run(String... strings) throws Exception{


	}
}
