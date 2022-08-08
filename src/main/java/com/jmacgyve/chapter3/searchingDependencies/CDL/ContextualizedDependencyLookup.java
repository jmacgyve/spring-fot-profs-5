package com.jmacgyve.chapter3.searchingDependencies.CDL;

import com.jmacgyve.chapter3.searchingDependencies.CDL.interfaces.Container;
import com.jmacgyve.chapter3.searchingDependencies.CDL.interfaces.ManagedComponent;

//Зависимый объект осуществляет поиск - Идет в Контейнер
public class ContextualizedDependencyLookup implements ManagedComponent {
    private Dependency dependency;
    @Override
    public void performLookup(Container container) {
        this.dependency = (Dependency) container.getDependency("myDependency");
    }

    @Override
    public String toString() {
        return "ContextualizedDependencyLookup{" +
                "dependency=" + dependency +
                '}';
    }
}
