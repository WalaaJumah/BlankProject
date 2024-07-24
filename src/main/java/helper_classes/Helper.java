/**
 * @author w.jumaa
 * @projectName EurekaJo
 * @classDescription
 */

package helper_classes;

import files_reader.PropertiesHelpers;

public class Helper {
    static int WaitTime = Integer.parseInt(PropertiesHelpers.getValue("WAIT_TIME"));
}
