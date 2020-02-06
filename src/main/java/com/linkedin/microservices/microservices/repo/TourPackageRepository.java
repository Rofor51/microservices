package com.linkedin.microservices.microservices.repo;


import com.linkedin.microservices.microservices.domain.TourPackage;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

import java.util.Optional;

/**
 * Tour Package Repository Interface
 *
 * Created by Mary Ellen Bowman
 */

public interface TourPackageRepository extends CrudRepository<TourPackage, String> {

    /**
     * Lookup a tour package by the name.
     *
     * @param name name of the tour.
     * @return TourPackage if found, null otherwise.
     */
    Optional<TourPackage> findByName(@Param("name") String name);

   ;
}

