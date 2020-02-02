package com.mnsd.newsscraper;

import com.mnsd.newsscraper.model.*;
import com.mnsd.newsscraper.repository.*;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
/**
 * Spring boot application for News Scraper service
 * @author Narasimhulu Madhana
 * @since 02/02/2020
 * @version 0.0.1-SNAPSHOT
 */

@SpringBootApplication
public class NewsscraperApplication {

	public static void main(String[] args) {
		SpringApplication.run(NewsscraperApplication.class, args);
	}
	@Bean
	public CommandLineRunner loadData(ArticleRepository repository, ArticleCategoryRepository articleCategoryRepository,
									  AuthorRepository authorRepository, ArticleCityRepository articleCityRepository,
									  TagsRepository tagsRepository) {
		return (args -> {
			List<ArticleCategory> articleCategories= Arrays.asList(new ArticleCategory("main"),new ArticleCategory("sports"),new ArticleCategory("national"),new ArticleCategory("international"),new ArticleCategory("movies"),new ArticleCategory("business"));
			articleCategoryRepository.saveAll(articleCategories);

			List<Author>  authors=new ArrayList<>();
			authors.add(new Author("mnsd","mnsd@gmail.com",new Date()));
			authors.add(new Author("handzap","handzap@gmail.com",new Date()));
			authors.add(new Author("any","any@gmail.com",new Date()));
			authorRepository.saveAll(authors);
			List<ArticleCity> cities=new ArrayList<>();
			cities.add(new ArticleCity(515671,"Dharmavaram"));
			cities.add(new ArticleCity(560037,"Marathahalli"));
			cities.add(new ArticleCity(560103,"Kadubeesanahalli"));
			articleCityRepository.saveAll(cities);
			List<Tags> tags=new ArrayList<>();
			tags.add(new Tags("trend"));
			tags.add(new Tags("coronavirus"));
			tags.add(new Tags("budget2020"));
			tags.add(new Tags("chinavirus"));
			tags.add(new Tags("yoga"));
			tagsRepository.saveAll(tags);
			List<Articles> articles=new ArrayList<>();
			articles.add(new Articles("Budget2020","Finance minister Nirmala Sitharaman on Saturday rolled out a new optional income tax regime that offers lower rates as a trade-off for foregoing exemptions for annual incomes up to Rs 15 lakh. The move was projected as an effort to provide relief and simplicity to taxpayers, particularly those at lower and middle income levels. The tax structure has been rejigged with the introduction of four thinly-sliced tax slabs between Rs 5 lakh and Rs 15 lakh with the rate applicable to each of them going down — from 20% to 10% between Rs 5 lakh and Rs 7.5 lakh, from 20% to 15% in the Rs 7.5 lakh-Rs 10 lakh bracket, from 30% to 20% for Rs 10 lakh-Rs 12.5 lakh and from 30% to 25% between Rs 12.5 lakh and Rs 15 lakh.",articleCategoryRepository.getOne(1),new Date(),articleCityRepository.getOne(560103),Arrays.asList(tagsRepository.getOne(1),tagsRepository.getOne(2)),authorRepository.getOne(1)));
			articles.add(new Articles("CoronaVirus","Corona Virus chinaolled out a new optional income tax regime that offers lower rates as a trade-off for foregoing exemptions for annual incomes up to Rs 15 lakh. The move was projected as an effort to provide relief and simplicity to taxpayers, particularly those at lower and middle income levels. The tax structure has been rejigged with the introduction of four thinly-sliced tax slabs between Rs 5 lakh and Rs 15 lakh with the rate applicable to each of them going down — from 20% to 10% between Rs 5 lakh and Rs 7.5 lakh, from 20% to 15% in the Rs 7.5 lakh-Rs 10 lakh bracket, from 30% to 20% for Rs 10 lakh-Rs 12.5 lakh and from 30% to 25% between Rs 12.5 lakh and Rs 15 lakh.",articleCategoryRepository.getOne(2),new Date(),articleCityRepository.getOne(560103),Arrays.asList(tagsRepository.getOne(2),tagsRepository.getOne(3)),authorRepository.getOne(1)));
			articles.add(new Articles("CoronaVirusChina","CoronaVirusChina s on Saturday rolled out a new optional income tax regime that offers lower rates as a trade-off for foregoing exemptions for annual incomes up to Rs 15 lakh. The move was projected as an effort to provide relief and simplicity to taxpayers, particularly those at lower and middle income levels. The tax structure has been rejigged with the introduction of four thinly-sliced tax slabs between Rs 5 lakh and Rs 15 lakh with the rate applicable to each of them going down — from 20% to 10% between Rs 5 lakh and Rs 7.5 lakh, from 20% to 15% in the Rs 7.5 lakh-Rs 10 lakh bracket, from 30% to 20% for Rs 10 lakh-Rs 12.5 lakh and from 30% to 25% between Rs 12.5 lakh and Rs 15 lakh.",articleCategoryRepository.getOne(3),new Date(),articleCityRepository.getOne(560103),Arrays.asList(tagsRepository.getOne(3),tagsRepository.getOne(2)),authorRepository.getOne(1)));
			articles.add(new Articles("CoronaVirusIndia","CoronaVirusIndia Sitharaman on Saturday rolled out a new optional income tax regime that offers lower rates as a trade-off for foregoing exemptions for annual incomes up to Rs 15 lakh. The move was projected as an effort to provide relief and simplicity to taxpayers, particularly those at lower and middle income levels. The tax structure has been rejigged with the introduction of four thinly-sliced tax slabs between Rs 5 lakh and Rs 15 lakh with the rate applicable to each of them going down — from 20% to 10% between Rs 5 lakh and Rs 7.5 lakh, from 20% to 15% in the Rs 7.5 lakh-Rs 10 lakh bracket, from 30% to 20% for Rs 10 lakh-Rs 12.5 lakh and from 30% to 25% between Rs 12.5 lakh and Rs 15 lakh.",articleCategoryRepository.getOne(1),new Date(),articleCityRepository.getOne(560037),Arrays.asList(tagsRepository.getOne(1),tagsRepository.getOne(3)),authorRepository.getOne(2)));
			articles.add(new Articles("CoronaVirusBengaluru","CoronaVirusBengaluru Sitharaman on Saturday rolled out a new optional income tax regime that offers lower rates as a trade-off for foregoing exemptions for annual incomes up to Rs 15 lakh. The move was projected as an effort to provide relief and simplicity to taxpayers, particularly those at lower and middle income levels. The tax structure has been rejigged with the introduction of four thinly-sliced tax slabs between Rs 5 lakh and Rs 15 lakh with the rate applicable to each of them going down — from 20% to 10% between Rs 5 lakh and Rs 7.5 lakh, from 20% to 15% in the Rs 7.5 lakh-Rs 10 lakh bracket, from 30% to 20% for Rs 10 lakh-Rs 12.5 lakh and from 30% to 25% between Rs 12.5 lakh and Rs 15 lakh.",articleCategoryRepository.getOne(2),new Date(),articleCityRepository.getOne(560037),Arrays.asList(tagsRepository.getOne(1)),authorRepository.getOne(2)));
			articles.add(new Articles("Budget2020 effect on Employees","Budget2020 effect on Employees Sitharaman on Saturday rolled out a new optional income tax regime that offers lower rates as a trade-off for foregoing exemptions for annual incomes up to Rs 15 lakh. The move was projected as an effort to provide relief and simplicity to taxpayers, particularly those at lower and middle income levels. The tax structure has been rejigged with the introduction of four thinly-sliced tax slabs between Rs 5 lakh and Rs 15 lakh with the rate applicable to each of them going down — from 20% to 10% between Rs 5 lakh and Rs 7.5 lakh, from 20% to 15% in the Rs 7.5 lakh-Rs 10 lakh bracket, from 30% to 20% for Rs 10 lakh-Rs 12.5 lakh and from 30% to 25% between Rs 12.5 lakh and Rs 15 lakh.",articleCategoryRepository.getOne(3),new Date(),articleCityRepository.getOne(560037),Arrays.asList(tagsRepository.getOne(2)),authorRepository.getOne(2)));
			articles.add(new Articles("Budget2020 effect to gdp","Budget2020 effect to gdp, Finance minister Nirmala Sitharaman on Saturday rolled out a new optional income tax regime that offers lower rates as a trade-off for foregoing exemptions for annual incomes up to Rs 15 lakh. The move was projected as an effort to provide relief and simplicity to taxpayers, particularly those at lower and middle income levels. The tax structure has been rejigged with the introduction of four thinly-sliced tax slabs between Rs 5 lakh and Rs 15 lakh with the rate applicable to each of them going down — from 20% to 10% between Rs 5 lakh and Rs 7.5 lakh, from 20% to 15% in the Rs 7.5 lakh-Rs 10 lakh bracket, from 30% to 20% for Rs 10 lakh-Rs 12.5 lakh and from 30% to 25% between Rs 12.5 lakh and Rs 15 lakh.",articleCategoryRepository.getOne(1),new Date(),articleCityRepository.getOne(515671),Arrays.asList(tagsRepository.getOne(3)),authorRepository.getOne(3)));
			articles.add(new Articles("Budget2020 Nifty fall","Budget2020 Nifty fall,Finance minister Nirmala Sitharaman on Saturday rolled out a new optional income tax regime that offers lower rates as a trade-off for foregoing exemptions for annual incomes up to Rs 15 lakh. The move was projected as an effort to provide relief and simplicity to taxpayers, particularly those at lower and middle income levels. The tax structure has been rejigged with the introduction of four thinly-sliced tax slabs between Rs 5 lakh and Rs 15 lakh with the rate applicable to each of them going down — from 20% to 10% between Rs 5 lakh and Rs 7.5 lakh, from 20% to 15% in the Rs 7.5 lakh-Rs 10 lakh bracket, from 30% to 20% for Rs 10 lakh-Rs 12.5 lakh and from 30% to 25% between Rs 12.5 lakh and Rs 15 lakh.",articleCategoryRepository.getOne(2),new Date(),articleCityRepository.getOne(515671),Arrays.asList(tagsRepository.getOne(1),tagsRepository.getOne(3)),authorRepository.getOne(3)));
			articles.add(new Articles("Budget2020 who are benefiting"," Budget2020 who are benefiting Finance minister Nirmala Sitharaman on Saturday rolled out a new optional income tax regime that offers lower rates as a trade-off for foregoing exemptions for annual incomes up to Rs 15 lakh. The move was projected as an effort to provide relief and simplicity to taxpayers, particularly those at lower and middle income levels. The tax structure has been rejigged with the introduction of four thinly-sliced tax slabs between Rs 5 lakh and Rs 15 lakh with the rate applicable to each of them going down — from 20% to 10% between Rs 5 lakh and Rs 7.5 lakh, from 20% to 15% in the Rs 7.5 lakh-Rs 10 lakh bracket, from 30% to 20% for Rs 10 lakh-Rs 12.5 lakh and from 30% to 25% between Rs 12.5 lakh and Rs 15 lakh.",articleCategoryRepository.getOne(3),new Date(),articleCityRepository.getOne(515671),Arrays.asList(tagsRepository.getOne(3),tagsRepository.getOne(2)),authorRepository.getOne(3)));
			repository.saveAll(articles);
		});
	}
}
