package project.lloydk.service;

import java.util.List;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import project.lloydk.DTO.CrawlerResponseDto;
import project.lloydk.Entity.Crawler;
import project.lloydk.repository.CrawlerRepository;

@Service
@RequiredArgsConstructor
public class CrawlerService {

	private final CrawlerRepository crawlerRepository;
	public CrawlerResponseDto cralwerList(String artist) {
		List<Crawler> crawlerReturnList = crawlerRepository.findByArtist(artist);
		return new CrawlerResponseDto(crawlerReturnList);
	}
}
