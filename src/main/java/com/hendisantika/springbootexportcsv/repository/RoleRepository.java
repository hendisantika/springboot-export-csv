package com.hendisantika.springbootexportcsv.repository;

import com.hendisantika.springbootexportcsv.domain.Role;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by IntelliJ IDEA.
 * Project : springboot-export-csv
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 20/10/21
 * Time: 07.21
 */
public interface RoleRepository extends CrudRepository<Role, Integer> {
    Role findByName(String name);
}
