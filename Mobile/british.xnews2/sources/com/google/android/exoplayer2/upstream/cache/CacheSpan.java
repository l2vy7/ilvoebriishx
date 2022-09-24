package com.google.android.exoplayer2.upstream.cache;

import com.google.android.exoplayer2.C6540C;
import java.io.File;

public class CacheSpan implements Comparable<CacheSpan> {
    public final File file;
    public final boolean isCached;
    public final String key;
    public final long lastTouchTimestamp;
    public final long length;
    public final long position;

    public CacheSpan(String str, long j, long j2) {
        this(str, j, j2, C6540C.TIME_UNSET, (File) null);
    }

    public boolean isHoleSpan() {
        return !this.isCached;
    }

    public boolean isOpenEnded() {
        return this.length == -1;
    }

    public String toString() {
        long j = this.position;
        long j2 = this.length;
        StringBuilder sb = new StringBuilder(44);
        sb.append("[");
        sb.append(j);
        sb.append(", ");
        sb.append(j2);
        sb.append("]");
        return sb.toString();
    }

    public CacheSpan(String str, long j, long j2, long j3, File file2) {
        this.key = str;
        this.position = j;
        this.length = j2;
        this.isCached = file2 != null;
        this.file = file2;
        this.lastTouchTimestamp = j3;
    }

    public int compareTo(CacheSpan cacheSpan) {
        if (!this.key.equals(cacheSpan.key)) {
            return this.key.compareTo(cacheSpan.key);
        }
        long j = this.position - cacheSpan.position;
        if (j == 0) {
            return 0;
        }
        return j < 0 ? -1 : 1;
    }
}
