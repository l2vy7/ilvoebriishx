package com.startapp;

import java.io.ByteArrayOutputStream;
import java.util.zip.GZIPOutputStream;

/* renamed from: com.startapp.a3 */
/* compiled from: Sta */
public class C11770a3 implements C12167ra {

    /* renamed from: a */
    public final C12131pa f52550a;

    public C11770a3(C12131pa paVar) {
        this.f52550a = paVar;
    }

    /* renamed from: a */
    public String mo45094a(String str) {
        GZIPOutputStream gZIPOutputStream = null;
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            GZIPOutputStream gZIPOutputStream2 = new GZIPOutputStream(byteArrayOutputStream);
            try {
                gZIPOutputStream2.write(str.getBytes());
                C12463z3.m53806a(gZIPOutputStream2);
                String a = this.f52550a.mo45670a(C12136q0.m52764b(byteArrayOutputStream.toByteArray()));
                C12463z3.m53806a(gZIPOutputStream2);
                return a;
            } catch (Exception unused) {
                gZIPOutputStream = gZIPOutputStream2;
                C12463z3.m53806a(gZIPOutputStream);
                return "";
            } catch (Throwable th) {
                C12463z3.m53806a(gZIPOutputStream2);
                throw th;
            }
        } catch (Exception unused2) {
            C12463z3.m53806a(gZIPOutputStream);
            return "";
        }
    }
}
