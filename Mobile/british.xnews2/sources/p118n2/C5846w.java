package p118n2;

import com.google.android.exoplayer2.C6540C;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import p086h2.C5382b;

/* renamed from: n2.w */
/* compiled from: RecyclableBufferedInputStream */
public class C5846w extends FilterInputStream {

    /* renamed from: b */
    private volatile byte[] f24587b;

    /* renamed from: c */
    private int f24588c;

    /* renamed from: d */
    private int f24589d;

    /* renamed from: e */
    private int f24590e;

    /* renamed from: f */
    private int f24591f;

    /* renamed from: g */
    private final C5382b f24592g;

    /* renamed from: n2.w$a */
    /* compiled from: RecyclableBufferedInputStream */
    static class C5847a extends IOException {
        C5847a(String str) {
            super(str);
        }
    }

    public C5846w(InputStream inputStream, C5382b bVar) {
        this(inputStream, bVar, C6540C.DEFAULT_BUFFER_SEGMENT_SIZE);
    }

    /* renamed from: c */
    private int m25826c(InputStream inputStream, byte[] bArr) throws IOException {
        int i;
        int i2 = this.f24590e;
        if (i2 == -1 || this.f24591f - i2 >= (i = this.f24589d)) {
            int read = inputStream.read(bArr);
            if (read > 0) {
                this.f24590e = -1;
                this.f24591f = 0;
                this.f24588c = read;
            }
            return read;
        }
        if (i2 == 0 && i > bArr.length && this.f24588c == bArr.length) {
            int length = bArr.length * 2;
            if (length <= i) {
                i = length;
            }
            byte[] bArr2 = (byte[]) this.f24592g.mo21806d(i, byte[].class);
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
            this.f24587b = bArr2;
            this.f24592g.put(bArr);
            bArr = bArr2;
        } else if (i2 > 0) {
            System.arraycopy(bArr, i2, bArr, 0, bArr.length - i2);
        }
        int i3 = this.f24591f - this.f24590e;
        this.f24591f = i3;
        this.f24590e = 0;
        this.f24588c = 0;
        int read2 = inputStream.read(bArr, i3, bArr.length - i3);
        int i4 = this.f24591f;
        if (read2 > 0) {
            i4 += read2;
        }
        this.f24588c = i4;
        return read2;
    }

    /* renamed from: f */
    private static IOException m25827f() throws IOException {
        throw new IOException("BufferedInputStream is closed");
    }

    public synchronized int available() throws IOException {
        InputStream inputStream;
        inputStream = this.in;
        if (this.f24587b == null || inputStream == null) {
            throw m25827f();
        }
        return (this.f24588c - this.f24591f) + inputStream.available();
    }

    public void close() throws IOException {
        if (this.f24587b != null) {
            this.f24592g.put(this.f24587b);
            this.f24587b = null;
        }
        InputStream inputStream = this.in;
        this.in = null;
        if (inputStream != null) {
            inputStream.close();
        }
    }

    /* renamed from: d */
    public synchronized void mo22746d() {
        this.f24589d = this.f24587b.length;
    }

    /* renamed from: e */
    public synchronized void mo22747e() {
        if (this.f24587b != null) {
            this.f24592g.put(this.f24587b);
            this.f24587b = null;
        }
    }

    public synchronized void mark(int i) {
        this.f24589d = Math.max(this.f24589d, i);
        this.f24590e = this.f24591f;
    }

    public boolean markSupported() {
        return true;
    }

    /* JADX WARNING: Unknown top exception splitter block from list: {B:11:0x0018=Splitter:B:11:0x0018, B:27:0x0039=Splitter:B:27:0x0039} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized int read() throws java.io.IOException {
        /*
            r5 = this;
            monitor-enter(r5)
            byte[] r0 = r5.f24587b     // Catch:{ all -> 0x003e }
            java.io.InputStream r1 = r5.in     // Catch:{ all -> 0x003e }
            if (r0 == 0) goto L_0x0039
            if (r1 == 0) goto L_0x0039
            int r2 = r5.f24591f     // Catch:{ all -> 0x003e }
            int r3 = r5.f24588c     // Catch:{ all -> 0x003e }
            r4 = -1
            if (r2 < r3) goto L_0x0018
            int r1 = r5.m25826c(r1, r0)     // Catch:{ all -> 0x003e }
            if (r1 != r4) goto L_0x0018
            monitor-exit(r5)
            return r4
        L_0x0018:
            byte[] r1 = r5.f24587b     // Catch:{ all -> 0x003e }
            if (r0 == r1) goto L_0x0026
            byte[] r0 = r5.f24587b     // Catch:{ all -> 0x003e }
            if (r0 == 0) goto L_0x0021
            goto L_0x0026
        L_0x0021:
            java.io.IOException r0 = m25827f()     // Catch:{ all -> 0x003e }
            throw r0     // Catch:{ all -> 0x003e }
        L_0x0026:
            int r1 = r5.f24588c     // Catch:{ all -> 0x003e }
            int r2 = r5.f24591f     // Catch:{ all -> 0x003e }
            int r1 = r1 - r2
            if (r1 <= 0) goto L_0x0037
            int r1 = r2 + 1
            r5.f24591f = r1     // Catch:{ all -> 0x003e }
            byte r0 = r0[r2]     // Catch:{ all -> 0x003e }
            r0 = r0 & 255(0xff, float:3.57E-43)
            monitor-exit(r5)
            return r0
        L_0x0037:
            monitor-exit(r5)
            return r4
        L_0x0039:
            java.io.IOException r0 = m25827f()     // Catch:{ all -> 0x003e }
            throw r0     // Catch:{ all -> 0x003e }
        L_0x003e:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p118n2.C5846w.read():int");
    }

    public synchronized void reset() throws IOException {
        if (this.f24587b != null) {
            int i = this.f24590e;
            if (-1 != i) {
                this.f24591f = i;
            } else {
                throw new C5847a("Mark has been invalidated, pos: " + this.f24591f + " markLimit: " + this.f24589d);
            }
        } else {
            throw new IOException("Stream is closed");
        }
    }

    public synchronized long skip(long j) throws IOException {
        if (j < 1) {
            return 0;
        }
        byte[] bArr = this.f24587b;
        if (bArr != null) {
            InputStream inputStream = this.in;
            if (inputStream != null) {
                int i = this.f24588c;
                int i2 = this.f24591f;
                if (((long) (i - i2)) >= j) {
                    this.f24591f = (int) (((long) i2) + j);
                    return j;
                }
                long j2 = ((long) i) - ((long) i2);
                this.f24591f = i;
                if (this.f24590e == -1 || j > ((long) this.f24589d)) {
                    return j2 + inputStream.skip(j - j2);
                } else if (m25826c(inputStream, bArr) == -1) {
                    return j2;
                } else {
                    int i3 = this.f24588c;
                    int i4 = this.f24591f;
                    if (((long) (i3 - i4)) >= j - j2) {
                        this.f24591f = (int) ((((long) i4) + j) - j2);
                        return j;
                    }
                    long j3 = (j2 + ((long) i3)) - ((long) i4);
                    this.f24591f = i3;
                    return j3;
                }
            } else {
                throw m25827f();
            }
        } else {
            throw m25827f();
        }
    }

    C5846w(InputStream inputStream, C5382b bVar, int i) {
        super(inputStream);
        this.f24590e = -1;
        this.f24592g = bVar;
        this.f24587b = (byte[]) bVar.mo21806d(i, byte[].class);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0031, code lost:
        return r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0047, code lost:
        return r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0054, code lost:
        return r4;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized int read(byte[] r7, int r8, int r9) throws java.io.IOException {
        /*
            r6 = this;
            monitor-enter(r6)
            byte[] r0 = r6.f24587b     // Catch:{ all -> 0x0090 }
            if (r0 == 0) goto L_0x008b
            if (r9 != 0) goto L_0x000a
            r7 = 0
            monitor-exit(r6)
            return r7
        L_0x000a:
            java.io.InputStream r1 = r6.in     // Catch:{ all -> 0x0090 }
            if (r1 == 0) goto L_0x0086
            int r2 = r6.f24591f     // Catch:{ all -> 0x0090 }
            int r3 = r6.f24588c     // Catch:{ all -> 0x0090 }
            if (r2 >= r3) goto L_0x0032
            int r4 = r3 - r2
            if (r4 < r9) goto L_0x001a
            r3 = r9
            goto L_0x001b
        L_0x001a:
            int r3 = r3 - r2
        L_0x001b:
            java.lang.System.arraycopy(r0, r2, r7, r8, r3)     // Catch:{ all -> 0x0090 }
            int r2 = r6.f24591f     // Catch:{ all -> 0x0090 }
            int r2 = r2 + r3
            r6.f24591f = r2     // Catch:{ all -> 0x0090 }
            if (r3 == r9) goto L_0x0030
            int r2 = r1.available()     // Catch:{ all -> 0x0090 }
            if (r2 != 0) goto L_0x002c
            goto L_0x0030
        L_0x002c:
            int r8 = r8 + r3
            int r2 = r9 - r3
            goto L_0x0033
        L_0x0030:
            monitor-exit(r6)
            return r3
        L_0x0032:
            r2 = r9
        L_0x0033:
            int r3 = r6.f24590e     // Catch:{ all -> 0x0090 }
            r4 = -1
            if (r3 != r4) goto L_0x0048
            int r3 = r0.length     // Catch:{ all -> 0x0090 }
            if (r2 < r3) goto L_0x0048
            int r3 = r1.read(r7, r8, r2)     // Catch:{ all -> 0x0090 }
            if (r3 != r4) goto L_0x0076
            if (r2 != r9) goto L_0x0044
            goto L_0x0046
        L_0x0044:
            int r4 = r9 - r2
        L_0x0046:
            monitor-exit(r6)
            return r4
        L_0x0048:
            int r3 = r6.m25826c(r1, r0)     // Catch:{ all -> 0x0090 }
            if (r3 != r4) goto L_0x0055
            if (r2 != r9) goto L_0x0051
            goto L_0x0053
        L_0x0051:
            int r4 = r9 - r2
        L_0x0053:
            monitor-exit(r6)
            return r4
        L_0x0055:
            byte[] r3 = r6.f24587b     // Catch:{ all -> 0x0090 }
            if (r0 == r3) goto L_0x0063
            byte[] r0 = r6.f24587b     // Catch:{ all -> 0x0090 }
            if (r0 == 0) goto L_0x005e
            goto L_0x0063
        L_0x005e:
            java.io.IOException r7 = m25827f()     // Catch:{ all -> 0x0090 }
            throw r7     // Catch:{ all -> 0x0090 }
        L_0x0063:
            int r3 = r6.f24588c     // Catch:{ all -> 0x0090 }
            int r4 = r6.f24591f     // Catch:{ all -> 0x0090 }
            int r5 = r3 - r4
            if (r5 < r2) goto L_0x006d
            r3 = r2
            goto L_0x006e
        L_0x006d:
            int r3 = r3 - r4
        L_0x006e:
            java.lang.System.arraycopy(r0, r4, r7, r8, r3)     // Catch:{ all -> 0x0090 }
            int r4 = r6.f24591f     // Catch:{ all -> 0x0090 }
            int r4 = r4 + r3
            r6.f24591f = r4     // Catch:{ all -> 0x0090 }
        L_0x0076:
            int r2 = r2 - r3
            if (r2 != 0) goto L_0x007b
            monitor-exit(r6)
            return r9
        L_0x007b:
            int r4 = r1.available()     // Catch:{ all -> 0x0090 }
            if (r4 != 0) goto L_0x0084
            int r9 = r9 - r2
            monitor-exit(r6)
            return r9
        L_0x0084:
            int r8 = r8 + r3
            goto L_0x0033
        L_0x0086:
            java.io.IOException r7 = m25827f()     // Catch:{ all -> 0x0090 }
            throw r7     // Catch:{ all -> 0x0090 }
        L_0x008b:
            java.io.IOException r7 = m25827f()     // Catch:{ all -> 0x0090 }
            throw r7     // Catch:{ all -> 0x0090 }
        L_0x0090:
            r7 = move-exception
            monitor-exit(r6)
            goto L_0x0094
        L_0x0093:
            throw r7
        L_0x0094:
            goto L_0x0093
        */
        throw new UnsupportedOperationException("Method not decompiled: p118n2.C5846w.read(byte[], int, int):int");
    }
}
