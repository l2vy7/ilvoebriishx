package com.google.ads.interactivemedia.p039v3.internal;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.NoSuchElementException;
import java.util.Queue;

/* renamed from: com.google.ads.interactivemedia.v3.internal.ahg */
/* compiled from: IMASDK */
final class ahg {

    /* renamed from: a */
    private final BufferedReader f14814a;

    /* renamed from: b */
    private final Queue<String> f14815b;

    /* renamed from: c */
    private String f14816c;

    public ahg(Queue<String> queue, BufferedReader bufferedReader) {
        this.f14815b = queue;
        this.f14814a = bufferedReader;
    }

    /* renamed from: a */
    public final boolean mo13717a() throws IOException {
        String trim;
        if (this.f14816c != null) {
            return true;
        }
        if (this.f14815b.isEmpty()) {
            do {
                String readLine = this.f14814a.readLine();
                this.f14816c = readLine;
                if (readLine == null) {
                    return false;
                }
                trim = readLine.trim();
                this.f14816c = trim;
            } while (trim.isEmpty());
            return true;
        }
        String poll = this.f14815b.poll();
        aup.m14890u(poll);
        this.f14816c = poll;
        return true;
    }

    /* renamed from: b */
    public final String mo13718b() throws IOException {
        if (mo13717a()) {
            String str = this.f14816c;
            this.f14816c = null;
            return str;
        }
        throw new NoSuchElementException();
    }
}
