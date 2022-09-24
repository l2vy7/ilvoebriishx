package com.startapp;

import com.startapp.simple.bloomfilter.codec.StringBuilderWriter;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;

/* renamed from: com.startapp.z3 */
/* compiled from: Sta */
public class C12463z3 {
    static {
        char c = File.separatorChar;
        StringBuilderWriter stringBuilderWriter = new StringBuilderWriter(4);
        PrintWriter printWriter = new PrintWriter(stringBuilderWriter);
        printWriter.println();
        stringBuilderWriter.toString();
        printWriter.close();
    }

    /* renamed from: a */
    public static void m53806a(OutputStream outputStream) {
        if (outputStream != null) {
            try {
                outputStream.close();
            } catch (IOException unused) {
            }
        }
    }
}
