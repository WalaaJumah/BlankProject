/**
 * @author w.jumaa
 * @projectName Talent-Seeker_Tool
 * @classDescription
 */

package constants;

import files_reader.PropertiesHelpers;

public class FrameworkConstants {
    public FrameworkConstants(){PropertiesHelpers.loadProperties();}
    public static final String READ_FROM = PropertiesHelpers.getValue("read_from") ;
    public static final String READ_FROM_JSON_PATH = PropertiesHelpers.getValue("read_from_Json_path") ;
    public static final String READ_FROM_JSON_EXCEL = PropertiesHelpers.getValue("read_from_Json_excel") ;
    public static final String BROWSER = PropertiesHelpers.getValue("BROWSER") ;
    public static final String HEADLESS = PropertiesHelpers.getValue("HEADLESS") ;
    public static final String BASE_URL = PropertiesHelpers.getValue("linkedin.com") ;


}
