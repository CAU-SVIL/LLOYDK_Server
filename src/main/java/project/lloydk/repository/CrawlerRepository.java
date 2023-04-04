package project.lloydk.repository;


import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import project.lloydk.Entity.Crawler;

@Repository
public interface CrawlerRepository extends MongoRepository<Crawler, String> {
	List<Crawler> findByArtist(String artist);

}