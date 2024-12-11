package com.example.beans;

import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.stereotype.Component;

@Component
public class SingletonBean {

    public void executeTask() {
        PrototypeBean prototypeBean = getPrototypeBean();
        prototypeBean.performTask();
    }
    /*
     * The @Lookup annotation in Spring is used to inject a prototype-scoped bean into a singleton bean dynamically. It ensures that every time the prototype bean is needed, a new instance is created and injected.
     */
    @Lookup
    protected PrototypeBean getPrototypeBean() {
        // Spring overrides this method dynamically to return a new instance.
        return null;
    }
}
