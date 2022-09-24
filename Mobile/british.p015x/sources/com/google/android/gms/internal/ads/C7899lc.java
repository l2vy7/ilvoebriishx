package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import java.io.ByteArrayInputStream;
import java.lang.reflect.InvocationTargetException;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.util.ArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.internal.ads.lc */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class C7899lc extends C7827jd {

    /* renamed from: j */
    private static final C7863kd<C7896l9> f34982j = new C7863kd<>();

    /* renamed from: i */
    private final Context f34983i;

    public C7899lc(C8400zb zbVar, String str, String str2, C7600d8 d8Var, int i, int i2, Context context, C8288w7 w7Var) {
        super(zbVar, "iH08ecr5p8p5eQT3/BFJ6jAaJm3eLNoIe2oA7hLZl5P0jAtinrUdPK16lrJGpxBz", "Gvy6wet11FtrNaAWhnvYSI1hOQnkPBTAgqoI9PXuwaM=", d8Var, i, 27);
        this.f34983i = context;
    }

    /* renamed from: e */
    private final String m34418e() {
        try {
            if (this.f33845b.mo36038l() != null) {
                this.f33845b.mo36038l().get();
            }
            C8218u8 c = this.f33845b.mo36030c();
            if (c == null || !c.mo35140k0()) {
                return null;
            }
            return c.mo35145y0();
        } catch (InterruptedException | ExecutionException unused) {
            return null;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo30349b() throws IllegalAccessException, InvocationTargetException {
        C7896l9 l9Var;
        int i;
        Boolean bool;
        AtomicReference<C7896l9> a = f34982j.mo33067a(this.f34983i.getPackageName());
        synchronized (a) {
            C7896l9 l9Var2 = a.get();
            if (l9Var2 == null || C7569cc.m30949g(l9Var2.f34946b) || l9Var2.f34946b.equals("E") || l9Var2.f34946b.equals("0000000000000000000000000000000000000000000000000000000000000000")) {
                if (!C7569cc.m30949g((String) null)) {
                    i = 5;
                } else {
                    if (!C7569cc.m30949g((String) null)) {
                        bool = Boolean.FALSE;
                    } else {
                        bool = Boolean.FALSE;
                    }
                    i = (!bool.booleanValue() || !this.f33845b.mo36040p()) ? 3 : 4;
                }
                Boolean valueOf = Boolean.valueOf(i == 3);
                Boolean bool2 = (Boolean) C8311wv.m39277c().mo18570b(p00.f36889H1);
                String d = ((Boolean) C8311wv.m39277c().mo18570b(p00.f36881G1)).booleanValue() ? mo33306d() : null;
                if (bool2.booleanValue() && this.f33845b.mo36040p() && C7569cc.m30949g(d)) {
                    d = m34418e();
                }
                C7896l9 l9Var3 = new C7896l9((String) this.f33849f.invoke((Object) null, new Object[]{this.f34983i, valueOf, d}));
                if (C7569cc.m30949g(l9Var3.f34946b) || l9Var3.f34946b.equals("E")) {
                    int i2 = i - 1;
                    if (i2 == 3) {
                        String e = m34418e();
                        if (!C7569cc.m30949g(e)) {
                            l9Var3.f34946b = e;
                        }
                    } else if (i2 == 4) {
                        throw null;
                    }
                }
                a.set(l9Var3);
            }
            l9Var = a.get();
        }
        synchronized (this.f33848e) {
            if (l9Var != null) {
                this.f33848e.mo31183y0(l9Var.f34946b);
                this.f33848e.mo31154W(l9Var.f34947c);
                this.f33848e.mo31156Y(l9Var.f34948d);
                this.f33848e.mo31169l0(l9Var.f34949e);
                this.f33848e.mo31181x0(l9Var.f34950f);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final String mo33306d() {
        try {
            CertificateFactory instance = CertificateFactory.getInstance("X.509");
            byte[] i = C7569cc.m30951i((String) C8311wv.m39277c().mo18570b(p00.f36897I1));
            ArrayList arrayList = new ArrayList();
            arrayList.add(instance.generateCertificate(new ByteArrayInputStream(i)));
            if (!Build.TYPE.equals("user")) {
                arrayList.add(instance.generateCertificate(new ByteArrayInputStream(C7569cc.m30951i((String) C8311wv.m39277c().mo18570b(p00.f36905J1)))));
            }
            Context context = this.f34983i;
            String packageName = context.getPackageName();
            this.f33845b.mo36037k();
            if (Build.VERSION.SDK_INT <= 30 && !Build.VERSION.CODENAME.equals("S")) {
                return null;
            }
            ub3 D = ub3.m38262D();
            context.getPackageManager().requestChecksums(packageName, false, 8, arrayList, new C7900ld(D));
            return (String) D.get();
        } catch (PackageManager.NameNotFoundException | InterruptedException | NoClassDefFoundError | CertificateEncodingException | CertificateException | ExecutionException unused) {
            return null;
        }
    }
}
