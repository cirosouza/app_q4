package infnet.edu.docker_test_service.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DockerTestController {

    @GetMapping("/teste")
    public String test() {
        return "O serviço está funcionando!";
    }
}
