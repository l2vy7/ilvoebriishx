package p096j1;

import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Build;
import java.io.File;
import p091i1.C5436b;
import p091i1.C5437c;

/* renamed from: j1.b */
/* compiled from: FrameworkSQLiteOpenHelper */
class C5496b implements C5437c {

    /* renamed from: b */
    private final Context f23897b;

    /* renamed from: c */
    private final String f23898c;

    /* renamed from: d */
    private final C5437c.C5438a f23899d;

    /* renamed from: e */
    private final boolean f23900e;

    /* renamed from: f */
    private final Object f23901f = new Object();

    /* renamed from: g */
    private C5497a f23902g;

    /* renamed from: h */
    private boolean f23903h;

    /* renamed from: j1.b$a */
    /* compiled from: FrameworkSQLiteOpenHelper */
    static class C5497a extends SQLiteOpenHelper {

        /* renamed from: b */
        final C5493a[] f23904b;

        /* renamed from: c */
        final C5437c.C5438a f23905c;

        /* renamed from: d */
        private boolean f23906d;

        /* renamed from: j1.b$a$a */
        /* compiled from: FrameworkSQLiteOpenHelper */
        class C5498a implements DatabaseErrorHandler {

            /* renamed from: a */
            final /* synthetic */ C5437c.C5438a f23907a;

            /* renamed from: b */
            final /* synthetic */ C5493a[] f23908b;

            C5498a(C5437c.C5438a aVar, C5493a[] aVarArr) {
                this.f23907a = aVar;
                this.f23908b = aVarArr;
            }

            public void onCorruption(SQLiteDatabase sQLiteDatabase) {
                this.f23907a.mo21902c(C5497a.m24540d(this.f23908b, sQLiteDatabase));
            }
        }

        C5497a(Context context, String str, C5493a[] aVarArr, C5437c.C5438a aVar) {
            super(context, str, (SQLiteDatabase.CursorFactory) null, aVar.f23792a, new C5498a(aVar, aVarArr));
            this.f23905c = aVar;
            this.f23904b = aVarArr;
        }

        /* renamed from: d */
        static C5493a m24540d(C5493a[] aVarArr, SQLiteDatabase sQLiteDatabase) {
            C5493a aVar = aVarArr[0];
            if (aVar == null || !aVar.mo21965c(sQLiteDatabase)) {
                aVarArr[0] = new C5493a(sQLiteDatabase);
            }
            return aVarArr[0];
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public C5493a mo21969c(SQLiteDatabase sQLiteDatabase) {
            return m24540d(this.f23904b, sQLiteDatabase);
        }

        public synchronized void close() {
            super.close();
            this.f23904b[0] = null;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public synchronized C5436b mo21971e() {
            this.f23906d = false;
            SQLiteDatabase writableDatabase = super.getWritableDatabase();
            if (this.f23906d) {
                close();
                return mo21971e();
            }
            return mo21969c(writableDatabase);
        }

        public void onConfigure(SQLiteDatabase sQLiteDatabase) {
            this.f23905c.mo5931b(mo21969c(sQLiteDatabase));
        }

        public void onCreate(SQLiteDatabase sQLiteDatabase) {
            this.f23905c.mo5932d(mo21969c(sQLiteDatabase));
        }

        public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
            this.f23906d = true;
            this.f23905c.mo5933e(mo21969c(sQLiteDatabase), i, i2);
        }

        public void onOpen(SQLiteDatabase sQLiteDatabase) {
            if (!this.f23906d) {
                this.f23905c.mo5934f(mo21969c(sQLiteDatabase));
            }
        }

        public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
            this.f23906d = true;
            this.f23905c.mo5935g(mo21969c(sQLiteDatabase), i, i2);
        }
    }

    C5496b(Context context, String str, C5437c.C5438a aVar, boolean z) {
        this.f23897b = context;
        this.f23898c = str;
        this.f23899d = aVar;
        this.f23900e = z;
    }

    /* renamed from: c */
    private C5497a m24539c() {
        C5497a aVar;
        synchronized (this.f23901f) {
            if (this.f23902g == null) {
                C5493a[] aVarArr = new C5493a[1];
                int i = Build.VERSION.SDK_INT;
                if (i < 23 || this.f23898c == null || !this.f23900e) {
                    this.f23902g = new C5497a(this.f23897b, this.f23898c, aVarArr, this.f23899d);
                } else {
                    this.f23902g = new C5497a(this.f23897b, new File(this.f23897b.getNoBackupFilesDir(), this.f23898c).getAbsolutePath(), aVarArr, this.f23899d);
                }
                if (i >= 16) {
                    this.f23902g.setWriteAheadLoggingEnabled(this.f23903h);
                }
            }
            aVar = this.f23902g;
        }
        return aVar;
    }

    public void close() {
        m24539c().close();
    }

    public String getDatabaseName() {
        return this.f23898c;
    }

    public C5436b getWritableDatabase() {
        return m24539c().mo21971e();
    }

    public void setWriteAheadLoggingEnabled(boolean z) {
        synchronized (this.f23901f) {
            C5497a aVar = this.f23902g;
            if (aVar != null) {
                aVar.setWriteAheadLoggingEnabled(z);
            }
            this.f23903h = z;
        }
    }
}
