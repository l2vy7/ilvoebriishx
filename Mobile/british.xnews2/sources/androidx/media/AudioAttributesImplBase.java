package androidx.media;

import android.util.Log;
import androidx.media.AudioAttributesImpl;
import java.util.Arrays;

public class AudioAttributesImplBase implements AudioAttributesImpl {

    /* renamed from: a */
    public int f3889a = 0;

    /* renamed from: b */
    public int f3890b = 0;

    /* renamed from: c */
    public int f3891c = 0;

    /* renamed from: d */
    public int f3892d = -1;

    /* renamed from: androidx.media.AudioAttributesImplBase$a */
    static class C0809a implements AudioAttributesImpl.C0806a {

        /* renamed from: a */
        private int f3893a = 0;

        /* renamed from: b */
        private int f3894b = 0;

        /* renamed from: c */
        private int f3895c = 0;

        /* renamed from: d */
        private int f3896d = -1;

        C0809a() {
        }

        /* renamed from: b */
        private C0809a m4380b(int i) {
            switch (i) {
                case 0:
                    this.f3894b = 1;
                    break;
                case 1:
                    break;
                case 2:
                    this.f3894b = 4;
                    break;
                case 3:
                    this.f3894b = 2;
                    break;
                case 4:
                    this.f3894b = 4;
                    break;
                case 5:
                    this.f3894b = 4;
                    break;
                case 6:
                    this.f3894b = 1;
                    this.f3895c |= 4;
                    break;
                case 7:
                    this.f3895c = 1 | this.f3895c;
                    break;
                case 8:
                    this.f3894b = 4;
                    break;
                case 9:
                    this.f3894b = 4;
                    break;
                case 10:
                    this.f3894b = 1;
                    break;
                default:
                    Log.e("AudioAttributesCompat", "Invalid stream type " + i + " for AudioAttributesCompat");
                    break;
            }
            this.f3894b = 4;
            this.f3893a = AudioAttributesImplBase.m4375e(i);
            return this;
        }

        public AudioAttributesImpl build() {
            return new AudioAttributesImplBase(this.f3894b, this.f3895c, this.f3893a, this.f3896d);
        }

        /* renamed from: c */
        public C0809a mo4062a(int i) {
            if (i != 10) {
                this.f3896d = i;
                return m4380b(i);
            }
            throw new IllegalArgumentException("STREAM_ACCESSIBILITY is not a legacy stream type that was used for audio playback");
        }
    }

    public AudioAttributesImplBase() {
    }

    /* renamed from: e */
    static int m4375e(int i) {
        switch (i) {
            case 0:
                return 2;
            case 1:
            case 7:
                return 13;
            case 2:
                return 6;
            case 3:
                return 1;
            case 4:
                return 4;
            case 5:
                return 5;
            case 6:
                return 2;
            case 8:
                return 3;
            case 10:
                return 11;
            default:
                return 0;
        }
    }

    /* renamed from: a */
    public int mo4068a() {
        return this.f3890b;
    }

    /* renamed from: b */
    public int mo4069b() {
        int i = this.f3891c;
        int c = mo4070c();
        if (c == 6) {
            i |= 4;
        } else if (c == 7) {
            i |= 1;
        }
        return i & 273;
    }

    /* renamed from: c */
    public int mo4070c() {
        int i = this.f3892d;
        if (i != -1) {
            return i;
        }
        return AudioAttributesCompat.m4367a(false, this.f3891c, this.f3889a);
    }

    /* renamed from: d */
    public int mo4071d() {
        return this.f3889a;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof AudioAttributesImplBase)) {
            return false;
        }
        AudioAttributesImplBase audioAttributesImplBase = (AudioAttributesImplBase) obj;
        if (this.f3890b == audioAttributesImplBase.mo4068a() && this.f3891c == audioAttributesImplBase.mo4069b() && this.f3889a == audioAttributesImplBase.mo4071d() && this.f3892d == audioAttributesImplBase.f3892d) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f3890b), Integer.valueOf(this.f3891c), Integer.valueOf(this.f3889a), Integer.valueOf(this.f3892d)});
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("AudioAttributesCompat:");
        if (this.f3892d != -1) {
            sb.append(" stream=");
            sb.append(this.f3892d);
            sb.append(" derived");
        }
        sb.append(" usage=");
        sb.append(AudioAttributesCompat.m4368b(this.f3889a));
        sb.append(" content=");
        sb.append(this.f3890b);
        sb.append(" flags=0x");
        sb.append(Integer.toHexString(this.f3891c).toUpperCase());
        return sb.toString();
    }

    AudioAttributesImplBase(int i, int i2, int i3, int i4) {
        this.f3890b = i;
        this.f3891c = i2;
        this.f3889a = i3;
        this.f3892d = i4;
    }
}
