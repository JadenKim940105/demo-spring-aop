package me.summerbell.demospringaop.aop;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component @Primary
public class BikeFactory implements Factory{
    @Override
    public void produce() {
        try {
            Thread.sleep(1000l);
            System.out.println("make a bike");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
