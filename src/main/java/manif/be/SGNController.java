package manif.be;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SGNController {
    @GetMapping("/sgn")
    public String hi(){
        return "Shree Ganeshaya Namah";

    }
}
