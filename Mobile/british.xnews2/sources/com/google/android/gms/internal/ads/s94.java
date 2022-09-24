package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.MulticastSocket;
import java.net.SocketTimeoutException;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class s94 extends va1 {

    /* renamed from: e */
    private final byte[] f38920e;

    /* renamed from: f */
    private final DatagramPacket f38921f;

    /* renamed from: g */
    private Uri f38922g;

    /* renamed from: h */
    private DatagramSocket f38923h;

    /* renamed from: i */
    private MulticastSocket f38924i;

    /* renamed from: j */
    private InetAddress f38925j;

    /* renamed from: k */
    private InetSocketAddress f38926k;

    /* renamed from: l */
    private boolean f38927l;

    /* renamed from: m */
    private int f38928m;

    public s94(int i) {
        super(true);
        byte[] bArr = new byte[2000];
        this.f38920e = bArr;
        this.f38921f = new DatagramPacket(bArr, 0, 2000);
    }

    /* renamed from: b */
    public final int mo30477b(byte[] bArr, int i, int i2) throws r94 {
        if (i2 == 0) {
            return 0;
        }
        if (this.f38928m == 0) {
            try {
                this.f38923h.receive(this.f38921f);
                int length = this.f38921f.getLength();
                this.f38928m = length;
                mo35395j(length);
            } catch (SocketTimeoutException e) {
                throw new r94(e, 2002);
            } catch (IOException e2) {
                throw new r94(e2, 2001);
            }
        }
        int length2 = this.f38921f.getLength();
        int i3 = this.f38928m;
        int min = Math.min(i3, i2);
        System.arraycopy(this.f38920e, length2 - i3, bArr, i, min);
        this.f38928m -= min;
        return min;
    }

    /* renamed from: i */
    public final long mo30478i(ci1 ci1) throws r94 {
        Uri uri = ci1.f30390a;
        this.f38922g = uri;
        String host = uri.getHost();
        int port = this.f38922g.getPort();
        mo35397l(ci1);
        try {
            this.f38925j = InetAddress.getByName(host);
            this.f38926k = new InetSocketAddress(this.f38925j, port);
            if (this.f38925j.isMulticastAddress()) {
                MulticastSocket multicastSocket = new MulticastSocket(this.f38926k);
                this.f38924i = multicastSocket;
                multicastSocket.joinGroup(this.f38925j);
                this.f38923h = this.f38924i;
            } else {
                this.f38923h = new DatagramSocket(this.f38926k);
            }
            this.f38923h.setSoTimeout(8000);
            this.f38927l = true;
            mo35398m(ci1);
            return -1;
        } catch (SecurityException e) {
            throw new r94(e, 2006);
        } catch (IOException e2) {
            throw new r94(e2, 2001);
        }
    }

    public final Uri zzi() {
        return this.f38922g;
    }

    public final void zzj() {
        this.f38922g = null;
        MulticastSocket multicastSocket = this.f38924i;
        if (multicastSocket != null) {
            try {
                multicastSocket.leaveGroup(this.f38925j);
            } catch (IOException unused) {
            }
            this.f38924i = null;
        }
        DatagramSocket datagramSocket = this.f38923h;
        if (datagramSocket != null) {
            datagramSocket.close();
            this.f38923h = null;
        }
        this.f38925j = null;
        this.f38926k = null;
        this.f38928m = 0;
        if (this.f38927l) {
            this.f38927l = false;
            mo35396k();
        }
    }
}
