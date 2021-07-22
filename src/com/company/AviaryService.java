package com.company;

import java.util.List;

public interface AviaryService<T> {

    void add(List<T> t);
    void add(T t);
    void remove(T t);
    void remove(List<T> t);
    }
