package com.google.android.gms.common.internal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.google.android.gms.common.internal.m */
/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
public final class C7408m {

    /* renamed from: com.google.android.gms.common.internal.m$a */
    /* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
    public static final class C7409a {

        /* renamed from: a */
        private final List<String> f29336a = new ArrayList();

        /* renamed from: b */
        private final Object f29337b;

        /* synthetic */ C7409a(Object obj, C7434u0 u0Var) {
            C4604n.m20098k(obj);
            this.f29337b = obj;
        }

        /* renamed from: a */
        public C7409a mo30140a(String str, Object obj) {
            List<String> list = this.f29336a;
            C4604n.m20098k(str);
            String valueOf = String.valueOf(obj);
            StringBuilder sb = new StringBuilder(str.length() + 1 + valueOf.length());
            sb.append(str);
            sb.append("=");
            sb.append(valueOf);
            list.add(sb.toString());
            return this;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder(100);
            sb.append(this.f29337b.getClass().getSimpleName());
            sb.append('{');
            int size = this.f29336a.size();
            for (int i = 0; i < size; i++) {
                sb.append(this.f29336a.get(i));
                if (i < size - 1) {
                    sb.append(", ");
                }
            }
            sb.append('}');
            return sb.toString();
        }
    }

    /* renamed from: a */
    public static boolean m30028a(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    /* renamed from: b */
    public static int m30029b(Object... objArr) {
        return Arrays.hashCode(objArr);
    }

    /* renamed from: c */
    public static C7409a m30030c(Object obj) {
        return new C7409a(obj, (C7434u0) null);
    }
}
