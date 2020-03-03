package ru.job4j.stream;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Profiles {

    public List<Address> collect(List<Profile> profiles) {
        return profiles.stream().map(profile -> profile.getAddress()).collect(Collectors.toList());
    }

    public List<Address> collectByCity(List<Profile> profiles) {
        return collect(profiles).stream().sorted(new SortedByCity()).distinct().collect(Collectors.toList());
    }

}