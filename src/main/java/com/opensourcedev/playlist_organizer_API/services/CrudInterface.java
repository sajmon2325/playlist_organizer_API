package com.opensourcedev.playlist_organizer_API.services;

import java.util.Set;

public interface CrudInterface<T, ID> {

    Set<T> findAll();

    T findById(ID id);

    T save(T object);

    void delete(T object);

    void deleteById(ID id);
}
