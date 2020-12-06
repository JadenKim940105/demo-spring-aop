package me.summerbell.demospringaop.proxy;

import org.springframework.stereotype.Service;

@Service
public class SimpleEventService implements EventService {
    @Override
    public void createEvent() {

        try {
            Thread.sleep(1000l);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("create an event");

    }

    @Override
    public void publishEvent() {

        try {
            Thread.sleep(1000l);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("publish an event");

    }
}
