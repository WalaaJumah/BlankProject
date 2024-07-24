/**
 * @author w.jumaa
 * @projectName Talent-Seeker_Tool
 * @classDescription
 */

package files_factory.excel;

import constants.FrameworkConstants;
import files_factory.common.FileAttributesDetails;
import files_factory.common.IAttributesFile;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ExcelReader implements IAttributesFile {

    @Override
    public List<FileAttributesDetails> getJobVacancyDetails() throws IOException {
        List<FileAttributesDetails> jobVacancyDetails = new ArrayList<>();
        FileInputStream excelFile = new FileInputStream((FrameworkConstants.READ_FROM_JSON_EXCEL));
        Workbook workbook = new XSSFWorkbook(excelFile);

        // Assuming the data is in the first sheet
        Sheet sheet = workbook.getSheetAt(0);

        // Find the column indices based on the column titles
        int positionIndex = -1;
        int filePathIndex = -1;
        int readFromIndex = -1;
        int writeFileIndex = -1;
        int enableIndex = -1;

        // Assuming the titles are in the first row
        Row firstRow = sheet.getRow(0);
        Iterator<Cell> cellIterator = firstRow.cellIterator();
        int currentIndex = 0;
        while (cellIterator.hasNext()) {
            Cell cell = cellIterator.next();
            String title = cell.getStringCellValue().trim().toLowerCase();

            // Adjust the title comparison as needed (e.g., handle case differences)
            switch (title) {
                case "position":
                    positionIndex = currentIndex;
                    break;
                case "file_path":
                    filePathIndex = currentIndex;
                    break;
                case "read_from":
                    readFromIndex = currentIndex;
                    break;
                case "enable":
                    enableIndex = currentIndex;
                    case "write_File":
                    writeFileIndex = currentIndex;

                    break;
                // Add more cases for other titles as needed
            }

            currentIndex++;
        }

        // Iterate through rows
        for (Row row : sheet) {
            // Skip the first row with column titles
            if (row.getRowNum() == 0) {
                continue;
            }

            // Create FileAttributesDetails object for each row
            FileAttributesDetails vacancyDetails = new FileAttributesDetails();

            // Iterate through cells in the current row
            Iterator<Cell> dataCellIterator = row.cellIterator();
            int cellIndex = 0;
            while (dataCellIterator.hasNext()) {
                Cell cell = dataCellIterator.next();

                // Assign cell value to the appropriate property based on the column index
// Assign cell value to the appropriate property based on the column index
                if (cellIndex == positionIndex) {
                    vacancyDetails.setPosition(cell.getStringCellValue());
                } else if (cellIndex == filePathIndex) {
                    vacancyDetails.setFile_path(cell.getStringCellValue());
                } else if (cellIndex == readFromIndex) {
                    vacancyDetails.setRead_from(cell.getStringCellValue());
                } else if (cellIndex == enableIndex) {
                    vacancyDetails.setEnable(cell.getBooleanCellValue());
                } else if (cellIndex == writeFileIndex) {
                    vacancyDetails.setWrite_File(cell.getStringCellValue());                }

                cellIndex++;
            }

            // Add FileAttributesDetails to the list
            jobVacancyDetails.add(vacancyDetails);
        }

        // Print the first item in the list (assuming it's not empty)
        if (!jobVacancyDetails.isEmpty()) {
            System.out.println(jobVacancyDetails.get(0));
        }

        workbook.close();
        return jobVacancyDetails;
    }
}