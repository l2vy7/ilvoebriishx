package com.startapp.sdk.adsbase.crashreport;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.util.Base64OutputStream;
import com.startapp.C11882e4;
import com.startapp.C5004d4;
import com.startapp.C5015nb;
import com.startapp.C5126w2;
import com.startapp.sdk.adsbase.crashreport.C12282b;
import com.startapp.sdk.adsbase.crashreport.ThreadsState;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.PrintWriter;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Map;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;

/* renamed from: com.startapp.sdk.adsbase.crashreport.a */
/* compiled from: Sta */
public class C12281a implements C12282b.C12286d {

    /* renamed from: a */
    public final Context f54577a;

    /* renamed from: b */
    public final boolean f54578b;

    /* renamed from: c */
    public final boolean f54579c;

    /* renamed from: d */
    public final boolean f54580d;

    public C12281a(Context context, String str, boolean z, boolean z2, boolean z3) {
        this.f54577a = context;
        this.f54578b = z;
        this.f54579c = z2;
        this.f54580d = z3;
    }

    /* renamed from: a */
    public boolean mo46231a(long j, String str) {
        HashSet hashSet;
        ThreadsState.C12280b bVar = new ThreadsState.C12280b();
        bVar.f54571a = "com.startapp.";
        bVar.f54575e = this.f54578b;
        bVar.f54576f = this.f54579c;
        bVar.f54574d = j;
        bVar.f54572b = str;
        if (this.f54580d) {
            hashSet = new HashSet();
            hashSet.add("android.webkit.WebView.loadDataWithBaseURL");
            hashSet.add("android.webkit.WebView.<init>");
            hashSet.add("android.webkit.WebView.stopLoading");
            hashSet.add("android.webkit.WebView.loadUrl");
            hashSet.add("libcore.icu.LocaleData.initLocaleData");
            hashSet.add("android.os.BinderProxy.transact");
            hashSet.add("android.hardware.SystemSensorManager.registerListenerImpl");
            hashSet.add("android.hardware.SystemSensorManager.<init>");
            hashSet.add("java.lang.Thread.<init>");
            hashSet.add("android.content.ContextWrapper.checkSelfPermission");
        } else {
            hashSet = null;
        }
        bVar.f54573c = hashSet;
        ThreadsState threadsState = new ThreadsState(bVar);
        if (threadsState.mo46226d() == null) {
            return false;
        }
        C5126w2.m23389a(this.f54577a, "StartappAnrTrace", (Serializable) threadsState);
        return true;
    }

    public void remove() {
        if (new File(C5126w2.m23395c(this.f54577a, "StartappAnrTrace")).exists()) {
            C5126w2.m23388a(this.f54577a, "StartappAnrTrace");
        }
    }

    /* renamed from: a */
    public void mo46230a() {
        ThreadsState threadsState;
        ThreadsState.ShrunkStackTraceElement[] shrunkStackTraceElementArr;
        if (new File(C5126w2.m23395c(this.f54577a, "StartappAnrTrace")).exists() && (threadsState = (ThreadsState) C5126w2.m23386a(this.f54577a, "StartappAnrTrace", ThreadsState.class)) != null) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            Map<Activity, Integer> map = C5015nb.f22145a;
            PrintWriter printWriter = new PrintWriter(new DeflaterOutputStream(new Base64OutputStream(byteArrayOutputStream, 10), new Deflater(9, true)));
            printWriter.print("\"delay: ");
            printWriter.print(threadsState.mo46223b());
            printWriter.println('\"');
            if (!TextUtils.isEmpty(threadsState.mo46225c())) {
                printWriter.print("\"handler: ");
                printWriter.print(threadsState.mo46225c());
                printWriter.println('\"');
            }
            Map<String, ThreadsState.ShrunkStackTraceElement[]> d = threadsState.mo46226d();
            int i = 0;
            StackTraceElement stackTraceElement = null;
            if (d == null) {
                shrunkStackTraceElementArr = null;
            } else {
                shrunkStackTraceElementArr = null;
                for (Map.Entry next : d.entrySet()) {
                    if (shrunkStackTraceElementArr == null) {
                        shrunkStackTraceElementArr = (ThreadsState.ShrunkStackTraceElement[]) next.getValue();
                    }
                    ThreadsState.ShrunkStackTraceElement[] shrunkStackTraceElementArr2 = (ThreadsState.ShrunkStackTraceElement[]) next.getValue();
                    printWriter.print('\"');
                    printWriter.print((String) next.getKey());
                    printWriter.println('\"');
                    for (ThreadsState.ShrunkStackTraceElement shrunkStackTraceElement : shrunkStackTraceElementArr2) {
                        if (shrunkStackTraceElement.mo46228a() != 0) {
                            printWriter.print(9);
                            printWriter.println(shrunkStackTraceElement.mo46228a());
                        }
                        StackTraceElement b = shrunkStackTraceElement.mo46229b();
                        if (b != null) {
                            printWriter.print(9);
                            printWriter.print("at ");
                            printWriter.print(b.getClassName());
                            printWriter.print('.');
                            printWriter.print(b.getMethodName());
                            printWriter.print('(');
                            printWriter.print(b.getFileName());
                            printWriter.print(':');
                            printWriter.print(b.getLineNumber());
                            printWriter.println(')');
                        }
                    }
                }
            }
            printWriter.close();
            if (shrunkStackTraceElementArr != null) {
                int length = shrunkStackTraceElementArr.length;
                while (true) {
                    if (i >= length) {
                        break;
                    }
                    StackTraceElement b2 = shrunkStackTraceElementArr[i].mo46229b();
                    if (b2 != null && b2.getClassName().startsWith("com.startapp.")) {
                        stackTraceElement = b2;
                        break;
                    }
                    i++;
                }
                if (stackTraceElement != null) {
                    String byteArrayOutputStream2 = byteArrayOutputStream.toString();
                    C5004d4 d4Var = new C5004d4(C11882e4.f52890i);
                    d4Var.f22126d = stackTraceElement.getClassName() + '.' + stackTraceElement.getMethodName();
                    d4Var.f22127e = byteArrayOutputStream2;
                    d4Var.mo20661a();
                }
            }
        }
    }
}
