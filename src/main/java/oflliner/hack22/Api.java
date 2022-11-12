package oflliner.hack22;

import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.HashMap;
import java.util.Map;

@RequestMapping(value = "/api10", produces = MediaType.APPLICATION_JSON_VALUE)
@Validated
@CrossOrigin
@RestController
@RequiredArgsConstructor
public class Api {

    @GetMapping
    public Object root() throws UnknownHostException {
        return "hello offline?? worlddd";
    }
}
