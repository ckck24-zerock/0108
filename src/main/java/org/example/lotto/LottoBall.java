package org.example.lotto;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

//step1. 명사로 클래스를 정의

@AllArgsConstructor
public class LottoBall {

    int num;

    @Override
    public String toString() {
        return "LottoBall{" +
                "num=" + num +
                '}';
    }
}
