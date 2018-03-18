package com.sample.sdj;

import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends ReadOnlyRepository<Book, Long> {

}
