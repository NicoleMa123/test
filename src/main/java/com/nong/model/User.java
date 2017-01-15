package com.nong.model;

/**
 * Created by jackeyleon on 2016/12/28.
 */
public class User {
    Long id;
    String name;

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
