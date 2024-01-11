package fr.enimaloc.respack.gson;

import org.jetbrains.annotations.NotNull;

import java.io.IOException;
import java.io.Writer;

public class UnicodeWriter extends Writer {
    private final Writer out;

    public UnicodeWriter(Writer out) {
        this.out = out;
    }

    @Override
    public void write(char @NotNull [] buffer, int offset, int count) throws IOException {
        for (int i = 0; i < count; i++) {
            char c = buffer[i + offset];
            char next = i + offset + 1 < count ? buffer[i + offset + 1] : 0;
            if (c == '\\' && next == 'u') {
                continue;
            }
            out.write(c);
        }
    }

    @Override
    public void flush() throws IOException {
        out.flush();
    }

    @Override
    public void close() throws IOException {
        out.close();
    }
}
