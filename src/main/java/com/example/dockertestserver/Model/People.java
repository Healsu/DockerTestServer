package com.example.dockertestserver.Model;


import com.fasterxml.jackson.annotation.JsonTypeId;
import com.sun.xml.txw2.annotation.XmlCDATA;

import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@NoArgsConstructor
@Entity

public class People {
@Id
@GeneratedValue (strategy = GenerationType.IDENTITY)
    private long id;
    String name;

    public People(String name) {
        this.name = name;
    }
}
