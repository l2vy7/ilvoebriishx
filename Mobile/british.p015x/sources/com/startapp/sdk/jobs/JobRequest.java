package com.startapp.sdk.jobs;

import com.startapp.C11887e9;
import java.util.ArrayList;
import java.util.UUID;

/* compiled from: Sta */
public abstract class JobRequest {

    /* renamed from: a */
    public final String[] f54714a;

    /* renamed from: b */
    public final UUID f54715b = UUID.randomUUID();

    /* renamed from: c */
    public final Network f54716c;

    /* renamed from: d */
    public final boolean f54717d;

    /* compiled from: Sta */
    public enum Network {
        ANY,
        UNMETERED
    }

    /* renamed from: com.startapp.sdk.jobs.JobRequest$a */
    /* compiled from: Sta */
    public static abstract class C12316a<B extends C12316a<?>> {

        /* renamed from: a */
        public final String[] f54721a;

        /* renamed from: b */
        public Network f54722b;

        /* renamed from: c */
        public boolean f54723c;

        @SafeVarargs
        public C12316a(Class<? extends C12320b>... clsArr) {
            ArrayList arrayList = new ArrayList();
            for (Class<? extends C12320b> name : clsArr) {
                arrayList.add(name.getName());
            }
            this.f54721a = (String[]) arrayList.toArray(new String[0]);
        }
    }

    public JobRequest(C12316a<?> aVar) {
        this.f54714a = aVar.f54721a;
        this.f54716c = aVar.f54722b;
        this.f54717d = aVar.f54723c;
    }

    @SafeVarargs
    /* renamed from: a */
    public static int m53446a(Class<? extends C12320b>... clsArr) {
        if (clsArr.length == 0) {
            return 0;
        }
        String[] strArr = new String[clsArr.length];
        for (int i = 0; i < clsArr.length; i++) {
            strArr[i] = clsArr[i].getName();
        }
        return m53447a(strArr);
    }

    /* renamed from: a */
    public abstract boolean mo46475a(C11887e9 e9Var);

    /* renamed from: a */
    public static int m53447a(String[] strArr) {
        StringBuilder sb = new StringBuilder();
        for (String append : strArr) {
            sb.append(append);
        }
        return sb.toString().hashCode();
    }
}
