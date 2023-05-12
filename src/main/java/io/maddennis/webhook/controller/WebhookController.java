package io.maddennis.webhook.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class WebhookController {

    @PostMapping("/github")
    public ResponseEntity<String> messageFromGitHubWebHook(@RequestBody String string) {
        System.out.println("-------WebHook----- " + string);
        return new ResponseEntity<>(string, HttpStatus.OK);
    }
}
