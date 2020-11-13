package com.example.crud.controller;

import com.example.crud.model.PhotoEntity;
import com.example.crud.repository.FlickrRepo;
import com.flickr4java.flickr.Flickr;
import com.flickr4java.flickr.FlickrException;
import com.flickr4java.flickr.REST;
import com.flickr4java.flickr.photos.Photo;
import com.flickr4java.flickr.photos.PhotoList;
import com.flickr4java.flickr.photos.PhotosInterface;
import com.flickr4java.flickr.photos.SearchParameters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.springframework.beans.factory.annotation.Value;

@RestController
public class FlickrController {
    @Autowired
    FlickrRepo flickrRepo;
    
    @Value("${api.key}")
    private String apiKey;
    
    @Value("${secret.key}")
    private String secretKey;
    
    @GetMapping("/flickr")
    public PhotoList<Photo> search(@RequestParam String text) throws FlickrException {
        Flickr f = new Flickr(apiKey, secretKey, new REST());
        // TestInterface testInterface = f.getTestInterface();
        // Collection results = testInterface.echo(Collections.EMPTY_MAP);
        
        PhotosInterface photos = f.getPhotosInterface();
        SearchParameters params = new SearchParameters();
        params.setMedia("videos"); // One of "photos", "videos" or "all"
        params.setExtras(Stream.of("media").collect(Collectors.toSet()));
        params.setText(text);
        PhotoList<Photo> results = photos.search(params, 5, 0);

        PhotoEntity photo = new PhotoEntity();
                
        results.forEach(p ->
        {
            photo.setTitle(p.getTitle());
            photo.setUrl(p.getUrl());
            flickrRepo.save(photo);
//            System.out.println(String.format("Title: %s", p.getTitle()));
//            System.out.println(String.format("Media: %s", p.getMedia()));
//            System.out.println(String.format("Original Video URL: %s", p.getVideoOriginalUrl()));
        });
        return results;
    }
    

}