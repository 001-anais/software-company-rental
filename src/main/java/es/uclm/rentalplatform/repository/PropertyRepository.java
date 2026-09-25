package es.uclm.rentalplatform.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import es.uclm.rentalplatform.domain.Property;

public interface PropertyRepository
        extends JpaRepository<Property, Long> {

}