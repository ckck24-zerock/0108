package org.example.snakegame;


import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class Tile {

    private int num;

    public Tile(int num) {
        this.num = num;
    }

}
