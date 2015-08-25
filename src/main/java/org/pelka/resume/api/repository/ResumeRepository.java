package org.pelka.resume.api.repository;

import org.pelka.resume.api.model.Personal;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Defines the custom queries and the repository artifact used in this
 * application context
 * 
 * @author arnoldpelka
 *
 */
public interface ResumeRepository extends MongoRepository<Personal, String> {
}
