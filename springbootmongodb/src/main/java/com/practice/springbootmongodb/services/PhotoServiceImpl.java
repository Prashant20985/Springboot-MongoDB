package com.practice.springbootmongodb.services;

import com.practice.springbootmongodb.collection.Photo;
import com.practice.springbootmongodb.repository.PhotoRepository;
import org.bson.BsonBinarySubType;
import org.bson.types.Binary;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@Service
public class PhotoServiceImpl implements IPhotoService{

    @Autowired
    private PhotoRepository photoRepository;

    @Override
    public String addPhoto(String name, MultipartFile image) throws IOException {

        Photo photo = new Photo();
        photo.setTitle(name);
        photo.setPhoto(new Binary(BsonBinarySubType.BINARY, image.getBytes()));
        return photoRepository.save(photo).getId();
    }

    @Override
    public Photo getPhoto(String id) {
        return photoRepository.findById(id).get();
    }
}
