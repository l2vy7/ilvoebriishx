package com.google.android.exoplayer2.source.dash.manifest;

import android.net.Uri;
import com.google.android.exoplayer2.util.UriUtil;
import com.ironsource.mediationsdk.logger.IronSourceError;

public final class RangedUri {
    private int hashCode;
    public final long length;
    private final String referenceUri;
    public final long start;

    public RangedUri(String str, long j, long j2) {
        this.referenceUri = str == null ? "" : str;
        this.start = j;
        this.length = j2;
    }

    public RangedUri attemptMerge(RangedUri rangedUri, String str) {
        String resolveUriString = resolveUriString(str);
        if (rangedUri != null && resolveUriString.equals(rangedUri.resolveUriString(str))) {
            long j = this.length;
            long j2 = -1;
            if (j != -1) {
                long j3 = this.start;
                if (j3 + j == rangedUri.start) {
                    long j4 = rangedUri.length;
                    if (j4 != -1) {
                        j2 = j + j4;
                    }
                    return new RangedUri(resolveUriString, j3, j2);
                }
            }
            long j5 = rangedUri.length;
            if (j5 != -1) {
                long j6 = rangedUri.start;
                if (j6 + j5 == this.start) {
                    if (j != -1) {
                        j2 = j5 + j;
                    }
                    return new RangedUri(resolveUriString, j6, j2);
                }
            }
        }
        return null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || RangedUri.class != obj.getClass()) {
            return false;
        }
        RangedUri rangedUri = (RangedUri) obj;
        if (this.start == rangedUri.start && this.length == rangedUri.length && this.referenceUri.equals(rangedUri.referenceUri)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        if (this.hashCode == 0) {
            this.hashCode = ((((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + ((int) this.start)) * 31) + ((int) this.length)) * 31) + this.referenceUri.hashCode();
        }
        return this.hashCode;
    }

    public Uri resolveUri(String str) {
        return UriUtil.resolveToUri(str, this.referenceUri);
    }

    public String resolveUriString(String str) {
        return UriUtil.resolve(str, this.referenceUri);
    }

    public String toString() {
        String str = this.referenceUri;
        long j = this.start;
        long j2 = this.length;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 81);
        sb.append("RangedUri(referenceUri=");
        sb.append(str);
        sb.append(", start=");
        sb.append(j);
        sb.append(", length=");
        sb.append(j2);
        sb.append(")");
        return sb.toString();
    }
}
