package com.springboot.restapi_blog.repository;

import com.springboot.restapi_blog.entity.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRepository extends JpaRepository<Comment,Long> {
}
