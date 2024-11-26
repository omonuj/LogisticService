package services;

import models.Sender;

import java.util.Date;

public interface PackageService {

    void id();
    void description();
    void creationDate();
    void quantity();
    void deliveryFee();
    void sender(Sender sender);
    void reciever();
    void  address();
}
