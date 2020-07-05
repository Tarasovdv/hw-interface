package iostreams.hw;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.io.Serializable;

@AllArgsConstructor
@Getter

public class User implements Serializable {
    private String login;
     private transient int password;
}
