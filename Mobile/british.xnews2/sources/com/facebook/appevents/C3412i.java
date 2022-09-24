package com.facebook.appevents;

import com.facebook.C3642m;
import com.facebook.internal.C3511k;
import p019c3.C2651a;
import p076f3.C5261a;
import p087h3.C5410b;
import p092i3.C5468b;

/* renamed from: com.facebook.appevents.i */
/* compiled from: AppEventsManager */
public class C3412i {

    /* renamed from: com.facebook.appevents.i$a */
    /* compiled from: AppEventsManager */
    static class C3413a implements C3511k.C3514c {
        C3413a() {
        }

        /* renamed from: a */
        public void mo11842a(boolean z) {
            if (z) {
                C2651a.m9287c();
            }
        }
    }

    /* renamed from: com.facebook.appevents.i$b */
    /* compiled from: AppEventsManager */
    static class C3414b implements C3511k.C3514c {
        C3414b() {
        }

        /* renamed from: a */
        public void mo11842a(boolean z) {
            if (z) {
                C5468b.m24478a();
            }
        }
    }

    /* renamed from: com.facebook.appevents.i$c */
    /* compiled from: AppEventsManager */
    static class C3415c implements C3511k.C3514c {
        C3415c() {
        }

        /* renamed from: a */
        public void mo11842a(boolean z) {
            if (z) {
                C5410b.m24341g();
            }
        }
    }

    /* renamed from: com.facebook.appevents.i$d */
    /* compiled from: AppEventsManager */
    static class C3416d implements C3511k.C3514c {
        C3416d() {
        }

        /* renamed from: a */
        public void mo11842a(boolean z) {
            if (z) {
                C5261a.m23776a();
            }
        }
    }

    /* renamed from: a */
    public static void m11425a() {
        if (C3642m.m12283i()) {
            C3511k.m11755a(C3511k.C3515d.AAM, new C3413a());
            C3511k.m11755a(C3511k.C3515d.RestrictiveDataFiltering, new C3414b());
            C3511k.m11755a(C3511k.C3515d.PrivacyProtection, new C3415c());
            C3511k.m11755a(C3511k.C3515d.EventDeactivation, new C3416d());
        }
    }
}
