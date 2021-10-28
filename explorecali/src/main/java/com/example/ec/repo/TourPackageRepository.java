package com.example.ec.repo;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RestResource;

import com.example.ec.domain.TourPackage;

public interface TourPackageRepository extends CrudRepository<TourPackage, String> {
	Optional<TourPackage> findByName(String name);
	@Override
    @RestResource(exported = false)
    <S extends TourPackage> S save(S s);

    @Override
    @RestResource(exported = false)
    <S extends TourPackage> Iterable<S> saveAll(Iterable<S> iterable);

    @Override
    @RestResource(exported = false)
    void deleteById(String s);

    @Override
    @RestResource(exported = false)
    void delete(TourPackage tourPackage);

    @Override
    @RestResource(exported = false)
    void deleteAll(Iterable<? extends TourPackage> iterable);

    @Override
    @RestResource(exported = false)
    void deleteAll();
}
