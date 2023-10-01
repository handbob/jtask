package jtask.jrepository;

import org.springframework.data.repository.*;

import jtask.jdata.*;

public interface JRepository extends CrudRepository<JData, Long> { }
