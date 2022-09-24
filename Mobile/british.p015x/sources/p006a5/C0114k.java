package p006a5;

import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import javax.annotation.Nullable;

@Deprecated
/* renamed from: a5.k */
/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
public final class C0114k {
    /* renamed from: a */
    public static void m409a(@Nullable Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    @Deprecated
    /* renamed from: b */
    public static long m410b(InputStream inputStream, OutputStream outputStream) throws IOException {
        return m411c(inputStream, outputStream, false, 1024);
    }

    @Deprecated
    /* renamed from: c */
    public static long m411c(InputStream inputStream, OutputStream outputStream, boolean z, int i) throws IOException {
        byte[] bArr = new byte[i];
        long j = 0;
        while (true) {
            try {
                int read = inputStream.read(bArr, 0, i);
                if (read == -1) {
                    break;
                }
                j += (long) read;
                outputStream.write(bArr, 0, read);
            } catch (Throwable th) {
                if (z) {
                    m409a(inputStream);
                    m409a(outputStream);
                }
                throw th;
            }
        }
        if (z) {
            m409a(inputStream);
            m409a(outputStream);
        }
        return j;
    }

    @Deprecated
    /* renamed from: d */
    public static byte[] m412d(InputStream inputStream, boolean z) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        m411c(inputStream, byteArrayOutputStream, z, 1024);
        return byteArrayOutputStream.toByteArray();
    }
}
