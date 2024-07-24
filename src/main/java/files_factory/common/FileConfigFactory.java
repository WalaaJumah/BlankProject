/**
 * @author w.jumaa
 * @projectName Talent-Seeker_Tool
 * @classDescription
 */

package files_factory.common;

import constants.FrameworkConstants;
import files_factory.Json.JSONReader;
import files_factory.excel.ExcelReader;

import java.io.IOException;

public class FileConfigFactory {
    public static IAttributesFile getJobDetails() throws IOException {
        switch (FrameworkConstants.READ_FROM) {
            case "json":
                return new JSONReader();
            case "api":
                return null;
            case "excel":
                return new ExcelReader();
            default:
                throw new RuntimeException("Incorrect Browser: " + FrameworkConstants.READ_FROM);
        }
    }
}
