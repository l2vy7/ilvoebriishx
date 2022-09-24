package com.google.ads.interactivemedia.p039v3.internal;

import android.net.Uri;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.MulticastSocket;
import java.net.SocketException;

/* renamed from: com.google.ads.interactivemedia.v3.internal.akr */
/* compiled from: IMASDK */
public final class akr extends aja {

    /* renamed from: a */
    private final byte[] f15168a;

    /* renamed from: b */
    private final DatagramPacket f15169b;

    /* renamed from: c */
    private Uri f15170c;

    /* renamed from: d */
    private DatagramSocket f15171d;

    /* renamed from: e */
    private MulticastSocket f15172e;

    /* renamed from: f */
    private InetAddress f15173f;

    /* renamed from: g */
    private InetSocketAddress f15174g;

    /* renamed from: h */
    private boolean f15175h;

    /* renamed from: i */
    private int f15176i;

    public akr() {
        super(true);
        byte[] bArr = new byte[2000];
        this.f15168a = bArr;
        this.f15169b = new DatagramPacket(bArr, 0, 2000);
    }

    /* renamed from: a */
    public final int mo13294a(byte[] bArr, int i, int i2) throws akq {
        if (i2 == 0) {
            return 0;
        }
        if (this.f15176i == 0) {
            try {
                this.f15171d.receive(this.f15169b);
                int length = this.f15169b.getLength();
                this.f15176i = length;
                mo13798i(length);
            } catch (IOException e) {
                throw new akq(e);
            }
        }
        int length2 = this.f15169b.getLength();
        int i3 = this.f15176i;
        int min = Math.min(i3, i2);
        System.arraycopy(this.f15168a, length2 - i3, bArr, i, min);
        this.f15176i -= min;
        return min;
    }

    /* renamed from: c */
    public final long mo13296c(ajk ajk) throws akq {
        Uri uri = ajk.f15056a;
        this.f15170c = uri;
        String host = uri.getHost();
        int port = this.f15170c.getPort();
        mo13796g(ajk);
        try {
            this.f15173f = InetAddress.getByName(host);
            this.f15174g = new InetSocketAddress(this.f15173f, port);
            if (this.f15173f.isMulticastAddress()) {
                MulticastSocket multicastSocket = new MulticastSocket(this.f15174g);
                this.f15172e = multicastSocket;
                multicastSocket.joinGroup(this.f15173f);
                this.f15171d = this.f15172e;
            } else {
                this.f15171d = new DatagramSocket(this.f15174g);
            }
            try {
                this.f15171d.setSoTimeout(8000);
                this.f15175h = true;
                mo13797h(ajk);
                return -1;
            } catch (SocketException e) {
                throw new akq(e);
            }
        } catch (IOException e2) {
            throw new akq(e2);
        }
    }

    /* renamed from: d */
    public final Uri mo13297d() {
        return this.f15170c;
    }

    /* renamed from: f */
    public final void mo13299f() {
        this.f15170c = null;
        MulticastSocket multicastSocket = this.f15172e;
        if (multicastSocket != null) {
            try {
                multicastSocket.leaveGroup(this.f15173f);
            } catch (IOException unused) {
            }
            this.f15172e = null;
        }
        DatagramSocket datagramSocket = this.f15171d;
        if (datagramSocket != null) {
            datagramSocket.close();
            this.f15171d = null;
        }
        this.f15173f = null;
        this.f15174g = null;
        this.f15176i = 0;
        if (this.f15175h) {
            this.f15175h = false;
            mo13799j();
        }
    }
}
