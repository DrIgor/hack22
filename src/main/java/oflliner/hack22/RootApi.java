package oflliner.hack22;


import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.URI;

@RequestMapping
@Validated
@CrossOrigin
@RestController
@RequiredArgsConstructor
public class RootApi {

    @GetMapping
    @SneakyThrows
    public ResponseEntity<Object> root() {
        var hackathon = new URI("http://hackathon-budva.s3-website.eu-central-1.amazonaws.com/");
        var headers = new HttpHeaders();
        headers.setLocation(hackathon);
        return new ResponseEntity<>(headers, HttpStatus.SEE_OTHER);
    }
}
