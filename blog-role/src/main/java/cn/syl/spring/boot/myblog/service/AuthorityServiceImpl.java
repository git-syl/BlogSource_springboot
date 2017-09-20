package cn.syl.spring.boot.myblog.service;

import cn.syl.spring.boot.myblog.domain.Authority;
import cn.syl.spring.boot.myblog.repository.AuthorityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthorityServiceImpl implements AuthorityService {
    @Autowired
    private AuthorityRepository authorityRepository;
    @Override
    public Authority getAuthorityById(Long id) {
        return authorityRepository.findOne(id);
    }
}
