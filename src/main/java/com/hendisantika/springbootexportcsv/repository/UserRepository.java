package com.hendisantika.springbootexportcsv.repository;

import com.hendisantika.springbootexportcsv.domain.User2;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by IntelliJ IDEA.
 * Project : springboot-export-csv
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 20/10/21
 * Time: 07.21
 */
public interface UserRepository extends JpaRepository<User2, Integer> {
}
