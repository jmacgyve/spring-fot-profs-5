package com.jmacgyve.chapter3.dependencyInjection.deployingMethod;

import com.jmacgyve.chapter3.searchingDependencies.CDL.ContextualizedDependencyLookup;
import com.jmacgyve.chapter3.searchingDependencies.CDL.DefaultContainer;
import com.jmacgyve.chapter3.searchingDependencies.CDL.Dependency;
import com.jmacgyve.chapter3.searchingDependencies.CDL.interfaces.Container;

//внедрение зависимостей через метод установки
public class Main {
    public static void main(String... args) {
        Container container = new DefaultContainer();

        ContextualizedDependencyLookup managedComponent = new ContextualizedDependencyLookup();
        managedComponent.setDependency((Dependency) container.getDependency("myDependency"));

        System.out.println(managedComponent);
    }
}
