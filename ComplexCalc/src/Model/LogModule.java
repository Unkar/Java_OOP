package Model;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;
import java.util.HashMap;

public class LogModule implements iLogger {
    private String entry = "";

    private String fileName;

    private final Date date = new Date();


    public LogModule(String fileName) {
        this.fileName = fileName;
        try (FileWriter fw = new FileWriter(fileName, true)) {
            fw.flush();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void update(String message) {
        entry += message + " ";
    }

    @Override
    public void writeToLogFile() {
        try (FileWriter fw = new FileWriter(fileName, true)) {
            fw.write(date.toString() + " ::: " + entry+"\n");
            fw.flush();
            fw.close();
            entry = "";
        } catch (Exception e) {
            System.out.println(e.getMessage());;
        }
    }
}
