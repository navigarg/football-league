package com.football.services.country.interfaces;

import java.util.List;

public interface GenericOperations<E> {

	public E post(E entity);

	public List<E> get();

	public void put(E entity);

	public void delete(E entity);
}
