package com.victor.devTest.Model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Option {
    private int id,votes;
    private String name;

    public Option(int id,String name) {
        this.id = id;
        this.name = name;
        this.votes = 0;
    }

    public Option(String name){
        this.name = name;
        this.id = 0;
        this.votes = 0;
    }

    public void setId(int id)
    {
        this.id = id;
    }


}
