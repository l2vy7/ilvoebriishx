package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.C9284o8;
import com.google.android.gms.internal.measurement.C9330r8;
import java.io.IOException;

/* renamed from: com.google.android.gms.internal.measurement.o8 */
/* compiled from: com.google.android.gms:play-services-measurement-base@@20.1.0 */
public class C9284o8<MessageType extends C9330r8<MessageType, BuilderType>, BuilderType extends C9284o8<MessageType, BuilderType>> extends C9068a7<MessageType, BuilderType> {

    /* renamed from: b */
    private final C9330r8 f45341b;

    /* renamed from: c */
    protected C9330r8 f45342c;

    /* renamed from: d */
    protected boolean f45343d = false;

    protected C9284o8(MessageType messagetype) {
        this.f45341b = messagetype;
        this.f45342c = (C9330r8) messagetype.mo37393y(4, (Object) null, (Object) null);
    }

    /* renamed from: m */
    private static final void m43328m(C9330r8 r8Var, C9330r8 r8Var2) {
        C9134ea.m42831a().mo37546b(r8Var.getClass()).mo37357d(r8Var, r8Var2);
    }

    /* renamed from: g */
    public final /* synthetic */ C9409w9 mo37835g() {
        return this.f45341b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public final /* synthetic */ C9068a7 mo37314i(C9083b7 b7Var) {
        mo37838p((C9330r8) b7Var);
        return this;
    }

    /* renamed from: k */
    public final /* bridge */ /* synthetic */ C9068a7 mo37316k(byte[] bArr, int i, int i2) throws C9085b9 {
        mo37839s(bArr, 0, i2, C9132e8.m42824a());
        return this;
    }

    /* renamed from: l */
    public final /* bridge */ /* synthetic */ C9068a7 mo37317l(byte[] bArr, int i, int i2, C9132e8 e8Var) throws C9085b9 {
        mo37839s(bArr, 0, i2, e8Var);
        return this;
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public void mo37836n() {
        C9330r8 r8Var = (C9330r8) this.f45342c.mo37393y(4, (Object) null, (Object) null);
        m43328m(r8Var, this.f45342c);
        this.f45342c = r8Var;
    }

    /* renamed from: o */
    public final C9284o8 clone() {
        C9284o8 o8Var = (C9284o8) this.f45341b.mo37393y(5, (Object) null, (Object) null);
        o8Var.mo37838p(mo37841x());
        return o8Var;
    }

    /* renamed from: p */
    public final C9284o8 mo37838p(C9330r8 r8Var) {
        if (this.f45343d) {
            mo37836n();
            this.f45343d = false;
        }
        m43328m(this.f45342c, r8Var);
        return this;
    }

    /* renamed from: s */
    public final C9284o8 mo37839s(byte[] bArr, int i, int i2, C9132e8 e8Var) throws C9085b9 {
        if (this.f45343d) {
            mo37836n();
            this.f45343d = false;
        }
        try {
            C9134ea.m42831a().mo37546b(this.f45342c.getClass()).mo37356c(this.f45342c, bArr, 0, i2, new C9131e7(e8Var));
            return this;
        } catch (C9085b9 e) {
            throw e;
        } catch (IndexOutOfBoundsException unused) {
            throw C9085b9.m42688f();
        } catch (IOException e2) {
            throw new RuntimeException("Reading from byte array should not throw IOException.", e2);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x002e, code lost:
        if (r3 != false) goto L_0x0030;
     */
    /* renamed from: w */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final MessageType mo37840w() {
        /*
            r5 = this;
            com.google.android.gms.internal.measurement.r8 r0 = r5.mo37841x()
            r1 = 1
            r2 = 0
            java.lang.Object r3 = r0.mo37393y(r1, r2, r2)
            java.lang.Byte r3 = (java.lang.Byte) r3
            byte r3 = r3.byteValue()
            if (r3 != r1) goto L_0x0013
            goto L_0x0030
        L_0x0013:
            if (r3 == 0) goto L_0x0031
            com.google.android.gms.internal.measurement.ea r3 = com.google.android.gms.internal.measurement.C9134ea.m42831a()
            java.lang.Class r4 = r0.getClass()
            com.google.android.gms.internal.measurement.ha r3 = r3.mo37546b(r4)
            boolean r3 = r3.mo37355b(r0)
            if (r1 == r3) goto L_0x0029
            r1 = r2
            goto L_0x002a
        L_0x0029:
            r1 = r0
        L_0x002a:
            r4 = 2
            r0.mo37393y(r4, r1, r2)
            if (r3 == 0) goto L_0x0031
        L_0x0030:
            return r0
        L_0x0031:
            com.google.android.gms.internal.measurement.va r1 = new com.google.android.gms.internal.measurement.va
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C9284o8.mo37840w():com.google.android.gms.internal.measurement.r8");
    }

    /* renamed from: y */
    public MessageType mo37841x() {
        if (this.f45343d) {
            return this.f45342c;
        }
        C9330r8 r8Var = this.f45342c;
        C9134ea.m42831a().mo37546b(r8Var.getClass()).mo37354a(r8Var);
        this.f45343d = true;
        return this.f45342c;
    }
}
