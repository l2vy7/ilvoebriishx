package com.appnext.core.adswatched.database;

import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.room.C1177b;
import androidx.room.C1199i;
import androidx.room.C1208l;
import androidx.room.C1211o;
import java.util.ArrayList;
import java.util.List;
import p086h1.C5372c;
import p091i1.C5444f;

/* renamed from: com.appnext.core.adswatched.database.b */
public final class C3172b implements C3171a {

    /* renamed from: ev */
    private final C1199i f12281ev;

    /* renamed from: ew */
    private final C1177b<AdWatched> f12282ew;

    /* renamed from: ex */
    private final C1211o f12283ex;

    public C3172b(C1199i iVar) {
        this.f12281ev = iVar;
        this.f12282ew = new C1177b<AdWatched>(iVar) {
            public final /* synthetic */ void bind(C5444f fVar, Object obj) {
                AdWatched adWatched = (AdWatched) obj;
                String str = adWatched.bannerId;
                if (str == null) {
                    fVar.mo5953j0(1);
                } else {
                    fVar.mo5952i(1, str);
                }
                String str2 = adWatched.auid;
                if (str2 == null) {
                    fVar.mo5953j0(2);
                } else {
                    fVar.mo5952i(2, str2);
                }
            }

            public final String createQuery() {
                return "INSERT OR REPLACE INTO `AdWatched` (`bannerId`,`auid`) VALUES (?,?)";
            }
        };
        this.f12283ex = new C1211o(iVar) {
            public final String createQuery() {
                return "DELETE FROM adwatched WHERE adwatched.auid Like ?";
            }
        };
    }

    /* renamed from: C */
    public final List<String> mo10757C(String str) {
        C1208l e = C1208l.m6621e("SELECT adwatched.bannerId FROM adwatched WHERE  adwatched.auid Like ?", 1);
        if (str == null) {
            e.mo5953j0(1);
        } else {
            e.mo5952i(1, str);
        }
        this.f12281ev.assertNotSuspendingTransaction();
        Cursor b = C5372c.m24191b(this.f12281ev, e, false, (CancellationSignal) null);
        try {
            ArrayList arrayList = new ArrayList(b.getCount());
            while (b.moveToNext()) {
                arrayList.add(b.getString(0));
            }
            return arrayList;
        } finally {
            b.close();
            e.mo5951h();
        }
    }

    /* renamed from: D */
    public final int mo10758D(String str) {
        this.f12281ev.assertNotSuspendingTransaction();
        C5444f acquire = this.f12283ex.acquire();
        if (str == null) {
            acquire.mo5953j0(1);
        } else {
            acquire.mo5952i(1, str);
        }
        this.f12281ev.beginTransaction();
        try {
            int I = acquire.mo21908I();
            this.f12281ev.setTransactionSuccessful();
            return I;
        } finally {
            this.f12281ev.endTransaction();
            this.f12283ex.release(acquire);
        }
    }

    /* renamed from: a */
    public final long mo10759a(AdWatched adWatched) {
        this.f12281ev.assertNotSuspendingTransaction();
        this.f12281ev.beginTransaction();
        try {
            long insertAndReturnId = this.f12282ew.insertAndReturnId(adWatched);
            this.f12281ev.setTransactionSuccessful();
            return insertAndReturnId;
        } finally {
            this.f12281ev.endTransaction();
        }
    }
}
