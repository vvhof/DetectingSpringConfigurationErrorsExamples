package de.wwu.springerrors;

import java.util.concurrent.Future;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.AsyncResult;

/**
 *
 * @author Konrad Fögen
 */
@Async
public class Lecture {
    public void async() {
    }
    
    public Future async2() {
        return null;
    }
    
    public String async3() {
        return null;
    }
    
    public AsyncResult<String> async4() {
        return null;
    }
}
