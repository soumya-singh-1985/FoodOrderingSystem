package Models;

import lombok.Getter;

import java.util.UUID;

@Getter
public class User {
    private String id = UUID.randomUUID().toString();
    private String name;
}
