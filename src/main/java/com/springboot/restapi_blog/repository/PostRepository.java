package com.springboot.restapi_blog.repository;

import com.springboot.restapi_blog.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post,Long> {
//    public Post findPostById(Long id);

}
