package com.jmacgyve.chapter3.searchingDependencies.CDL;

import com.jmacgyve.chapter3.searchingDependencies.CDL.interfaces.Container;
import com.jmacgyve.chapter3.searchingDependencies.CDL.interfaces.ManagedComponent;

//Поиск зависимостей: контекстный поиск зависимостей CDL
public class Main {
    public static void main(String[] args) {
        Container container = new DefaultContainer();

        ManagedComponent managedComponent = new ContextualizedDependencyLookup();
        managedComponent.performLookup(container);

        System.out.println(managedComponent);
    }
}
