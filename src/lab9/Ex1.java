package lab9;

import reactor.core.publisher.Flux;

import java.time.Duration;
import java.util.Arrays;

public class Ex1 {
    Flux<String> emptyFlux() {
        return Flux.empty();
    }

    Flux<String> fooBarFlux() {
        String[] strings = {"Foo","Bar"};
        return Flux.<String>fromArray(strings);
    }

    public static void main(String[] args) throws InterruptedException {
//        Flux.interval(Duration.ofMillis(250))
//                .map(input -> {
//                    if ( input < 3) return "tick " + input;
//                    throw new RuntimeException("boom");
//                })
//                .retry(2)
//                .elapsed()
//                .subscribe(System.out::println, System.err::println);
//        Thread.sleep(2100);

        Ex1 e1= new Ex1();
        e1.fooBarFlux().subscribe(System.out::println);
    }
}