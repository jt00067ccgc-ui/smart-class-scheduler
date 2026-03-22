package backend.java.scheduler;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.FileOutputStream;
import java.io.IOException;

public class ExcelWriter {

    public static void writeScheduleToExcel(String filePath, String[][] scheduleData) {
        Workbook workbook = new XSSFWorkbook();
        Sheet sheet = workbook.createSheet("Schedule");

        // Create header row
        Row headerRow = sheet.createRow(0);
        String[] headers = {"Section", "Professor", "Room", "TimeSlot", "Day", "SubjectCode"};
        for (int i = 0; i < headers.length; i++) {
            Cell cell = headerRow.createCell(i);
            cell.setCellValue(headers[i]);
            CellStyle style = workbook.createCellStyle();
            Font font = workbook.createFont();
            font.setBold(true);
            style.setFont(font);
            cell.setCellStyle(style);
        }

        // Fill in schedule data
        for (int i = 0; i < scheduleData.length; i++) {
            Row row = sheet.createRow(i + 1);
            for (int j = 0; j < scheduleData[i].length; j++) {
                Cell cell = row.createCell(j);
                cell.setCellValue(scheduleData[i][j]);
            }
        }

        // Auto-size columns
        for (int i = 0; i < headers.length; i++) {
            sheet.autoSizeColumn(i);
        }

        // Write to file
        try (FileOutputStream fileOut = new FileOutputStream(filePath)) {
            workbook.write(fileOut);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                workbook.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}