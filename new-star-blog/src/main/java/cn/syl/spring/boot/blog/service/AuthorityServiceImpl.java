/**
 * 
 */
package cn.syl.spring.boot.blog.service;

import cn.syl.spring.boot.blog.domain.Authority;
import cn.syl.spring.boot.blog.repository.AuthorityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Authority 服务接口的实现.
 *
 */
@Service
public class AuthorityServiceImpl implements AuthorityService {

	@Autowired
	private AuthorityRepository authorityRepository;
	
	/* (non-Javadoc)
	 * @see com.waylau.spring.boot.blog.service.AuthorityService#getAuthorityById(java.lang.Long)
	 */
	@Override
	public Authority getAuthorityById(Long id) {
		return authorityRepository.findOne(id);
	}

}
