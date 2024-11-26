package models;

import lombok.NoArgsConstructor;

import java.sql.Time;

@NoArgsConstructor
public class TrackingInformation {
    private String id;
    private String description;
    private String trackingNumber;
    private Time localDateTime;

}
