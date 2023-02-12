package com.epam.mjc;

import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.Optional;
import java.util.stream.Collectors;

public class CollectionService {

    public List<Integer> filterEvenNumbers(List<Integer> list) {
        return list.stream().filter(num -> num % 2 == 0).collect(Collectors.toList());
    }

    public List<String> toUpperCaseCollection(List<String> list) {
       return list.stream().map( element -> element.toUpperCase(Locale.ROOT))
               .collect(Collectors.toList());
    }

    public Optional<Integer> findMax(List<Integer> list) {
        return list.stream().max(Comparator.naturalOrder());
    }

    public Optional<Integer> findMin(List<List<Integer>> list) {
        return list.stream().flatMap(lists->lists.stream()).min((Comparator.naturalOrder()));
    }

    public Integer sum(List<Integer> list) {
        return list.stream().reduce(0,Integer::sum);
    }
}
