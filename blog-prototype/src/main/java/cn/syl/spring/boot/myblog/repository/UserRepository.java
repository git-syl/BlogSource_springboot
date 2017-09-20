package cn.syl.spring.boot.myblog.repository;

import cn.syl.spring.boot.myblog.domain.User;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface UserRepository extends CrudRepository<User,Long> {
//    User saveOrUpdate(User user);
//    void deleteUser(Long id);
//    User getUserById(Long id);
//    List<User> listUsers();
}
