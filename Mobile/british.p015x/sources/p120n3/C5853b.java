package p120n3;

import com.facebook.C3642m;
import com.facebook.C3655r;
import com.facebook.GraphRequest;
import java.io.File;
import java.io.FilenameFilter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import org.json.JSONArray;
import org.json.JSONException;
import p108l3.C5673c;

/* renamed from: n3.b */
/* compiled from: ErrorReportHandler */
public final class C5853b {

    /* renamed from: n3.b$a */
    /* compiled from: ErrorReportHandler */
    static class C5854a implements Comparator<C5852a> {
        C5854a() {
        }

        /* renamed from: a */
        public int compare(C5852a aVar, C5852a aVar2) {
            return aVar.mo22759b(aVar2);
        }
    }

    /* renamed from: n3.b$b */
    /* compiled from: ErrorReportHandler */
    static class C5855b implements GraphRequest.C3360f {

        /* renamed from: a */
        final /* synthetic */ ArrayList f24604a;

        C5855b(ArrayList arrayList) {
            this.f24604a = arrayList;
        }

        /* renamed from: b */
        public void mo7382b(C3655r rVar) {
            try {
                if (rVar.mo12380g() == null && rVar.mo12381h().getBoolean("success")) {
                    for (int i = 0; this.f24604a.size() > i; i++) {
                        ((C5852a) this.f24604a.get(i)).mo22758a();
                    }
                }
            } catch (JSONException unused) {
            }
        }
    }

    /* renamed from: n3.b$c */
    /* compiled from: ErrorReportHandler */
    static class C5856c implements FilenameFilter {
        C5856c() {
        }

        public boolean accept(File file, String str) {
            return str.matches(String.format("^%s[0-9]+.json$", new Object[]{"error_log_"}));
        }
    }

    /* renamed from: a */
    public static void m25847a() {
        if (C3642m.m12283i()) {
            m25850d();
        }
    }

    /* renamed from: b */
    public static File[] m25848b() {
        File c = C5673c.m25028c();
        if (c == null) {
            return new File[0];
        }
        return c.listFiles(new C5856c());
    }

    /* renamed from: c */
    public static void m25849c(String str) {
        try {
            new C5852a(str).mo22762e();
        } catch (Exception unused) {
        }
    }

    /* renamed from: d */
    public static void m25850d() {
        File[] b = m25848b();
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (File aVar : b) {
            C5852a aVar2 = new C5852a(aVar);
            if (aVar2.mo22761d()) {
                arrayList.add(aVar2);
            }
        }
        Collections.sort(arrayList, new C5854a());
        JSONArray jSONArray = new JSONArray();
        while (i < arrayList.size() && i < 1000) {
            jSONArray.put(arrayList.get(i));
            i++;
        }
        C5673c.m25033h("error_reports", jSONArray, new C5855b(arrayList));
    }
}
