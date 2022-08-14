package com.jmacgyve.chapter3.dependencyInjection.beanFactory;

public class BookwormOracle implements Oracle {
    private Encyclopedia encyclopedia;

    public void setEncyclopedia(Encyclopedia encyclopedia) {
        this.encyclopedia = encyclopedia;
    }

    @Override
    public String defineMeaningOfLife() {
       return  "BookwormOracle defineMeaningOfLife in class BookwormOracle";
    }
}
