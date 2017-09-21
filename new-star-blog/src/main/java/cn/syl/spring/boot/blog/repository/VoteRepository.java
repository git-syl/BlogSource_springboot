package cn.syl.spring.boot.blog.repository;

import cn.syl.spring.boot.blog.domain.Vote;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Vote Repository接口.
 */
public interface VoteRepository extends JpaRepository<Vote, Long> {
}
