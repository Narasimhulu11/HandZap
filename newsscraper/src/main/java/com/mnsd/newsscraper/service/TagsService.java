package com.mnsd.newsscraper.service;

import com.mnsd.newsscraper.model.Tags;
import com.mnsd.newsscraper.repository.TagsRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TagsService {

    private TagsRepository tagsRepository;

    public TagsService(TagsRepository tagsRepository) {
        this.tagsRepository = tagsRepository;
    }

    public Tags addArticleTags(String tag) {
        return this.tagsRepository.save(new Tags(tag));
    }

    public List<Tags> getAllTags() {
        return this.tagsRepository.findAll();
    }

    public List<Tags> getTags(List<Integer> tagsId) {
        return this.tagsRepository.findAllById(tagsId);
    }
}
