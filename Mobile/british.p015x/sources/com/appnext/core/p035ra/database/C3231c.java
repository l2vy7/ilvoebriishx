package com.appnext.core.p035ra.database;

import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.room.C1177b;
import androidx.room.C1199i;
import androidx.room.C1208l;
import androidx.room.C1211o;
import java.util.ArrayList;
import java.util.List;
import p086h1.C5371b;
import p086h1.C5372c;
import p091i1.C5444f;

/* renamed from: com.appnext.core.ra.database.c */
public final class C3231c implements C3230b {

    /* renamed from: eT */
    private final C1177b<C3229a> f12417eT;

    /* renamed from: eU */
    private final C1177b<C3229a> f12418eU;

    /* renamed from: eV */
    private final C1211o f12419eV;

    /* renamed from: ev */
    private final C1199i f12420ev;

    public C3231c(C1199i iVar) {
        this.f12420ev = iVar;
        this.f12417eT = new C1177b<C3229a>(iVar) {
            public final /* synthetic */ void bind(C5444f fVar, Object obj) {
                C3229a aVar = (C3229a) obj;
                String str = aVar.f12414eQ;
                if (str == null) {
                    fVar.mo5953j0(1);
                } else {
                    fVar.mo5952i(1, str);
                }
                String str2 = aVar.f12415eR;
                if (str2 == null) {
                    fVar.mo5953j0(2);
                } else {
                    fVar.mo5952i(2, str2);
                }
                fVar.mo5945N(3, aVar.f12416eS ? 1 : 0);
            }

            public final String createQuery() {
                return "INSERT OR IGNORE INTO `RecentApp` (`recentAppPackage`,`storeDate`,`sent`) VALUES (?,?,?)";
            }
        };
        this.f12418eU = new C1177b<C3229a>(iVar) {
            public final /* synthetic */ void bind(C5444f fVar, Object obj) {
                C3229a aVar = (C3229a) obj;
                String str = aVar.f12414eQ;
                if (str == null) {
                    fVar.mo5953j0(1);
                } else {
                    fVar.mo5952i(1, str);
                }
                String str2 = aVar.f12415eR;
                if (str2 == null) {
                    fVar.mo5953j0(2);
                } else {
                    fVar.mo5952i(2, str2);
                }
                fVar.mo5945N(3, aVar.f12416eS ? 1 : 0);
            }

            public final String createQuery() {
                return "INSERT OR REPLACE INTO `RecentApp` (`recentAppPackage`,`storeDate`,`sent`) VALUES (?,?,?)";
            }
        };
        this.f12419eV = new C1211o(iVar) {
            public final String createQuery() {
                return "DELETE FROM recentapp WHERE storeDate NOT LIKE ?";
            }
        };
    }

    /* renamed from: E */
    public final int mo10845E(String str) {
        this.f12420ev.assertNotSuspendingTransaction();
        C5444f acquire = this.f12419eV.acquire();
        if (str == null) {
            acquire.mo5953j0(1);
        } else {
            acquire.mo5952i(1, str);
        }
        this.f12420ev.beginTransaction();
        try {
            int I = acquire.mo21908I();
            this.f12420ev.setTransactionSuccessful();
            return I;
        } finally {
            this.f12420ev.endTransaction();
            this.f12419eV.release(acquire);
        }
    }

    /* renamed from: aR */
    public final List<C3229a> mo10846aR() {
        C1208l e = C1208l.m6621e("SELECT * FROM recentapp", 0);
        this.f12420ev.assertNotSuspendingTransaction();
        Cursor b = C5372c.m24191b(this.f12420ev, e, false, (CancellationSignal) null);
        try {
            int c = C5371b.m24189c(b, "recentAppPackage");
            int c2 = C5371b.m24189c(b, "storeDate");
            int c3 = C5371b.m24189c(b, "sent");
            ArrayList arrayList = new ArrayList(b.getCount());
            while (b.moveToNext()) {
                C3229a aVar = new C3229a();
                aVar.f12414eQ = b.getString(c);
                aVar.f12415eR = b.getString(c2);
                aVar.f12416eS = b.getInt(c3) != 0;
                arrayList.add(aVar);
            }
            return arrayList;
        } finally {
            b.close();
            e.mo5951h();
        }
    }

    /* renamed from: aS */
    public final List<C3229a> mo10847aS() {
        C1208l e = C1208l.m6621e("SELECT * FROM recentapp WHERE sent = 0", 0);
        this.f12420ev.assertNotSuspendingTransaction();
        Cursor b = C5372c.m24191b(this.f12420ev, e, false, (CancellationSignal) null);
        try {
            int c = C5371b.m24189c(b, "recentAppPackage");
            int c2 = C5371b.m24189c(b, "storeDate");
            int c3 = C5371b.m24189c(b, "sent");
            ArrayList arrayList = new ArrayList(b.getCount());
            while (b.moveToNext()) {
                C3229a aVar = new C3229a();
                aVar.f12414eQ = b.getString(c);
                aVar.f12415eR = b.getString(c2);
                aVar.f12416eS = b.getInt(c3) != 0;
                arrayList.add(aVar);
            }
            return arrayList;
        } finally {
            b.close();
            e.mo5951h();
        }
    }

    /* renamed from: b */
    public final long[] mo10848b(List<C3229a> list) {
        this.f12420ev.assertNotSuspendingTransaction();
        this.f12420ev.beginTransaction();
        try {
            long[] insertAndReturnIdsArray = this.f12417eT.insertAndReturnIdsArray(list);
            this.f12420ev.setTransactionSuccessful();
            return insertAndReturnIdsArray;
        } finally {
            this.f12420ev.endTransaction();
        }
    }

    /* renamed from: c */
    public final void mo10849c(List<C3229a> list) {
        this.f12420ev.assertNotSuspendingTransaction();
        this.f12420ev.beginTransaction();
        try {
            this.f12418eU.insert(list);
            this.f12420ev.setTransactionSuccessful();
        } finally {
            this.f12420ev.endTransaction();
        }
    }
}
