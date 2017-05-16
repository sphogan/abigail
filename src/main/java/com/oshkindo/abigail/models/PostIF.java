package com.oshkindo.abigail.models;

import org.immutables.value.Value;
import rocks.davenport.immutables.DavenportStyle;

import javax.persistence.Entity;
import javax.persistence.Id;

@Value.Modifiable
@Entity
@DavenportStyle
public interface PostIF {
    @Id
    int getId();
    String getTitle();
    String getSlug();
    String getBody();
    long getTimestamp();
}
