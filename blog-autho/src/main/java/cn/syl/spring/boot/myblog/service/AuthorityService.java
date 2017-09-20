package cn.syl.spring.boot.myblog.service;

import cn.syl.spring.boot.myblog.domain.Authority;

public interface AuthorityService {
    /**
     *
     * @param id
     * @return
     */
    Authority getAuthorityById(Long id);
}
