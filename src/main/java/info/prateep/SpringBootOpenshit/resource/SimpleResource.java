package info.prateep.SpringBootOpenshit.resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by prateepgedupudi on 9/15/17.
 */
@RestController
public class SimpleResource {
    @RequestMapping("/")
    public String root(){
        return "Hello Prateep";
    }

}
