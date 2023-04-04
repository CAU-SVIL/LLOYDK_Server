package project.lloydk.DTO;

import java.util.List;

import lombok.Getter;
import lombok.NoArgsConstructor;
import project.lloydk.Entity.Crawler;

@Getter
@NoArgsConstructor
public class CrawlerResponseDto {
	private List<Crawler> crawler;

	public CrawlerResponseDto(List<Crawler> list){
		this.crawler = list;
	}
}
