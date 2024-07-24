/**
 * @author w.jumaa
 * @projectName blank_project
 * @classDescription
 */

package files_reader;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ExcelReader {
    private String filePath;
    private String sheetName;

    public ExcelReader(String filePath, String sheetName) {
        this.filePath = filePath;
        this.sheetName = sheetName;
    }

    public List<Config> readConfigs() {
        List<Config> configs = new ArrayList<>();
        try (FileInputStream fis = new FileInputStream(filePath)) {
            Workbook workbook = new XSSFWorkbook(fis);
            Sheet sheet = workbook.getSheet(sheetName);

            for (Row row : sheet) {
                Cell usernameCell = row.getCell(0);
                Cell passwordCell = row.getCell(1);

                if (usernameCell != null && passwordCell != null) {
                    String username = usernameCell.getStringCellValue().trim();
                    String password = passwordCell.getStringCellValue().trim();
                    configs.add(new Config(username, password));
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return configs;
    }
}
