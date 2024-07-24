/**
 * @author w.jumaa
 * @projectName EurekaJo
 * @classDescription
 */

package helper_classes;

import helper_classes.reading_helper.PropertiesHelpers;

public class Helper {
    static int WaitTime = Integer.parseInt(PropertiesHelpers.getValue("WAIT_TIME"));
}
