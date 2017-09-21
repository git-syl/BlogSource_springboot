package cn.syl.spring.boot.fileserver.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import cn.syl.spring.boot.fileserver.domain.File;
 

/**
 * File 存储库.
 * 
 * @since 1.0.0 2017年3月28日
 */
public interface FileRepository extends MongoRepository<File, String> {
}
