package com.company;

import java.nio.file.*;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Path filePath = Paths.get("C:\\Users\\Osama\\Documents\\test\\src\\com\\company\\java.txt");
        try {
            List<String> lines = Files.readAllLines(filePath);
            for (int i = 0; i < lines.size(); ) {
                if (lines.get(i).contains("/") || lines.get(i).contains("*")) {
                    lines.remove(i);
                }else i++;
            }
//          Files.write(filePath, lines);

          Files.write(filePath, lines,StandardOpenOption.APPEND);

        } catch (Exception e) {
            System.out.println("Uh-oh, could not read the file!");
        }
    }
}
