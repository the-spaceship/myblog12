package com.myblog1.myblog12.service;

import com.myblog1.myblog12.payload.PostDto;

public interface PostService {


    PostDto createPost(PostDto postDto);

    PostDto getPostById(long id);
}
