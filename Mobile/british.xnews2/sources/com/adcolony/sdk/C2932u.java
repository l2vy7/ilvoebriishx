package com.adcolony.sdk;

import com.adcolony.sdk.C2978z;
import com.google.android.exoplayer2.C6540C;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.zip.GZIPInputStream;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.adcolony.sdk.u */
class C2932u {

    /* renamed from: a */
    private LinkedList<Runnable> f11830a = new LinkedList<>();

    /* renamed from: b */
    private boolean f11831b;

    /* renamed from: com.adcolony.sdk.u$a */
    class C2933a implements C2750e0 {

        /* renamed from: com.adcolony.sdk.u$a$a */
        class C2934a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C2714c0 f11833a;

            C2934a(C2714c0 c0Var) {
                this.f11833a = c0Var;
            }

            public void run() {
                boolean unused = C2932u.this.m10177g(this.f11833a);
                C2932u.this.m10158a();
            }
        }

        C2933a() {
        }

        /* renamed from: a */
        public void mo9550a(C2714c0 c0Var) {
            C2932u.this.m10161a((Runnable) new C2934a(c0Var));
        }
    }

    /* renamed from: com.adcolony.sdk.u$b */
    class C2935b implements C2750e0 {

        /* renamed from: com.adcolony.sdk.u$b$a */
        class C2936a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C2714c0 f11836a;

            C2936a(C2714c0 c0Var) {
                this.f11836a = c0Var;
            }

            public void run() {
                boolean unused = C2932u.this.m10163a(this.f11836a, new File(C2976x.m10337i(this.f11836a.mo9608b(), "filepath")));
                C2932u.this.m10158a();
            }
        }

        C2935b() {
        }

        /* renamed from: a */
        public void mo9550a(C2714c0 c0Var) {
            C2932u.this.m10161a((Runnable) new C2936a(c0Var));
        }
    }

    /* renamed from: com.adcolony.sdk.u$c */
    class C2937c implements C2750e0 {

        /* renamed from: com.adcolony.sdk.u$c$a */
        class C2938a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C2714c0 f11839a;

            C2938a(C2714c0 c0Var) {
                this.f11839a = c0Var;
            }

            public void run() {
                boolean unused = C2932u.this.m10172d(this.f11839a);
                C2932u.this.m10158a();
            }
        }

        C2937c() {
        }

        /* renamed from: a */
        public void mo9550a(C2714c0 c0Var) {
            C2932u.this.m10161a((Runnable) new C2938a(c0Var));
        }
    }

    /* renamed from: com.adcolony.sdk.u$d */
    class C2939d implements C2750e0 {

        /* renamed from: com.adcolony.sdk.u$d$a */
        class C2940a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C2714c0 f11842a;

            C2940a(C2714c0 c0Var) {
                this.f11842a = c0Var;
            }

            public void run() {
                String unused = C2932u.this.m10173e(this.f11842a);
                C2932u.this.m10158a();
            }
        }

        C2939d() {
        }

        /* renamed from: a */
        public void mo9550a(C2714c0 c0Var) {
            C2932u.this.m10161a((Runnable) new C2940a(c0Var));
        }
    }

    /* renamed from: com.adcolony.sdk.u$e */
    class C2941e implements C2750e0 {

        /* renamed from: com.adcolony.sdk.u$e$a */
        class C2942a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C2714c0 f11845a;

            C2942a(C2714c0 c0Var) {
                this.f11845a = c0Var;
            }

            public void run() {
                boolean unused = C2932u.this.m10175f(this.f11845a);
                C2932u.this.m10158a();
            }
        }

        C2941e() {
        }

        /* renamed from: a */
        public void mo9550a(C2714c0 c0Var) {
            C2932u.this.m10161a((Runnable) new C2942a(c0Var));
        }
    }

    /* renamed from: com.adcolony.sdk.u$f */
    class C2943f implements C2750e0 {

        /* renamed from: com.adcolony.sdk.u$f$a */
        class C2944a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C2714c0 f11848a;

            C2944a(C2714c0 c0Var) {
                this.f11848a = c0Var;
            }

            public void run() {
                boolean unused = C2932u.this.m10167b(this.f11848a);
                C2932u.this.m10158a();
            }
        }

        C2943f() {
        }

        /* renamed from: a */
        public void mo9550a(C2714c0 c0Var) {
            C2932u.this.m10161a((Runnable) new C2944a(c0Var));
        }
    }

    /* renamed from: com.adcolony.sdk.u$g */
    class C2945g implements C2750e0 {

        /* renamed from: com.adcolony.sdk.u$g$a */
        class C2946a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C2714c0 f11851a;

            C2946a(C2714c0 c0Var) {
                this.f11851a = c0Var;
            }

            public void run() {
                boolean unused = C2932u.this.m10169c(this.f11851a);
                C2932u.this.m10158a();
            }
        }

        C2945g() {
        }

        /* renamed from: a */
        public void mo9550a(C2714c0 c0Var) {
            C2932u.this.m10161a((Runnable) new C2946a(c0Var));
        }
    }

    /* renamed from: com.adcolony.sdk.u$h */
    class C2947h implements C2750e0 {

        /* renamed from: com.adcolony.sdk.u$h$a */
        class C2948a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C2714c0 f11854a;

            C2948a(C2714c0 c0Var) {
                this.f11854a = c0Var;
            }

            public void run() {
                boolean unused = C2932u.this.m10179h(this.f11854a);
                C2932u.this.m10158a();
            }
        }

        C2947h() {
        }

        /* renamed from: a */
        public void mo9550a(C2714c0 c0Var) {
            C2932u.this.m10161a((Runnable) new C2948a(c0Var));
        }
    }

    /* renamed from: com.adcolony.sdk.u$i */
    class C2949i implements C2750e0 {

        /* renamed from: com.adcolony.sdk.u$i$a */
        class C2950a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C2714c0 f11857a;

            C2950a(C2714c0 c0Var) {
                this.f11857a = c0Var;
            }

            public void run() {
                boolean unused = C2932u.this.m10162a(this.f11857a);
                C2932u.this.m10158a();
            }
        }

        C2949i() {
        }

        /* renamed from: a */
        public void mo9550a(C2714c0 c0Var) {
            C2932u.this.m10161a((Runnable) new C2950a(c0Var));
        }
    }

    C2932u() {
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public boolean m10169c(C2714c0 c0Var) {
        JSONObject b = c0Var.mo9608b();
        String i = C2976x.m10337i(b, "filepath");
        C2684a.m9409c().mo9738y().mo9911g();
        JSONObject b2 = C2976x.m10319b();
        try {
            int e = C2976x.m10332e(b, "offset");
            int e2 = C2976x.m10332e(b, "size");
            boolean c = C2976x.m10329c(b, "gunzip");
            String i2 = C2976x.m10337i(b, "output_filepath");
            InputStream p0Var = new C2866p0(new FileInputStream(i), e, e2);
            if (c) {
                p0Var = new GZIPInputStream(p0Var, 1024);
            }
            if (i2.equals("")) {
                StringBuilder sb = new StringBuilder(p0Var.available());
                byte[] bArr = new byte[1024];
                while (true) {
                    int read = p0Var.read(bArr, 0, 1024);
                    if (read < 0) {
                        break;
                    }
                    sb.append(new String(bArr, 0, read, C6540C.ISO88591_NAME));
                }
                C2976x.m10323b(b2, "size", sb.length());
                C2976x.m10313a(b2, "data", sb.toString());
            } else {
                FileOutputStream fileOutputStream = new FileOutputStream(i2);
                byte[] bArr2 = new byte[1024];
                int i3 = 0;
                while (true) {
                    int read2 = p0Var.read(bArr2, 0, 1024);
                    if (read2 < 0) {
                        break;
                    }
                    fileOutputStream.write(bArr2, 0, read2);
                    i3 += read2;
                }
                fileOutputStream.close();
                C2976x.m10323b(b2, "size", i3);
            }
            p0Var.close();
            C2976x.m10325b(b2, "success", true);
            c0Var.mo9607a(b2).mo9612d();
            return true;
        } catch (IOException unused) {
            C2976x.m10325b(b2, "success", false);
            c0Var.mo9607a(b2).mo9612d();
            return false;
        } catch (OutOfMemoryError unused2) {
            new C2978z.C2979a().mo10088a("Out of memory error - disabling AdColony.").mo10090a(C2978z.f11949i);
            C2684a.m9409c().mo9711b(true);
            C2976x.m10325b(b2, "success", false);
            c0Var.mo9607a(b2).mo9612d();
            return false;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public boolean m10172d(C2714c0 c0Var) {
        String i = C2976x.m10337i(c0Var.mo9608b(), "filepath");
        C2684a.m9409c().mo9738y().mo9911g();
        JSONObject b = C2976x.m10319b();
        String[] list = new File(i).list();
        if (list != null) {
            JSONArray a = C2976x.m10301a();
            for (String str : list) {
                JSONObject b2 = C2976x.m10319b();
                C2976x.m10313a(b2, "filename", str);
                if (new File(i + str).isDirectory()) {
                    C2976x.m10325b(b2, "is_folder", true);
                } else {
                    C2976x.m10325b(b2, "is_folder", false);
                }
                C2976x.m10308a(a, (Object) b2);
            }
            C2976x.m10325b(b, "success", true);
            C2976x.m10314a(b, "entries", a);
            c0Var.mo9607a(b).mo9612d();
            return true;
        }
        C2976x.m10325b(b, "success", false);
        c0Var.mo9607a(b).mo9612d();
        return false;
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public String m10173e(C2714c0 c0Var) {
        JSONObject b = c0Var.mo9608b();
        String i = C2976x.m10337i(b, "filepath");
        String i2 = C2976x.m10337i(b, "encoding");
        boolean z = i2 != null && i2.equals("utf8");
        C2684a.m9409c().mo9738y().mo9911g();
        JSONObject b2 = C2976x.m10319b();
        try {
            StringBuilder a = mo10011a(i, z);
            C2976x.m10325b(b2, "success", true);
            C2976x.m10313a(b2, "data", a.toString());
            c0Var.mo9607a(b2).mo9612d();
            return a.toString();
        } catch (IOException unused) {
            C2976x.m10325b(b2, "success", false);
            c0Var.mo9607a(b2).mo9612d();
            return "";
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public boolean m10175f(C2714c0 c0Var) {
        JSONObject b = c0Var.mo9608b();
        String i = C2976x.m10337i(b, "filepath");
        String i2 = C2976x.m10337i(b, "new_filepath");
        C2684a.m9409c().mo9738y().mo9911g();
        JSONObject b2 = C2976x.m10319b();
        try {
            if (new File(i).renameTo(new File(i2))) {
                C2976x.m10325b(b2, "success", true);
                c0Var.mo9607a(b2).mo9612d();
                return true;
            }
            C2976x.m10325b(b2, "success", false);
            c0Var.mo9607a(b2).mo9612d();
            return false;
        } catch (Exception unused) {
            C2976x.m10325b(b2, "success", false);
            c0Var.mo9607a(b2).mo9612d();
            return false;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public boolean m10177g(C2714c0 c0Var) {
        JSONObject b = c0Var.mo9608b();
        String i = C2976x.m10337i(b, "filepath");
        String i2 = C2976x.m10337i(b, "data");
        boolean equals = C2976x.m10337i(b, "encoding").equals("utf8");
        C2684a.m9409c().mo9738y().mo9911g();
        JSONObject b2 = C2976x.m10319b();
        try {
            mo10012a(i, i2, equals);
            C2976x.m10325b(b2, "success", true);
            c0Var.mo9607a(b2).mo9612d();
            return true;
        } catch (IOException unused) {
            C2976x.m10325b(b2, "success", false);
            c0Var.mo9607a(b2).mo9612d();
            return false;
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00f7, code lost:
        new com.adcolony.sdk.C2978z.C2979a().mo10088a("Out of memory error - disabling AdColony.").mo10090a(com.adcolony.sdk.C2978z.f11949i);
        com.adcolony.sdk.C2684a.m9409c().mo9711b(true);
        com.adcolony.sdk.C2976x.m10325b(r5, "success", false);
        r0.mo9607a(r5).mo9612d();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x011a, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x011b, code lost:
        r2 = false;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:24:? A[ExcHandler: OutOfMemoryError (unused java.lang.OutOfMemoryError), SYNTHETIC, Splitter:B:1:0x0029] */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean m10179h(com.adcolony.sdk.C2714c0 r20) {
        /*
            r19 = this;
            r0 = r20
            java.lang.String r1 = "success"
            org.json.JSONObject r2 = r20.mo9608b()
            java.lang.String r3 = "filepath"
            java.lang.String r3 = com.adcolony.sdk.C2976x.m10337i(r2, r3)
            java.lang.String r4 = "bundle_path"
            java.lang.String r4 = com.adcolony.sdk.C2976x.m10337i(r2, r4)
            java.lang.String r5 = "bundle_filenames"
            org.json.JSONArray r2 = com.adcolony.sdk.C2976x.m10318b((org.json.JSONObject) r2, (java.lang.String) r5)
            com.adcolony.sdk.i r5 = com.adcolony.sdk.C2684a.m9409c()
            com.adcolony.sdk.o0 r5 = r5.mo9738y()
            r5.mo9911g()
            org.json.JSONObject r5 = com.adcolony.sdk.C2976x.m10319b()
            java.io.File r8 = new java.io.File     // Catch:{ IOException -> 0x011b, OutOfMemoryError -> 0x00f7 }
            r8.<init>(r4)     // Catch:{ IOException -> 0x011b, OutOfMemoryError -> 0x00f7 }
            java.io.RandomAccessFile r9 = new java.io.RandomAccessFile     // Catch:{ IOException -> 0x011b, OutOfMemoryError -> 0x00f7 }
            java.lang.String r10 = "r"
            r9.<init>(r8, r10)     // Catch:{ IOException -> 0x011b, OutOfMemoryError -> 0x00f7 }
            r10 = 32
            byte[] r10 = new byte[r10]     // Catch:{ IOException -> 0x011b, OutOfMemoryError -> 0x00f7 }
            r9.readInt()     // Catch:{ IOException -> 0x011b, OutOfMemoryError -> 0x00f7 }
            int r11 = r9.readInt()     // Catch:{ IOException -> 0x011b, OutOfMemoryError -> 0x00f7 }
            org.json.JSONArray r12 = new org.json.JSONArray     // Catch:{ IOException -> 0x011b, OutOfMemoryError -> 0x00f7 }
            r12.<init>()     // Catch:{ IOException -> 0x011b, OutOfMemoryError -> 0x00f7 }
            r13 = 1024(0x400, float:1.435E-42)
            byte[] r14 = new byte[r13]     // Catch:{ IOException -> 0x011b, OutOfMemoryError -> 0x00f7 }
            r15 = 0
        L_0x004a:
            if (r15 >= r11) goto L_0x00dd
            int r16 = r15 * 44
            int r6 = r16 + 8
            r17 = r8
            long r7 = (long) r6     // Catch:{ IOException -> 0x011b, OutOfMemoryError -> 0x00f7 }
            r9.seek(r7)     // Catch:{ IOException -> 0x011b, OutOfMemoryError -> 0x00f7 }
            r9.read(r10)     // Catch:{ IOException -> 0x011b, OutOfMemoryError -> 0x00f7 }
            r9.readInt()     // Catch:{ IOException -> 0x011b, OutOfMemoryError -> 0x00f7 }
            int r6 = r9.readInt()     // Catch:{ IOException -> 0x011b, OutOfMemoryError -> 0x00f7 }
            int r7 = r9.readInt()     // Catch:{ IOException -> 0x011b, OutOfMemoryError -> 0x00f7 }
            r12.put(r7)     // Catch:{ IOException -> 0x011b, OutOfMemoryError -> 0x00f7 }
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ JSONException -> 0x00b3 }
            r8.<init>()     // Catch:{ JSONException -> 0x00b3 }
            r8.append(r3)     // Catch:{ JSONException -> 0x00b3 }
            java.lang.Object r13 = r2.get(r15)     // Catch:{ JSONException -> 0x00b3 }
            r8.append(r13)     // Catch:{ JSONException -> 0x00b3 }
            java.lang.String r8 = r8.toString()     // Catch:{ JSONException -> 0x00b3 }
            r18 = r2
            r13 = r3
            long r2 = (long) r6
            r9.seek(r2)     // Catch:{ IOException -> 0x011b, OutOfMemoryError -> 0x00f7 }
            java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x011b, OutOfMemoryError -> 0x00f7 }
            r2.<init>(r8)     // Catch:{ IOException -> 0x011b, OutOfMemoryError -> 0x00f7 }
            int r3 = r7 / 1024
            int r7 = r7 % 1024
            r6 = 0
        L_0x008b:
            if (r6 >= r3) goto L_0x009d
            r16 = r3
            r3 = 1024(0x400, float:1.435E-42)
            r8 = 0
            r9.read(r14, r8, r3)     // Catch:{ IOException -> 0x011b, OutOfMemoryError -> 0x00f7 }
            r2.write(r14, r8, r3)     // Catch:{ IOException -> 0x011b, OutOfMemoryError -> 0x00f7 }
            int r6 = r6 + 1
            r3 = r16
            goto L_0x008b
        L_0x009d:
            r3 = 1024(0x400, float:1.435E-42)
            r8 = 0
            r9.read(r14, r8, r7)     // Catch:{ IOException -> 0x011b, OutOfMemoryError -> 0x00f7 }
            r2.write(r14, r8, r7)     // Catch:{ IOException -> 0x011b, OutOfMemoryError -> 0x00f7 }
            r2.close()     // Catch:{ IOException -> 0x011b, OutOfMemoryError -> 0x00f7 }
            int r15 = r15 + 1
            r3 = r13
            r8 = r17
            r2 = r18
            r13 = 1024(0x400, float:1.435E-42)
            goto L_0x004a
        L_0x00b3:
            com.adcolony.sdk.z$a r2 = new com.adcolony.sdk.z$a     // Catch:{ IOException -> 0x011b, OutOfMemoryError -> 0x00f7 }
            r2.<init>()     // Catch:{ IOException -> 0x011b, OutOfMemoryError -> 0x00f7 }
            java.lang.String r3 = "Couldn't extract file name at index "
            com.adcolony.sdk.z$a r2 = r2.mo10088a((java.lang.String) r3)     // Catch:{ IOException -> 0x011b, OutOfMemoryError -> 0x00f7 }
            com.adcolony.sdk.z$a r2 = r2.mo10086a((int) r15)     // Catch:{ IOException -> 0x011b, OutOfMemoryError -> 0x00f7 }
            java.lang.String r3 = " unpacking ad unit bundle at "
            com.adcolony.sdk.z$a r2 = r2.mo10088a((java.lang.String) r3)     // Catch:{ IOException -> 0x011b, OutOfMemoryError -> 0x00f7 }
            com.adcolony.sdk.z$a r2 = r2.mo10088a((java.lang.String) r4)     // Catch:{ IOException -> 0x011b, OutOfMemoryError -> 0x00f7 }
            com.adcolony.sdk.z r3 = com.adcolony.sdk.C2978z.f11949i     // Catch:{ IOException -> 0x011b, OutOfMemoryError -> 0x00f7 }
            r2.mo10090a((com.adcolony.sdk.C2978z) r3)     // Catch:{ IOException -> 0x011b, OutOfMemoryError -> 0x00f7 }
            r2 = 0
            com.adcolony.sdk.C2976x.m10325b((org.json.JSONObject) r5, (java.lang.String) r1, (boolean) r2)     // Catch:{ IOException -> 0x011c, OutOfMemoryError -> 0x00f7 }
            com.adcolony.sdk.c0 r3 = r0.mo9607a((org.json.JSONObject) r5)     // Catch:{ IOException -> 0x011c, OutOfMemoryError -> 0x00f7 }
            r3.mo9612d()     // Catch:{ IOException -> 0x011c, OutOfMemoryError -> 0x00f7 }
            return r2
        L_0x00dd:
            r17 = r8
            r9.close()     // Catch:{ IOException -> 0x011b, OutOfMemoryError -> 0x00f7 }
            r17.delete()     // Catch:{ IOException -> 0x011b, OutOfMemoryError -> 0x00f7 }
            r2 = 1
            com.adcolony.sdk.C2976x.m10325b((org.json.JSONObject) r5, (java.lang.String) r1, (boolean) r2)     // Catch:{ IOException -> 0x011b, OutOfMemoryError -> 0x00f7 }
            java.lang.String r2 = "file_sizes"
            com.adcolony.sdk.C2976x.m10314a((org.json.JSONObject) r5, (java.lang.String) r2, (org.json.JSONArray) r12)     // Catch:{ IOException -> 0x011b, OutOfMemoryError -> 0x00f7 }
            com.adcolony.sdk.c0 r2 = r0.mo9607a((org.json.JSONObject) r5)     // Catch:{ IOException -> 0x011b, OutOfMemoryError -> 0x00f7 }
            r2.mo9612d()     // Catch:{ IOException -> 0x011b, OutOfMemoryError -> 0x00f7 }
            r0 = 1
            return r0
        L_0x00f7:
            com.adcolony.sdk.z$a r2 = new com.adcolony.sdk.z$a
            r2.<init>()
            java.lang.String r3 = "Out of memory error - disabling AdColony."
            com.adcolony.sdk.z$a r2 = r2.mo10088a((java.lang.String) r3)
            com.adcolony.sdk.z r3 = com.adcolony.sdk.C2978z.f11949i
            r2.mo10090a((com.adcolony.sdk.C2978z) r3)
            com.adcolony.sdk.i r2 = com.adcolony.sdk.C2684a.m9409c()
            r3 = 1
            r2.mo9711b((boolean) r3)
            r2 = 0
            com.adcolony.sdk.C2976x.m10325b((org.json.JSONObject) r5, (java.lang.String) r1, (boolean) r2)
            com.adcolony.sdk.c0 r0 = r0.mo9607a((org.json.JSONObject) r5)
            r0.mo9612d()
            return r2
        L_0x011b:
            r2 = 0
        L_0x011c:
            com.adcolony.sdk.z$a r3 = new com.adcolony.sdk.z$a
            r3.<init>()
            java.lang.String r6 = "Failed to find or open ad unit bundle at path: "
            com.adcolony.sdk.z$a r3 = r3.mo10088a((java.lang.String) r6)
            com.adcolony.sdk.z$a r3 = r3.mo10088a((java.lang.String) r4)
            com.adcolony.sdk.z r4 = com.adcolony.sdk.C2978z.f11950j
            r3.mo10090a((com.adcolony.sdk.C2978z) r4)
            com.adcolony.sdk.C2976x.m10325b((org.json.JSONObject) r5, (java.lang.String) r1, (boolean) r2)
            com.adcolony.sdk.c0 r0 = r0.mo9607a((org.json.JSONObject) r5)
            r0.mo9612d()
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.adcolony.sdk.C2932u.m10179h(com.adcolony.sdk.c0):boolean");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo10014b() {
        C2684a.m9405a("FileSystem.save", (C2750e0) new C2933a());
        C2684a.m9405a("FileSystem.delete", (C2750e0) new C2935b());
        C2684a.m9405a("FileSystem.listing", (C2750e0) new C2937c());
        C2684a.m9405a("FileSystem.load", (C2750e0) new C2939d());
        C2684a.m9405a("FileSystem.rename", (C2750e0) new C2941e());
        C2684a.m9405a("FileSystem.exists", (C2750e0) new C2943f());
        C2684a.m9405a("FileSystem.extract", (C2750e0) new C2945g());
        C2684a.m9405a("FileSystem.unpack_bundle", (C2750e0) new C2947h());
        C2684a.m9405a("FileSystem.create_directory", (C2750e0) new C2949i());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo10012a(String str, String str2, boolean z) throws IOException {
        BufferedWriter bufferedWriter = z ? new BufferedWriter(new OutputStreamWriter(new FileOutputStream(str), C6540C.UTF8_NAME)) : new BufferedWriter(new OutputStreamWriter(new FileOutputStream(str)));
        bufferedWriter.write(str2);
        bufferedWriter.flush();
        bufferedWriter.close();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public boolean m10163a(C2714c0 c0Var, File file) {
        C2684a.m9409c().mo9738y().mo9911g();
        JSONObject b = C2976x.m10319b();
        if (mo10013a(file)) {
            C2976x.m10325b(b, "success", true);
            c0Var.mo9607a(b).mo9612d();
            return true;
        }
        C2976x.m10325b(b, "success", false);
        c0Var.mo9607a(b).mo9612d();
        return false;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public boolean m10167b(C2714c0 c0Var) {
        String i = C2976x.m10337i(c0Var.mo9608b(), "filepath");
        C2684a.m9409c().mo9738y().mo9911g();
        JSONObject b = C2976x.m10319b();
        try {
            boolean a = m10166a(i);
            C2976x.m10325b(b, IronSourceConstants.EVENTS_RESULT, a);
            C2976x.m10325b(b, "success", true);
            c0Var.mo9607a(b).mo9612d();
            return a;
        } catch (Exception e) {
            C2976x.m10325b(b, IronSourceConstants.EVENTS_RESULT, false);
            C2976x.m10325b(b, "success", false);
            c0Var.mo9607a(b).mo9612d();
            e.printStackTrace();
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo10013a(File file) {
        try {
            if (!file.isDirectory()) {
                return file.delete();
            }
            if (file.list().length == 0) {
                return file.delete();
            }
            String[] list = file.list();
            if (list.length > 0) {
                return mo10013a(new File(file, list[0]));
            }
            if (file.list().length == 0) {
                return file.delete();
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public StringBuilder mo10011a(String str, boolean z) throws IOException {
        BufferedReader bufferedReader;
        File file = new File(str);
        StringBuilder sb = new StringBuilder((int) file.length());
        if (z) {
            bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file.getAbsolutePath()), C6540C.UTF8_NAME));
        } else {
            bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file.getAbsolutePath())));
        }
        while (true) {
            String readLine = bufferedReader.readLine();
            if (readLine != null) {
                sb.append(readLine);
                sb.append("\n");
            } else {
                bufferedReader.close();
                return sb;
            }
        }
    }

    /* renamed from: a */
    private boolean m10166a(String str) {
        return new File(str).exists();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public boolean m10162a(C2714c0 c0Var) {
        String i = C2976x.m10337i(c0Var.mo9608b(), "filepath");
        C2684a.m9409c().mo9738y().mo9911g();
        JSONObject b = C2976x.m10319b();
        try {
            if (new File(i).mkdir()) {
                C2976x.m10325b(b, "success", true);
                c0Var.mo9607a(b).mo9612d();
                return true;
            }
            C2976x.m10325b(b, "success", false);
            return false;
        } catch (Exception unused) {
            C2976x.m10325b(b, "success", false);
            c0Var.mo9607a(b).mo9612d();
            return false;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m10161a(Runnable runnable) {
        if (!this.f11830a.isEmpty() || this.f11831b) {
            this.f11830a.push(runnable);
            return;
        }
        this.f11831b = true;
        runnable.run();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m10158a() {
        this.f11831b = false;
        if (!this.f11830a.isEmpty()) {
            this.f11831b = true;
            this.f11830a.removeLast().run();
        }
    }
}
