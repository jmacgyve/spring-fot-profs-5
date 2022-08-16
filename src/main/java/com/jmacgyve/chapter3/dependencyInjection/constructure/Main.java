package com.jmacgyve.chapter3.dependencyInjection.constructure;

import com.jmacgyve.chapter3.searchingDependencies.CDL.ContextualizedDependencyLookup;
import com.jmacgyve.chapter3.searchingDependencies.CDL.DefaultContainer;
import com.jmacgyve.chapter3.searchingDependencies.CDL.Dependency;
import com.jmacgyve.chapter3.searchingDependencies.CDL.interfaces.Container;
import com.jmacgyve.chapter3.searchingDependencies.CDL.interfaces.ManagedComponent;

//внедрение зависимостей через конструктор
public class Main {
    public static void main(String... args) {
        Container container = new DefaultContainer();
        ManagedComponent managedComponent = new ContextualizedDependencyLookup((Dependency) container.getDependency("myDependency"));
        System.out.println(managedComponent);
    }
}
