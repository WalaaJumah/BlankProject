/**
 * @author w.jumaa
 * @projectName Talent-Seeker_Tool
 * @classDescription
 */

package files_factory.Json;

import com.fasterxml.jackson.databind.ObjectMapper;
import constants.FrameworkConstants;
import files_factory.common.FileAttributesDetails;
import files_factory.common.IAttributesFile;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class JSONReader implements IAttributesFile {
    String configFilePath;

    @Override
    public List<FileAttributesDetails> getJobVacancyDetails() throws IOException {
        List<FileAttributesDetails> jobVacancyDetails;
        ObjectMapper objectMapper= new ObjectMapper();
       FileAttributesDetails[] map= objectMapper.readValue(new File(FrameworkConstants.READ_FROM_JSON_PATH), FileAttributesDetails[].class);
       if(map!=null) {
           jobVacancyDetails = Arrays.asList(map);
       }
       else{
           jobVacancyDetails= new ArrayList<>();
       }
        return jobVacancyDetails;
    }

}
