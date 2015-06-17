package de.wwu.springerrors;

import java.util.concurrent.Future;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.AsyncResult;

/**
 *
 * @author Konrad Fögen 
 */
public class Person {

    @Async
    public void async() {
    }

    @Async
    public Future async2() {
        return null;
    }

    @Async
    public String async3() {
        return null;
    }

    @Async
    public AsyncResult<Void> async4() {
        return null;
    }

}
