package com.alves.restful.repository;

import com.alves.restful.domain.Post;
import com.alves.restful.domain.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends MongoRepository <Post, String> {
}
