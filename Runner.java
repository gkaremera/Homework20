package edu.dmacc.codedsm.hw20;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Runner{

    public static void main(String[] args) {

        List<String> caje = Arrays.asList("Dog", "Cat", "Bird", "Monkey", "Donkey");
        List<Integer> namej = caje.stream(). map(s -> s.length()).collect( Collectors.toList());
        System.out.println(namej);

        List<String> cajes = caje.stream().filter(s->s.startsWith("D")).collect(Collectors.toList());
        System.out.println(cajes);

        Integer sum = caje.stream().map(s -> s.length()).reduce(0, (a, b) -> a + b);
        System.out.println(sum);




    }




    }



