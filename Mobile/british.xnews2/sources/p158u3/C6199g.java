package p158u3;

import com.google.auto.value.AutoValue;

@AutoValue
/* renamed from: u3.g */
/* compiled from: BackendResponse */
public abstract class C6199g {

    /* renamed from: u3.g$a */
    /* compiled from: BackendResponse */
    public enum C6200a {
        OK,
        TRANSIENT_ERROR,
        FATAL_ERROR
    }

    /* renamed from: a */
    public static C6199g m27154a() {
        return new C6193b(C6200a.FATAL_ERROR, -1);
    }

    /* renamed from: d */
    public static C6199g m27155d(long j) {
        return new C6193b(C6200a.OK, j);
    }

    /* renamed from: e */
    public static C6199g m27156e() {
        return new C6193b(C6200a.TRANSIENT_ERROR, -1);
    }

    /* renamed from: b */
    public abstract long mo23619b();

    /* renamed from: c */
    public abstract C6200a mo23620c();
}
