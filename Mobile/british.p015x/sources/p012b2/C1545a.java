package p012b2;

import android.annotation.TargetApi;
import android.os.Build;
import android.os.StrictMode;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: b2.a */
/* compiled from: DiskLruCache */
public final class C1545a implements Closeable {
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final File f6611b;

    /* renamed from: c */
    private final File f6612c;

    /* renamed from: d */
    private final File f6613d;

    /* renamed from: e */
    private final File f6614e;

    /* renamed from: f */
    private final int f6615f;

    /* renamed from: g */
    private long f6616g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public final int f6617h;

    /* renamed from: i */
    private long f6618i = 0;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public Writer f6619j;

    /* renamed from: k */
    private final LinkedHashMap<String, C1549d> f6620k = new LinkedHashMap<>(0, 0.75f, true);
    /* access modifiers changed from: private */

    /* renamed from: l */
    public int f6621l;

    /* renamed from: m */
    private long f6622m = 0;

    /* renamed from: n */
    final ThreadPoolExecutor f6623n = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), new C1547b((C1546a) null));

    /* renamed from: o */
    private final Callable<Void> f6624o = new C1546a();

    /* renamed from: b2.a$a */
    /* compiled from: DiskLruCache */
    class C1546a implements Callable<Void> {
        C1546a() {
        }

        /* JADX WARNING: Code restructure failed: missing block: B:11:0x0027, code lost:
            return null;
         */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Void call() throws java.lang.Exception {
            /*
                r4 = this;
                b2.a r0 = p012b2.C1545a.this
                monitor-enter(r0)
                b2.a r1 = p012b2.C1545a.this     // Catch:{ all -> 0x0028 }
                java.io.Writer r1 = r1.f6619j     // Catch:{ all -> 0x0028 }
                r2 = 0
                if (r1 != 0) goto L_0x000e
                monitor-exit(r0)     // Catch:{ all -> 0x0028 }
                return r2
            L_0x000e:
                b2.a r1 = p012b2.C1545a.this     // Catch:{ all -> 0x0028 }
                r1.m7927T()     // Catch:{ all -> 0x0028 }
                b2.a r1 = p012b2.C1545a.this     // Catch:{ all -> 0x0028 }
                boolean r1 = r1.m7942v()     // Catch:{ all -> 0x0028 }
                if (r1 == 0) goto L_0x0026
                b2.a r1 = p012b2.C1545a.this     // Catch:{ all -> 0x0028 }
                r1.m7925H()     // Catch:{ all -> 0x0028 }
                b2.a r1 = p012b2.C1545a.this     // Catch:{ all -> 0x0028 }
                r3 = 0
                int unused = r1.f6621l = r3     // Catch:{ all -> 0x0028 }
            L_0x0026:
                monitor-exit(r0)     // Catch:{ all -> 0x0028 }
                return r2
            L_0x0028:
                r1 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x0028 }
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: p012b2.C1545a.C1546a.call():java.lang.Void");
        }
    }

    /* renamed from: b2.a$b */
    /* compiled from: DiskLruCache */
    private static final class C1547b implements ThreadFactory {
        private C1547b() {
        }

        public synchronized Thread newThread(Runnable runnable) {
            Thread thread;
            thread = new Thread(runnable, "glide-disk-lru-cache-thread");
            thread.setPriority(1);
            return thread;
        }

        /* synthetic */ C1547b(C1546a aVar) {
            this();
        }
    }

    /* renamed from: b2.a$c */
    /* compiled from: DiskLruCache */
    public final class C1548c {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public final C1549d f6626a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public final boolean[] f6627b;

        /* renamed from: c */
        private boolean f6628c;

        /* synthetic */ C1548c(C1545a aVar, C1549d dVar, C1546a aVar2) {
            this(dVar);
        }

        /* renamed from: a */
        public void mo7094a() throws IOException {
            C1545a.this.m7938n(this, false);
        }

        /* renamed from: b */
        public void mo7095b() {
            if (!this.f6628c) {
                try {
                    mo7094a();
                } catch (IOException unused) {
                }
            }
        }

        /* renamed from: e */
        public void mo7096e() throws IOException {
            C1545a.this.m7938n(this, true);
            this.f6628c = true;
        }

        /* renamed from: f */
        public File mo7097f(int i) throws IOException {
            File k;
            synchronized (C1545a.this) {
                if (this.f6626a.f6635f == this) {
                    if (!this.f6626a.f6634e) {
                        this.f6627b[i] = true;
                    }
                    k = this.f6626a.mo7099k(i);
                    if (!C1545a.this.f6611b.exists()) {
                        C1545a.this.f6611b.mkdirs();
                    }
                } else {
                    throw new IllegalStateException();
                }
            }
            return k;
        }

        private C1548c(C1549d dVar) {
            this.f6626a = dVar;
            this.f6627b = dVar.f6634e ? null : new boolean[C1545a.this.f6617h];
        }
    }

    /* renamed from: b2.a$d */
    /* compiled from: DiskLruCache */
    private final class C1549d {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public final String f6630a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public final long[] f6631b;

        /* renamed from: c */
        File[] f6632c;

        /* renamed from: d */
        File[] f6633d;
        /* access modifiers changed from: private */

        /* renamed from: e */
        public boolean f6634e;
        /* access modifiers changed from: private */

        /* renamed from: f */
        public C1548c f6635f;
        /* access modifiers changed from: private */

        /* renamed from: g */
        public long f6636g;

        /* synthetic */ C1549d(C1545a aVar, String str, C1546a aVar2) {
            this(str);
        }

        /* renamed from: m */
        private IOException m7965m(String[] strArr) throws IOException {
            throw new IOException("unexpected journal line: " + Arrays.toString(strArr));
        }

        /* access modifiers changed from: private */
        /* renamed from: n */
        public void m7966n(String[] strArr) throws IOException {
            if (strArr.length == C1545a.this.f6617h) {
                int i = 0;
                while (i < strArr.length) {
                    try {
                        this.f6631b[i] = Long.parseLong(strArr[i]);
                        i++;
                    } catch (NumberFormatException unused) {
                        throw m7965m(strArr);
                    }
                }
                return;
            }
            throw m7965m(strArr);
        }

        /* renamed from: j */
        public File mo7098j(int i) {
            return this.f6632c[i];
        }

        /* renamed from: k */
        public File mo7099k(int i) {
            return this.f6633d[i];
        }

        /* renamed from: l */
        public String mo7100l() throws IOException {
            StringBuilder sb = new StringBuilder();
            for (long append : this.f6631b) {
                sb.append(' ');
                sb.append(append);
            }
            return sb.toString();
        }

        private C1549d(String str) {
            this.f6630a = str;
            this.f6631b = new long[C1545a.this.f6617h];
            this.f6632c = new File[C1545a.this.f6617h];
            this.f6633d = new File[C1545a.this.f6617h];
            StringBuilder sb = new StringBuilder(str);
            sb.append('.');
            int length = sb.length();
            for (int i = 0; i < C1545a.this.f6617h; i++) {
                sb.append(i);
                this.f6632c[i] = new File(C1545a.this.f6611b, sb.toString());
                sb.append(".tmp");
                this.f6633d[i] = new File(C1545a.this.f6611b, sb.toString());
                sb.setLength(length);
            }
        }
    }

    /* renamed from: b2.a$e */
    /* compiled from: DiskLruCache */
    public final class C1550e {

        /* renamed from: a */
        private final String f6638a;

        /* renamed from: b */
        private final long f6639b;

        /* renamed from: c */
        private final long[] f6640c;

        /* renamed from: d */
        private final File[] f6641d;

        /* synthetic */ C1550e(C1545a aVar, String str, long j, File[] fileArr, long[] jArr, C1546a aVar2) {
            this(str, j, fileArr, jArr);
        }

        /* renamed from: a */
        public File mo7101a(int i) {
            return this.f6641d[i];
        }

        private C1550e(String str, long j, File[] fileArr, long[] jArr) {
            this.f6638a = str;
            this.f6639b = j;
            this.f6641d = fileArr;
            this.f6640c = jArr;
        }
    }

    private C1545a(File file, int i, int i2, long j) {
        File file2 = file;
        this.f6611b = file2;
        this.f6615f = i;
        this.f6612c = new File(file2, "journal");
        this.f6613d = new File(file2, "journal.tmp");
        this.f6614e = new File(file2, "journal.bkp");
        this.f6617h = i2;
        this.f6616g = j;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:16|17|(1:19)(1:20)|21|22) */
    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        r9.f6621l = r0 - r9.f6620k.size();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x006c, code lost:
        if (r1.mo7103e() != false) goto L_0x006e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x006e, code lost:
        m7925H();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0072, code lost:
        r9.f6619j = new java.io.BufferedWriter(new java.io.OutputStreamWriter(new java.io.FileOutputStream(r9.f6612c, true), p012b2.C1553c.f6649a));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x008b, code lost:
        return;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:16:0x005f */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:23:0x008c=Splitter:B:23:0x008c, B:16:0x005f=Splitter:B:16:0x005f} */
    /* renamed from: B */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m7923B() throws java.io.IOException {
        /*
            r9 = this;
            java.lang.String r0 = ", "
            b2.b r1 = new b2.b
            java.io.FileInputStream r2 = new java.io.FileInputStream
            java.io.File r3 = r9.f6612c
            r2.<init>(r3)
            java.nio.charset.Charset r3 = p012b2.C1553c.f6649a
            r1.<init>(r2, r3)
            java.lang.String r2 = r1.mo7104f()     // Catch:{ all -> 0x00ba }
            java.lang.String r3 = r1.mo7104f()     // Catch:{ all -> 0x00ba }
            java.lang.String r4 = r1.mo7104f()     // Catch:{ all -> 0x00ba }
            java.lang.String r5 = r1.mo7104f()     // Catch:{ all -> 0x00ba }
            java.lang.String r6 = r1.mo7104f()     // Catch:{ all -> 0x00ba }
            java.lang.String r7 = "libcore.io.DiskLruCache"
            boolean r7 = r7.equals(r2)     // Catch:{ all -> 0x00ba }
            if (r7 == 0) goto L_0x008c
            java.lang.String r7 = "1"
            boolean r7 = r7.equals(r3)     // Catch:{ all -> 0x00ba }
            if (r7 == 0) goto L_0x008c
            int r7 = r9.f6615f     // Catch:{ all -> 0x00ba }
            java.lang.String r7 = java.lang.Integer.toString(r7)     // Catch:{ all -> 0x00ba }
            boolean r4 = r7.equals(r4)     // Catch:{ all -> 0x00ba }
            if (r4 == 0) goto L_0x008c
            int r4 = r9.f6617h     // Catch:{ all -> 0x00ba }
            java.lang.String r4 = java.lang.Integer.toString(r4)     // Catch:{ all -> 0x00ba }
            boolean r4 = r4.equals(r5)     // Catch:{ all -> 0x00ba }
            if (r4 == 0) goto L_0x008c
            java.lang.String r4 = ""
            boolean r4 = r4.equals(r6)     // Catch:{ all -> 0x00ba }
            if (r4 == 0) goto L_0x008c
            r0 = 0
        L_0x0055:
            java.lang.String r2 = r1.mo7104f()     // Catch:{ EOFException -> 0x005f }
            r9.m7924C(r2)     // Catch:{ EOFException -> 0x005f }
            int r0 = r0 + 1
            goto L_0x0055
        L_0x005f:
            java.util.LinkedHashMap<java.lang.String, b2.a$d> r2 = r9.f6620k     // Catch:{ all -> 0x00ba }
            int r2 = r2.size()     // Catch:{ all -> 0x00ba }
            int r0 = r0 - r2
            r9.f6621l = r0     // Catch:{ all -> 0x00ba }
            boolean r0 = r1.mo7103e()     // Catch:{ all -> 0x00ba }
            if (r0 == 0) goto L_0x0072
            r9.m7925H()     // Catch:{ all -> 0x00ba }
            goto L_0x0088
        L_0x0072:
            java.io.BufferedWriter r0 = new java.io.BufferedWriter     // Catch:{ all -> 0x00ba }
            java.io.OutputStreamWriter r2 = new java.io.OutputStreamWriter     // Catch:{ all -> 0x00ba }
            java.io.FileOutputStream r3 = new java.io.FileOutputStream     // Catch:{ all -> 0x00ba }
            java.io.File r4 = r9.f6612c     // Catch:{ all -> 0x00ba }
            r5 = 1
            r3.<init>(r4, r5)     // Catch:{ all -> 0x00ba }
            java.nio.charset.Charset r4 = p012b2.C1553c.f6649a     // Catch:{ all -> 0x00ba }
            r2.<init>(r3, r4)     // Catch:{ all -> 0x00ba }
            r0.<init>(r2)     // Catch:{ all -> 0x00ba }
            r9.f6619j = r0     // Catch:{ all -> 0x00ba }
        L_0x0088:
            p012b2.C1553c.m7975a(r1)
            return
        L_0x008c:
            java.io.IOException r4 = new java.io.IOException     // Catch:{ all -> 0x00ba }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x00ba }
            r7.<init>()     // Catch:{ all -> 0x00ba }
            java.lang.String r8 = "unexpected journal header: ["
            r7.append(r8)     // Catch:{ all -> 0x00ba }
            r7.append(r2)     // Catch:{ all -> 0x00ba }
            r7.append(r0)     // Catch:{ all -> 0x00ba }
            r7.append(r3)     // Catch:{ all -> 0x00ba }
            r7.append(r0)     // Catch:{ all -> 0x00ba }
            r7.append(r5)     // Catch:{ all -> 0x00ba }
            r7.append(r0)     // Catch:{ all -> 0x00ba }
            r7.append(r6)     // Catch:{ all -> 0x00ba }
            java.lang.String r0 = "]"
            r7.append(r0)     // Catch:{ all -> 0x00ba }
            java.lang.String r0 = r7.toString()     // Catch:{ all -> 0x00ba }
            r4.<init>(r0)     // Catch:{ all -> 0x00ba }
            throw r4     // Catch:{ all -> 0x00ba }
        L_0x00ba:
            r0 = move-exception
            p012b2.C1553c.m7975a(r1)
            goto L_0x00c0
        L_0x00bf:
            throw r0
        L_0x00c0:
            goto L_0x00bf
        */
        throw new UnsupportedOperationException("Method not decompiled: p012b2.C1545a.m7923B():void");
    }

    /* renamed from: C */
    private void m7924C(String str) throws IOException {
        String str2;
        int indexOf = str.indexOf(32);
        if (indexOf != -1) {
            int i = indexOf + 1;
            int indexOf2 = str.indexOf(32, i);
            if (indexOf2 == -1) {
                str2 = str.substring(i);
                if (indexOf == 6 && str.startsWith("REMOVE")) {
                    this.f6620k.remove(str2);
                    return;
                }
            } else {
                str2 = str.substring(i, indexOf2);
            }
            C1549d dVar = this.f6620k.get(str2);
            if (dVar == null) {
                dVar = new C1549d(this, str2, (C1546a) null);
                this.f6620k.put(str2, dVar);
            }
            if (indexOf2 != -1 && indexOf == 5 && str.startsWith("CLEAN")) {
                String[] split = str.substring(indexOf2 + 1).split(" ");
                boolean unused = dVar.f6634e = true;
                C1548c unused2 = dVar.f6635f = null;
                dVar.m7966n(split);
            } else if (indexOf2 == -1 && indexOf == 5 && str.startsWith("DIRTY")) {
                C1548c unused3 = dVar.f6635f = new C1548c(this, dVar, (C1546a) null);
            } else if (indexOf2 != -1 || indexOf != 4 || !str.startsWith("READ")) {
                throw new IOException("unexpected journal line: " + str);
            }
        } else {
            throw new IOException("unexpected journal line: " + str);
        }
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: private */
    /* renamed from: H */
    public synchronized void m7925H() throws IOException {
        Writer writer = this.f6619j;
        if (writer != null) {
            m7937m(writer);
        }
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f6613d), C1553c.f6649a));
        try {
            bufferedWriter.write("libcore.io.DiskLruCache");
            bufferedWriter.write("\n");
            bufferedWriter.write(IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE);
            bufferedWriter.write("\n");
            bufferedWriter.write(Integer.toString(this.f6615f));
            bufferedWriter.write("\n");
            bufferedWriter.write(Integer.toString(this.f6617h));
            bufferedWriter.write("\n");
            bufferedWriter.write("\n");
            for (C1549d next : this.f6620k.values()) {
                if (next.f6635f != null) {
                    bufferedWriter.write("DIRTY " + next.f6630a + 10);
                } else {
                    bufferedWriter.write("CLEAN " + next.f6630a + next.mo7100l() + 10);
                }
            }
            m7937m(bufferedWriter);
            if (this.f6612c.exists()) {
                m7926R(this.f6612c, this.f6614e, true);
            }
            m7926R(this.f6613d, this.f6612c, false);
            this.f6614e.delete();
            this.f6619j = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f6612c, true), C1553c.f6649a));
        } catch (Throwable th) {
            m7937m(bufferedWriter);
            throw th;
        }
    }

    /* renamed from: R */
    private static void m7926R(File file, File file2, boolean z) throws IOException {
        if (z) {
            m7939p(file2);
        }
        if (!file.renameTo(file2)) {
            throw new IOException();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: T */
    public void m7927T() throws IOException {
        while (this.f6618i > this.f6616g) {
            mo7086Q((String) this.f6620k.entrySet().iterator().next().getKey());
        }
    }

    /* renamed from: l */
    private void m7936l() {
        if (this.f6619j == null) {
            throw new IllegalStateException("cache is closed");
        }
    }

    @TargetApi(26)
    /* renamed from: m */
    private static void m7937m(Writer writer) throws IOException {
        if (Build.VERSION.SDK_INT < 26) {
            writer.close();
            return;
        }
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitUnbufferedIo().build());
        try {
            writer.close();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0107, code lost:
        return;
     */
    /* renamed from: n */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void m7938n(p012b2.C1545a.C1548c r10, boolean r11) throws java.io.IOException {
        /*
            r9 = this;
            monitor-enter(r9)
            b2.a$d r0 = r10.f6626a     // Catch:{ all -> 0x010e }
            b2.a$c r1 = r0.f6635f     // Catch:{ all -> 0x010e }
            if (r1 != r10) goto L_0x0108
            r1 = 0
            if (r11 == 0) goto L_0x004d
            boolean r2 = r0.f6634e     // Catch:{ all -> 0x010e }
            if (r2 != 0) goto L_0x004d
            r2 = 0
        L_0x0015:
            int r3 = r9.f6617h     // Catch:{ all -> 0x010e }
            if (r2 >= r3) goto L_0x004d
            boolean[] r3 = r10.f6627b     // Catch:{ all -> 0x010e }
            boolean r3 = r3[r2]     // Catch:{ all -> 0x010e }
            if (r3 == 0) goto L_0x0033
            java.io.File r3 = r0.mo7099k(r2)     // Catch:{ all -> 0x010e }
            boolean r3 = r3.exists()     // Catch:{ all -> 0x010e }
            if (r3 != 0) goto L_0x0030
            r10.mo7094a()     // Catch:{ all -> 0x010e }
            monitor-exit(r9)
            return
        L_0x0030:
            int r2 = r2 + 1
            goto L_0x0015
        L_0x0033:
            r10.mo7094a()     // Catch:{ all -> 0x010e }
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException     // Catch:{ all -> 0x010e }
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ all -> 0x010e }
            r11.<init>()     // Catch:{ all -> 0x010e }
            java.lang.String r0 = "Newly created entry didn't create value for index "
            r11.append(r0)     // Catch:{ all -> 0x010e }
            r11.append(r2)     // Catch:{ all -> 0x010e }
            java.lang.String r11 = r11.toString()     // Catch:{ all -> 0x010e }
            r10.<init>(r11)     // Catch:{ all -> 0x010e }
            throw r10     // Catch:{ all -> 0x010e }
        L_0x004d:
            int r10 = r9.f6617h     // Catch:{ all -> 0x010e }
            if (r1 >= r10) goto L_0x0081
            java.io.File r10 = r0.mo7099k(r1)     // Catch:{ all -> 0x010e }
            if (r11 == 0) goto L_0x007b
            boolean r2 = r10.exists()     // Catch:{ all -> 0x010e }
            if (r2 == 0) goto L_0x007e
            java.io.File r2 = r0.mo7098j(r1)     // Catch:{ all -> 0x010e }
            r10.renameTo(r2)     // Catch:{ all -> 0x010e }
            long[] r10 = r0.f6631b     // Catch:{ all -> 0x010e }
            r3 = r10[r1]     // Catch:{ all -> 0x010e }
            long r5 = r2.length()     // Catch:{ all -> 0x010e }
            long[] r10 = r0.f6631b     // Catch:{ all -> 0x010e }
            r10[r1] = r5     // Catch:{ all -> 0x010e }
            long r7 = r9.f6618i     // Catch:{ all -> 0x010e }
            long r7 = r7 - r3
            long r7 = r7 + r5
            r9.f6618i = r7     // Catch:{ all -> 0x010e }
            goto L_0x007e
        L_0x007b:
            m7939p(r10)     // Catch:{ all -> 0x010e }
        L_0x007e:
            int r1 = r1 + 1
            goto L_0x004d
        L_0x0081:
            int r10 = r9.f6621l     // Catch:{ all -> 0x010e }
            r1 = 1
            int r10 = r10 + r1
            r9.f6621l = r10     // Catch:{ all -> 0x010e }
            r10 = 0
            p012b2.C1545a.C1548c unused = r0.f6635f = r10     // Catch:{ all -> 0x010e }
            boolean r10 = r0.f6634e     // Catch:{ all -> 0x010e }
            r10 = r10 | r11
            r2 = 10
            r3 = 32
            if (r10 == 0) goto L_0x00c9
            boolean unused = r0.f6634e = r1     // Catch:{ all -> 0x010e }
            java.io.Writer r10 = r9.f6619j     // Catch:{ all -> 0x010e }
            java.lang.String r1 = "CLEAN"
            r10.append(r1)     // Catch:{ all -> 0x010e }
            java.io.Writer r10 = r9.f6619j     // Catch:{ all -> 0x010e }
            r10.append(r3)     // Catch:{ all -> 0x010e }
            java.io.Writer r10 = r9.f6619j     // Catch:{ all -> 0x010e }
            java.lang.String r1 = r0.f6630a     // Catch:{ all -> 0x010e }
            r10.append(r1)     // Catch:{ all -> 0x010e }
            java.io.Writer r10 = r9.f6619j     // Catch:{ all -> 0x010e }
            java.lang.String r1 = r0.mo7100l()     // Catch:{ all -> 0x010e }
            r10.append(r1)     // Catch:{ all -> 0x010e }
            java.io.Writer r10 = r9.f6619j     // Catch:{ all -> 0x010e }
            r10.append(r2)     // Catch:{ all -> 0x010e }
            if (r11 == 0) goto L_0x00ec
            long r10 = r9.f6622m     // Catch:{ all -> 0x010e }
            r1 = 1
            long r1 = r1 + r10
            r9.f6622m = r1     // Catch:{ all -> 0x010e }
            long unused = r0.f6636g = r10     // Catch:{ all -> 0x010e }
            goto L_0x00ec
        L_0x00c9:
            java.util.LinkedHashMap<java.lang.String, b2.a$d> r10 = r9.f6620k     // Catch:{ all -> 0x010e }
            java.lang.String r11 = r0.f6630a     // Catch:{ all -> 0x010e }
            r10.remove(r11)     // Catch:{ all -> 0x010e }
            java.io.Writer r10 = r9.f6619j     // Catch:{ all -> 0x010e }
            java.lang.String r11 = "REMOVE"
            r10.append(r11)     // Catch:{ all -> 0x010e }
            java.io.Writer r10 = r9.f6619j     // Catch:{ all -> 0x010e }
            r10.append(r3)     // Catch:{ all -> 0x010e }
            java.io.Writer r10 = r9.f6619j     // Catch:{ all -> 0x010e }
            java.lang.String r11 = r0.f6630a     // Catch:{ all -> 0x010e }
            r10.append(r11)     // Catch:{ all -> 0x010e }
            java.io.Writer r10 = r9.f6619j     // Catch:{ all -> 0x010e }
            r10.append(r2)     // Catch:{ all -> 0x010e }
        L_0x00ec:
            java.io.Writer r10 = r9.f6619j     // Catch:{ all -> 0x010e }
            m7941t(r10)     // Catch:{ all -> 0x010e }
            long r10 = r9.f6618i     // Catch:{ all -> 0x010e }
            long r0 = r9.f6616g     // Catch:{ all -> 0x010e }
            int r2 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r2 > 0) goto L_0x00ff
            boolean r10 = r9.m7942v()     // Catch:{ all -> 0x010e }
            if (r10 == 0) goto L_0x0106
        L_0x00ff:
            java.util.concurrent.ThreadPoolExecutor r10 = r9.f6623n     // Catch:{ all -> 0x010e }
            java.util.concurrent.Callable<java.lang.Void> r11 = r9.f6624o     // Catch:{ all -> 0x010e }
            r10.submit(r11)     // Catch:{ all -> 0x010e }
        L_0x0106:
            monitor-exit(r9)
            return
        L_0x0108:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException     // Catch:{ all -> 0x010e }
            r10.<init>()     // Catch:{ all -> 0x010e }
            throw r10     // Catch:{ all -> 0x010e }
        L_0x010e:
            r10 = move-exception
            monitor-exit(r9)
            goto L_0x0112
        L_0x0111:
            throw r10
        L_0x0112:
            goto L_0x0111
        */
        throw new UnsupportedOperationException("Method not decompiled: p012b2.C1545a.m7938n(b2.a$c, boolean):void");
    }

    /* renamed from: p */
    private static void m7939p(File file) throws IOException {
        if (file.exists() && !file.delete()) {
            throw new IOException();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001e, code lost:
        return null;
     */
    /* renamed from: s */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized p012b2.C1545a.C1548c m7940s(java.lang.String r6, long r7) throws java.io.IOException {
        /*
            r5 = this;
            monitor-enter(r5)
            r5.m7936l()     // Catch:{ all -> 0x005d }
            java.util.LinkedHashMap<java.lang.String, b2.a$d> r0 = r5.f6620k     // Catch:{ all -> 0x005d }
            java.lang.Object r0 = r0.get(r6)     // Catch:{ all -> 0x005d }
            b2.a$d r0 = (p012b2.C1545a.C1549d) r0     // Catch:{ all -> 0x005d }
            r1 = -1
            r3 = 0
            int r4 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r4 == 0) goto L_0x001f
            if (r0 == 0) goto L_0x001d
            long r1 = r0.f6636g     // Catch:{ all -> 0x005d }
            int r4 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r4 == 0) goto L_0x001f
        L_0x001d:
            monitor-exit(r5)
            return r3
        L_0x001f:
            if (r0 != 0) goto L_0x002c
            b2.a$d r0 = new b2.a$d     // Catch:{ all -> 0x005d }
            r0.<init>(r5, r6, r3)     // Catch:{ all -> 0x005d }
            java.util.LinkedHashMap<java.lang.String, b2.a$d> r7 = r5.f6620k     // Catch:{ all -> 0x005d }
            r7.put(r6, r0)     // Catch:{ all -> 0x005d }
            goto L_0x0034
        L_0x002c:
            b2.a$c r7 = r0.f6635f     // Catch:{ all -> 0x005d }
            if (r7 == 0) goto L_0x0034
            monitor-exit(r5)
            return r3
        L_0x0034:
            b2.a$c r7 = new b2.a$c     // Catch:{ all -> 0x005d }
            r7.<init>(r5, r0, r3)     // Catch:{ all -> 0x005d }
            p012b2.C1545a.C1548c unused = r0.f6635f = r7     // Catch:{ all -> 0x005d }
            java.io.Writer r8 = r5.f6619j     // Catch:{ all -> 0x005d }
            java.lang.String r0 = "DIRTY"
            r8.append(r0)     // Catch:{ all -> 0x005d }
            java.io.Writer r8 = r5.f6619j     // Catch:{ all -> 0x005d }
            r0 = 32
            r8.append(r0)     // Catch:{ all -> 0x005d }
            java.io.Writer r8 = r5.f6619j     // Catch:{ all -> 0x005d }
            r8.append(r6)     // Catch:{ all -> 0x005d }
            java.io.Writer r6 = r5.f6619j     // Catch:{ all -> 0x005d }
            r8 = 10
            r6.append(r8)     // Catch:{ all -> 0x005d }
            java.io.Writer r6 = r5.f6619j     // Catch:{ all -> 0x005d }
            m7941t(r6)     // Catch:{ all -> 0x005d }
            monitor-exit(r5)
            return r7
        L_0x005d:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p012b2.C1545a.m7940s(java.lang.String, long):b2.a$c");
    }

    @TargetApi(26)
    /* renamed from: t */
    private static void m7941t(Writer writer) throws IOException {
        if (Build.VERSION.SDK_INT < 26) {
            writer.flush();
            return;
        }
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitUnbufferedIo().build());
        try {
            writer.flush();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: v */
    public boolean m7942v() {
        int i = this.f6621l;
        return i >= 2000 && i >= this.f6620k.size();
    }

    /* renamed from: w */
    public static C1545a m7943w(File file, int i, int i2, long j) throws IOException {
        if (j <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        } else if (i2 > 0) {
            File file2 = new File(file, "journal.bkp");
            if (file2.exists()) {
                File file3 = new File(file, "journal");
                if (file3.exists()) {
                    file2.delete();
                } else {
                    m7926R(file2, file3, false);
                }
            }
            C1545a aVar = new C1545a(file, i, i2, j);
            if (aVar.f6612c.exists()) {
                try {
                    aVar.m7923B();
                    aVar.m7944x();
                    return aVar;
                } catch (IOException e) {
                    PrintStream printStream = System.out;
                    printStream.println("DiskLruCache " + file + " is corrupt: " + e.getMessage() + ", removing");
                    aVar.mo7088o();
                }
            }
            file.mkdirs();
            C1545a aVar2 = new C1545a(file, i, i2, j);
            aVar2.m7925H();
            return aVar2;
        } else {
            throw new IllegalArgumentException("valueCount <= 0");
        }
    }

    /* renamed from: x */
    private void m7944x() throws IOException {
        m7939p(this.f6613d);
        Iterator<C1549d> it = this.f6620k.values().iterator();
        while (it.hasNext()) {
            C1549d next = it.next();
            int i = 0;
            if (next.f6635f == null) {
                while (i < this.f6617h) {
                    this.f6618i += next.f6631b[i];
                    i++;
                }
            } else {
                C1548c unused = next.f6635f = null;
                while (i < this.f6617h) {
                    m7939p(next.mo7098j(i));
                    m7939p(next.mo7099k(i));
                    i++;
                }
                it.remove();
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x008c, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x008e, code lost:
        return false;
     */
    /* renamed from: Q */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized boolean mo7086Q(java.lang.String r8) throws java.io.IOException {
        /*
            r7 = this;
            monitor-enter(r7)
            r7.m7936l()     // Catch:{ all -> 0x008f }
            java.util.LinkedHashMap<java.lang.String, b2.a$d> r0 = r7.f6620k     // Catch:{ all -> 0x008f }
            java.lang.Object r0 = r0.get(r8)     // Catch:{ all -> 0x008f }
            b2.a$d r0 = (p012b2.C1545a.C1549d) r0     // Catch:{ all -> 0x008f }
            r1 = 0
            if (r0 == 0) goto L_0x008d
            b2.a$c r2 = r0.f6635f     // Catch:{ all -> 0x008f }
            if (r2 == 0) goto L_0x0017
            goto L_0x008d
        L_0x0017:
            int r2 = r7.f6617h     // Catch:{ all -> 0x008f }
            if (r1 >= r2) goto L_0x0059
            java.io.File r2 = r0.mo7098j(r1)     // Catch:{ all -> 0x008f }
            boolean r3 = r2.exists()     // Catch:{ all -> 0x008f }
            if (r3 == 0) goto L_0x0043
            boolean r3 = r2.delete()     // Catch:{ all -> 0x008f }
            if (r3 == 0) goto L_0x002c
            goto L_0x0043
        L_0x002c:
            java.io.IOException r8 = new java.io.IOException     // Catch:{ all -> 0x008f }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x008f }
            r0.<init>()     // Catch:{ all -> 0x008f }
            java.lang.String r1 = "failed to delete "
            r0.append(r1)     // Catch:{ all -> 0x008f }
            r0.append(r2)     // Catch:{ all -> 0x008f }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x008f }
            r8.<init>(r0)     // Catch:{ all -> 0x008f }
            throw r8     // Catch:{ all -> 0x008f }
        L_0x0043:
            long r2 = r7.f6618i     // Catch:{ all -> 0x008f }
            long[] r4 = r0.f6631b     // Catch:{ all -> 0x008f }
            r5 = r4[r1]     // Catch:{ all -> 0x008f }
            long r2 = r2 - r5
            r7.f6618i = r2     // Catch:{ all -> 0x008f }
            long[] r2 = r0.f6631b     // Catch:{ all -> 0x008f }
            r3 = 0
            r2[r1] = r3     // Catch:{ all -> 0x008f }
            int r1 = r1 + 1
            goto L_0x0017
        L_0x0059:
            int r0 = r7.f6621l     // Catch:{ all -> 0x008f }
            r1 = 1
            int r0 = r0 + r1
            r7.f6621l = r0     // Catch:{ all -> 0x008f }
            java.io.Writer r0 = r7.f6619j     // Catch:{ all -> 0x008f }
            java.lang.String r2 = "REMOVE"
            r0.append(r2)     // Catch:{ all -> 0x008f }
            java.io.Writer r0 = r7.f6619j     // Catch:{ all -> 0x008f }
            r2 = 32
            r0.append(r2)     // Catch:{ all -> 0x008f }
            java.io.Writer r0 = r7.f6619j     // Catch:{ all -> 0x008f }
            r0.append(r8)     // Catch:{ all -> 0x008f }
            java.io.Writer r0 = r7.f6619j     // Catch:{ all -> 0x008f }
            r2 = 10
            r0.append(r2)     // Catch:{ all -> 0x008f }
            java.util.LinkedHashMap<java.lang.String, b2.a$d> r0 = r7.f6620k     // Catch:{ all -> 0x008f }
            r0.remove(r8)     // Catch:{ all -> 0x008f }
            boolean r8 = r7.m7942v()     // Catch:{ all -> 0x008f }
            if (r8 == 0) goto L_0x008b
            java.util.concurrent.ThreadPoolExecutor r8 = r7.f6623n     // Catch:{ all -> 0x008f }
            java.util.concurrent.Callable<java.lang.Void> r0 = r7.f6624o     // Catch:{ all -> 0x008f }
            r8.submit(r0)     // Catch:{ all -> 0x008f }
        L_0x008b:
            monitor-exit(r7)
            return r1
        L_0x008d:
            monitor-exit(r7)
            return r1
        L_0x008f:
            r8 = move-exception
            monitor-exit(r7)
            goto L_0x0093
        L_0x0092:
            throw r8
        L_0x0093:
            goto L_0x0092
        */
        throw new UnsupportedOperationException("Method not decompiled: p012b2.C1545a.mo7086Q(java.lang.String):boolean");
    }

    public synchronized void close() throws IOException {
        if (this.f6619j != null) {
            Iterator it = new ArrayList(this.f6620k.values()).iterator();
            while (it.hasNext()) {
                C1549d dVar = (C1549d) it.next();
                if (dVar.f6635f != null) {
                    dVar.f6635f.mo7094a();
                }
            }
            m7927T();
            m7937m(this.f6619j);
            this.f6619j = null;
        }
    }

    /* renamed from: o */
    public void mo7088o() throws IOException {
        close();
        C1553c.m7976b(this.f6611b);
    }

    /* renamed from: r */
    public C1548c mo7089r(String str) throws IOException {
        return m7940s(str, -1);
    }

    /* renamed from: u */
    public synchronized C1550e mo7090u(String str) throws IOException {
        m7936l();
        C1549d dVar = this.f6620k.get(str);
        if (dVar == null) {
            return null;
        }
        if (!dVar.f6634e) {
            return null;
        }
        for (File exists : dVar.f6632c) {
            if (!exists.exists()) {
                return null;
            }
        }
        this.f6621l++;
        this.f6619j.append("READ");
        this.f6619j.append(' ');
        this.f6619j.append(str);
        this.f6619j.append(10);
        if (m7942v()) {
            this.f6623n.submit(this.f6624o);
        }
        return new C1550e(this, str, dVar.f6636g, dVar.f6632c, dVar.f6631b, (C1546a) null);
    }
}
