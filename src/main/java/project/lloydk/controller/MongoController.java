package project.lloydk.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;
import project.lloydk.DTO.CrawlerResponseDto;
import project.lloydk.service.CrawlerService;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequiredArgsConstructor
public class MongoController {

	private final CrawlerService crawlerService;

	@GetMapping("api/test/{artist}")
	public CrawlerResponseDto findByArtist(@PathVariable String artist){
		return (CrawlerResponseDto) crawlerService.cralwerList(artist);
	}
}
