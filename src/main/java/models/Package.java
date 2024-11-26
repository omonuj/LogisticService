package models;


import lombok.NoArgsConstructor;

import java.util.Date;

@NoArgsConstructor
public class Package {

    private String id;
    private String description;
    private Date creationDate;
    private int quantity;
    private int deliveryFee;
    private Sender sender;
    private String reciever;
    private String address;
}

