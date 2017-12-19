package com.rx.study.service;

import io.reactivex.Observable;
import org.reactivestreams.Subscriber;
import org.springframework.stereotype.Service;

@Service
public class RunService {

    public void run() {
        Observable<String> myStrings = Observable.just("Alpha", "Beta", "Gamma", "Delta","Epsilon");
        myStrings.subscribe(s -> System.out.println());
    }
}
