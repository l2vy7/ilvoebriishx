package androidx.work;

import java.util.List;

/* renamed from: androidx.work.k */
/* compiled from: InputMerger */
public abstract class C1480k {

    /* renamed from: a */
    private static final String f6490a = C1483m.m7773f("InputMerger");

    /* renamed from: a */
    public static C1480k m7765a(String str) {
        try {
            return (C1480k) Class.forName(str).newInstance();
        } catch (Exception e) {
            C1483m c = C1483m.m7771c();
            String str2 = f6490a;
            c.mo7014b(str2, "Trouble instantiating + " + str, e);
            return null;
        }
    }

    /* renamed from: b */
    public abstract C1427e mo6804b(List<C1427e> list);
}
