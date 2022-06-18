package com.javacicd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class GithubCicdActionApplication {

	@GetMapping("/welcome")
	public String welcome() {
		return "Welcome to Hari Implemented CI/CD";
	}
	public static void main(String[] args) {
		SpringApplication.run(GithubCicdActionApplication.class, args);
	}

	
	/*echo "# github-action-example" >> README.md
	git init
	git add README.md
	git commit -m "first commit"
	git branch -M master
	git remote add origin https://github.com/harishankar796/github-action-example.git
	git push -u origin master*/
}
 