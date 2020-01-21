package com.shailesh;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.shailesh.misc.ProfileEntity;
import com.shailesh.misc.ProfileRepository;

@SpringBootApplication
@EnableJpaRepositories
public class JPAApplication {

	public static void main(String[] args) {
		SpringApplication.run(JPAApplication.class, args);
	}

	
	@Autowired
	private ProfileRepository profile;
	
	@PostConstruct
	private void doSomething() {
		
		ProfileEntity profileEntity = new ProfileEntity();
		
		profileEntity.setId(1l);
		profileEntity.setDescription("desc1");
		
		profile.save(profileEntity);
		
		
	}
}
