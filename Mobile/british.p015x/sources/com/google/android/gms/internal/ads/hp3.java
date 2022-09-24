package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.hp3;
import com.google.android.gms.internal.ads.kp3;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public class hp3<MessageType extends kp3<MessageType, BuilderType>, BuilderType extends hp3<MessageType, BuilderType>> extends kn3<MessageType, BuilderType> {

    /* renamed from: b */
    private final MessageType f32798b;

    /* renamed from: c */
    protected MessageType f32799c;

    /* renamed from: d */
    protected boolean f32800d = false;

    protected hp3(MessageType messagetype) {
        this.f32798b = messagetype;
        this.f32799c = (kp3) messagetype.mo30379D(4, (Object) null, (Object) null);
    }

    /* renamed from: l */
    private static final void m32908l(MessageType messagetype, MessageType messagetype2) {
        dr3.m31600a().mo31400b(messagetype.getClass()).mo33998d(messagetype, messagetype2);
    }

    /* renamed from: d */
    public final /* synthetic */ uq3 mo32419d() {
        return this.f32798b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public final /* synthetic */ kn3 mo32420k(ln3 ln3) {
        mo32422n((kp3) ln3);
        return this;
    }

    /* renamed from: m */
    public final BuilderType clone() {
        BuilderType buildertype = (hp3) this.f32798b.mo30379D(5, (Object) null, (Object) null);
        buildertype.mo32422n(mo32426v());
        return buildertype;
    }

    /* renamed from: n */
    public final BuilderType mo32422n(MessageType messagetype) {
        if (this.f32800d) {
            mo32427w();
            this.f32800d = false;
        }
        m32908l(this.f32799c, messagetype);
        return this;
    }

    /* renamed from: o */
    public final BuilderType mo32423o(byte[] bArr, int i, int i2, wo3 wo3) throws wp3 {
        if (this.f32800d) {
            mo32427w();
            this.f32800d = false;
        }
        try {
            dr3.m31600a().mo31400b(this.f32799c.getClass()).mo34001g(this.f32799c, bArr, 0, i2, new on3(wo3));
            return this;
        } catch (wp3 e) {
            throw e;
        } catch (IndexOutOfBoundsException unused) {
            throw wp3.m39230j();
        } catch (IOException e2) {
            throw new RuntimeException("Reading from byte array should not throw IOException.", e2);
        }
    }

    /* renamed from: p */
    public final MessageType mo32424p() {
        MessageType s = mo32426v();
        if (s.mo33146u()) {
            return s;
        }
        throw new fs3(s);
    }

    /* renamed from: s */
    public MessageType mo32426v() {
        if (this.f32800d) {
            return this.f32799c;
        }
        MessageType messagetype = this.f32799c;
        dr3.m31600a().mo31400b(messagetype.getClass()).mo33996a(messagetype);
        this.f32800d = true;
        return this.f32799c;
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public void mo32427w() {
        MessageType messagetype = (kp3) this.f32799c.mo30379D(4, (Object) null, (Object) null);
        m32908l(messagetype, this.f32799c);
        this.f32799c = messagetype;
    }
}
