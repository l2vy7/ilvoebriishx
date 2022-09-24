package com.google.android.exoplayer2.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public final class AtomicFile {
    private static final String TAG = "AtomicFile";
    private final File backupName;
    private final File baseName;

    private static final class AtomicFileOutputStream extends OutputStream {
        private boolean closed = false;
        private final FileOutputStream fileOutputStream;

        public AtomicFileOutputStream(File file) throws FileNotFoundException {
            this.fileOutputStream = new FileOutputStream(file);
        }

        public void close() throws IOException {
            if (!this.closed) {
                this.closed = true;
                flush();
                try {
                    this.fileOutputStream.getFD().sync();
                } catch (IOException e) {
                    Log.m19798w(AtomicFile.TAG, "Failed to sync file descriptor:", e);
                }
                this.fileOutputStream.close();
            }
        }

        public void flush() throws IOException {
            this.fileOutputStream.flush();
        }

        public void write(int i) throws IOException {
            this.fileOutputStream.write(i);
        }

        public void write(byte[] bArr) throws IOException {
            this.fileOutputStream.write(bArr);
        }

        public void write(byte[] bArr, int i, int i2) throws IOException {
            this.fileOutputStream.write(bArr, i, i2);
        }
    }

    public AtomicFile(File file) {
        this.baseName = file;
        this.backupName = new File(String.valueOf(file.getPath()).concat(".bak"));
    }

    private void restoreBackup() {
        if (this.backupName.exists()) {
            this.baseName.delete();
            this.backupName.renameTo(this.baseName);
        }
    }

    public void delete() {
        this.baseName.delete();
        this.backupName.delete();
    }

    public void endWrite(OutputStream outputStream) throws IOException {
        outputStream.close();
        this.backupName.delete();
    }

    public boolean exists() {
        return this.baseName.exists() || this.backupName.exists();
    }

    public InputStream openRead() throws FileNotFoundException {
        restoreBackup();
        return new FileInputStream(this.baseName);
    }

    public OutputStream startWrite() throws IOException {
        if (this.baseName.exists()) {
            if (this.backupName.exists()) {
                this.baseName.delete();
            } else if (!this.baseName.renameTo(this.backupName)) {
                String valueOf = String.valueOf(this.baseName);
                String valueOf2 = String.valueOf(this.backupName);
                StringBuilder sb = new StringBuilder(valueOf.length() + 37 + valueOf2.length());
                sb.append("Couldn't rename file ");
                sb.append(valueOf);
                sb.append(" to backup file ");
                sb.append(valueOf2);
                Log.m19797w(TAG, sb.toString());
            }
        }
        try {
            return new AtomicFileOutputStream(this.baseName);
        } catch (FileNotFoundException e) {
            File parentFile = this.baseName.getParentFile();
            if (parentFile == null || !parentFile.mkdirs()) {
                String valueOf3 = String.valueOf(this.baseName);
                StringBuilder sb2 = new StringBuilder(valueOf3.length() + 16);
                sb2.append("Couldn't create ");
                sb2.append(valueOf3);
                throw new IOException(sb2.toString(), e);
            }
            try {
                return new AtomicFileOutputStream(this.baseName);
            } catch (FileNotFoundException e2) {
                String valueOf4 = String.valueOf(this.baseName);
                StringBuilder sb3 = new StringBuilder(valueOf4.length() + 16);
                sb3.append("Couldn't create ");
                sb3.append(valueOf4);
                throw new IOException(sb3.toString(), e2);
            }
        }
    }
}
