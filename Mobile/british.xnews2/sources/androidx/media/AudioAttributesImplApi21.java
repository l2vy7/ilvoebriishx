package androidx.media;

import android.media.AudioAttributes;
import androidx.media.AudioAttributesImpl;

public class AudioAttributesImplApi21 implements AudioAttributesImpl {

    /* renamed from: a */
    public AudioAttributes f3886a;

    /* renamed from: b */
    public int f3887b;

    /* renamed from: androidx.media.AudioAttributesImplApi21$a */
    static class C0807a implements AudioAttributesImpl.C0806a {

        /* renamed from: a */
        final AudioAttributes.Builder f3888a = new AudioAttributes.Builder();

        C0807a() {
        }

        /* renamed from: b */
        public C0807a mo4062a(int i) {
            this.f3888a.setLegacyStreamType(i);
            return this;
        }

        public AudioAttributesImpl build() {
            return new AudioAttributesImplApi21(this.f3888a.build());
        }
    }

    public AudioAttributesImplApi21() {
        this.f3887b = -1;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof AudioAttributesImplApi21)) {
            return false;
        }
        return this.f3886a.equals(((AudioAttributesImplApi21) obj).f3886a);
    }

    public int hashCode() {
        return this.f3886a.hashCode();
    }

    public String toString() {
        return "AudioAttributesCompat: audioattributes=" + this.f3886a;
    }

    AudioAttributesImplApi21(AudioAttributes audioAttributes) {
        this(audioAttributes, -1);
    }

    AudioAttributesImplApi21(AudioAttributes audioAttributes, int i) {
        this.f3887b = -1;
        this.f3886a = audioAttributes;
        this.f3887b = i;
    }
}
