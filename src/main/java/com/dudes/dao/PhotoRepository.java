package com.dudes.dao;

import com.dudes.model.Photo;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Vitaliy Grinyov
 * @since 2016
 */
public interface PhotoRepository extends JpaRepository<Photo, Long> {
}
