package com.mockitoadvanced.service;

import com.mockitoadvanced.fileio.FileReader;
import com.mockitoadvanced.fileio.FileWriter;

public class FileService {

    private FileReader reader;
    private FileWriter writer;

    public FileService(FileReader reader, FileWriter writer) {
        this.reader = reader;
        this.writer = writer;
    }

    public String processFile() {

        String content = reader.read();

        writer.write(content);

        return "Processed " + content;
    }
}