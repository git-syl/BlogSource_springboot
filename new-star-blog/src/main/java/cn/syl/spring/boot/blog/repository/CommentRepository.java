package cn.syl.spring.boot.blog.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import cn.syl.spring.boot.blog.domain.Comment;

/**
 * Comment Repository 接口. 
 *
 */
public interface CommentRepository extends JpaRepository<Comment, Long> {

}
