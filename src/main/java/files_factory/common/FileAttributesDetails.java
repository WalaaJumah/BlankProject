/**
 * @author w.jumaa
 * @projectName Talent-Seeker_Tool
 * @classDescription
 */

package files_factory.common;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FileAttributesDetails {
    @JsonProperty("position")
    public String position;
    @JsonProperty("read_from")
    public String  read_from;
    @JsonProperty("file-path")
    public String file_path;
    @JsonProperty("write-File")
    public String write_File;
    @JsonProperty("enable")
    public boolean enable;


}
