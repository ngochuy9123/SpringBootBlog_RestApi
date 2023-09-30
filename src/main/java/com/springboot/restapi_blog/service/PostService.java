package com.springboot.restapi_blog.service;

import com.springboot.restapi_blog.payload.PostDto;
import com.springboot.restapi_blog.payload.PostResponse;

import java.util.List;

public interface PostService {
    PostDto createPost(PostDto postDto);

    PostResponse getAllPosts(int pageNo, int pageSize,String sortBy,String sortDir);

    PostDto GetPostById(long id);
    PostDto updatePost(PostDto postDto,long id);

    void deletePostById(long id);
}
