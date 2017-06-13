package com.fufang.cloud;

import java.util.Arrays;
import java.util.List;

/**
 * Created by zhifu.chen on 2017/4/27.
 */
public class TestLambda {
    public static void main(String[] args) {
        System.out.println(33);
        String[] atp = {"Rafael Nadal", "Novak Djokovic",
                "Stanislas Wawrinka",
                "David Ferrer", "Roger Federer",
                "Andy Murray", "Tomas Berdych",
                "Juan Martin Del Potro"};
        List<String> players = Arrays.asList(atp);

        // 以前的循环方式
//        for (String player : players) {
//            System.out.println(player + "; ");
//        }

        // 使用 lambda 表达式以及函数操作(functional operation)
//        players.forEach((player)-> {System.out.println(player + ";");
//            System.out.println(333);});
//        Arrays.sort(atp, (String s1, String s2) -> (s1.compareTo(s2)));
//        new TestLambda().print((s) -> System.out.println(s));
        
    }
    
    void print(TT tt) {
        tt.print("22");
    }
    interface TT{
        void print(String a);
    }
}
