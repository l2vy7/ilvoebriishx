package androidx.room;

import android.content.Context;
import android.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;
import p086h1.C5370a;
import p086h1.C5372c;
import p086h1.C5373d;
import p091i1.C5436b;
import p091i1.C5437c;

/* renamed from: androidx.room.m */
/* compiled from: SQLiteCopyOpenHelper */
class C1209m implements C5437c {

    /* renamed from: b */
    private final Context f5519b;

    /* renamed from: c */
    private final String f5520c;

    /* renamed from: d */
    private final File f5521d;

    /* renamed from: e */
    private final int f5522e;

    /* renamed from: f */
    private final C5437c f5523f;

    /* renamed from: g */
    private C1176a f5524g;

    /* renamed from: h */
    private boolean f5525h;

    C1209m(Context context, String str, File file, int i, C5437c cVar) {
        this.f5519b = context;
        this.f5520c = str;
        this.f5521d = file;
        this.f5522e = i;
        this.f5523f = cVar;
    }

    /* renamed from: c */
    private void m6632c(File file) throws IOException {
        ReadableByteChannel readableByteChannel;
        if (this.f5520c != null) {
            readableByteChannel = Channels.newChannel(this.f5519b.getAssets().open(this.f5520c));
        } else if (this.f5521d != null) {
            readableByteChannel = new FileInputStream(this.f5521d).getChannel();
        } else {
            throw new IllegalStateException("copyFromAssetPath and copyFromFile == null!");
        }
        File createTempFile = File.createTempFile("room-copy-helper", ".tmp", this.f5519b.getCacheDir());
        createTempFile.deleteOnExit();
        C5373d.m24193a(readableByteChannel, new FileOutputStream(createTempFile).getChannel());
        File parentFile = file.getParentFile();
        if (parentFile != null && !parentFile.exists() && !parentFile.mkdirs()) {
            throw new IOException("Failed to create directories for " + file.getAbsolutePath());
        } else if (!createTempFile.renameTo(file)) {
            throw new IOException("Failed to move intermediate file (" + createTempFile.getAbsolutePath() + ") to destination (" + file.getAbsolutePath() + ").");
        }
    }

    /* renamed from: e */
    private void m6633e() {
        String databaseName = getDatabaseName();
        File databasePath = this.f5519b.getDatabasePath(databaseName);
        C1176a aVar = this.f5524g;
        C5370a aVar2 = new C5370a(databaseName, this.f5519b.getFilesDir(), aVar == null || aVar.f5427j);
        try {
            aVar2.mo21782b();
            if (!databasePath.exists()) {
                m6632c(databasePath);
                aVar2.mo21783c();
            } else if (this.f5524g == null) {
                aVar2.mo21783c();
            } else {
                try {
                    int c = C5372c.m24192c(databasePath);
                    int i = this.f5522e;
                    if (c == i) {
                        aVar2.mo21783c();
                    } else if (this.f5524g.mo5847a(c, i)) {
                        aVar2.mo21783c();
                    } else {
                        if (this.f5519b.deleteDatabase(databaseName)) {
                            try {
                                m6632c(databasePath);
                            } catch (IOException e) {
                                Log.w("ROOM", "Unable to copy database file.", e);
                            }
                        } else {
                            Log.w("ROOM", "Failed to delete database file (" + databaseName + ") for a copy destructive migration.");
                        }
                        aVar2.mo21783c();
                    }
                } catch (IOException e2) {
                    Log.w("ROOM", "Unable to read database version.", e2);
                    aVar2.mo21783c();
                }
            }
        } catch (IOException e3) {
            throw new RuntimeException("Unable to copy database file.", e3);
        } catch (Throwable th) {
            aVar2.mo21783c();
            throw th;
        }
    }

    public synchronized void close() {
        this.f5523f.close();
        this.f5525h = false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo5955d(C1176a aVar) {
        this.f5524g = aVar;
    }

    public String getDatabaseName() {
        return this.f5523f.getDatabaseName();
    }

    public synchronized C5436b getWritableDatabase() {
        if (!this.f5525h) {
            m6633e();
            this.f5525h = true;
        }
        return this.f5523f.getWritableDatabase();
    }

    public void setWriteAheadLoggingEnabled(boolean z) {
        this.f5523f.setWriteAheadLoggingEnabled(z);
    }
}
