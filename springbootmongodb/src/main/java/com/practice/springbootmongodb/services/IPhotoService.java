package com.practice.springbootmongodb.services;

import com.practice.springbootmongodb.collection.Photo;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

public interface IPhotoService {
    String addPhoto(String name, MultipartFile image) throws IOException;

    Photo getPhoto(String id);
}
