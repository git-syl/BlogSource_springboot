package cn.syl.spring.boot.myblog.repository;

import cn.syl.spring.boot.myblog.domain.Authority;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorityRepository extends JpaRepository<Authority,Long> {
}
