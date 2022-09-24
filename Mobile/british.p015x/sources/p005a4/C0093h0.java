package p005a4;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Build;
import java.util.Arrays;
import java.util.List;

/* renamed from: a4.h0 */
/* compiled from: SchemaManager */
final class C0093h0 extends SQLiteOpenHelper {

    /* renamed from: d */
    static int f228d = 4;

    /* renamed from: e */
    private static final C0094a f229e;

    /* renamed from: f */
    private static final C0094a f230f;

    /* renamed from: g */
    private static final C0094a f231g;

    /* renamed from: h */
    private static final C0094a f232h;

    /* renamed from: i */
    private static final List<C0094a> f233i;

    /* renamed from: b */
    private final int f234b;

    /* renamed from: c */
    private boolean f235c = false;

    /* renamed from: a4.h0$a */
    /* compiled from: SchemaManager */
    public interface C0094a {
        /* renamed from: a */
        void mo234a(SQLiteDatabase sQLiteDatabase);
    }

    static {
        C0094a b = C0082d0.m352b();
        f229e = b;
        C0094a b2 = C0084e0.m357b();
        f230f = b2;
        C0094a b3 = C0087f0.m363b();
        f231g = b3;
        C0094a b4 = C0090g0.m369b();
        f232h = b4;
        f233i = Arrays.asList(new C0094a[]{b, b2, b3, b4});
    }

    C0093h0(Context context, String str, int i) {
        super(context, str, (SQLiteDatabase.CursorFactory) null, i);
        this.f234b = i;
    }

    /* renamed from: c */
    private void m375c(SQLiteDatabase sQLiteDatabase) {
        if (!this.f235c) {
            onConfigure(sQLiteDatabase);
        }
    }

    /* renamed from: d */
    static /* synthetic */ void m376d(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE events (_id INTEGER PRIMARY KEY, context_id INTEGER NOT NULL, transport_name TEXT NOT NULL, timestamp_ms INTEGER NOT NULL, uptime_ms INTEGER NOT NULL, payload BLOB NOT NULL, code INTEGER, num_attempts INTEGER NOT NULL,FOREIGN KEY (context_id) REFERENCES transport_contexts(_id) ON DELETE CASCADE)");
        sQLiteDatabase.execSQL("CREATE TABLE event_metadata (_id INTEGER PRIMARY KEY, event_id INTEGER NOT NULL, name TEXT NOT NULL, value TEXT NOT NULL,FOREIGN KEY (event_id) REFERENCES events(_id) ON DELETE CASCADE)");
        sQLiteDatabase.execSQL("CREATE TABLE transport_contexts (_id INTEGER PRIMARY KEY, backend_name TEXT NOT NULL, priority INTEGER NOT NULL, next_request_ms INTEGER NOT NULL)");
        sQLiteDatabase.execSQL("CREATE INDEX events_backend_id on events(context_id)");
        sQLiteDatabase.execSQL("CREATE UNIQUE INDEX contexts_backend_priority on transport_contexts(backend_name, priority)");
    }

    /* renamed from: e */
    static /* synthetic */ void m377e(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("ALTER TABLE transport_contexts ADD COLUMN extras BLOB");
        sQLiteDatabase.execSQL("CREATE UNIQUE INDEX contexts_backend_priority_extras on transport_contexts(backend_name, priority, extras)");
        sQLiteDatabase.execSQL("DROP INDEX contexts_backend_priority");
    }

    /* renamed from: g */
    static /* synthetic */ void m379g(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("ALTER TABLE events ADD COLUMN inline BOOLEAN NOT NULL DEFAULT 1");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS event_payloads");
        sQLiteDatabase.execSQL("CREATE TABLE event_payloads (sequence_num INTEGER NOT NULL, event_id INTEGER NOT NULL, bytes BLOB NOT NULL,FOREIGN KEY (event_id) REFERENCES events(_id) ON DELETE CASCADE,PRIMARY KEY (sequence_num, event_id))");
    }

    /* renamed from: h */
    private void m380h(SQLiteDatabase sQLiteDatabase, int i) {
        m375c(sQLiteDatabase);
        m381j(sQLiteDatabase, 0, i);
    }

    /* renamed from: j */
    private void m381j(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        List<C0094a> list = f233i;
        if (i2 <= list.size()) {
            while (i < i2) {
                f233i.get(i).mo234a(sQLiteDatabase);
                i++;
            }
            return;
        }
        throw new IllegalArgumentException("Migration from " + i + " to " + i2 + " was requested, but cannot be performed. Only " + list.size() + " migrations are provided");
    }

    public void onConfigure(SQLiteDatabase sQLiteDatabase) {
        this.f235c = true;
        sQLiteDatabase.rawQuery("PRAGMA busy_timeout=0;", new String[0]).close();
        if (Build.VERSION.SDK_INT >= 16) {
            sQLiteDatabase.setForeignKeyConstraintsEnabled(true);
        }
    }

    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        m380h(sQLiteDatabase, this.f234b);
    }

    public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        sQLiteDatabase.execSQL("DROP TABLE events");
        sQLiteDatabase.execSQL("DROP TABLE event_metadata");
        sQLiteDatabase.execSQL("DROP TABLE transport_contexts");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS event_payloads");
        m380h(sQLiteDatabase, i2);
    }

    public void onOpen(SQLiteDatabase sQLiteDatabase) {
        m375c(sQLiteDatabase);
    }

    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        m375c(sQLiteDatabase);
        m381j(sQLiteDatabase, i, i2);
    }
}
