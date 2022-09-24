package p325r8;

/* renamed from: r8.a */
/* compiled from: BasicRouteDirector */
public class C12870a implements C12872c {
    /* renamed from: a */
    public int mo48013a(C12874e eVar, C12874e eVar2) {
        if (eVar == null) {
            throw new IllegalArgumentException("Planned route may not be null.");
        } else if (eVar2 == null || eVar2.mo48018b() < 1) {
            return mo48015c(eVar);
        } else {
            if (eVar.mo48018b() > 1) {
                return mo48016d(eVar, eVar2);
            }
            return mo48014b(eVar, eVar2);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public int mo48014b(C12874e eVar, C12874e eVar2) {
        if (eVar2.mo48018b() > 1 || !eVar.mo48024h().equals(eVar2.mo48024h()) || eVar.mo48017a() != eVar2.mo48017a()) {
            return -1;
        }
        if (eVar.mo48021d() == null || eVar.mo48021d().equals(eVar2.mo48021d())) {
            return 0;
        }
        return -1;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public int mo48015c(C12874e eVar) {
        return eVar.mo48018b() > 1 ? 2 : 1;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public int mo48016d(C12874e eVar, C12874e eVar2) {
        int b;
        int b2;
        if (eVar2.mo48018b() <= 1 || !eVar.mo48024h().equals(eVar2.mo48024h()) || (b = eVar.mo48018b()) < (b2 = eVar2.mo48018b())) {
            return -1;
        }
        for (int i = 0; i < b2 - 1; i++) {
            if (!eVar.mo48023g(i).equals(eVar2.mo48023g(i))) {
                return -1;
            }
        }
        if (b > b2) {
            return 4;
        }
        if ((eVar2.mo48019c() && !eVar.mo48019c()) || (eVar2.mo48026i() && !eVar.mo48026i())) {
            return -1;
        }
        if (eVar.mo48019c() && !eVar2.mo48019c()) {
            return 3;
        }
        if (eVar.mo48026i() && !eVar2.mo48026i()) {
            return 5;
        }
        if (eVar.mo48017a() != eVar2.mo48017a()) {
            return -1;
        }
        return 0;
    }
}
