package p063d1;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.util.Log;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileFilter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.ArrayList;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.util.zip.ZipOutputStream;

/* renamed from: d1.b */
/* compiled from: MultiDexExtractor */
final class C5149b implements Closeable {

    /* renamed from: b */
    private final File f22569b;

    /* renamed from: c */
    private final long f22570c;

    /* renamed from: d */
    private final File f22571d;

    /* renamed from: e */
    private final RandomAccessFile f22572e;

    /* renamed from: f */
    private final FileChannel f22573f;

    /* renamed from: g */
    private final FileLock f22574g;

    /* renamed from: d1.b$a */
    /* compiled from: MultiDexExtractor */
    class C5150a implements FileFilter {
        C5150a() {
        }

        public boolean accept(File file) {
            return !file.getName().equals("MultiDex.lock");
        }
    }

    /* renamed from: d1.b$b */
    /* compiled from: MultiDexExtractor */
    private static class C5151b extends File {

        /* renamed from: b */
        public long f22576b = -1;

        public C5151b(File file, String str) {
            super(file, str);
        }
    }

    C5149b(File file, File file2) throws IOException {
        Log.i("MultiDex", "MultiDexExtractor(" + file.getPath() + ", " + file2.getPath() + ")");
        this.f22569b = file;
        this.f22571d = file2;
        this.f22570c = m23460h(file);
        File file3 = new File(file2, "MultiDex.lock");
        RandomAccessFile randomAccessFile = new RandomAccessFile(file3, "rw");
        this.f22572e = randomAccessFile;
        try {
            FileChannel channel = randomAccessFile.getChannel();
            this.f22573f = channel;
            try {
                Log.i("MultiDex", "Blocking on lock " + file3.getPath());
                this.f22574g = channel.lock();
                Log.i("MultiDex", file3.getPath() + " locked");
            } catch (IOException e) {
                e = e;
                m23456d(this.f22573f);
                throw e;
            } catch (RuntimeException e2) {
                e = e2;
                m23456d(this.f22573f);
                throw e;
            } catch (Error e3) {
                e = e3;
                m23456d(this.f22573f);
                throw e;
            }
        } catch (IOException | Error | RuntimeException e4) {
            m23456d(this.f22572e);
            throw e4;
        }
    }

    /* renamed from: c */
    private void m23455c() {
        File[] listFiles = this.f22571d.listFiles(new C5150a());
        if (listFiles == null) {
            Log.w("MultiDex", "Failed to list secondary dex dir content (" + this.f22571d.getPath() + ").");
            return;
        }
        for (File file : listFiles) {
            Log.i("MultiDex", "Trying to delete old file " + file.getPath() + " of size " + file.length());
            if (!file.delete()) {
                Log.w("MultiDex", "Failed to delete old file " + file.getPath());
            } else {
                Log.i("MultiDex", "Deleted old file " + file.getPath());
            }
        }
    }

    /* renamed from: d */
    private static void m23456d(Closeable closeable) {
        try {
            closeable.close();
        } catch (IOException e) {
            Log.w("MultiDex", "Failed to close resource", e);
        }
    }

    /* renamed from: e */
    private static void m23457e(ZipFile zipFile, ZipEntry zipEntry, File file, String str) throws IOException, FileNotFoundException {
        ZipOutputStream zipOutputStream;
        InputStream inputStream = zipFile.getInputStream(zipEntry);
        File createTempFile = File.createTempFile("tmp-" + str, ".zip", file.getParentFile());
        Log.i("MultiDex", "Extracting " + createTempFile.getPath());
        try {
            zipOutputStream = new ZipOutputStream(new BufferedOutputStream(new FileOutputStream(createTempFile)));
            ZipEntry zipEntry2 = new ZipEntry("classes.dex");
            zipEntry2.setTime(zipEntry.getTime());
            zipOutputStream.putNextEntry(zipEntry2);
            byte[] bArr = new byte[16384];
            for (int read = inputStream.read(bArr); read != -1; read = inputStream.read(bArr)) {
                zipOutputStream.write(bArr, 0, read);
            }
            zipOutputStream.closeEntry();
            zipOutputStream.close();
            if (createTempFile.setReadOnly()) {
                Log.i("MultiDex", "Renaming to " + file.getPath());
                if (createTempFile.renameTo(file)) {
                    m23456d(inputStream);
                    createTempFile.delete();
                    return;
                }
                throw new IOException("Failed to rename \"" + createTempFile.getAbsolutePath() + "\" to \"" + file.getAbsolutePath() + "\"");
            }
            throw new IOException("Failed to mark readonly \"" + createTempFile.getAbsolutePath() + "\" (tmp of \"" + file.getAbsolutePath() + "\")");
        } catch (Throwable th) {
            m23456d(inputStream);
            createTempFile.delete();
            throw th;
        }
    }

    /* renamed from: f */
    private static SharedPreferences m23458f(Context context) {
        return context.getSharedPreferences("multidex.version", Build.VERSION.SDK_INT < 11 ? 0 : 4);
    }

    /* renamed from: g */
    private static long m23459g(File file) {
        long lastModified = file.lastModified();
        return lastModified == -1 ? lastModified - 1 : lastModified;
    }

    /* renamed from: h */
    private static long m23460h(File file) throws IOException {
        long c = C5152c.m23468c(file);
        return c == -1 ? c - 1 : c;
    }

    /* renamed from: j */
    private static boolean m23461j(Context context, File file, long j, String str) {
        SharedPreferences f = m23458f(context);
        if (f.getLong(str + "timestamp", -1) == m23459g(file)) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append("crc");
            return f.getLong(sb.toString(), -1) != j;
        }
    }

    /* renamed from: l */
    private List<C5151b> m23462l(Context context, String str) throws IOException {
        String str2 = str;
        Log.i("MultiDex", "loading existing secondary dex files");
        String str3 = this.f22569b.getName() + ".classes";
        SharedPreferences f = m23458f(context);
        int i = f.getInt(str2 + "dex.number", 1);
        ArrayList arrayList = new ArrayList(i + -1);
        int i2 = 2;
        while (i2 <= i) {
            C5151b bVar = new C5151b(this.f22571d, str3 + i2 + ".zip");
            if (bVar.isFile()) {
                bVar.f22576b = m23460h(bVar);
                long j = f.getLong(str2 + "dex.crc." + i2, -1);
                long j2 = f.getLong(str2 + "dex.time." + i2, -1);
                long lastModified = bVar.lastModified();
                if (j2 == lastModified) {
                    String str4 = str3;
                    SharedPreferences sharedPreferences = f;
                    if (j == bVar.f22576b) {
                        arrayList.add(bVar);
                        i2++;
                        f = sharedPreferences;
                        str3 = str4;
                    }
                }
                throw new IOException("Invalid extracted dex: " + bVar + " (key \"" + str2 + "\"), expected modification time: " + j2 + ", modification time: " + lastModified + ", expected crc: " + j + ", file crc: " + bVar.f22576b);
            }
            throw new IOException("Missing extracted secondary dex file '" + bVar.getPath() + "'");
        }
        return arrayList;
    }

    /* renamed from: m */
    private List<C5151b> m23463m() throws IOException {
        C5151b bVar;
        boolean z;
        String str = this.f22569b.getName() + ".classes";
        m23455c();
        ArrayList arrayList = new ArrayList();
        ZipFile zipFile = new ZipFile(this.f22569b);
        try {
            ZipEntry entry = zipFile.getEntry("classes" + 2 + ".dex");
            int i = 2;
            while (entry != null) {
                bVar = new C5151b(this.f22571d, str + i + ".zip");
                arrayList.add(bVar);
                Log.i("MultiDex", "Extraction is needed for file " + bVar);
                int i2 = 0;
                boolean z2 = false;
                while (i2 < 3 && !z2) {
                    int i3 = i2 + 1;
                    m23457e(zipFile, entry, bVar, str);
                    bVar.f22576b = m23460h(bVar);
                    z = true;
                    StringBuilder sb = new StringBuilder();
                    sb.append("Extraction ");
                    sb.append(z ? "succeeded" : "failed");
                    sb.append(" '");
                    sb.append(bVar.getAbsolutePath());
                    sb.append("': length ");
                    int i4 = i3;
                    sb.append(bVar.length());
                    sb.append(" - crc: ");
                    sb.append(bVar.f22576b);
                    Log.i("MultiDex", sb.toString());
                    if (!z) {
                        bVar.delete();
                        if (bVar.exists()) {
                            Log.w("MultiDex", "Failed to delete corrupted secondary dex '" + bVar.getPath() + "'");
                        }
                    }
                    z2 = z;
                    i2 = i4;
                }
                if (z2) {
                    i++;
                    entry = zipFile.getEntry("classes" + i + ".dex");
                } else {
                    throw new IOException("Could not create zip file " + bVar.getAbsolutePath() + " for secondary dex (" + i + ")");
                }
            }
            try {
                zipFile.close();
            } catch (IOException e) {
                Log.w("MultiDex", "Failed to close resource", e);
            }
            return arrayList;
        } catch (IOException e2) {
            Log.w("MultiDex", "Failed to read crc from " + bVar.getAbsolutePath(), e2);
            z = false;
        } catch (Throwable th) {
            Throwable th2 = th;
            try {
                zipFile.close();
            } catch (IOException e3) {
                Log.w("MultiDex", "Failed to close resource", e3);
            }
            throw th2;
        }
    }

    /* renamed from: n */
    private static void m23464n(Context context, String str, long j, long j2, List<C5151b> list) {
        SharedPreferences.Editor edit = m23458f(context).edit();
        edit.putLong(str + "timestamp", j);
        edit.putLong(str + "crc", j2);
        edit.putInt(str + "dex.number", list.size() + 1);
        int i = 2;
        for (C5151b next : list) {
            edit.putLong(str + "dex.crc." + i, next.f22576b);
            edit.putLong(str + "dex.time." + i, next.lastModified());
            i++;
        }
        edit.commit();
    }

    public void close() throws IOException {
        this.f22574g.release();
        this.f22573f.close();
        this.f22572e.close();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public List<? extends File> mo21328k(Context context, String str, boolean z) throws IOException {
        List<C5151b> list;
        List<C5151b> list2;
        Log.i("MultiDex", "MultiDexExtractor.load(" + this.f22569b.getPath() + ", " + z + ", " + str + ")");
        if (this.f22574g.isValid()) {
            if (z || m23461j(context, this.f22569b, this.f22570c, str)) {
                if (z) {
                    Log.i("MultiDex", "Forced extraction must be performed.");
                } else {
                    Log.i("MultiDex", "Detected that extraction must be performed.");
                }
                list2 = m23463m();
                m23464n(context, str, m23459g(this.f22569b), this.f22570c, list2);
            } else {
                try {
                    list = m23462l(context, str);
                } catch (IOException e) {
                    Log.w("MultiDex", "Failed to reload existing extracted secondary dex files, falling back to fresh extraction", e);
                    list2 = m23463m();
                    m23464n(context, str, m23459g(this.f22569b), this.f22570c, list2);
                }
                Log.i("MultiDex", "load found " + list.size() + " secondary dex files");
                return list;
            }
            list = list2;
            Log.i("MultiDex", "load found " + list.size() + " secondary dex files");
            return list;
        }
        throw new IllegalStateException("MultiDexExtractor was closed");
    }
}
