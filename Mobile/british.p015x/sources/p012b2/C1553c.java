package p012b2;

import com.google.android.exoplayer2.C6540C;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;

/* renamed from: b2.c */
/* compiled from: Util */
final class C1553c {

    /* renamed from: a */
    static final Charset f6649a = Charset.forName(C6540C.ASCII_NAME);

    /* renamed from: b */
    static final Charset f6650b = Charset.forName(C6540C.UTF8_NAME);

    /* renamed from: a */
    static void m7975a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e) {
                throw e;
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: b */
    static void m7976b(File file) throws IOException {
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            int length = listFiles.length;
            int i = 0;
            while (i < length) {
                File file2 = listFiles[i];
                if (file2.isDirectory()) {
                    m7976b(file2);
                }
                if (file2.delete()) {
                    i++;
                } else {
                    throw new IOException("failed to delete file: " + file2);
                }
            }
            return;
        }
        throw new IOException("not a readable directory: " + file);
    }
}
