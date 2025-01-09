package org.example.snakegame;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@ToString
@Setter
public class Tile {

    private int num;
    private String desc;

    public Tile(int num) {
        this.num = num;
    }

}
