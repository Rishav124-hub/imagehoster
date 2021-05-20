package com.upgrad.technical.service.dao;

import com.upgrad.technical.service.entity.ImageEntity;
import com.upgrad.technical.service.entity.UserAuthTokenEntity;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
public class ImageDao {

    @PersistenceContext
    private EntityManager entityManager;

    public ImageEntity createImage(ImageEntity imageEntity) {
        entityManager.persist(imageEntity);
        return imageEntity;
    }

    public UserAuthTokenEntity getUserAuthToken(final String accesstoken) {
        return null;
    }

    public ImageEntity getImage(final String imageUuid) {
        return null;
    }

    public ImageEntity getImageById(final long Id) {
        return null;
    }

    public ImageEntity updateImage(final ImageEntity imageEntity) {
        return null;

    }
}
