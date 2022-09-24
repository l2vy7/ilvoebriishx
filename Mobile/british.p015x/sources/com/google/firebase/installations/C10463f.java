package com.google.firebase.installations;

import android.text.TextUtils;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import p228k7.C10655d;
import p234m7.C10811a;
import p234m7.C10812b;

/* renamed from: com.google.firebase.installations.f */
/* compiled from: Utils */
public final class C10463f {

    /* renamed from: b */
    public static final long f48964b = TimeUnit.HOURS.toSeconds(1);

    /* renamed from: c */
    private static final Pattern f48965c = Pattern.compile("\\AA[\\w-]{38}\\z");

    /* renamed from: d */
    private static C10463f f48966d;

    /* renamed from: a */
    private final C10811a f48967a;

    private C10463f(C10811a aVar) {
        this.f48967a = aVar;
    }

    /* renamed from: c */
    public static C10463f m48162c() {
        return m48163d(C10812b.m48780a());
    }

    /* renamed from: d */
    public static C10463f m48163d(C10811a aVar) {
        if (f48966d == null) {
            f48966d = new C10463f(aVar);
        }
        return f48966d;
    }

    /* renamed from: g */
    static boolean m48164g(String str) {
        return f48965c.matcher(str).matches();
    }

    /* renamed from: h */
    static boolean m48165h(String str) {
        return str.contains(":");
    }

    /* renamed from: a */
    public long mo41936a() {
        return this.f48967a.currentTimeMillis();
    }

    /* renamed from: b */
    public long mo41937b() {
        return TimeUnit.MILLISECONDS.toSeconds(mo41936a());
    }

    /* renamed from: e */
    public long mo41938e() {
        return (long) (Math.random() * 1000.0d);
    }

    /* renamed from: f */
    public boolean mo41939f(C10655d dVar) {
        if (!TextUtils.isEmpty(dVar.mo42760b()) && dVar.mo42767h() + dVar.mo42761c() >= mo41937b() + f48964b) {
            return false;
        }
        return true;
    }
}
