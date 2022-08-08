package com.jmacgyve.chapter3.searchingDependencies.CDL;

import com.jmacgyve.chapter3.searchingDependencies.CDL.interfaces.Container;

//Получаем от контейнера объект по ключу (как в JNDI)
public class DefaultContainer implements Container {
    @Override
    public Object getDependency(String key) {
        if ("myDependency".equals(key)) {
            return new Dependency();
        }

        throw new RuntimeException("Unknown dependency: " + key);
    }
}
