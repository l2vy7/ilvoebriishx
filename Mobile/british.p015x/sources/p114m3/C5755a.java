package p114m3;

import android.os.Process;
import android.util.Log;
import com.facebook.C3642m;
import com.facebook.C3655r;
import com.facebook.GraphRequest;
import java.io.File;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import org.json.JSONArray;
import org.json.JSONException;
import p108l3.C5667a;
import p108l3.C5673c;

/* renamed from: m3.a */
/* compiled from: CrashHandler */
public class C5755a implements Thread.UncaughtExceptionHandler {

    /* renamed from: c */
    private static final String f24402c = C5755a.class.getCanonicalName();

    /* renamed from: d */
    private static C5755a f24403d;

    /* renamed from: a */
    private final Thread.UncaughtExceptionHandler f24404a;

    /* renamed from: b */
    private boolean f24405b = false;

    /* renamed from: m3.a$a */
    /* compiled from: CrashHandler */
    static class C5756a implements Comparator<C5667a> {
        C5756a() {
        }

        /* renamed from: a */
        public int compare(C5667a aVar, C5667a aVar2) {
            return aVar.mo22347b(aVar2);
        }
    }

    /* renamed from: m3.a$b */
    /* compiled from: CrashHandler */
    static class C5757b implements GraphRequest.C3360f {

        /* renamed from: a */
        final /* synthetic */ ArrayList f24406a;

        C5757b(ArrayList arrayList) {
            this.f24406a = arrayList;
        }

        /* renamed from: b */
        public void mo7382b(C3655r rVar) {
            try {
                if (rVar.mo12380g() == null && rVar.mo12381h().getBoolean("success")) {
                    for (int i = 0; this.f24406a.size() > i; i++) {
                        ((C5667a) this.f24406a.get(i)).mo22346a();
                    }
                }
            } catch (JSONException unused) {
            }
        }
    }

    private C5755a(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.f24404a = uncaughtExceptionHandler;
    }

    /* renamed from: a */
    public static synchronized void m25458a() {
        synchronized (C5755a.class) {
            if (C3642m.m12283i()) {
                m25460c();
            }
            if (f24403d != null) {
                Log.w(f24402c, "Already enabled!");
                return;
            }
            C5755a aVar = new C5755a(Thread.getDefaultUncaughtExceptionHandler());
            f24403d = aVar;
            Thread.setDefaultUncaughtExceptionHandler(aVar);
        }
    }

    /* renamed from: b */
    private static void m25459b() {
        try {
            Process.killProcess(Process.myPid());
            System.exit(10);
        } catch (Throwable unused) {
        }
    }

    /* renamed from: c */
    private static void m25460c() {
        File[] f = C5673c.m25031f();
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (File aVar : f) {
            C5667a aVar2 = new C5667a(aVar);
            if (aVar2.mo22349d()) {
                arrayList.add(aVar2);
            }
        }
        Collections.sort(arrayList, new C5756a());
        JSONArray jSONArray = new JSONArray();
        while (i < arrayList.size() && i < 5) {
            jSONArray.put(arrayList.get(i));
            i++;
        }
        C5673c.m25033h("crash_reports", jSONArray, new C5757b(arrayList));
    }

    public void uncaughtException(Thread thread, Throwable th) {
        if (C5673c.m25030e(th)) {
            new C5667a(th, C5667a.C5669b.CrashReport).mo22350e();
        }
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.f24404a;
        if (uncaughtExceptionHandler != null) {
            uncaughtExceptionHandler.uncaughtException(thread, th);
        }
        if (this.f24405b) {
            m25459b();
        }
    }
}
