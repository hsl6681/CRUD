package com.CRUDex.boardcrud.repository;

import com.CRUDex.boardcrud.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends JpaRepository<Post, Long> {
    // 추가적인 메소드 불필요
}