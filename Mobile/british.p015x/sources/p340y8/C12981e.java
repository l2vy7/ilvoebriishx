package p340y8;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;

/* renamed from: y8.e */
/* compiled from: FileBody */
public class C12981e extends C12977a {

    /* renamed from: d */
    private final File f55719d;

    /* renamed from: e */
    private final String f55720e;

    /* renamed from: f */
    private final String f55721f;

    public C12981e(File file, String str, String str2, String str3) {
        super(str2);
        if (file != null) {
            this.f55719d = file;
            if (str != null) {
                this.f55720e = str;
            } else {
                this.f55720e = file.getName();
            }
            this.f55721f = str3;
            return;
        }
        throw new IllegalArgumentException("File may not be null");
    }

    /* renamed from: a */
    public void mo48154a(OutputStream outputStream) throws IOException {
        if (outputStream != null) {
            FileInputStream fileInputStream = new FileInputStream(this.f55719d);
            try {
                byte[] bArr = new byte[4096];
                while (true) {
                    int read = fileInputStream.read(bArr);
                    if (read != -1) {
                        outputStream.write(bArr, 0, read);
                    } else {
                        outputStream.flush();
                        return;
                    }
                }
            } finally {
                fileInputStream.close();
            }
        } else {
            throw new IllegalArgumentException("Output stream may not be null");
        }
    }

    /* renamed from: b */
    public long mo48155b() {
        return this.f55719d.length();
    }

    /* renamed from: c */
    public String mo48156c() {
        return "binary";
    }

    /* renamed from: d */
    public String mo48157d() {
        return this.f55721f;
    }

    /* renamed from: f */
    public String mo48158f() {
        return this.f55720e;
    }

    public C12981e(File file, String str, String str2) {
        this(file, (String) null, str, str2);
    }

    public C12981e(File file, String str) {
        this(file, str, (String) null);
    }

    public C12981e(File file) {
        this(file, "application/octet-stream");
    }
}
