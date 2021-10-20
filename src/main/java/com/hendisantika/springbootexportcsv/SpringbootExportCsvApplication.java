package com.hendisantika.springbootexportcsv;

import com.hendisantika.springbootexportcsv.domain.Role;
import com.hendisantika.springbootexportcsv.domain.User2;
import com.hendisantika.springbootexportcsv.repository.RoleRepository;
import com.hendisantika.springbootexportcsv.repository.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;
import java.util.Set;

@SpringBootApplication
public class SpringbootExportCsvApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootExportCsvApplication.class, args);
    }

    @Bean
    public CommandLineRunner demo(UserRepository userRepository, RoleRepository roleRepository) {
        return (args) -> {
            for (int i = 0; i < 2; i++) {
                roleRepository.save(new Role(1, "ADMIN", "ADMIN"));
                roleRepository.save(new Role(2, "USER", "USER"));
            }

            Role roleAdmin = roleRepository.findByName("ADMIN");

            List<Role> roles = (List<Role>) roleRepository.findAll();
            for (int i = 0; i < 10; i++) {
                userRepository.save(new User2(i, "email" + i + "@email.com", "password" + i, "fullName" + i, true,
                        Set.of(roleAdmin)));
            }
        };
    }
}
