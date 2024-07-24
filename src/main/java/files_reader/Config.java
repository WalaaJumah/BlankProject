/**
 * @author w.jumaa
 * @projectName blank_project
 * @classDescription
 */

package files_reader;

import lombok.Getter;
import lombok.Setter;
@Setter
@Getter
public class Config {
    private String username;
    private String password;

    public Config(String username, String password) {
        this.username = username;
        this.password = password;
    }
}
