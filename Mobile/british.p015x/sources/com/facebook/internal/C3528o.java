package com.facebook.internal;

import com.facebook.C3642m;
import com.facebook.C3752u;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Date;
import java.util.PriorityQueue;
import java.util.concurrent.atomic.AtomicLong;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

/* renamed from: com.facebook.internal.o */
/* compiled from: FileLruCache */
public final class C3528o {

    /* renamed from: h */
    static final String f13205h = "o";
    /* access modifiers changed from: private */

    /* renamed from: i */
    public static final AtomicLong f13206i = new AtomicLong();

    /* renamed from: a */
    private final String f13207a;

    /* renamed from: b */
    private final C3537g f13208b;

    /* renamed from: c */
    private final File f13209c;

    /* renamed from: d */
    private boolean f13210d;

    /* renamed from: e */
    private boolean f13211e;

    /* renamed from: f */
    private final Object f13212f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public AtomicLong f13213g = new AtomicLong(0);

    /* renamed from: com.facebook.internal.o$a */
    /* compiled from: FileLruCache */
    class C3529a implements C3539i {

        /* renamed from: a */
        final /* synthetic */ long f13214a;

        /* renamed from: b */
        final /* synthetic */ File f13215b;

        /* renamed from: c */
        final /* synthetic */ String f13216c;

        C3529a(long j, File file, String str) {
            this.f13214a = j;
            this.f13215b = file;
            this.f13216c = str;
        }

        public void onClose() {
            if (this.f13214a < C3528o.this.f13213g.get()) {
                this.f13215b.delete();
            } else {
                C3528o.this.m11817l(this.f13216c, this.f13215b);
            }
        }
    }

    /* renamed from: com.facebook.internal.o$b */
    /* compiled from: FileLruCache */
    class C3530b implements Runnable {

        /* renamed from: b */
        final /* synthetic */ File[] f13218b;

        C3530b(File[] fileArr) {
            this.f13218b = fileArr;
        }

        public void run() {
            for (File delete : this.f13218b) {
                delete.delete();
            }
        }
    }

    /* renamed from: com.facebook.internal.o$c */
    /* compiled from: FileLruCache */
    class C3531c implements Runnable {
        C3531c() {
        }

        public void run() {
            C3528o.this.m11818m();
        }
    }

    /* renamed from: com.facebook.internal.o$d */
    /* compiled from: FileLruCache */
    private static class C3532d {

        /* renamed from: a */
        private static final FilenameFilter f13221a = new C3533a();

        /* renamed from: b */
        private static final FilenameFilter f13222b = new C3534b();

        /* renamed from: com.facebook.internal.o$d$a */
        /* compiled from: FileLruCache */
        static class C3533a implements FilenameFilter {
            C3533a() {
            }

            public boolean accept(File file, String str) {
                return !str.startsWith("buffer");
            }
        }

        /* renamed from: com.facebook.internal.o$d$b */
        /* compiled from: FileLruCache */
        static class C3534b implements FilenameFilter {
            C3534b() {
            }

            public boolean accept(File file, String str) {
                return str.startsWith("buffer");
            }
        }

        /* renamed from: a */
        static void m11825a(File file) {
            File[] listFiles = file.listFiles(m11827c());
            if (listFiles != null) {
                for (File delete : listFiles) {
                    delete.delete();
                }
            }
        }

        /* renamed from: b */
        static FilenameFilter m11826b() {
            return f13221a;
        }

        /* renamed from: c */
        static FilenameFilter m11827c() {
            return f13222b;
        }

        /* renamed from: d */
        static File m11828d(File file) {
            return new File(file, "buffer" + Long.valueOf(C3528o.f13206i.incrementAndGet()).toString());
        }
    }

    /* renamed from: com.facebook.internal.o$e */
    /* compiled from: FileLruCache */
    private static class C3535e extends OutputStream {

        /* renamed from: b */
        final OutputStream f13223b;

        /* renamed from: c */
        final C3539i f13224c;

        C3535e(OutputStream outputStream, C3539i iVar) {
            this.f13223b = outputStream;
            this.f13224c = iVar;
        }

        public void close() throws IOException {
            try {
                this.f13223b.close();
            } finally {
                this.f13224c.onClose();
            }
        }

        public void flush() throws IOException {
            this.f13223b.flush();
        }

        public void write(byte[] bArr, int i, int i2) throws IOException {
            this.f13223b.write(bArr, i, i2);
        }

        public void write(byte[] bArr) throws IOException {
            this.f13223b.write(bArr);
        }

        public void write(int i) throws IOException {
            this.f13223b.write(i);
        }
    }

    /* renamed from: com.facebook.internal.o$g */
    /* compiled from: FileLruCache */
    public static final class C3537g {

        /* renamed from: a */
        private int f13227a = ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;

        /* renamed from: b */
        private int f13228b = 1024;

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public int mo12043a() {
            return this.f13227a;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public int mo12044b() {
            return this.f13228b;
        }
    }

    /* renamed from: com.facebook.internal.o$h */
    /* compiled from: FileLruCache */
    private static final class C3538h implements Comparable<C3538h> {

        /* renamed from: b */
        private final File f13229b;

        /* renamed from: c */
        private final long f13230c;

        C3538h(File file) {
            this.f13229b = file;
            this.f13230c = file.lastModified();
        }

        /* renamed from: a */
        public int compareTo(C3538h hVar) {
            if (mo12050i() < hVar.mo12050i()) {
                return -1;
            }
            if (mo12050i() > hVar.mo12050i()) {
                return 1;
            }
            return mo12047d().compareTo(hVar.mo12047d());
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public File mo12047d() {
            return this.f13229b;
        }

        public boolean equals(Object obj) {
            return (obj instanceof C3538h) && compareTo((C3538h) obj) == 0;
        }

        public int hashCode() {
            return ((1073 + this.f13229b.hashCode()) * 37) + ((int) (this.f13230c % 2147483647L));
        }

        /* access modifiers changed from: package-private */
        /* renamed from: i */
        public long mo12050i() {
            return this.f13230c;
        }
    }

    /* renamed from: com.facebook.internal.o$i */
    /* compiled from: FileLruCache */
    private interface C3539i {
        void onClose();
    }

    /* renamed from: com.facebook.internal.o$j */
    /* compiled from: FileLruCache */
    private static final class C3540j {
        /* renamed from: a */
        static JSONObject m11834a(InputStream inputStream) throws IOException {
            if (inputStream.read() != 0) {
                return null;
            }
            int i = 0;
            int i2 = 0;
            for (int i3 = 0; i3 < 3; i3++) {
                int read = inputStream.read();
                if (read == -1) {
                    C3561x.m11893g(C3752u.CACHE, C3528o.f13205h, "readHeader: stream.read returned -1 while reading header size");
                    return null;
                }
                i2 = (i2 << 8) + (read & 255);
            }
            byte[] bArr = new byte[i2];
            while (i < i2) {
                int read2 = inputStream.read(bArr, i, i2 - i);
                if (read2 < 1) {
                    C3752u uVar = C3752u.CACHE;
                    String str = C3528o.f13205h;
                    C3561x.m11893g(uVar, str, "readHeader: stream.read stopped at " + Integer.valueOf(i) + " when expected " + i2);
                    return null;
                }
                i += read2;
            }
            try {
                Object nextValue = new JSONTokener(new String(bArr)).nextValue();
                if (nextValue instanceof JSONObject) {
                    return (JSONObject) nextValue;
                }
                C3752u uVar2 = C3752u.CACHE;
                String str2 = C3528o.f13205h;
                C3561x.m11893g(uVar2, str2, "readHeader: expected JSONObject, got " + nextValue.getClass().getCanonicalName());
                return null;
            } catch (JSONException e) {
                throw new IOException(e.getMessage());
            }
        }

        /* renamed from: b */
        static void m11835b(OutputStream outputStream, JSONObject jSONObject) throws IOException {
            byte[] bytes = jSONObject.toString().getBytes();
            outputStream.write(0);
            outputStream.write((bytes.length >> 16) & 255);
            outputStream.write((bytes.length >> 8) & 255);
            outputStream.write((bytes.length >> 0) & 255);
            outputStream.write(bytes);
        }
    }

    public C3528o(String str, C3537g gVar) {
        this.f13207a = str;
        this.f13208b = gVar;
        File file = new File(C3642m.m12284j(), str);
        this.f13209c = file;
        this.f13212f = new Object();
        if (file.mkdirs() || file.isDirectory()) {
            C3532d.m11825a(file);
        }
    }

    /* renamed from: k */
    private void m11816k() {
        synchronized (this.f13212f) {
            if (!this.f13210d) {
                this.f13210d = true;
                C3642m.m12288n().execute(new C3531c());
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: l */
    public void m11817l(String str, File file) {
        if (!file.renameTo(new File(this.f13209c, C3481f0.m11612W(str)))) {
            file.delete();
        }
        m11816k();
    }

    /* access modifiers changed from: private */
    /* renamed from: m */
    public void m11818m() {
        long j;
        synchronized (this.f13212f) {
            this.f13210d = false;
            this.f13211e = true;
        }
        try {
            C3561x.m11893g(C3752u.CACHE, f13205h, "trim started");
            PriorityQueue priorityQueue = new PriorityQueue();
            File[] listFiles = this.f13209c.listFiles(C3532d.m11826b());
            long j2 = 0;
            if (listFiles != null) {
                j = 0;
                for (File file : listFiles) {
                    C3538h hVar = new C3538h(file);
                    priorityQueue.add(hVar);
                    C3561x.m11893g(C3752u.CACHE, f13205h, "  trim considering time=" + Long.valueOf(hVar.mo12050i()) + " name=" + hVar.mo12047d().getName());
                    j2 += file.length();
                    j++;
                }
            } else {
                j = 0;
            }
            while (true) {
                if (j2 > ((long) this.f13208b.mo12043a()) || j > ((long) this.f13208b.mo12044b())) {
                    File d = ((C3538h) priorityQueue.remove()).mo12047d();
                    C3561x.m11893g(C3752u.CACHE, f13205h, "  trim removing " + d.getName());
                    j2 -= d.length();
                    j--;
                    d.delete();
                } else {
                    synchronized (this.f13212f) {
                        this.f13211e = false;
                        this.f13212f.notifyAll();
                    }
                    return;
                }
            }
        } catch (Throwable th) {
            synchronized (this.f13212f) {
                this.f13211e = false;
                this.f13212f.notifyAll();
                throw th;
            }
        }
    }

    /* renamed from: e */
    public void mo12017e() {
        File[] listFiles = this.f13209c.listFiles(C3532d.m11826b());
        this.f13213g.set(System.currentTimeMillis());
        if (listFiles != null) {
            C3642m.m12288n().execute(new C3530b(listFiles));
        }
    }

    /* renamed from: f */
    public InputStream mo12018f(String str) throws IOException {
        return mo12019g(str, (String) null);
    }

    /* renamed from: g */
    public InputStream mo12019g(String str, String str2) throws IOException {
        File file = new File(this.f13209c, C3481f0.m11612W(str));
        try {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file), 8192);
            try {
                JSONObject a = C3540j.m11834a(bufferedInputStream);
                if (a == null) {
                    return null;
                }
                String optString = a.optString("key");
                if (optString != null) {
                    if (optString.equals(str)) {
                        String optString2 = a.optString("tag", (String) null);
                        if ((str2 != null || optString2 == null) && (str2 == null || str2.equals(optString2))) {
                            long time = new Date().getTime();
                            C3752u uVar = C3752u.CACHE;
                            String str3 = f13205h;
                            C3561x.m11893g(uVar, str3, "Setting lastModified to " + Long.valueOf(time) + " for " + file.getName());
                            file.setLastModified(time);
                            return bufferedInputStream;
                        }
                        bufferedInputStream.close();
                        return null;
                    }
                }
                bufferedInputStream.close();
                return null;
            } finally {
                bufferedInputStream.close();
            }
        } catch (IOException unused) {
            return null;
        }
    }

    /* renamed from: h */
    public InputStream mo12020h(String str, InputStream inputStream) throws IOException {
        return new C3536f(inputStream, mo12021i(str));
    }

    /* renamed from: i */
    public OutputStream mo12021i(String str) throws IOException {
        return mo12022j(str, (String) null);
    }

    /* renamed from: j */
    public OutputStream mo12022j(String str, String str2) throws IOException {
        File d = C3532d.m11828d(this.f13209c);
        d.delete();
        if (d.createNewFile()) {
            try {
                BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new C3535e(new FileOutputStream(d), new C3529a(System.currentTimeMillis(), d, str)), 8192);
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("key", str);
                    if (!C3481f0.m11604O(str2)) {
                        jSONObject.put("tag", str2);
                    }
                    C3540j.m11835b(bufferedOutputStream, jSONObject);
                    return bufferedOutputStream;
                } catch (JSONException e) {
                    C3752u uVar = C3752u.CACHE;
                    String str3 = f13205h;
                    C3561x.m11891e(uVar, 5, str3, "Error creating JSON header for cache file: " + e);
                    throw new IOException(e.getMessage());
                } catch (Throwable th) {
                    bufferedOutputStream.close();
                    throw th;
                }
            } catch (FileNotFoundException e2) {
                C3752u uVar2 = C3752u.CACHE;
                String str4 = f13205h;
                C3561x.m11891e(uVar2, 5, str4, "Error creating buffer output stream: " + e2);
                throw new IOException(e2.getMessage());
            }
        } else {
            throw new IOException("Could not create file at " + d.getAbsolutePath());
        }
    }

    public String toString() {
        return "{FileLruCache: tag:" + this.f13207a + " file:" + this.f13209c.getName() + "}";
    }

    /* renamed from: com.facebook.internal.o$f */
    /* compiled from: FileLruCache */
    private static final class C3536f extends InputStream {

        /* renamed from: b */
        final InputStream f13225b;

        /* renamed from: c */
        final OutputStream f13226c;

        C3536f(InputStream inputStream, OutputStream outputStream) {
            this.f13225b = inputStream;
            this.f13226c = outputStream;
        }

        public int available() throws IOException {
            return this.f13225b.available();
        }

        public void close() throws IOException {
            try {
                this.f13225b.close();
            } finally {
                this.f13226c.close();
            }
        }

        public void mark(int i) {
            throw new UnsupportedOperationException();
        }

        public boolean markSupported() {
            return false;
        }

        public int read(byte[] bArr) throws IOException {
            int read = this.f13225b.read(bArr);
            if (read > 0) {
                this.f13226c.write(bArr, 0, read);
            }
            return read;
        }

        public synchronized void reset() {
            throw new UnsupportedOperationException();
        }

        public long skip(long j) throws IOException {
            int read;
            byte[] bArr = new byte[1024];
            long j2 = 0;
            while (j2 < j && (read = read(bArr, 0, (int) Math.min(j - j2, (long) 1024))) >= 0) {
                j2 += (long) read;
            }
            return j2;
        }

        public int read() throws IOException {
            int read = this.f13225b.read();
            if (read >= 0) {
                this.f13226c.write(read);
            }
            return read;
        }

        public int read(byte[] bArr, int i, int i2) throws IOException {
            int read = this.f13225b.read(bArr, i, i2);
            if (read > 0) {
                this.f13226c.write(bArr, i, read);
            }
            return read;
        }
    }
}
