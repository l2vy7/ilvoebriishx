package com.adcolony.sdk;

import android.content.Context;
import android.os.StatFs;
import com.adcolony.sdk.C2978z;
import java.io.File;

/* renamed from: com.adcolony.sdk.o0 */
class C2863o0 {

    /* renamed from: a */
    private String f11607a;

    /* renamed from: b */
    private String f11608b;

    /* renamed from: c */
    private String f11609c;

    /* renamed from: d */
    private String f11610d;

    /* renamed from: e */
    private File f11611e;

    /* renamed from: f */
    private File f11612f;

    /* renamed from: g */
    private File f11613g;

    C2863o0() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public double mo9904a(String str) {
        try {
            StatFs statFs = new StatFs(str);
            return (double) (((long) statFs.getAvailableBlocks()) * ((long) statFs.getBlockSize()));
        } catch (RuntimeException unused) {
            return 0.0d;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public String mo9906b() {
        return this.f11609c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public String mo9907c() {
        return this.f11608b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public String mo9908d() {
        return this.f11610d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public boolean mo9909e() {
        C2794i c = C2684a.m9409c();
        this.f11607a = mo9910f() + "/adc3/";
        this.f11608b = this.f11607a + "media/";
        File file = new File(this.f11608b);
        this.f11611e = file;
        if (!file.isDirectory()) {
            this.f11611e.delete();
            this.f11611e.mkdirs();
        }
        if (!this.f11611e.isDirectory()) {
            c.mo9711b(true);
            return false;
        } else if (mo9904a(this.f11608b) < 2.097152E7d) {
            new C2978z.C2979a().mo10088a("Not enough memory available at media path, disabling AdColony.").mo10090a(C2978z.f11947g);
            c.mo9711b(true);
            return false;
        } else {
            this.f11609c = mo9910f() + "/adc3/data/";
            File file2 = new File(this.f11609c);
            this.f11612f = file2;
            if (!file2.isDirectory()) {
                this.f11612f.delete();
            }
            this.f11612f.mkdirs();
            this.f11610d = this.f11607a + "tmp/";
            File file3 = new File(this.f11610d);
            this.f11613g = file3;
            if (!file3.isDirectory()) {
                this.f11613g.delete();
                this.f11613g.mkdirs();
            }
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public String mo9910f() {
        Context b = C2684a.m9407b();
        if (b == null) {
            return "";
        }
        return b.getFilesDir().getAbsolutePath();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public boolean mo9911g() {
        File file = this.f11611e;
        if (file == null || this.f11612f == null || this.f11613g == null) {
            return false;
        }
        if (!file.isDirectory()) {
            this.f11611e.delete();
        }
        if (!this.f11612f.isDirectory()) {
            this.f11612f.delete();
        }
        if (!this.f11613g.isDirectory()) {
            this.f11613g.delete();
        }
        this.f11611e.mkdirs();
        this.f11612f.mkdirs();
        this.f11613g.mkdirs();
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public String mo9905a() {
        return this.f11607a;
    }
}
