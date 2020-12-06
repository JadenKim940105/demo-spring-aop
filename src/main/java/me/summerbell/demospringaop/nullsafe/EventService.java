package me.summerbell.demospringaop.nullsafe;

import org.springframework.lang.NonNull;
import org.springframework.stereotype.Service;

@Service
public class EventService {

    @NonNull
    public String  createService(@NonNull String name){
        return "hello " + name;
    }
}
