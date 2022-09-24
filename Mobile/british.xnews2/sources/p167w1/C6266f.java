package p167w1;

import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.room.C1177b;
import androidx.room.C1199i;
import androidx.room.C1208l;
import p085h1.C5372c;
import p090i1.C5444f;

/* renamed from: w1.f */
/* compiled from: PreferenceDao_Impl */
public final class C6266f implements C6265e {

    /* renamed from: a */
    private final C1199i f25915a;

    /* renamed from: b */
    private final C1177b<C6264d> f25916b;

    /* renamed from: w1.f$a */
    /* compiled from: PreferenceDao_Impl */
    class C6267a extends C1177b<C6264d> {
        C6267a(C1199i iVar) {
            super(iVar);
        }

        /* renamed from: a */
        public void bind(C5444f fVar, C6264d dVar) {
            String str = dVar.f25913a;
            if (str == null) {
                fVar.mo5953j0(1);
            } else {
                fVar.mo5952i(1, str);
            }
            Long l = dVar.f25914b;
            if (l == null) {
                fVar.mo5953j0(2);
            } else {
                fVar.mo5945N(2, l.longValue());
            }
        }

        public String createQuery() {
            return "INSERT OR REPLACE INTO `Preference` (`key`,`long_value`) VALUES (?,?)";
        }
    }

    public C6266f(C1199i iVar) {
        this.f25915a = iVar;
        this.f25916b = new C6267a(iVar);
    }

    /* renamed from: a */
    public void mo23952a(C6264d dVar) {
        this.f25915a.assertNotSuspendingTransaction();
        this.f25915a.beginTransaction();
        try {
            this.f25916b.insert(dVar);
            this.f25915a.setTransactionSuccessful();
        } finally {
            this.f25915a.endTransaction();
        }
    }

    /* renamed from: b */
    public Long mo23953b(String str) {
        C1208l e = C1208l.m6621e("SELECT long_value FROM Preference where `key`=?", 1);
        if (str == null) {
            e.mo5953j0(1);
        } else {
            e.mo5952i(1, str);
        }
        this.f25915a.assertNotSuspendingTransaction();
        Long l = null;
        Cursor b = C5372c.m24191b(this.f25915a, e, false, (CancellationSignal) null);
        try {
            if (b.moveToFirst()) {
                if (!b.isNull(0)) {
                    l = Long.valueOf(b.getLong(0));
                }
            }
            return l;
        } finally {
            b.close();
            e.mo5951h();
        }
    }
}
