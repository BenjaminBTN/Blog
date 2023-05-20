package ru.galkin.blog.repo;

import org.springframework.data.repository.CrudRepository;
import ru.galkin.blog.models.Post;

public interface PostRepository extends CrudRepository<Post, Long> {
}
