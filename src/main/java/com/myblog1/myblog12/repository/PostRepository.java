package com.myblog1.myblog12.repository;

import com.myblog1.myblog12.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;


public interface PostRepository extends JpaRepository<Post, Long> {

}
