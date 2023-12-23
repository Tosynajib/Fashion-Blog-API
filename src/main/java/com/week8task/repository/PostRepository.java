package com.week8task.repository;

import com.week8task.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PostRepository extends JpaRepository<Post, Long> {
    List<Post> findByPublished (boolean published);

    List<Post> findByTitleIgnoreCaseStartingWith(String title);
}
