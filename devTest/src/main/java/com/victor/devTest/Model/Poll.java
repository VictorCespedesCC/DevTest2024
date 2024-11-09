package com.victor.devTest.Model;

import lombok.*;

import java.util.List;


@Getter
@Setter
@NoArgsConstructor
public class Poll {

    private int id;
    private String name;
    private Option[] options;

    public Poll(int id, String name,Option[] options){
        this.id = id;
        this.name = name;
        this.options = options;
    }

    public Poll(String name, Option[] options){
        this.name = name;
        this.options = options;
    }

    public int getId() {
        return id;
    }

    public void setId(int newId) {
        this.id = newId;
    }

    public Option[] getOptions() {
        return options;
    }
}
