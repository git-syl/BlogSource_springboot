package cn.syl.spring.boot.blog.service;

import cn.syl.spring.boot.blog.domain.Authority;

/**
 * Authority 服务接口.
 *
 */
public interface AuthorityService {
	/**
	 * 根据ID查询 Authority
	 * @param id
	 * @return
	 */
    Authority getAuthorityById(Long id);
}
