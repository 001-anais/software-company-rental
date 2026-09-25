package es.uclm.rentalplatform.service;

import java.util.List;

import org.springframework.stereotype.Service;

import es.uclm.rentalplatform.domain.Property;
import es.uclm.rentalplatform.repository.PropertyRepository;

@Service
public class PropertyService {

    private final PropertyRepository repository;

    public PropertyService(PropertyRepository repository) {
        this.repository = repository;
    }

    public Property save(Property property) {
        return repository.save(property);
    }

    public List<Property> findAll() {
        return repository.findAll();
    }
}