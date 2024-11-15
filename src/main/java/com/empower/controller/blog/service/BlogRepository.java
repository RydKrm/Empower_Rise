package com.empower.controller.blog.service;

import com.empower.controller.blog.Blog;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BlogRepository extends JpaRepository<Blog, Long> {
}
