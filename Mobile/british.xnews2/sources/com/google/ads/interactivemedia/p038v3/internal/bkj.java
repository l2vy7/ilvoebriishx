package com.google.ads.interactivemedia.p038v3.internal;

import com.google.ads.interactivemedia.p038v3.internal.bkj;
import com.google.ads.interactivemedia.p038v3.internal.bkl;
import java.io.IOException;

/* renamed from: com.google.ads.interactivemedia.v3.internal.bkj */
/* compiled from: IMASDK */
public class bkj<MessageType extends bkl<MessageType, BuilderType>, BuilderType extends bkj<MessageType, BuilderType>> extends bjb<MessageType, BuilderType> {

    /* renamed from: a */
    protected MessageType f16589a;

    /* renamed from: b */
    protected boolean f16590b = false;

    /* renamed from: c */
    private final MessageType f16591c;

    protected bkj(MessageType messagetype) {
        this.f16591c = messagetype;
        this.f16589a = (bkl) messagetype.mo15393av(4);
    }

    /* renamed from: a */
    private static final void m16294a(MessageType messagetype, MessageType messagetype2) {
        blu.m16503a().mo15459c(messagetype).mo15450d(messagetype, messagetype2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: Y */
    public final /* bridge */ /* synthetic */ bjb mo15161Y(bjc bjc) {
        mo15388ah((bkl) bjc);
        return this;
    }

    /* access modifiers changed from: protected */
    /* renamed from: ab */
    public void mo15382ab() {
        MessageType messagetype = (bkl) this.f16589a.mo15393av(4);
        m16294a(messagetype, this.f16589a);
        this.f16589a = messagetype;
    }

    /* renamed from: ac */
    public final BuilderType clone() {
        BuilderType buildertype = (bkj) this.f16591c.mo15393av(5);
        buildertype.mo15388ah(mo15386af());
        return buildertype;
    }

    /* renamed from: ad */
    public MessageType mo15386af() {
        if (this.f16590b) {
            return this.f16589a;
        }
        MessageType messagetype = this.f16589a;
        blu.m16503a().mo15459c(messagetype).mo15456k(messagetype);
        this.f16590b = true;
        return this.f16589a;
    }

    /* renamed from: ae */
    public final MessageType mo15385ae() {
        MessageType ad = mo15386af();
        if (ad.mo15391ak()) {
            return ad;
        }
        throw new bml();
    }

    /* renamed from: ag */
    public final /* bridge */ /* synthetic */ bln mo15387ag() {
        return this.f16591c;
    }

    /* renamed from: ah */
    public final void mo15388ah(MessageType messagetype) {
        if (this.f16590b) {
            mo15382ab();
            this.f16590b = false;
        }
        m16294a(this.f16589a, messagetype);
    }

    /* renamed from: ai */
    public final void mo15163aa(byte[] bArr, int i, bka bka) throws bkt {
        if (this.f16590b) {
            mo15382ab();
            this.f16590b = false;
        }
        try {
            blu.m16503a().mo15459c(this.f16589a).mo15455j(this.f16589a, bArr, 0, i, new bjg(bka));
        } catch (bkt e) {
            throw e;
        } catch (IndexOutOfBoundsException unused) {
            throw bkt.m16348a();
        } catch (IOException e2) {
            throw new RuntimeException("Reading from byte array should not throw IOException.", e2);
        }
    }
}
