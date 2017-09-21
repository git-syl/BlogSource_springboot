package cn.syl.spring.boot.blog.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.syl.spring.boot.blog.domain.Comment;
import cn.syl.spring.boot.blog.repository.CommentRepository;

/**
 * Comment Service接口实现.
 *
 */
@Service
public class CommentServiceImpl implements CommentService {

    @Autowired
    private CommentRepository commentRepository;
    
	@Override
	public Comment getCommentById(Long id) {
		return commentRepository.findOne(id);
	}

	@Override
	public void removeComment(Long id) {
		commentRepository.delete(id);
	}

}
