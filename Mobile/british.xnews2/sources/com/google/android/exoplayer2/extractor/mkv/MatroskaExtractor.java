package com.google.android.exoplayer2.extractor.mkv;

import android.util.Pair;
import android.util.SparseArray;
import com.google.android.exoplayer2.C6540C;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.audio.Ac3Util;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.extractor.ChunkIndex;
import com.google.android.exoplayer2.extractor.Extractor;
import com.google.android.exoplayer2.extractor.ExtractorInput;
import com.google.android.exoplayer2.extractor.ExtractorOutput;
import com.google.android.exoplayer2.extractor.ExtractorsFactory;
import com.google.android.exoplayer2.extractor.PositionHolder;
import com.google.android.exoplayer2.extractor.SeekMap;
import com.google.android.exoplayer2.extractor.TrackOutput;
import com.google.android.exoplayer2.upstream.DataReader;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.LongArray;
import com.google.android.exoplayer2.util.MimeTypes;
import com.google.android.exoplayer2.util.NalUnitUtil;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.google.android.exoplayer2.util.Util;
import com.startapp.C12425x3;
import java.io.IOException;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

public class MatroskaExtractor implements Extractor {
    private static final int BLOCK_ADDITIONAL_ID_VP9_ITU_T_35 = 4;
    private static final int BLOCK_ADD_ID_TYPE_DVCC = 1685480259;
    private static final int BLOCK_ADD_ID_TYPE_DVVC = 1685485123;
    private static final int BLOCK_STATE_DATA = 2;
    private static final int BLOCK_STATE_HEADER = 1;
    private static final int BLOCK_STATE_START = 0;
    private static final String CODEC_ID_AAC = "A_AAC";
    private static final String CODEC_ID_AC3 = "A_AC3";
    private static final String CODEC_ID_ACM = "A_MS/ACM";
    private static final String CODEC_ID_ASS = "S_TEXT/ASS";
    private static final String CODEC_ID_AV1 = "V_AV1";
    private static final String CODEC_ID_DTS = "A_DTS";
    private static final String CODEC_ID_DTS_EXPRESS = "A_DTS/EXPRESS";
    private static final String CODEC_ID_DTS_LOSSLESS = "A_DTS/LOSSLESS";
    private static final String CODEC_ID_DVBSUB = "S_DVBSUB";
    private static final String CODEC_ID_E_AC3 = "A_EAC3";
    private static final String CODEC_ID_FLAC = "A_FLAC";
    private static final String CODEC_ID_FOURCC = "V_MS/VFW/FOURCC";
    private static final String CODEC_ID_H264 = "V_MPEG4/ISO/AVC";
    private static final String CODEC_ID_H265 = "V_MPEGH/ISO/HEVC";
    private static final String CODEC_ID_MP2 = "A_MPEG/L2";
    private static final String CODEC_ID_MP3 = "A_MPEG/L3";
    private static final String CODEC_ID_MPEG2 = "V_MPEG2";
    private static final String CODEC_ID_MPEG4_AP = "V_MPEG4/ISO/AP";
    private static final String CODEC_ID_MPEG4_ASP = "V_MPEG4/ISO/ASP";
    private static final String CODEC_ID_MPEG4_SP = "V_MPEG4/ISO/SP";
    private static final String CODEC_ID_OPUS = "A_OPUS";
    private static final String CODEC_ID_PCM_FLOAT = "A_PCM/FLOAT/IEEE";
    private static final String CODEC_ID_PCM_INT_BIG = "A_PCM/INT/BIG";
    private static final String CODEC_ID_PCM_INT_LIT = "A_PCM/INT/LIT";
    private static final String CODEC_ID_PGS = "S_HDMV/PGS";
    private static final String CODEC_ID_SUBRIP = "S_TEXT/UTF8";
    private static final String CODEC_ID_THEORA = "V_THEORA";
    private static final String CODEC_ID_TRUEHD = "A_TRUEHD";
    private static final String CODEC_ID_VOBSUB = "S_VOBSUB";
    private static final String CODEC_ID_VORBIS = "A_VORBIS";
    private static final String CODEC_ID_VP8 = "V_VP8";
    private static final String CODEC_ID_VP9 = "V_VP9";
    private static final String DOC_TYPE_MATROSKA = "matroska";
    private static final String DOC_TYPE_WEBM = "webm";
    private static final int ENCRYPTION_IV_SIZE = 8;
    public static final ExtractorsFactory FACTORY = C6700a.f27415a;
    public static final int FLAG_DISABLE_SEEK_FOR_CUES = 1;
    private static final int FOURCC_COMPRESSION_DIVX = 1482049860;
    private static final int FOURCC_COMPRESSION_H263 = 859189832;
    private static final int FOURCC_COMPRESSION_VC1 = 826496599;
    private static final int ID_AUDIO = 225;
    private static final int ID_AUDIO_BIT_DEPTH = 25188;
    private static final int ID_BLOCK = 161;
    private static final int ID_BLOCK_ADDITIONAL = 165;
    private static final int ID_BLOCK_ADDITIONS = 30113;
    private static final int ID_BLOCK_ADDITION_MAPPING = 16868;
    private static final int ID_BLOCK_ADD_ID = 238;
    private static final int ID_BLOCK_ADD_ID_EXTRA_DATA = 16877;
    private static final int ID_BLOCK_ADD_ID_TYPE = 16871;
    private static final int ID_BLOCK_DURATION = 155;
    private static final int ID_BLOCK_GROUP = 160;
    private static final int ID_BLOCK_MORE = 166;
    private static final int ID_CHANNELS = 159;
    private static final int ID_CLUSTER = 524531317;
    private static final int ID_CODEC_DELAY = 22186;
    private static final int ID_CODEC_ID = 134;
    private static final int ID_CODEC_PRIVATE = 25506;
    private static final int ID_COLOUR = 21936;
    private static final int ID_COLOUR_PRIMARIES = 21947;
    private static final int ID_COLOUR_RANGE = 21945;
    private static final int ID_COLOUR_TRANSFER = 21946;
    private static final int ID_CONTENT_COMPRESSION = 20532;
    private static final int ID_CONTENT_COMPRESSION_ALGORITHM = 16980;
    private static final int ID_CONTENT_COMPRESSION_SETTINGS = 16981;
    private static final int ID_CONTENT_ENCODING = 25152;
    private static final int ID_CONTENT_ENCODINGS = 28032;
    private static final int ID_CONTENT_ENCODING_ORDER = 20529;
    private static final int ID_CONTENT_ENCODING_SCOPE = 20530;
    private static final int ID_CONTENT_ENCRYPTION = 20533;
    private static final int ID_CONTENT_ENCRYPTION_AES_SETTINGS = 18407;
    private static final int ID_CONTENT_ENCRYPTION_AES_SETTINGS_CIPHER_MODE = 18408;
    private static final int ID_CONTENT_ENCRYPTION_ALGORITHM = 18401;
    private static final int ID_CONTENT_ENCRYPTION_KEY_ID = 18402;
    private static final int ID_CUES = 475249515;
    private static final int ID_CUE_CLUSTER_POSITION = 241;
    private static final int ID_CUE_POINT = 187;
    private static final int ID_CUE_TIME = 179;
    private static final int ID_CUE_TRACK_POSITIONS = 183;
    private static final int ID_DEFAULT_DURATION = 2352003;
    private static final int ID_DISPLAY_HEIGHT = 21690;
    private static final int ID_DISPLAY_UNIT = 21682;
    private static final int ID_DISPLAY_WIDTH = 21680;
    private static final int ID_DOC_TYPE = 17026;
    private static final int ID_DOC_TYPE_READ_VERSION = 17029;
    private static final int ID_DURATION = 17545;
    private static final int ID_EBML = 440786851;
    private static final int ID_EBML_READ_VERSION = 17143;
    private static final int ID_FLAG_DEFAULT = 136;
    private static final int ID_FLAG_FORCED = 21930;
    private static final int ID_INFO = 357149030;
    private static final int ID_LANGUAGE = 2274716;
    private static final int ID_LUMNINANCE_MAX = 21977;
    private static final int ID_LUMNINANCE_MIN = 21978;
    private static final int ID_MASTERING_METADATA = 21968;
    private static final int ID_MAX_BLOCK_ADDITION_ID = 21998;
    private static final int ID_MAX_CLL = 21948;
    private static final int ID_MAX_FALL = 21949;
    private static final int ID_NAME = 21358;
    private static final int ID_PIXEL_HEIGHT = 186;
    private static final int ID_PIXEL_WIDTH = 176;
    private static final int ID_PRIMARY_B_CHROMATICITY_X = 21973;
    private static final int ID_PRIMARY_B_CHROMATICITY_Y = 21974;
    private static final int ID_PRIMARY_G_CHROMATICITY_X = 21971;
    private static final int ID_PRIMARY_G_CHROMATICITY_Y = 21972;
    private static final int ID_PRIMARY_R_CHROMATICITY_X = 21969;
    private static final int ID_PRIMARY_R_CHROMATICITY_Y = 21970;
    private static final int ID_PROJECTION = 30320;
    private static final int ID_PROJECTION_POSE_PITCH = 30324;
    private static final int ID_PROJECTION_POSE_ROLL = 30325;
    private static final int ID_PROJECTION_POSE_YAW = 30323;
    private static final int ID_PROJECTION_PRIVATE = 30322;
    private static final int ID_PROJECTION_TYPE = 30321;
    private static final int ID_REFERENCE_BLOCK = 251;
    private static final int ID_SAMPLING_FREQUENCY = 181;
    private static final int ID_SEEK = 19899;
    private static final int ID_SEEK_HEAD = 290298740;
    private static final int ID_SEEK_ID = 21419;
    private static final int ID_SEEK_POSITION = 21420;
    private static final int ID_SEEK_PRE_ROLL = 22203;
    private static final int ID_SEGMENT = 408125543;
    private static final int ID_SEGMENT_INFO = 357149030;
    private static final int ID_SIMPLE_BLOCK = 163;
    private static final int ID_STEREO_MODE = 21432;
    private static final int ID_TIMECODE_SCALE = 2807729;
    private static final int ID_TIME_CODE = 231;
    private static final int ID_TRACKS = 374648427;
    private static final int ID_TRACK_ENTRY = 174;
    private static final int ID_TRACK_NUMBER = 215;
    private static final int ID_TRACK_TYPE = 131;
    private static final int ID_VIDEO = 224;
    private static final int ID_WHITE_POINT_CHROMATICITY_X = 21975;
    private static final int ID_WHITE_POINT_CHROMATICITY_Y = 21976;
    private static final int LACING_EBML = 3;
    private static final int LACING_FIXED_SIZE = 2;
    private static final int LACING_NONE = 0;
    private static final int LACING_XIPH = 1;
    private static final int OPUS_MAX_INPUT_SIZE = 5760;
    /* access modifiers changed from: private */
    public static final byte[] SSA_DIALOGUE_FORMAT = Util.getUtf8Bytes("Format: Start, End, ReadOrder, Layer, Style, Name, MarginL, MarginR, MarginV, Effect, Text");
    private static final byte[] SSA_PREFIX = {68, 105, 97, 108, 111, 103, 117, 101, 58, 32, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44};
    private static final int SSA_PREFIX_END_TIMECODE_OFFSET = 21;
    private static final String SSA_TIMECODE_FORMAT = "%01d:%02d:%02d:%02d";
    private static final long SSA_TIMECODE_LAST_VALUE_SCALING_FACTOR = 10000;
    private static final byte[] SUBRIP_PREFIX = {49, 10, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 10};
    private static final int SUBRIP_PREFIX_END_TIMECODE_OFFSET = 19;
    private static final String SUBRIP_TIMECODE_FORMAT = "%02d:%02d:%02d,%03d";
    private static final long SUBRIP_TIMECODE_LAST_VALUE_SCALING_FACTOR = 1000;
    private static final String TAG = "MatroskaExtractor";
    /* access modifiers changed from: private */
    public static final Map<String, Integer> TRACK_NAME_TO_ROTATION_DEGREES;
    private static final int TRACK_TYPE_AUDIO = 2;
    private static final int UNSET_ENTRY_ID = -1;
    private static final int VORBIS_MAX_INPUT_SIZE = 8192;
    private static final int WAVE_FORMAT_EXTENSIBLE = 65534;
    private static final int WAVE_FORMAT_PCM = 1;
    private static final int WAVE_FORMAT_SIZE = 18;
    /* access modifiers changed from: private */
    public static final UUID WAVE_SUBFORMAT_PCM = new UUID(72057594037932032L, -9223371306706625679L);
    private final ParsableByteArray blockAdditionalData;
    private int blockAdditionalId;
    private long blockDurationUs;
    private int blockFlags;
    private boolean blockHasReferenceBlock;
    private int blockSampleCount;
    private int blockSampleIndex;
    private int[] blockSampleSizes;
    private int blockState;
    private long blockTimeUs;
    private int blockTrackNumber;
    private int blockTrackNumberLength;
    private long clusterTimecodeUs;
    private LongArray cueClusterPositions;
    private LongArray cueTimesUs;
    private long cuesContentPosition;
    private Track currentTrack;
    private long durationTimecode;
    private long durationUs;
    private final ParsableByteArray encryptionInitializationVector;
    private final ParsableByteArray encryptionSubsampleData;
    private ByteBuffer encryptionSubsampleDataBuffer;
    private ExtractorOutput extractorOutput;
    private boolean haveOutputSample;
    private final ParsableByteArray nalLength;
    private final ParsableByteArray nalStartCode;
    private final EbmlReader reader;
    private int sampleBytesRead;
    private int sampleBytesWritten;
    private int sampleCurrentNalBytesRemaining;
    private boolean sampleEncodingHandled;
    private boolean sampleInitializationVectorRead;
    private int samplePartitionCount;
    private boolean samplePartitionCountRead;
    private byte sampleSignalByte;
    private boolean sampleSignalByteRead;
    private final ParsableByteArray sampleStrippedBytes;
    private final ParsableByteArray scratch;
    private int seekEntryId;
    private final ParsableByteArray seekEntryIdBytes;
    private long seekEntryPosition;
    private boolean seekForCues;
    private final boolean seekForCuesEnabled;
    private long seekPositionAfterBuildingCues;
    private boolean seenClusterPositionForCurrentCuePoint;
    private long segmentContentPosition;
    private long segmentContentSize;
    private boolean sentSeekMap;
    private final ParsableByteArray subtitleSample;
    private long timecodeScale;
    private final SparseArray<Track> tracks;
    private final VarintReader varintReader;
    private final ParsableByteArray vorbisNumPageSamples;

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface Flags {
    }

    private static final class Track {
        private static final int DEFAULT_MAX_CLL = 1000;
        private static final int DEFAULT_MAX_FALL = 200;
        private static final int DISPLAY_UNIT_PIXELS = 0;
        private static final int MAX_CHROMATICITY = 50000;
        public int audioBitDepth;
        /* access modifiers changed from: private */
        public int blockAddIdType;
        public int channelCount;
        public long codecDelayNs;
        public String codecId;
        public byte[] codecPrivate;
        public int colorRange;
        public int colorSpace;
        public int colorTransfer;
        public TrackOutput.CryptoData cryptoData;
        public int defaultSampleDurationNs;
        public int displayHeight;
        public int displayUnit;
        public int displayWidth;
        public byte[] dolbyVisionConfigBytes;
        public DrmInitData drmInitData;
        public boolean flagDefault;
        public boolean flagForced;
        public boolean hasColorInfo;
        public boolean hasContentEncryption;
        public int height;
        /* access modifiers changed from: private */
        public String language;
        public int maxBlockAdditionId;
        public int maxContentLuminance;
        public int maxFrameAverageLuminance;
        public float maxMasteringLuminance;
        public float minMasteringLuminance;
        public int nalUnitLengthFieldLength;
        public String name;
        public int number;
        public TrackOutput output;
        public float primaryBChromaticityX;
        public float primaryBChromaticityY;
        public float primaryGChromaticityX;
        public float primaryGChromaticityY;
        public float primaryRChromaticityX;
        public float primaryRChromaticityY;
        public byte[] projectionData;
        public float projectionPosePitch;
        public float projectionPoseRoll;
        public float projectionPoseYaw;
        public int projectionType;
        public int sampleRate;
        public byte[] sampleStrippedBytes;
        public long seekPreRollNs;
        public int stereoMode;
        public TrueHdSampleRechunker trueHdSampleRechunker;
        public int type;
        public float whitePointChromaticityX;
        public float whitePointChromaticityY;
        public int width;

        private Track() {
            this.width = -1;
            this.height = -1;
            this.displayWidth = -1;
            this.displayHeight = -1;
            this.displayUnit = 0;
            this.projectionType = -1;
            this.projectionPoseYaw = 0.0f;
            this.projectionPosePitch = 0.0f;
            this.projectionPoseRoll = 0.0f;
            this.projectionData = null;
            this.stereoMode = -1;
            this.hasColorInfo = false;
            this.colorSpace = -1;
            this.colorTransfer = -1;
            this.colorRange = -1;
            this.maxContentLuminance = 1000;
            this.maxFrameAverageLuminance = 200;
            this.primaryRChromaticityX = -1.0f;
            this.primaryRChromaticityY = -1.0f;
            this.primaryGChromaticityX = -1.0f;
            this.primaryGChromaticityY = -1.0f;
            this.primaryBChromaticityX = -1.0f;
            this.primaryBChromaticityY = -1.0f;
            this.whitePointChromaticityX = -1.0f;
            this.whitePointChromaticityY = -1.0f;
            this.maxMasteringLuminance = -1.0f;
            this.minMasteringLuminance = -1.0f;
            this.channelCount = 1;
            this.audioBitDepth = -1;
            this.sampleRate = 8000;
            this.codecDelayNs = 0;
            this.seekPreRollNs = 0;
            this.flagDefault = true;
            this.language = "eng";
        }

        /* access modifiers changed from: private */
        @EnsuresNonNull({"output"})
        public void assertOutputInitialized() {
            Assertions.checkNotNull(this.output);
        }

        @EnsuresNonNull({"codecPrivate"})
        private byte[] getCodecPrivate(String str) throws ParserException {
            byte[] bArr = this.codecPrivate;
            if (bArr != null) {
                return bArr;
            }
            String valueOf = String.valueOf(str);
            throw new ParserException(valueOf.length() != 0 ? "Missing CodecPrivate for codec ".concat(valueOf) : new String("Missing CodecPrivate for codec "));
        }

        private byte[] getHdrStaticInfo() {
            if (this.primaryRChromaticityX == -1.0f || this.primaryRChromaticityY == -1.0f || this.primaryGChromaticityX == -1.0f || this.primaryGChromaticityY == -1.0f || this.primaryBChromaticityX == -1.0f || this.primaryBChromaticityY == -1.0f || this.whitePointChromaticityX == -1.0f || this.whitePointChromaticityY == -1.0f || this.maxMasteringLuminance == -1.0f || this.minMasteringLuminance == -1.0f) {
                return null;
            }
            byte[] bArr = new byte[25];
            ByteBuffer order = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
            order.put((byte) 0);
            order.putShort((short) ((int) ((this.primaryRChromaticityX * 50000.0f) + 0.5f)));
            order.putShort((short) ((int) ((this.primaryRChromaticityY * 50000.0f) + 0.5f)));
            order.putShort((short) ((int) ((this.primaryGChromaticityX * 50000.0f) + 0.5f)));
            order.putShort((short) ((int) ((this.primaryGChromaticityY * 50000.0f) + 0.5f)));
            order.putShort((short) ((int) ((this.primaryBChromaticityX * 50000.0f) + 0.5f)));
            order.putShort((short) ((int) ((this.primaryBChromaticityY * 50000.0f) + 0.5f)));
            order.putShort((short) ((int) ((this.whitePointChromaticityX * 50000.0f) + 0.5f)));
            order.putShort((short) ((int) ((this.whitePointChromaticityY * 50000.0f) + 0.5f)));
            order.putShort((short) ((int) (this.maxMasteringLuminance + 0.5f)));
            order.putShort((short) ((int) (this.minMasteringLuminance + 0.5f)));
            order.putShort((short) this.maxContentLuminance);
            order.putShort((short) this.maxFrameAverageLuminance);
            return bArr;
        }

        private static Pair<String, List<byte[]>> parseFourCcPrivate(ParsableByteArray parsableByteArray) throws ParserException {
            try {
                parsableByteArray.skipBytes(16);
                long readLittleEndianUnsignedInt = parsableByteArray.readLittleEndianUnsignedInt();
                if (readLittleEndianUnsignedInt == 1482049860) {
                    return new Pair<>(MimeTypes.VIDEO_DIVX, (Object) null);
                }
                if (readLittleEndianUnsignedInt == 859189832) {
                    return new Pair<>(MimeTypes.VIDEO_H263, (Object) null);
                }
                if (readLittleEndianUnsignedInt == 826496599) {
                    byte[] data = parsableByteArray.getData();
                    for (int position = parsableByteArray.getPosition() + 20; position < data.length - 4; position++) {
                        if (data[position] == 0 && data[position + 1] == 0 && data[position + 2] == 1 && data[position + 3] == 15) {
                            return new Pair<>(MimeTypes.VIDEO_VC1, Collections.singletonList(Arrays.copyOfRange(data, position, data.length)));
                        }
                    }
                    throw new ParserException("Failed to find FourCC VC1 initialization data");
                }
                Log.m19797w(MatroskaExtractor.TAG, "Unknown FourCC. Setting mimeType to video/x-unknown");
                return new Pair<>(MimeTypes.VIDEO_UNKNOWN, (Object) null);
            } catch (ArrayIndexOutOfBoundsException unused) {
                throw new ParserException("Error parsing FourCC private data");
            }
        }

        private static boolean parseMsAcmCodecPrivate(ParsableByteArray parsableByteArray) throws ParserException {
            try {
                int readLittleEndianUnsignedShort = parsableByteArray.readLittleEndianUnsignedShort();
                if (readLittleEndianUnsignedShort == 1) {
                    return true;
                }
                if (readLittleEndianUnsignedShort != 65534) {
                    return false;
                }
                parsableByteArray.setPosition(24);
                if (parsableByteArray.readLong() == MatroskaExtractor.WAVE_SUBFORMAT_PCM.getMostSignificantBits() && parsableByteArray.readLong() == MatroskaExtractor.WAVE_SUBFORMAT_PCM.getLeastSignificantBits()) {
                    return true;
                }
                return false;
            } catch (ArrayIndexOutOfBoundsException unused) {
                throw new ParserException("Error parsing MS/ACM codec private");
            }
        }

        private static List<byte[]> parseVorbisCodecPrivate(byte[] bArr) throws ParserException {
            try {
                if (bArr[0] == 2) {
                    int i = 1;
                    int i2 = 0;
                    while ((bArr[i] & 255) == 255) {
                        i2 += 255;
                        i++;
                    }
                    int i3 = i + 1;
                    int i4 = i2 + (bArr[i] & 255);
                    int i5 = 0;
                    while ((bArr[i3] & 255) == 255) {
                        i5 += 255;
                        i3++;
                    }
                    int i6 = i3 + 1;
                    int i7 = i5 + (bArr[i3] & 255);
                    if (bArr[i6] == 1) {
                        byte[] bArr2 = new byte[i4];
                        System.arraycopy(bArr, i6, bArr2, 0, i4);
                        int i8 = i6 + i4;
                        if (bArr[i8] == 3) {
                            int i9 = i8 + i7;
                            if (bArr[i9] == 5) {
                                byte[] bArr3 = new byte[(bArr.length - i9)];
                                System.arraycopy(bArr, i9, bArr3, 0, bArr.length - i9);
                                ArrayList arrayList = new ArrayList(2);
                                arrayList.add(bArr2);
                                arrayList.add(bArr3);
                                return arrayList;
                            }
                            throw new ParserException("Error parsing vorbis codec private");
                        }
                        throw new ParserException("Error parsing vorbis codec private");
                    }
                    throw new ParserException("Error parsing vorbis codec private");
                }
                throw new ParserException("Error parsing vorbis codec private");
            } catch (ArrayIndexOutOfBoundsException unused) {
                throw new ParserException("Error parsing vorbis codec private");
            }
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v17, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v12, resolved type: java.lang.String} */
        /* JADX WARNING: Can't fix incorrect switch cases order */
        /* JADX WARNING: Code restructure failed: missing block: B:113:0x029e, code lost:
            r16 = com.google.android.exoplayer2.util.MimeTypes.AUDIO_UNKNOWN;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:114:0x02a2, code lost:
            r1 = null;
            r3 = null;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:128:0x0319, code lost:
            r1 = null;
            r3 = null;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:129:0x031c, code lost:
            r7 = -1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:130:0x031d, code lost:
            r15 = -1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:138:0x037d, code lost:
            r7 = -1;
            r15 = -1;
            r19 = r3;
            r3 = r1;
            r1 = r19;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:141:0x03b5, code lost:
            r3 = null;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:144:0x03c2, code lost:
            r1 = null;
            r3 = null;
            r7 = -1;
            r15 = 4096;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:146:0x03da, code lost:
            r3 = null;
            r7 = -1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:163:0x0454, code lost:
            r4 = r0.dolbyVisionConfigBytes;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:164:0x0456, code lost:
            if (r4 == null) goto L_0x0467;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:165:0x0458, code lost:
            r4 = com.google.android.exoplayer2.video.DolbyVisionConfig.parse(new com.google.android.exoplayer2.util.ParsableByteArray(r4));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:166:0x0461, code lost:
            if (r4 == null) goto L_0x0467;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:167:0x0463, code lost:
            r3 = r4.codecs;
            r16 = com.google.android.exoplayer2.util.MimeTypes.VIDEO_DOLBY_VISION;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:168:0x0467, code lost:
            r4 = r16;
            r5 = r0.flagDefault | 0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:169:0x046e, code lost:
            if (r0.flagForced == false) goto L_0x0472;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:170:0x0470, code lost:
            r6 = 2;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:171:0x0472, code lost:
            r6 = 0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:172:0x0473, code lost:
            r5 = r5 | r6;
            r6 = new com.google.android.exoplayer2.Format.Builder();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:173:0x047d, code lost:
            if (com.google.android.exoplayer2.util.MimeTypes.isAudio(r4) == false) goto L_0x0491;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:174:0x047f, code lost:
            r6.setChannelCount(r0.channelCount).setSampleRate(r0.sampleRate).setPcmEncoding(r7);
            r8 = 1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:176:0x0495, code lost:
            if (com.google.android.exoplayer2.util.MimeTypes.isVideo(r4) == false) goto L_0x056f;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:178:0x0499, code lost:
            if (r0.displayUnit != 0) goto L_0x04ad;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:179:0x049b, code lost:
            r2 = r0.displayWidth;
            r7 = -1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:180:0x049e, code lost:
            if (r2 != -1) goto L_0x04a2;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:181:0x04a0, code lost:
            r2 = r0.width;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:182:0x04a2, code lost:
            r0.displayWidth = r2;
            r2 = r0.displayHeight;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:183:0x04a6, code lost:
            if (r2 != -1) goto L_0x04aa;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:184:0x04a8, code lost:
            r2 = r0.height;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:185:0x04aa, code lost:
            r0.displayHeight = r2;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:186:0x04ad, code lost:
            r7 = -1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:187:0x04ae, code lost:
            r2 = -1.0f;
            r8 = r0.displayWidth;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:188:0x04b2, code lost:
            if (r8 == r7) goto L_0x04c3;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:189:0x04b4, code lost:
            r10 = r0.displayHeight;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:190:0x04b6, code lost:
            if (r10 == r7) goto L_0x04c3;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:191:0x04b8, code lost:
            r2 = ((float) (r0.height * r8)) / ((float) (r0.width * r10));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:193:0x04c5, code lost:
            if (r0.hasColorInfo == false) goto L_0x04d7;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:194:0x04c7, code lost:
            r10 = new com.google.android.exoplayer2.video.ColorInfo(r0.colorSpace, r0.colorRange, r0.colorTransfer, getHdrStaticInfo());
         */
        /* JADX WARNING: Code restructure failed: missing block: B:195:0x04d7, code lost:
            r10 = null;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:197:0x04db, code lost:
            if (r0.name == null) goto L_0x04f9;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:199:0x04e7, code lost:
            if (com.google.android.exoplayer2.extractor.mkv.MatroskaExtractor.access$600().containsKey(r0.name) == false) goto L_0x04f9;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:200:0x04e9, code lost:
            r7 = ((java.lang.Integer) com.google.android.exoplayer2.extractor.mkv.MatroskaExtractor.access$600().get(r0.name)).intValue();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:202:0x04fb, code lost:
            if (r0.projectionType != 0) goto L_0x0549;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:204:0x0504, code lost:
            if (java.lang.Float.compare(r0.projectionPoseYaw, 0.0f) != 0) goto L_0x0549;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:206:0x050c, code lost:
            if (java.lang.Float.compare(r0.projectionPosePitch, 0.0f) != 0) goto L_0x0549;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:208:0x0514, code lost:
            if (java.lang.Float.compare(r0.projectionPoseRoll, 0.0f) != 0) goto L_0x0517;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:210:0x051f, code lost:
            if (java.lang.Float.compare(r0.projectionPosePitch, 90.0f) != 0) goto L_0x0524;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:211:0x0521, code lost:
            r9 = 90;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:213:0x052c, code lost:
            if (java.lang.Float.compare(r0.projectionPosePitch, -180.0f) == 0) goto L_0x0546;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:215:0x0536, code lost:
            if (java.lang.Float.compare(r0.projectionPosePitch, 180.0f) != 0) goto L_0x0539;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:217:0x0541, code lost:
            if (java.lang.Float.compare(r0.projectionPosePitch, -90.0f) != 0) goto L_0x0549;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:218:0x0543, code lost:
            r9 = 270;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:219:0x0546, code lost:
            r9 = 180;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:220:0x0549, code lost:
            r9 = r7;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:221:0x054a, code lost:
            r6.setWidth(r0.width).setHeight(r0.height).setPixelWidthHeightRatio(r2).setRotationDegrees(r9).setProjectionData(r0.projectionData).setStereoMode(r0.stereoMode).setColorInfo(r10);
            r8 = 2;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:223:0x0573, code lost:
            if (com.google.android.exoplayer2.util.MimeTypes.APPLICATION_SUBRIP.equals(r4) != false) goto L_0x0598;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:225:0x0579, code lost:
            if (com.google.android.exoplayer2.util.MimeTypes.TEXT_SSA.equals(r4) != false) goto L_0x0598;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:227:0x057f, code lost:
            if (com.google.android.exoplayer2.util.MimeTypes.APPLICATION_VOBSUB.equals(r4) != false) goto L_0x0598;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:229:0x0587, code lost:
            if (r18.equals(r4) != false) goto L_0x0598;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:231:0x058d, code lost:
            if (com.google.android.exoplayer2.util.MimeTypes.APPLICATION_DVBSUBS.equals(r4) == false) goto L_0x0590;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:233:0x0597, code lost:
            throw new com.google.android.exoplayer2.ParserException("Unexpected MIME type.");
         */
        /* JADX WARNING: Code restructure failed: missing block: B:235:0x059a, code lost:
            if (r0.name == null) goto L_0x05ad;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:237:0x05a6, code lost:
            if (com.google.android.exoplayer2.extractor.mkv.MatroskaExtractor.access$600().containsKey(r0.name) != false) goto L_0x05ad;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:238:0x05a8, code lost:
            r6.setLabel(r0.name);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:239:0x05ad, code lost:
            r1 = r6.setId(r22).setSampleMimeType(r4).setMaxInputSize(r15).setLanguage(r0.language).setSelectionFlags(r5).setInitializationData(r1).setCodecs(r3).setDrmInitData(r0.drmInitData).build();
            r2 = r21.track(r0.number, r8);
            r0.output = r2;
            r2.format(r1);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:240:0x05e4, code lost:
            return;
         */
        /* JADX WARNING: Multi-variable type inference failed */
        @org.checkerframework.checker.nullness.qual.RequiresNonNull({"codecId"})
        @org.checkerframework.checker.nullness.qual.EnsuresNonNull({"this.output"})
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void initializeOutput(com.google.android.exoplayer2.extractor.ExtractorOutput r21, int r22) throws com.google.android.exoplayer2.ParserException {
            /*
                r20 = this;
                r0 = r20
                java.lang.String r1 = r0.codecId
                r1.hashCode()
                int r2 = r1.hashCode()
                r3 = 16
                r6 = 8
                r7 = 4
                r8 = 3
                r9 = 0
                switch(r2) {
                    case -2095576542: goto L_0x01b3;
                    case -2095575984: goto L_0x01a7;
                    case -1985379776: goto L_0x019b;
                    case -1784763192: goto L_0x018f;
                    case -1730367663: goto L_0x0183;
                    case -1482641358: goto L_0x0177;
                    case -1482641357: goto L_0x016b;
                    case -1373388978: goto L_0x015f;
                    case -933872740: goto L_0x0151;
                    case -538363189: goto L_0x0143;
                    case -538363109: goto L_0x0135;
                    case -425012669: goto L_0x0127;
                    case -356037306: goto L_0x0119;
                    case 62923557: goto L_0x010b;
                    case 62923603: goto L_0x00fd;
                    case 62927045: goto L_0x00ef;
                    case 82318131: goto L_0x00e1;
                    case 82338133: goto L_0x00d3;
                    case 82338134: goto L_0x00c5;
                    case 99146302: goto L_0x00b7;
                    case 444813526: goto L_0x00a9;
                    case 542569478: goto L_0x009b;
                    case 635596514: goto L_0x008d;
                    case 725948237: goto L_0x0080;
                    case 725957860: goto L_0x0073;
                    case 738597099: goto L_0x0066;
                    case 855502857: goto L_0x0059;
                    case 1422270023: goto L_0x004c;
                    case 1809237540: goto L_0x003f;
                    case 1950749482: goto L_0x0032;
                    case 1950789798: goto L_0x0025;
                    case 1951062397: goto L_0x0018;
                    default: goto L_0x0015;
                }
            L_0x0015:
                r1 = -1
                goto L_0x01be
            L_0x0018:
                java.lang.String r2 = "A_OPUS"
                boolean r1 = r1.equals(r2)
                if (r1 != 0) goto L_0x0021
                goto L_0x0015
            L_0x0021:
                r1 = 31
                goto L_0x01be
            L_0x0025:
                java.lang.String r2 = "A_FLAC"
                boolean r1 = r1.equals(r2)
                if (r1 != 0) goto L_0x002e
                goto L_0x0015
            L_0x002e:
                r1 = 30
                goto L_0x01be
            L_0x0032:
                java.lang.String r2 = "A_EAC3"
                boolean r1 = r1.equals(r2)
                if (r1 != 0) goto L_0x003b
                goto L_0x0015
            L_0x003b:
                r1 = 29
                goto L_0x01be
            L_0x003f:
                java.lang.String r2 = "V_MPEG2"
                boolean r1 = r1.equals(r2)
                if (r1 != 0) goto L_0x0048
                goto L_0x0015
            L_0x0048:
                r1 = 28
                goto L_0x01be
            L_0x004c:
                java.lang.String r2 = "S_TEXT/UTF8"
                boolean r1 = r1.equals(r2)
                if (r1 != 0) goto L_0x0055
                goto L_0x0015
            L_0x0055:
                r1 = 27
                goto L_0x01be
            L_0x0059:
                java.lang.String r2 = "V_MPEGH/ISO/HEVC"
                boolean r1 = r1.equals(r2)
                if (r1 != 0) goto L_0x0062
                goto L_0x0015
            L_0x0062:
                r1 = 26
                goto L_0x01be
            L_0x0066:
                java.lang.String r2 = "S_TEXT/ASS"
                boolean r1 = r1.equals(r2)
                if (r1 != 0) goto L_0x006f
                goto L_0x0015
            L_0x006f:
                r1 = 25
                goto L_0x01be
            L_0x0073:
                java.lang.String r2 = "A_PCM/INT/LIT"
                boolean r1 = r1.equals(r2)
                if (r1 != 0) goto L_0x007c
                goto L_0x0015
            L_0x007c:
                r1 = 24
                goto L_0x01be
            L_0x0080:
                java.lang.String r2 = "A_PCM/INT/BIG"
                boolean r1 = r1.equals(r2)
                if (r1 != 0) goto L_0x0089
                goto L_0x0015
            L_0x0089:
                r1 = 23
                goto L_0x01be
            L_0x008d:
                java.lang.String r2 = "A_PCM/FLOAT/IEEE"
                boolean r1 = r1.equals(r2)
                if (r1 != 0) goto L_0x0097
                goto L_0x0015
            L_0x0097:
                r1 = 22
                goto L_0x01be
            L_0x009b:
                java.lang.String r2 = "A_DTS/EXPRESS"
                boolean r1 = r1.equals(r2)
                if (r1 != 0) goto L_0x00a5
                goto L_0x0015
            L_0x00a5:
                r1 = 21
                goto L_0x01be
            L_0x00a9:
                java.lang.String r2 = "V_THEORA"
                boolean r1 = r1.equals(r2)
                if (r1 != 0) goto L_0x00b3
                goto L_0x0015
            L_0x00b3:
                r1 = 20
                goto L_0x01be
            L_0x00b7:
                java.lang.String r2 = "S_HDMV/PGS"
                boolean r1 = r1.equals(r2)
                if (r1 != 0) goto L_0x00c1
                goto L_0x0015
            L_0x00c1:
                r1 = 19
                goto L_0x01be
            L_0x00c5:
                java.lang.String r2 = "V_VP9"
                boolean r1 = r1.equals(r2)
                if (r1 != 0) goto L_0x00cf
                goto L_0x0015
            L_0x00cf:
                r1 = 18
                goto L_0x01be
            L_0x00d3:
                java.lang.String r2 = "V_VP8"
                boolean r1 = r1.equals(r2)
                if (r1 != 0) goto L_0x00dd
                goto L_0x0015
            L_0x00dd:
                r1 = 17
                goto L_0x01be
            L_0x00e1:
                java.lang.String r2 = "V_AV1"
                boolean r1 = r1.equals(r2)
                if (r1 != 0) goto L_0x00eb
                goto L_0x0015
            L_0x00eb:
                r1 = 16
                goto L_0x01be
            L_0x00ef:
                java.lang.String r2 = "A_DTS"
                boolean r1 = r1.equals(r2)
                if (r1 != 0) goto L_0x00f9
                goto L_0x0015
            L_0x00f9:
                r1 = 15
                goto L_0x01be
            L_0x00fd:
                java.lang.String r2 = "A_AC3"
                boolean r1 = r1.equals(r2)
                if (r1 != 0) goto L_0x0107
                goto L_0x0015
            L_0x0107:
                r1 = 14
                goto L_0x01be
            L_0x010b:
                java.lang.String r2 = "A_AAC"
                boolean r1 = r1.equals(r2)
                if (r1 != 0) goto L_0x0115
                goto L_0x0015
            L_0x0115:
                r1 = 13
                goto L_0x01be
            L_0x0119:
                java.lang.String r2 = "A_DTS/LOSSLESS"
                boolean r1 = r1.equals(r2)
                if (r1 != 0) goto L_0x0123
                goto L_0x0015
            L_0x0123:
                r1 = 12
                goto L_0x01be
            L_0x0127:
                java.lang.String r2 = "S_VOBSUB"
                boolean r1 = r1.equals(r2)
                if (r1 != 0) goto L_0x0131
                goto L_0x0015
            L_0x0131:
                r1 = 11
                goto L_0x01be
            L_0x0135:
                java.lang.String r2 = "V_MPEG4/ISO/AVC"
                boolean r1 = r1.equals(r2)
                if (r1 != 0) goto L_0x013f
                goto L_0x0015
            L_0x013f:
                r1 = 10
                goto L_0x01be
            L_0x0143:
                java.lang.String r2 = "V_MPEG4/ISO/ASP"
                boolean r1 = r1.equals(r2)
                if (r1 != 0) goto L_0x014d
                goto L_0x0015
            L_0x014d:
                r1 = 9
                goto L_0x01be
            L_0x0151:
                java.lang.String r2 = "S_DVBSUB"
                boolean r1 = r1.equals(r2)
                if (r1 != 0) goto L_0x015b
                goto L_0x0015
            L_0x015b:
                r1 = 8
                goto L_0x01be
            L_0x015f:
                java.lang.String r2 = "V_MS/VFW/FOURCC"
                boolean r1 = r1.equals(r2)
                if (r1 != 0) goto L_0x0169
                goto L_0x0015
            L_0x0169:
                r1 = 7
                goto L_0x01be
            L_0x016b:
                java.lang.String r2 = "A_MPEG/L3"
                boolean r1 = r1.equals(r2)
                if (r1 != 0) goto L_0x0175
                goto L_0x0015
            L_0x0175:
                r1 = 6
                goto L_0x01be
            L_0x0177:
                java.lang.String r2 = "A_MPEG/L2"
                boolean r1 = r1.equals(r2)
                if (r1 != 0) goto L_0x0181
                goto L_0x0015
            L_0x0181:
                r1 = 5
                goto L_0x01be
            L_0x0183:
                java.lang.String r2 = "A_VORBIS"
                boolean r1 = r1.equals(r2)
                if (r1 != 0) goto L_0x018d
                goto L_0x0015
            L_0x018d:
                r1 = 4
                goto L_0x01be
            L_0x018f:
                java.lang.String r2 = "A_TRUEHD"
                boolean r1 = r1.equals(r2)
                if (r1 != 0) goto L_0x0199
                goto L_0x0015
            L_0x0199:
                r1 = 3
                goto L_0x01be
            L_0x019b:
                java.lang.String r2 = "A_MS/ACM"
                boolean r1 = r1.equals(r2)
                if (r1 != 0) goto L_0x01a5
                goto L_0x0015
            L_0x01a5:
                r1 = 2
                goto L_0x01be
            L_0x01a7:
                java.lang.String r2 = "V_MPEG4/ISO/SP"
                boolean r1 = r1.equals(r2)
                if (r1 != 0) goto L_0x01b1
                goto L_0x0015
            L_0x01b1:
                r1 = 1
                goto L_0x01be
            L_0x01b3:
                java.lang.String r2 = "V_MPEG4/ISO/AP"
                boolean r1 = r1.equals(r2)
                if (r1 != 0) goto L_0x01bd
                goto L_0x0015
            L_0x01bd:
                r1 = 0
            L_0x01be:
                java.lang.String r2 = "application/dvbsubs"
                java.lang.String r11 = "application/pgs"
                java.lang.String r12 = "application/vobsub"
                java.lang.String r13 = "text/x-ssa"
                java.lang.String r14 = "application/x-subrip"
                java.lang.String r4 = ". Setting mimeType to "
                java.lang.String r16 = "audio/raw"
                r17 = 0
                java.lang.String r5 = "MatroskaExtractor"
                java.lang.String r15 = "audio/x-unknown"
                switch(r1) {
                    case 0: goto L_0x0443;
                    case 1: goto L_0x0443;
                    case 2: goto L_0x03ec;
                    case 3: goto L_0x03df;
                    case 4: goto L_0x03ca;
                    case 5: goto L_0x03be;
                    case 6: goto L_0x03b9;
                    case 7: goto L_0x039a;
                    case 8: goto L_0x0386;
                    case 9: goto L_0x0443;
                    case 10: goto L_0x0362;
                    case 11: goto L_0x0353;
                    case 12: goto L_0x034e;
                    case 13: goto L_0x032f;
                    case 14: goto L_0x032a;
                    case 15: goto L_0x0325;
                    case 16: goto L_0x0320;
                    case 17: goto L_0x0315;
                    case 18: goto L_0x0310;
                    case 19: goto L_0x0308;
                    case 20: goto L_0x0303;
                    case 21: goto L_0x0325;
                    case 22: goto L_0x02d9;
                    case 23: goto L_0x02a7;
                    case 24: goto L_0x0272;
                    case 25: goto L_0x025e;
                    case 26: goto L_0x0241;
                    case 27: goto L_0x023b;
                    case 28: goto L_0x0235;
                    case 29: goto L_0x022f;
                    case 30: goto L_0x021f;
                    case 31: goto L_0x01dd;
                    default: goto L_0x01d5;
                }
            L_0x01d5:
                com.google.android.exoplayer2.ParserException r1 = new com.google.android.exoplayer2.ParserException
                java.lang.String r2 = "Unrecognized codec identifier."
                r1.<init>((java.lang.String) r2)
                throw r1
            L_0x01dd:
                r15 = 5760(0x1680, float:8.071E-42)
                java.util.ArrayList r1 = new java.util.ArrayList
                r1.<init>(r8)
                java.lang.String r3 = r0.codecId
                byte[] r3 = r0.getCodecPrivate(r3)
                r1.add(r3)
                java.nio.ByteBuffer r3 = java.nio.ByteBuffer.allocate(r6)
                java.nio.ByteOrder r4 = java.nio.ByteOrder.LITTLE_ENDIAN
                java.nio.ByteBuffer r3 = r3.order(r4)
                r18 = r11
                long r10 = r0.codecDelayNs
                java.nio.ByteBuffer r3 = r3.putLong(r10)
                byte[] r3 = r3.array()
                r1.add(r3)
                java.nio.ByteBuffer r3 = java.nio.ByteBuffer.allocate(r6)
                java.nio.ByteBuffer r3 = r3.order(r4)
                long r4 = r0.seekPreRollNs
                java.nio.ByteBuffer r3 = r3.putLong(r4)
                byte[] r3 = r3.array()
                r1.add(r3)
                java.lang.String r16 = "audio/opus"
                goto L_0x03da
            L_0x021f:
                r18 = r11
                java.lang.String r1 = r0.codecId
                byte[] r1 = r0.getCodecPrivate(r1)
                java.util.List r1 = java.util.Collections.singletonList(r1)
                java.lang.String r16 = "audio/flac"
                goto L_0x03b5
            L_0x022f:
                r18 = r11
                java.lang.String r16 = "audio/eac3"
                goto L_0x0319
            L_0x0235:
                r18 = r11
                java.lang.String r16 = "video/mpeg2"
                goto L_0x0319
            L_0x023b:
                r18 = r11
                r16 = r14
                goto L_0x0319
            L_0x0241:
                r18 = r11
                com.google.android.exoplayer2.util.ParsableByteArray r1 = new com.google.android.exoplayer2.util.ParsableByteArray
                java.lang.String r3 = r0.codecId
                byte[] r3 = r0.getCodecPrivate(r3)
                r1.<init>((byte[]) r3)
                com.google.android.exoplayer2.video.HevcConfig r1 = com.google.android.exoplayer2.video.HevcConfig.parse(r1)
                java.util.List<byte[]> r3 = r1.initializationData
                int r4 = r1.nalUnitLengthFieldLength
                r0.nalUnitLengthFieldLength = r4
                java.lang.String r1 = r1.codecs
                java.lang.String r16 = "video/hevc"
                goto L_0x037d
            L_0x025e:
                r18 = r11
                byte[] r1 = com.google.android.exoplayer2.extractor.mkv.MatroskaExtractor.SSA_DIALOGUE_FORMAT
                java.lang.String r3 = r0.codecId
                byte[] r3 = r0.getCodecPrivate(r3)
                com.google.common.collect.t r1 = com.google.common.collect.C4766t.m21980G(r1, r3)
                r16 = r13
                goto L_0x03b5
            L_0x0272:
                r18 = r11
                int r1 = r0.audioBitDepth
                int r7 = com.google.android.exoplayer2.util.Util.getPcmEncoding(r1)
                if (r7 != 0) goto L_0x02a2
                int r1 = r0.audioBitDepth
                int r3 = r15.length()
                int r3 = r3 + 74
                java.lang.StringBuilder r6 = new java.lang.StringBuilder
                r6.<init>(r3)
                java.lang.String r3 = "Unsupported little endian PCM bit depth: "
                r6.append(r3)
                r6.append(r1)
                r6.append(r4)
                r6.append(r15)
                java.lang.String r1 = r6.toString()
                com.google.android.exoplayer2.util.Log.m19797w(r5, r1)
            L_0x029e:
                r16 = r15
                goto L_0x0319
            L_0x02a2:
                r1 = r17
                r3 = r1
                goto L_0x031d
            L_0x02a7:
                r18 = r11
                int r1 = r0.audioBitDepth
                if (r1 != r6) goto L_0x02b3
                r1 = r17
                r3 = r1
                r7 = 3
                goto L_0x031d
            L_0x02b3:
                if (r1 != r3) goto L_0x02b8
                r7 = 268435456(0x10000000, float:2.5243549E-29)
                goto L_0x02a2
            L_0x02b8:
                int r3 = r15.length()
                int r3 = r3 + 71
                java.lang.StringBuilder r6 = new java.lang.StringBuilder
                r6.<init>(r3)
                java.lang.String r3 = "Unsupported big endian PCM bit depth: "
                r6.append(r3)
                r6.append(r1)
                r6.append(r4)
                r6.append(r15)
                java.lang.String r1 = r6.toString()
                com.google.android.exoplayer2.util.Log.m19797w(r5, r1)
                goto L_0x029e
            L_0x02d9:
                r18 = r11
                int r1 = r0.audioBitDepth
                r3 = 32
                if (r1 != r3) goto L_0x02e2
                goto L_0x02a2
            L_0x02e2:
                int r3 = r15.length()
                int r3 = r3 + 75
                java.lang.StringBuilder r6 = new java.lang.StringBuilder
                r6.<init>(r3)
                java.lang.String r3 = "Unsupported floating point PCM bit depth: "
                r6.append(r3)
                r6.append(r1)
                r6.append(r4)
                r6.append(r15)
                java.lang.String r1 = r6.toString()
                com.google.android.exoplayer2.util.Log.m19797w(r5, r1)
                goto L_0x029e
            L_0x0303:
                r18 = r11
                java.lang.String r16 = "video/x-unknown"
                goto L_0x0319
            L_0x0308:
                r18 = r11
                r1 = r17
                r3 = r1
                r16 = r18
                goto L_0x031c
            L_0x0310:
                r18 = r11
                java.lang.String r16 = "video/x-vnd.on2.vp9"
                goto L_0x0319
            L_0x0315:
                r18 = r11
                java.lang.String r16 = "video/x-vnd.on2.vp8"
            L_0x0319:
                r1 = r17
                r3 = r1
            L_0x031c:
                r7 = -1
            L_0x031d:
                r15 = -1
                goto L_0x0454
            L_0x0320:
                r18 = r11
                java.lang.String r16 = "video/av01"
                goto L_0x0319
            L_0x0325:
                r18 = r11
                java.lang.String r16 = "audio/vnd.dts"
                goto L_0x0319
            L_0x032a:
                r18 = r11
                java.lang.String r16 = "audio/ac3"
                goto L_0x0319
            L_0x032f:
                r18 = r11
                java.lang.String r1 = r0.codecId
                byte[] r1 = r0.getCodecPrivate(r1)
                java.util.List r1 = java.util.Collections.singletonList(r1)
                byte[] r3 = r0.codecPrivate
                com.google.android.exoplayer2.audio.AacUtil$Config r3 = com.google.android.exoplayer2.audio.AacUtil.parseAudioSpecificConfig(r3)
                int r4 = r3.sampleRateHz
                r0.sampleRate = r4
                int r4 = r3.channelCount
                r0.channelCount = r4
                java.lang.String r3 = r3.codecs
                java.lang.String r16 = "audio/mp4a-latm"
                goto L_0x031c
            L_0x034e:
                r18 = r11
                java.lang.String r16 = "audio/vnd.dts.hd"
                goto L_0x0319
            L_0x0353:
                r18 = r11
                java.lang.String r1 = r0.codecId
                byte[] r1 = r0.getCodecPrivate(r1)
                com.google.common.collect.t r1 = com.google.common.collect.C4766t.m21979F(r1)
                r16 = r12
                goto L_0x03b5
            L_0x0362:
                r18 = r11
                com.google.android.exoplayer2.util.ParsableByteArray r1 = new com.google.android.exoplayer2.util.ParsableByteArray
                java.lang.String r3 = r0.codecId
                byte[] r3 = r0.getCodecPrivate(r3)
                r1.<init>((byte[]) r3)
                com.google.android.exoplayer2.video.AvcConfig r1 = com.google.android.exoplayer2.video.AvcConfig.parse(r1)
                java.util.List<byte[]> r3 = r1.initializationData
                int r4 = r1.nalUnitLengthFieldLength
                r0.nalUnitLengthFieldLength = r4
                java.lang.String r1 = r1.codecs
                java.lang.String r16 = "video/avc"
            L_0x037d:
                r7 = -1
                r15 = -1
                r19 = r3
                r3 = r1
                r1 = r19
                goto L_0x0454
            L_0x0386:
                r18 = r11
                byte[] r1 = new byte[r7]
                java.lang.String r3 = r0.codecId
                byte[] r3 = r0.getCodecPrivate(r3)
                java.lang.System.arraycopy(r3, r9, r1, r9, r7)
                com.google.common.collect.t r1 = com.google.common.collect.C4766t.m21979F(r1)
                r16 = r2
                goto L_0x03b5
            L_0x039a:
                r18 = r11
                com.google.android.exoplayer2.util.ParsableByteArray r1 = new com.google.android.exoplayer2.util.ParsableByteArray
                java.lang.String r3 = r0.codecId
                byte[] r3 = r0.getCodecPrivate(r3)
                r1.<init>((byte[]) r3)
                android.util.Pair r1 = parseFourCcPrivate(r1)
                java.lang.Object r3 = r1.first
                r16 = r3
                java.lang.String r16 = (java.lang.String) r16
                java.lang.Object r1 = r1.second
                java.util.List r1 = (java.util.List) r1
            L_0x03b5:
                r3 = r17
                goto L_0x031c
            L_0x03b9:
                r18 = r11
                java.lang.String r16 = "audio/mpeg"
                goto L_0x03c2
            L_0x03be:
                r18 = r11
                java.lang.String r16 = "audio/mpeg-L2"
            L_0x03c2:
                r1 = r17
                r3 = r1
                r7 = -1
                r15 = 4096(0x1000, float:5.74E-42)
                goto L_0x0454
            L_0x03ca:
                r18 = r11
                r15 = 8192(0x2000, float:1.14794E-41)
                java.lang.String r1 = r0.codecId
                byte[] r1 = r0.getCodecPrivate(r1)
                java.util.List r1 = parseVorbisCodecPrivate(r1)
                java.lang.String r16 = "audio/vorbis"
            L_0x03da:
                r3 = r17
                r7 = -1
                goto L_0x0454
            L_0x03df:
                r18 = r11
                com.google.android.exoplayer2.extractor.mkv.MatroskaExtractor$TrueHdSampleRechunker r1 = new com.google.android.exoplayer2.extractor.mkv.MatroskaExtractor$TrueHdSampleRechunker
                r1.<init>()
                r0.trueHdSampleRechunker = r1
                java.lang.String r16 = "audio/true-hd"
                goto L_0x0319
            L_0x03ec:
                r18 = r11
                com.google.android.exoplayer2.util.ParsableByteArray r1 = new com.google.android.exoplayer2.util.ParsableByteArray
                java.lang.String r3 = r0.codecId
                byte[] r3 = r0.getCodecPrivate(r3)
                r1.<init>((byte[]) r3)
                boolean r1 = parseMsAcmCodecPrivate(r1)
                if (r1 == 0) goto L_0x042b
                int r1 = r0.audioBitDepth
                int r7 = com.google.android.exoplayer2.util.Util.getPcmEncoding(r1)
                if (r7 != 0) goto L_0x02a2
                int r1 = r0.audioBitDepth
                int r3 = r15.length()
                int r3 = r3 + 60
                java.lang.StringBuilder r6 = new java.lang.StringBuilder
                r6.<init>(r3)
                java.lang.String r3 = "Unsupported PCM bit depth: "
                r6.append(r3)
                r6.append(r1)
                r6.append(r4)
                r6.append(r15)
                java.lang.String r1 = r6.toString()
                com.google.android.exoplayer2.util.Log.m19797w(r5, r1)
                goto L_0x029e
            L_0x042b:
                java.lang.String r1 = "Non-PCM MS/ACM is unsupported. Setting mimeType to "
                int r3 = r15.length()
                if (r3 == 0) goto L_0x0438
                java.lang.String r1 = r1.concat(r15)
                goto L_0x043e
            L_0x0438:
                java.lang.String r3 = new java.lang.String
                r3.<init>(r1)
                r1 = r3
            L_0x043e:
                com.google.android.exoplayer2.util.Log.m19797w(r5, r1)
                goto L_0x029e
            L_0x0443:
                r18 = r11
                byte[] r1 = r0.codecPrivate
                if (r1 != 0) goto L_0x044c
                r1 = r17
                goto L_0x0450
            L_0x044c:
                java.util.List r1 = java.util.Collections.singletonList(r1)
            L_0x0450:
                java.lang.String r16 = "video/mp4v-es"
                goto L_0x03b5
            L_0x0454:
                byte[] r4 = r0.dolbyVisionConfigBytes
                if (r4 == 0) goto L_0x0467
                com.google.android.exoplayer2.util.ParsableByteArray r5 = new com.google.android.exoplayer2.util.ParsableByteArray
                r5.<init>((byte[]) r4)
                com.google.android.exoplayer2.video.DolbyVisionConfig r4 = com.google.android.exoplayer2.video.DolbyVisionConfig.parse(r5)
                if (r4 == 0) goto L_0x0467
                java.lang.String r3 = r4.codecs
                java.lang.String r16 = "video/dolby-vision"
            L_0x0467:
                r4 = r16
                boolean r5 = r0.flagDefault
                r5 = r5 | r9
                boolean r6 = r0.flagForced
                if (r6 == 0) goto L_0x0472
                r6 = 2
                goto L_0x0473
            L_0x0472:
                r6 = 0
            L_0x0473:
                r5 = r5 | r6
                com.google.android.exoplayer2.Format$Builder r6 = new com.google.android.exoplayer2.Format$Builder
                r6.<init>()
                boolean r10 = com.google.android.exoplayer2.util.MimeTypes.isAudio(r4)
                if (r10 == 0) goto L_0x0491
                int r2 = r0.channelCount
                com.google.android.exoplayer2.Format$Builder r2 = r6.setChannelCount(r2)
                int r8 = r0.sampleRate
                com.google.android.exoplayer2.Format$Builder r2 = r2.setSampleRate(r8)
                r2.setPcmEncoding(r7)
                r8 = 1
                goto L_0x0598
            L_0x0491:
                boolean r7 = com.google.android.exoplayer2.util.MimeTypes.isVideo(r4)
                if (r7 == 0) goto L_0x056f
                int r2 = r0.displayUnit
                if (r2 != 0) goto L_0x04ad
                int r2 = r0.displayWidth
                r7 = -1
                if (r2 != r7) goto L_0x04a2
                int r2 = r0.width
            L_0x04a2:
                r0.displayWidth = r2
                int r2 = r0.displayHeight
                if (r2 != r7) goto L_0x04aa
                int r2 = r0.height
            L_0x04aa:
                r0.displayHeight = r2
                goto L_0x04ae
            L_0x04ad:
                r7 = -1
            L_0x04ae:
                r2 = -1082130432(0xffffffffbf800000, float:-1.0)
                int r8 = r0.displayWidth
                if (r8 == r7) goto L_0x04c3
                int r10 = r0.displayHeight
                if (r10 == r7) goto L_0x04c3
                int r2 = r0.height
                int r2 = r2 * r8
                float r2 = (float) r2
                int r8 = r0.width
                int r8 = r8 * r10
                float r8 = (float) r8
                float r2 = r2 / r8
            L_0x04c3:
                boolean r8 = r0.hasColorInfo
                if (r8 == 0) goto L_0x04d7
                byte[] r8 = r20.getHdrStaticInfo()
                com.google.android.exoplayer2.video.ColorInfo r10 = new com.google.android.exoplayer2.video.ColorInfo
                int r11 = r0.colorSpace
                int r12 = r0.colorRange
                int r13 = r0.colorTransfer
                r10.<init>(r11, r12, r13, r8)
                goto L_0x04d9
            L_0x04d7:
                r10 = r17
            L_0x04d9:
                java.lang.String r8 = r0.name
                if (r8 == 0) goto L_0x04f9
                java.util.Map r8 = com.google.android.exoplayer2.extractor.mkv.MatroskaExtractor.TRACK_NAME_TO_ROTATION_DEGREES
                java.lang.String r11 = r0.name
                boolean r8 = r8.containsKey(r11)
                if (r8 == 0) goto L_0x04f9
                java.util.Map r7 = com.google.android.exoplayer2.extractor.mkv.MatroskaExtractor.TRACK_NAME_TO_ROTATION_DEGREES
                java.lang.String r8 = r0.name
                java.lang.Object r7 = r7.get(r8)
                java.lang.Integer r7 = (java.lang.Integer) r7
                int r7 = r7.intValue()
            L_0x04f9:
                int r8 = r0.projectionType
                if (r8 != 0) goto L_0x0549
                float r8 = r0.projectionPoseYaw
                r11 = 0
                int r8 = java.lang.Float.compare(r8, r11)
                if (r8 != 0) goto L_0x0549
                float r8 = r0.projectionPosePitch
                int r8 = java.lang.Float.compare(r8, r11)
                if (r8 != 0) goto L_0x0549
                float r8 = r0.projectionPoseRoll
                int r8 = java.lang.Float.compare(r8, r11)
                if (r8 != 0) goto L_0x0517
                goto L_0x054a
            L_0x0517:
                float r8 = r0.projectionPosePitch
                r9 = 1119092736(0x42b40000, float:90.0)
                int r8 = java.lang.Float.compare(r8, r9)
                if (r8 != 0) goto L_0x0524
                r9 = 90
                goto L_0x054a
            L_0x0524:
                float r8 = r0.projectionPosePitch
                r9 = -1020002304(0xffffffffc3340000, float:-180.0)
                int r8 = java.lang.Float.compare(r8, r9)
                if (r8 == 0) goto L_0x0546
                float r8 = r0.projectionPosePitch
                r9 = 1127481344(0x43340000, float:180.0)
                int r8 = java.lang.Float.compare(r8, r9)
                if (r8 != 0) goto L_0x0539
                goto L_0x0546
            L_0x0539:
                float r8 = r0.projectionPosePitch
                r9 = -1028390912(0xffffffffc2b40000, float:-90.0)
                int r8 = java.lang.Float.compare(r8, r9)
                if (r8 != 0) goto L_0x0549
                r9 = 270(0x10e, float:3.78E-43)
                goto L_0x054a
            L_0x0546:
                r9 = 180(0xb4, float:2.52E-43)
                goto L_0x054a
            L_0x0549:
                r9 = r7
            L_0x054a:
                int r7 = r0.width
                com.google.android.exoplayer2.Format$Builder r7 = r6.setWidth(r7)
                int r8 = r0.height
                com.google.android.exoplayer2.Format$Builder r7 = r7.setHeight(r8)
                com.google.android.exoplayer2.Format$Builder r2 = r7.setPixelWidthHeightRatio(r2)
                com.google.android.exoplayer2.Format$Builder r2 = r2.setRotationDegrees(r9)
                byte[] r7 = r0.projectionData
                com.google.android.exoplayer2.Format$Builder r2 = r2.setProjectionData(r7)
                int r7 = r0.stereoMode
                com.google.android.exoplayer2.Format$Builder r2 = r2.setStereoMode(r7)
                r2.setColorInfo(r10)
                r8 = 2
                goto L_0x0598
            L_0x056f:
                boolean r7 = r14.equals(r4)
                if (r7 != 0) goto L_0x0598
                boolean r7 = r13.equals(r4)
                if (r7 != 0) goto L_0x0598
                boolean r7 = r12.equals(r4)
                if (r7 != 0) goto L_0x0598
                r7 = r18
                boolean r7 = r7.equals(r4)
                if (r7 != 0) goto L_0x0598
                boolean r2 = r2.equals(r4)
                if (r2 == 0) goto L_0x0590
                goto L_0x0598
            L_0x0590:
                com.google.android.exoplayer2.ParserException r1 = new com.google.android.exoplayer2.ParserException
                java.lang.String r2 = "Unexpected MIME type."
                r1.<init>((java.lang.String) r2)
                throw r1
            L_0x0598:
                java.lang.String r2 = r0.name
                if (r2 == 0) goto L_0x05ad
                java.util.Map r2 = com.google.android.exoplayer2.extractor.mkv.MatroskaExtractor.TRACK_NAME_TO_ROTATION_DEGREES
                java.lang.String r7 = r0.name
                boolean r2 = r2.containsKey(r7)
                if (r2 != 0) goto L_0x05ad
                java.lang.String r2 = r0.name
                r6.setLabel(r2)
            L_0x05ad:
                r2 = r22
                com.google.android.exoplayer2.Format$Builder r2 = r6.setId((int) r2)
                com.google.android.exoplayer2.Format$Builder r2 = r2.setSampleMimeType(r4)
                com.google.android.exoplayer2.Format$Builder r2 = r2.setMaxInputSize(r15)
                java.lang.String r4 = r0.language
                com.google.android.exoplayer2.Format$Builder r2 = r2.setLanguage(r4)
                com.google.android.exoplayer2.Format$Builder r2 = r2.setSelectionFlags(r5)
                com.google.android.exoplayer2.Format$Builder r1 = r2.setInitializationData(r1)
                com.google.android.exoplayer2.Format$Builder r1 = r1.setCodecs(r3)
                com.google.android.exoplayer2.drm.DrmInitData r2 = r0.drmInitData
                com.google.android.exoplayer2.Format$Builder r1 = r1.setDrmInitData(r2)
                com.google.android.exoplayer2.Format r1 = r1.build()
                int r2 = r0.number
                r3 = r21
                com.google.android.exoplayer2.extractor.TrackOutput r2 = r3.track(r2, r8)
                r0.output = r2
                r2.format(r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.extractor.mkv.MatroskaExtractor.Track.initializeOutput(com.google.android.exoplayer2.extractor.ExtractorOutput, int):void");
        }

        @RequiresNonNull({"output"})
        public void outputPendingSampleMetadata() {
            TrueHdSampleRechunker trueHdSampleRechunker2 = this.trueHdSampleRechunker;
            if (trueHdSampleRechunker2 != null) {
                trueHdSampleRechunker2.outputPendingSampleMetadata(this);
            }
        }

        public void reset() {
            TrueHdSampleRechunker trueHdSampleRechunker2 = this.trueHdSampleRechunker;
            if (trueHdSampleRechunker2 != null) {
                trueHdSampleRechunker2.reset();
            }
        }
    }

    private static final class TrueHdSampleRechunker {
        private int chunkFlags;
        private int chunkOffset;
        private int chunkSampleCount;
        private int chunkSize;
        private long chunkTimeUs;
        private boolean foundSyncframe;
        private final byte[] syncframePrefix = new byte[10];

        @RequiresNonNull({"#1.output"})
        public void outputPendingSampleMetadata(Track track) {
            if (this.chunkSampleCount > 0) {
                track.output.sampleMetadata(this.chunkTimeUs, this.chunkFlags, this.chunkSize, this.chunkOffset, track.cryptoData);
                this.chunkSampleCount = 0;
            }
        }

        public void reset() {
            this.foundSyncframe = false;
            this.chunkSampleCount = 0;
        }

        @RequiresNonNull({"#1.output"})
        public void sampleMetadata(Track track, long j, int i, int i2, int i3) {
            if (this.foundSyncframe) {
                int i4 = this.chunkSampleCount;
                int i5 = i4 + 1;
                this.chunkSampleCount = i5;
                if (i4 == 0) {
                    this.chunkTimeUs = j;
                    this.chunkFlags = i;
                    this.chunkSize = 0;
                }
                this.chunkSize += i2;
                this.chunkOffset = i3;
                if (i5 >= 16) {
                    outputPendingSampleMetadata(track);
                }
            }
        }

        public void startSample(ExtractorInput extractorInput) throws IOException {
            if (!this.foundSyncframe) {
                extractorInput.peekFully(this.syncframePrefix, 0, 10);
                extractorInput.resetPeekPosition();
                if (Ac3Util.parseTrueHdSyncframeAudioSampleCount(this.syncframePrefix) != 0) {
                    this.foundSyncframe = true;
                }
            }
        }
    }

    private final class InnerEbmlProcessor implements EbmlProcessor {
        private InnerEbmlProcessor() {
        }

        public void binaryElement(int i, int i2, ExtractorInput extractorInput) throws IOException {
            MatroskaExtractor.this.binaryElement(i, i2, extractorInput);
        }

        public void endMasterElement(int i) throws ParserException {
            MatroskaExtractor.this.endMasterElement(i);
        }

        public void floatElement(int i, double d) throws ParserException {
            MatroskaExtractor.this.floatElement(i, d);
        }

        public int getElementType(int i) {
            return MatroskaExtractor.this.getElementType(i);
        }

        public void integerElement(int i, long j) throws ParserException {
            MatroskaExtractor.this.integerElement(i, j);
        }

        public boolean isLevel1Element(int i) {
            return MatroskaExtractor.this.isLevel1Element(i);
        }

        public void startMasterElement(int i, long j, long j2) throws ParserException {
            MatroskaExtractor.this.startMasterElement(i, j, j2);
        }

        public void stringElement(int i, String str) throws ParserException {
            MatroskaExtractor.this.stringElement(i, str);
        }
    }

    static {
        HashMap hashMap = new HashMap();
        hashMap.put("htc_video_rotA-000", 0);
        hashMap.put("htc_video_rotA-090", 90);
        hashMap.put("htc_video_rotA-180", 180);
        hashMap.put("htc_video_rotA-270", 270);
        TRACK_NAME_TO_ROTATION_DEGREES = Collections.unmodifiableMap(hashMap);
    }

    public MatroskaExtractor() {
        this(0);
    }

    @EnsuresNonNull({"cueTimesUs", "cueClusterPositions"})
    private void assertInCues(int i) throws ParserException {
        if (this.cueTimesUs == null || this.cueClusterPositions == null) {
            StringBuilder sb = new StringBuilder(37);
            sb.append("Element ");
            sb.append(i);
            sb.append(" must be in a Cues");
            throw new ParserException(sb.toString());
        }
    }

    @EnsuresNonNull({"currentTrack"})
    private void assertInTrackEntry(int i) throws ParserException {
        if (this.currentTrack == null) {
            StringBuilder sb = new StringBuilder(43);
            sb.append("Element ");
            sb.append(i);
            sb.append(" must be in a TrackEntry");
            throw new ParserException(sb.toString());
        }
    }

    @EnsuresNonNull({"extractorOutput"})
    private void assertInitialized() {
        Assertions.checkStateNotNull(this.extractorOutput);
    }

    private SeekMap buildSeekMap(LongArray longArray, LongArray longArray2) {
        int i;
        if (this.segmentContentPosition == -1 || this.durationUs == C6540C.TIME_UNSET || longArray == null || longArray.size() == 0 || longArray2 == null || longArray2.size() != longArray.size()) {
            return new SeekMap.Unseekable(this.durationUs);
        }
        int size = longArray.size();
        int[] iArr = new int[size];
        long[] jArr = new long[size];
        long[] jArr2 = new long[size];
        long[] jArr3 = new long[size];
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            jArr3[i3] = longArray.get(i3);
            jArr[i3] = this.segmentContentPosition + longArray2.get(i3);
        }
        while (true) {
            i = size - 1;
            if (i2 >= i) {
                break;
            }
            int i4 = i2 + 1;
            iArr[i2] = (int) (jArr[i4] - jArr[i2]);
            jArr2[i2] = jArr3[i4] - jArr3[i2];
            i2 = i4;
        }
        iArr[i] = (int) ((this.segmentContentPosition + this.segmentContentSize) - jArr[i]);
        jArr2[i] = this.durationUs - jArr3[i];
        long j = jArr2[i];
        if (j <= 0) {
            StringBuilder sb = new StringBuilder(72);
            sb.append("Discarding last cue point with unexpected duration: ");
            sb.append(j);
            Log.m19797w(TAG, sb.toString());
            iArr = Arrays.copyOf(iArr, i);
            jArr = Arrays.copyOf(jArr, i);
            jArr2 = Arrays.copyOf(jArr2, i);
            jArr3 = Arrays.copyOf(jArr3, i);
        }
        return new ChunkIndex(iArr, jArr, jArr2, jArr3);
    }

    @RequiresNonNull({"#1.output"})
    private void commitSampleToOutput(Track track, long j, int i, int i2, int i3) {
        TrueHdSampleRechunker trueHdSampleRechunker = track.trueHdSampleRechunker;
        if (trueHdSampleRechunker != null) {
            trueHdSampleRechunker.sampleMetadata(track, j, i, i2, i3);
        } else {
            if (CODEC_ID_SUBRIP.equals(track.codecId) || CODEC_ID_ASS.equals(track.codecId)) {
                if (this.blockSampleCount > 1) {
                    Log.m19797w(TAG, "Skipping subtitle sample in laced block.");
                } else {
                    long j2 = this.blockDurationUs;
                    if (j2 == C6540C.TIME_UNSET) {
                        Log.m19797w(TAG, "Skipping subtitle sample with no duration.");
                    } else {
                        setSubtitleEndTime(track.codecId, j2, this.subtitleSample.getData());
                        int position = this.subtitleSample.getPosition();
                        while (true) {
                            if (position >= this.subtitleSample.limit()) {
                                break;
                            } else if (this.subtitleSample.getData()[position] == 0) {
                                this.subtitleSample.setLimit(position);
                                break;
                            } else {
                                position++;
                            }
                        }
                        TrackOutput trackOutput = track.output;
                        ParsableByteArray parsableByteArray = this.subtitleSample;
                        trackOutput.sampleData(parsableByteArray, parsableByteArray.limit());
                        i2 += this.subtitleSample.limit();
                    }
                }
            }
            if ((268435456 & i) != 0) {
                if (this.blockSampleCount > 1) {
                    i &= -268435457;
                } else {
                    int limit = this.blockAdditionalData.limit();
                    track.output.sampleData(this.blockAdditionalData, limit, 2);
                    i2 += limit;
                }
            }
            track.output.sampleMetadata(j, i, i2, i3, track.cryptoData);
        }
        this.haveOutputSample = true;
    }

    private static int[] ensureArrayCapacity(int[] iArr, int i) {
        if (iArr == null) {
            return new int[i];
        }
        if (iArr.length >= i) {
            return iArr;
        }
        return new int[Math.max(iArr.length * 2, i)];
    }

    private int finishWriteSampleData() {
        int i = this.sampleBytesWritten;
        resetWriteSampleData();
        return i;
    }

    private static byte[] formatSubtitleTimecode(long j, String str, long j2) {
        Assertions.checkArgument(j != C6540C.TIME_UNSET);
        int i = (int) (j / 3600000000L);
        long j3 = j - (((long) (i * 3600)) * 1000000);
        int i2 = (int) (j3 / 60000000);
        long j4 = j3 - (((long) (i2 * 60)) * 1000000);
        int i3 = (int) (j4 / 1000000);
        return Util.getUtf8Bytes(String.format(Locale.US, str, new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf((int) ((j4 - (((long) i3) * 1000000)) / j2))}));
    }

    private Track getCurrentTrack(int i) throws ParserException {
        assertInTrackEntry(i);
        return this.currentTrack;
    }

    private static boolean isCodecSupported(String str) {
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case -2095576542:
                if (str.equals(CODEC_ID_MPEG4_AP)) {
                    c = 0;
                    break;
                }
                break;
            case -2095575984:
                if (str.equals(CODEC_ID_MPEG4_SP)) {
                    c = 1;
                    break;
                }
                break;
            case -1985379776:
                if (str.equals(CODEC_ID_ACM)) {
                    c = 2;
                    break;
                }
                break;
            case -1784763192:
                if (str.equals(CODEC_ID_TRUEHD)) {
                    c = 3;
                    break;
                }
                break;
            case -1730367663:
                if (str.equals(CODEC_ID_VORBIS)) {
                    c = 4;
                    break;
                }
                break;
            case -1482641358:
                if (str.equals(CODEC_ID_MP2)) {
                    c = 5;
                    break;
                }
                break;
            case -1482641357:
                if (str.equals(CODEC_ID_MP3)) {
                    c = 6;
                    break;
                }
                break;
            case -1373388978:
                if (str.equals(CODEC_ID_FOURCC)) {
                    c = 7;
                    break;
                }
                break;
            case -933872740:
                if (str.equals(CODEC_ID_DVBSUB)) {
                    c = 8;
                    break;
                }
                break;
            case -538363189:
                if (str.equals(CODEC_ID_MPEG4_ASP)) {
                    c = 9;
                    break;
                }
                break;
            case -538363109:
                if (str.equals(CODEC_ID_H264)) {
                    c = 10;
                    break;
                }
                break;
            case -425012669:
                if (str.equals(CODEC_ID_VOBSUB)) {
                    c = 11;
                    break;
                }
                break;
            case -356037306:
                if (str.equals(CODEC_ID_DTS_LOSSLESS)) {
                    c = 12;
                    break;
                }
                break;
            case 62923557:
                if (str.equals(CODEC_ID_AAC)) {
                    c = 13;
                    break;
                }
                break;
            case 62923603:
                if (str.equals(CODEC_ID_AC3)) {
                    c = 14;
                    break;
                }
                break;
            case 62927045:
                if (str.equals(CODEC_ID_DTS)) {
                    c = 15;
                    break;
                }
                break;
            case 82318131:
                if (str.equals(CODEC_ID_AV1)) {
                    c = 16;
                    break;
                }
                break;
            case 82338133:
                if (str.equals(CODEC_ID_VP8)) {
                    c = 17;
                    break;
                }
                break;
            case 82338134:
                if (str.equals(CODEC_ID_VP9)) {
                    c = 18;
                    break;
                }
                break;
            case 99146302:
                if (str.equals(CODEC_ID_PGS)) {
                    c = 19;
                    break;
                }
                break;
            case 444813526:
                if (str.equals(CODEC_ID_THEORA)) {
                    c = 20;
                    break;
                }
                break;
            case 542569478:
                if (str.equals(CODEC_ID_DTS_EXPRESS)) {
                    c = 21;
                    break;
                }
                break;
            case 635596514:
                if (str.equals(CODEC_ID_PCM_FLOAT)) {
                    c = 22;
                    break;
                }
                break;
            case 725948237:
                if (str.equals(CODEC_ID_PCM_INT_BIG)) {
                    c = 23;
                    break;
                }
                break;
            case 725957860:
                if (str.equals(CODEC_ID_PCM_INT_LIT)) {
                    c = 24;
                    break;
                }
                break;
            case 738597099:
                if (str.equals(CODEC_ID_ASS)) {
                    c = 25;
                    break;
                }
                break;
            case 855502857:
                if (str.equals(CODEC_ID_H265)) {
                    c = 26;
                    break;
                }
                break;
            case 1422270023:
                if (str.equals(CODEC_ID_SUBRIP)) {
                    c = 27;
                    break;
                }
                break;
            case 1809237540:
                if (str.equals(CODEC_ID_MPEG2)) {
                    c = 28;
                    break;
                }
                break;
            case 1950749482:
                if (str.equals(CODEC_ID_E_AC3)) {
                    c = 29;
                    break;
                }
                break;
            case 1950789798:
                if (str.equals(CODEC_ID_FLAC)) {
                    c = 30;
                    break;
                }
                break;
            case 1951062397:
                if (str.equals(CODEC_ID_OPUS)) {
                    c = 31;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
                return true;
            default:
                return false;
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ Extractor[] lambda$static$0() {
        return new Extractor[]{new MatroskaExtractor()};
    }

    private boolean maybeSeekForCues(PositionHolder positionHolder, long j) {
        if (this.seekForCues) {
            this.seekPositionAfterBuildingCues = j;
            positionHolder.position = this.cuesContentPosition;
            this.seekForCues = false;
            return true;
        }
        if (this.sentSeekMap) {
            long j2 = this.seekPositionAfterBuildingCues;
            if (j2 != -1) {
                positionHolder.position = j2;
                this.seekPositionAfterBuildingCues = -1;
                return true;
            }
        }
        return false;
    }

    private void readScratch(ExtractorInput extractorInput, int i) throws IOException {
        if (this.scratch.limit() < i) {
            if (this.scratch.capacity() < i) {
                ParsableByteArray parsableByteArray = this.scratch;
                parsableByteArray.ensureCapacity(Math.max(parsableByteArray.capacity() * 2, i));
            }
            extractorInput.readFully(this.scratch.getData(), this.scratch.limit(), i - this.scratch.limit());
            this.scratch.setLimit(i);
        }
    }

    private void resetWriteSampleData() {
        this.sampleBytesRead = 0;
        this.sampleBytesWritten = 0;
        this.sampleCurrentNalBytesRemaining = 0;
        this.sampleEncodingHandled = false;
        this.sampleSignalByteRead = false;
        this.samplePartitionCountRead = false;
        this.samplePartitionCount = 0;
        this.sampleSignalByte = 0;
        this.sampleInitializationVectorRead = false;
        this.sampleStrippedBytes.reset(0);
    }

    private long scaleTimecodeToUs(long j) throws ParserException {
        long j2 = this.timecodeScale;
        if (j2 != C6540C.TIME_UNSET) {
            return Util.scaleLargeTimestamp(j, j2, 1000);
        }
        throw new ParserException("Can't scale timecode prior to timecodeScale being set.");
    }

    private static void setSubtitleEndTime(String str, long j, byte[] bArr) {
        int i;
        byte[] bArr2;
        str.hashCode();
        if (str.equals(CODEC_ID_ASS)) {
            bArr2 = formatSubtitleTimecode(j, SSA_TIMECODE_FORMAT, 10000);
            i = 21;
        } else if (str.equals(CODEC_ID_SUBRIP)) {
            bArr2 = formatSubtitleTimecode(j, SUBRIP_TIMECODE_FORMAT, 1000);
            i = 19;
        } else {
            throw new IllegalArgumentException();
        }
        System.arraycopy(bArr2, 0, bArr, i, bArr2.length);
    }

    @RequiresNonNull({"#2.output"})
    private int writeSampleData(ExtractorInput extractorInput, Track track, int i) throws IOException {
        int i2;
        if (CODEC_ID_SUBRIP.equals(track.codecId)) {
            writeSubtitleSampleData(extractorInput, SUBRIP_PREFIX, i);
            return finishWriteSampleData();
        } else if (CODEC_ID_ASS.equals(track.codecId)) {
            writeSubtitleSampleData(extractorInput, SSA_PREFIX, i);
            return finishWriteSampleData();
        } else {
            TrackOutput trackOutput = track.output;
            boolean z = true;
            if (!this.sampleEncodingHandled) {
                if (track.hasContentEncryption) {
                    this.blockFlags &= -1073741825;
                    int i3 = 128;
                    if (!this.sampleSignalByteRead) {
                        extractorInput.readFully(this.scratch.getData(), 0, 1);
                        this.sampleBytesRead++;
                        if ((this.scratch.getData()[0] & C12425x3.f55111d) != 128) {
                            this.sampleSignalByte = this.scratch.getData()[0];
                            this.sampleSignalByteRead = true;
                        } else {
                            throw new ParserException("Extension bit is set in signal byte");
                        }
                    }
                    byte b = this.sampleSignalByte;
                    if ((b & 1) == 1) {
                        boolean z2 = (b & 2) == 2;
                        this.blockFlags |= 1073741824;
                        if (!this.sampleInitializationVectorRead) {
                            extractorInput.readFully(this.encryptionInitializationVector.getData(), 0, 8);
                            this.sampleBytesRead += 8;
                            this.sampleInitializationVectorRead = true;
                            byte[] data = this.scratch.getData();
                            if (!z2) {
                                i3 = 0;
                            }
                            data[0] = (byte) (i3 | 8);
                            this.scratch.setPosition(0);
                            trackOutput.sampleData(this.scratch, 1, 1);
                            this.sampleBytesWritten++;
                            this.encryptionInitializationVector.setPosition(0);
                            trackOutput.sampleData(this.encryptionInitializationVector, 8, 1);
                            this.sampleBytesWritten += 8;
                        }
                        if (z2) {
                            if (!this.samplePartitionCountRead) {
                                extractorInput.readFully(this.scratch.getData(), 0, 1);
                                this.sampleBytesRead++;
                                this.scratch.setPosition(0);
                                this.samplePartitionCount = this.scratch.readUnsignedByte();
                                this.samplePartitionCountRead = true;
                            }
                            int i4 = this.samplePartitionCount * 4;
                            this.scratch.reset(i4);
                            extractorInput.readFully(this.scratch.getData(), 0, i4);
                            this.sampleBytesRead += i4;
                            short s = (short) ((this.samplePartitionCount / 2) + 1);
                            int i5 = (s * 6) + 2;
                            ByteBuffer byteBuffer = this.encryptionSubsampleDataBuffer;
                            if (byteBuffer == null || byteBuffer.capacity() < i5) {
                                this.encryptionSubsampleDataBuffer = ByteBuffer.allocate(i5);
                            }
                            this.encryptionSubsampleDataBuffer.position(0);
                            this.encryptionSubsampleDataBuffer.putShort(s);
                            int i6 = 0;
                            int i7 = 0;
                            while (true) {
                                i2 = this.samplePartitionCount;
                                if (i6 >= i2) {
                                    break;
                                }
                                int readUnsignedIntToInt = this.scratch.readUnsignedIntToInt();
                                if (i6 % 2 == 0) {
                                    this.encryptionSubsampleDataBuffer.putShort((short) (readUnsignedIntToInt - i7));
                                } else {
                                    this.encryptionSubsampleDataBuffer.putInt(readUnsignedIntToInt - i7);
                                }
                                i6++;
                                i7 = readUnsignedIntToInt;
                            }
                            int i8 = (i - this.sampleBytesRead) - i7;
                            if (i2 % 2 == 1) {
                                this.encryptionSubsampleDataBuffer.putInt(i8);
                            } else {
                                this.encryptionSubsampleDataBuffer.putShort((short) i8);
                                this.encryptionSubsampleDataBuffer.putInt(0);
                            }
                            this.encryptionSubsampleData.reset(this.encryptionSubsampleDataBuffer.array(), i5);
                            trackOutput.sampleData(this.encryptionSubsampleData, i5, 1);
                            this.sampleBytesWritten += i5;
                        }
                    }
                } else {
                    byte[] bArr = track.sampleStrippedBytes;
                    if (bArr != null) {
                        this.sampleStrippedBytes.reset(bArr, bArr.length);
                    }
                }
                if (track.maxBlockAdditionId > 0) {
                    this.blockFlags |= 268435456;
                    this.blockAdditionalData.reset(0);
                    this.scratch.reset(4);
                    this.scratch.getData()[0] = (byte) ((i >> 24) & 255);
                    this.scratch.getData()[1] = (byte) ((i >> 16) & 255);
                    this.scratch.getData()[2] = (byte) ((i >> 8) & 255);
                    this.scratch.getData()[3] = (byte) (i & 255);
                    trackOutput.sampleData(this.scratch, 4, 2);
                    this.sampleBytesWritten += 4;
                }
                this.sampleEncodingHandled = true;
            }
            int limit = i + this.sampleStrippedBytes.limit();
            if (!CODEC_ID_H264.equals(track.codecId) && !CODEC_ID_H265.equals(track.codecId)) {
                if (track.trueHdSampleRechunker != null) {
                    if (this.sampleStrippedBytes.limit() != 0) {
                        z = false;
                    }
                    Assertions.checkState(z);
                    track.trueHdSampleRechunker.startSample(extractorInput);
                }
                while (true) {
                    int i9 = this.sampleBytesRead;
                    if (i9 >= limit) {
                        break;
                    }
                    int writeToOutput = writeToOutput(extractorInput, trackOutput, limit - i9);
                    this.sampleBytesRead += writeToOutput;
                    this.sampleBytesWritten += writeToOutput;
                }
            } else {
                byte[] data2 = this.nalLength.getData();
                data2[0] = 0;
                data2[1] = 0;
                data2[2] = 0;
                int i10 = track.nalUnitLengthFieldLength;
                int i11 = 4 - i10;
                while (this.sampleBytesRead < limit) {
                    int i12 = this.sampleCurrentNalBytesRemaining;
                    if (i12 == 0) {
                        writeToTarget(extractorInput, data2, i11, i10);
                        this.sampleBytesRead += i10;
                        this.nalLength.setPosition(0);
                        this.sampleCurrentNalBytesRemaining = this.nalLength.readUnsignedIntToInt();
                        this.nalStartCode.setPosition(0);
                        trackOutput.sampleData(this.nalStartCode, 4);
                        this.sampleBytesWritten += 4;
                    } else {
                        int writeToOutput2 = writeToOutput(extractorInput, trackOutput, i12);
                        this.sampleBytesRead += writeToOutput2;
                        this.sampleBytesWritten += writeToOutput2;
                        this.sampleCurrentNalBytesRemaining -= writeToOutput2;
                    }
                }
            }
            if (CODEC_ID_VORBIS.equals(track.codecId)) {
                this.vorbisNumPageSamples.setPosition(0);
                trackOutput.sampleData(this.vorbisNumPageSamples, 4);
                this.sampleBytesWritten += 4;
            }
            return finishWriteSampleData();
        }
    }

    private void writeSubtitleSampleData(ExtractorInput extractorInput, byte[] bArr, int i) throws IOException {
        int length = bArr.length + i;
        if (this.subtitleSample.capacity() < length) {
            this.subtitleSample.reset(Arrays.copyOf(bArr, length + i));
        } else {
            System.arraycopy(bArr, 0, this.subtitleSample.getData(), 0, bArr.length);
        }
        extractorInput.readFully(this.subtitleSample.getData(), bArr.length, i);
        this.subtitleSample.setPosition(0);
        this.subtitleSample.setLimit(length);
    }

    private int writeToOutput(ExtractorInput extractorInput, TrackOutput trackOutput, int i) throws IOException {
        int bytesLeft = this.sampleStrippedBytes.bytesLeft();
        if (bytesLeft <= 0) {
            return trackOutput.sampleData((DataReader) extractorInput, i, false);
        }
        int min = Math.min(i, bytesLeft);
        trackOutput.sampleData(this.sampleStrippedBytes, min);
        return min;
    }

    private void writeToTarget(ExtractorInput extractorInput, byte[] bArr, int i, int i2) throws IOException {
        int min = Math.min(i2, this.sampleStrippedBytes.bytesLeft());
        extractorInput.readFully(bArr, i + min, i2 - min);
        if (min > 0) {
            this.sampleStrippedBytes.readBytes(bArr, i, min);
        }
    }

    /* access modifiers changed from: protected */
    public void binaryElement(int i, int i2, ExtractorInput extractorInput) throws IOException {
        long j;
        long j2;
        int i3;
        byte b;
        int[] iArr;
        int i4 = i;
        int i5 = i2;
        ExtractorInput extractorInput2 = extractorInput;
        int i6 = 0;
        int i7 = 1;
        if (i4 == ID_BLOCK || i4 == ID_SIMPLE_BLOCK) {
            if (this.blockState == 0) {
                this.blockTrackNumber = (int) this.varintReader.readUnsignedVarint(extractorInput2, false, true, 8);
                this.blockTrackNumberLength = this.varintReader.getLastLength();
                this.blockDurationUs = C6540C.TIME_UNSET;
                this.blockState = 1;
                this.scratch.reset(0);
            }
            Track track = this.tracks.get(this.blockTrackNumber);
            if (track == null) {
                extractorInput2.skipFully(i5 - this.blockTrackNumberLength);
                this.blockState = 0;
                return;
            }
            track.assertOutputInitialized();
            if (this.blockState == 1) {
                readScratch(extractorInput2, 3);
                int i8 = (this.scratch.getData()[2] & 6) >> 1;
                byte b2 = 255;
                if (i8 == 0) {
                    this.blockSampleCount = 1;
                    int[] ensureArrayCapacity = ensureArrayCapacity(this.blockSampleSizes, 1);
                    this.blockSampleSizes = ensureArrayCapacity;
                    ensureArrayCapacity[0] = (i5 - this.blockTrackNumberLength) - 3;
                } else {
                    int i9 = 4;
                    readScratch(extractorInput2, 4);
                    int i10 = (this.scratch.getData()[3] & 255) + 1;
                    this.blockSampleCount = i10;
                    int[] ensureArrayCapacity2 = ensureArrayCapacity(this.blockSampleSizes, i10);
                    this.blockSampleSizes = ensureArrayCapacity2;
                    if (i8 == 2) {
                        int i11 = this.blockSampleCount;
                        Arrays.fill(ensureArrayCapacity2, 0, i11, ((i5 - this.blockTrackNumberLength) - 4) / i11);
                    } else if (i8 == 1) {
                        int i12 = 0;
                        int i13 = 0;
                        while (true) {
                            i3 = this.blockSampleCount;
                            if (i12 >= i3 - 1) {
                                break;
                            }
                            this.blockSampleSizes[i12] = 0;
                            do {
                                i9++;
                                readScratch(extractorInput2, i9);
                                b = this.scratch.getData()[i9 - 1] & 255;
                                iArr = this.blockSampleSizes;
                                iArr[i12] = iArr[i12] + b;
                            } while (b == 255);
                            i13 += iArr[i12];
                            i12++;
                        }
                        this.blockSampleSizes[i3 - 1] = ((i5 - this.blockTrackNumberLength) - i9) - i13;
                    } else if (i8 == 3) {
                        int i14 = 0;
                        int i15 = 0;
                        while (true) {
                            int i16 = this.blockSampleCount;
                            if (i14 >= i16 - 1) {
                                this.blockSampleSizes[i16 - 1] = ((i5 - this.blockTrackNumberLength) - i9) - i15;
                                break;
                            }
                            this.blockSampleSizes[i14] = i6;
                            i9++;
                            readScratch(extractorInput2, i9);
                            int i17 = i9 - 1;
                            if (this.scratch.getData()[i17] != 0) {
                                int i18 = 0;
                                while (true) {
                                    if (i18 >= 8) {
                                        j = 0;
                                        break;
                                    }
                                    int i19 = i7 << (7 - i18);
                                    if ((this.scratch.getData()[i17] & i19) != 0) {
                                        int i20 = i9 + i18;
                                        readScratch(extractorInput2, i20);
                                        long j3 = (long) (this.scratch.getData()[i17] & b2 & (i19 ^ -1));
                                        int i21 = i17 + 1;
                                        while (true) {
                                            j2 = j3;
                                            if (i21 >= i20) {
                                                break;
                                            }
                                            j3 = (j2 << 8) | ((long) (this.scratch.getData()[i21] & b2));
                                            i21++;
                                            i20 = i20;
                                            b2 = 255;
                                        }
                                        int i22 = i20;
                                        if (i14 > 0) {
                                            j2 -= (1 << ((i18 * 7) + 6)) - 1;
                                        }
                                        j = j2;
                                        i9 = i22;
                                    } else {
                                        i18++;
                                        i7 = 1;
                                        b2 = 255;
                                    }
                                }
                                if (j >= -2147483648L && j <= 2147483647L) {
                                    int i23 = (int) j;
                                    int[] iArr2 = this.blockSampleSizes;
                                    if (i14 != 0) {
                                        i23 += iArr2[i14 - 1];
                                    }
                                    iArr2[i14] = i23;
                                    i15 += iArr2[i14];
                                    i14++;
                                    i6 = 0;
                                    i7 = 1;
                                    b2 = 255;
                                }
                            } else {
                                throw new ParserException("No valid varint length mask found");
                            }
                        }
                        throw new ParserException("EBML lacing sample size out of range.");
                    } else {
                        StringBuilder sb = new StringBuilder(36);
                        sb.append("Unexpected lacing value: ");
                        sb.append(i8);
                        throw new ParserException(sb.toString());
                    }
                }
                this.blockTimeUs = this.clusterTimecodeUs + scaleTimecodeToUs((long) ((this.scratch.getData()[0] << 8) | (this.scratch.getData()[1] & 255)));
                this.blockFlags = (track.type == 2 || (i4 == ID_SIMPLE_BLOCK && (this.scratch.getData()[2] & C12425x3.f55111d) == 128)) ? 1 : 0;
                this.blockState = 2;
                this.blockSampleIndex = 0;
            }
            if (i4 == ID_SIMPLE_BLOCK) {
                while (true) {
                    int i24 = this.blockSampleIndex;
                    if (i24 < this.blockSampleCount) {
                        commitSampleToOutput(track, ((long) ((this.blockSampleIndex * track.defaultSampleDurationNs) / 1000)) + this.blockTimeUs, this.blockFlags, writeSampleData(extractorInput2, track, this.blockSampleSizes[i24]), 0);
                        this.blockSampleIndex++;
                    } else {
                        this.blockState = 0;
                        return;
                    }
                }
            } else {
                while (true) {
                    int i25 = this.blockSampleIndex;
                    if (i25 < this.blockSampleCount) {
                        int[] iArr3 = this.blockSampleSizes;
                        iArr3[i25] = writeSampleData(extractorInput2, track, iArr3[i25]);
                        this.blockSampleIndex++;
                    } else {
                        return;
                    }
                }
            }
        } else if (i4 != ID_BLOCK_ADDITIONAL) {
            if (i4 == ID_BLOCK_ADD_ID_EXTRA_DATA) {
                handleBlockAddIDExtraData(getCurrentTrack(i), extractorInput2, i5);
            } else if (i4 == ID_CONTENT_COMPRESSION_SETTINGS) {
                assertInTrackEntry(i);
                byte[] bArr = new byte[i5];
                this.currentTrack.sampleStrippedBytes = bArr;
                extractorInput2.readFully(bArr, 0, i5);
            } else if (i4 == ID_CONTENT_ENCRYPTION_KEY_ID) {
                byte[] bArr2 = new byte[i5];
                extractorInput2.readFully(bArr2, 0, i5);
                getCurrentTrack(i).cryptoData = new TrackOutput.CryptoData(1, bArr2, 0, 0);
            } else if (i4 == ID_SEEK_ID) {
                Arrays.fill(this.seekEntryIdBytes.getData(), (byte) 0);
                extractorInput2.readFully(this.seekEntryIdBytes.getData(), 4 - i5, i5);
                this.seekEntryIdBytes.setPosition(0);
                this.seekEntryId = (int) this.seekEntryIdBytes.readUnsignedInt();
            } else if (i4 == ID_CODEC_PRIVATE) {
                assertInTrackEntry(i);
                byte[] bArr3 = new byte[i5];
                this.currentTrack.codecPrivate = bArr3;
                extractorInput2.readFully(bArr3, 0, i5);
            } else if (i4 == ID_PROJECTION_PRIVATE) {
                assertInTrackEntry(i);
                byte[] bArr4 = new byte[i5];
                this.currentTrack.projectionData = bArr4;
                extractorInput2.readFully(bArr4, 0, i5);
            } else {
                StringBuilder sb2 = new StringBuilder(26);
                sb2.append("Unexpected id: ");
                sb2.append(i4);
                throw new ParserException(sb2.toString());
            }
        } else if (this.blockState == 2) {
            handleBlockAdditionalData(this.tracks.get(this.blockTrackNumber), this.blockAdditionalId, extractorInput2, i5);
        }
    }

    /* access modifiers changed from: protected */
    public void endMasterElement(int i) throws ParserException {
        assertInitialized();
        if (i != ID_BLOCK_GROUP) {
            if (i == ID_TRACK_ENTRY) {
                Track track = (Track) Assertions.checkStateNotNull(this.currentTrack);
                String str = track.codecId;
                if (str != null) {
                    if (isCodecSupported(str)) {
                        track.initializeOutput(this.extractorOutput, track.number);
                        this.tracks.put(track.number, track);
                    }
                    this.currentTrack = null;
                    return;
                }
                throw new ParserException("CodecId is missing in TrackEntry element");
            } else if (i == ID_SEEK) {
                int i2 = this.seekEntryId;
                if (i2 != -1) {
                    long j = this.seekEntryPosition;
                    if (j != -1) {
                        if (i2 == ID_CUES) {
                            this.cuesContentPosition = j;
                            return;
                        }
                        return;
                    }
                }
                throw new ParserException("Mandatory element SeekID or SeekPosition not found");
            } else if (i == ID_CONTENT_ENCODING) {
                assertInTrackEntry(i);
                Track track2 = this.currentTrack;
                if (!track2.hasContentEncryption) {
                    return;
                }
                if (track2.cryptoData != null) {
                    track2.drmInitData = new DrmInitData(new DrmInitData.SchemeData(C6540C.UUID_NIL, MimeTypes.VIDEO_WEBM, this.currentTrack.cryptoData.encryptionKey));
                    return;
                }
                throw new ParserException("Encrypted Track found but ContentEncKeyID was not found");
            } else if (i == ID_CONTENT_ENCODINGS) {
                assertInTrackEntry(i);
                Track track3 = this.currentTrack;
                if (track3.hasContentEncryption && track3.sampleStrippedBytes != null) {
                    throw new ParserException("Combining encryption and compression is not supported");
                }
            } else if (i == 357149030) {
                if (this.timecodeScale == C6540C.TIME_UNSET) {
                    this.timecodeScale = 1000000;
                }
                long j2 = this.durationTimecode;
                if (j2 != C6540C.TIME_UNSET) {
                    this.durationUs = scaleTimecodeToUs(j2);
                }
            } else if (i != ID_TRACKS) {
                if (i == ID_CUES) {
                    if (!this.sentSeekMap) {
                        this.extractorOutput.seekMap(buildSeekMap(this.cueTimesUs, this.cueClusterPositions));
                        this.sentSeekMap = true;
                    }
                    this.cueTimesUs = null;
                    this.cueClusterPositions = null;
                }
            } else if (this.tracks.size() != 0) {
                this.extractorOutput.endTracks();
            } else {
                throw new ParserException("No valid tracks were found");
            }
        } else if (this.blockState == 2) {
            int i3 = 0;
            for (int i4 = 0; i4 < this.blockSampleCount; i4++) {
                i3 += this.blockSampleSizes[i4];
            }
            Track track4 = this.tracks.get(this.blockTrackNumber);
            track4.assertOutputInitialized();
            for (int i5 = 0; i5 < this.blockSampleCount; i5++) {
                long j3 = ((long) ((track4.defaultSampleDurationNs * i5) / 1000)) + this.blockTimeUs;
                int i6 = this.blockFlags;
                if (i5 == 0 && !this.blockHasReferenceBlock) {
                    i6 |= 1;
                }
                int i7 = this.blockSampleSizes[i5];
                i3 -= i7;
                commitSampleToOutput(track4, j3, i6, i7, i3);
            }
            this.blockState = 0;
        }
    }

    /* access modifiers changed from: protected */
    public void floatElement(int i, double d) throws ParserException {
        if (i == ID_SAMPLING_FREQUENCY) {
            getCurrentTrack(i).sampleRate = (int) d;
        } else if (i != ID_DURATION) {
            switch (i) {
                case ID_PRIMARY_R_CHROMATICITY_X /*21969*/:
                    getCurrentTrack(i).primaryRChromaticityX = (float) d;
                    return;
                case ID_PRIMARY_R_CHROMATICITY_Y /*21970*/:
                    getCurrentTrack(i).primaryRChromaticityY = (float) d;
                    return;
                case ID_PRIMARY_G_CHROMATICITY_X /*21971*/:
                    getCurrentTrack(i).primaryGChromaticityX = (float) d;
                    return;
                case ID_PRIMARY_G_CHROMATICITY_Y /*21972*/:
                    getCurrentTrack(i).primaryGChromaticityY = (float) d;
                    return;
                case ID_PRIMARY_B_CHROMATICITY_X /*21973*/:
                    getCurrentTrack(i).primaryBChromaticityX = (float) d;
                    return;
                case ID_PRIMARY_B_CHROMATICITY_Y /*21974*/:
                    getCurrentTrack(i).primaryBChromaticityY = (float) d;
                    return;
                case ID_WHITE_POINT_CHROMATICITY_X /*21975*/:
                    getCurrentTrack(i).whitePointChromaticityX = (float) d;
                    return;
                case ID_WHITE_POINT_CHROMATICITY_Y /*21976*/:
                    getCurrentTrack(i).whitePointChromaticityY = (float) d;
                    return;
                case ID_LUMNINANCE_MAX /*21977*/:
                    getCurrentTrack(i).maxMasteringLuminance = (float) d;
                    return;
                case ID_LUMNINANCE_MIN /*21978*/:
                    getCurrentTrack(i).minMasteringLuminance = (float) d;
                    return;
                default:
                    switch (i) {
                        case ID_PROJECTION_POSE_YAW /*30323*/:
                            getCurrentTrack(i).projectionPoseYaw = (float) d;
                            return;
                        case ID_PROJECTION_POSE_PITCH /*30324*/:
                            getCurrentTrack(i).projectionPosePitch = (float) d;
                            return;
                        case ID_PROJECTION_POSE_ROLL /*30325*/:
                            getCurrentTrack(i).projectionPoseRoll = (float) d;
                            return;
                        default:
                            return;
                    }
            }
        } else {
            this.durationTimecode = (long) d;
        }
    }

    /* access modifiers changed from: protected */
    public int getElementType(int i) {
        switch (i) {
            case ID_TRACK_TYPE /*131*/:
            case ID_FLAG_DEFAULT /*136*/:
            case ID_BLOCK_DURATION /*155*/:
            case ID_CHANNELS /*159*/:
            case ID_PIXEL_WIDTH /*176*/:
            case ID_CUE_TIME /*179*/:
            case ID_PIXEL_HEIGHT /*186*/:
            case ID_TRACK_NUMBER /*215*/:
            case ID_TIME_CODE /*231*/:
            case ID_BLOCK_ADD_ID /*238*/:
            case ID_CUE_CLUSTER_POSITION /*241*/:
            case ID_REFERENCE_BLOCK /*251*/:
            case ID_BLOCK_ADD_ID_TYPE /*16871*/:
            case ID_CONTENT_COMPRESSION_ALGORITHM /*16980*/:
            case ID_DOC_TYPE_READ_VERSION /*17029*/:
            case ID_EBML_READ_VERSION /*17143*/:
            case ID_CONTENT_ENCRYPTION_ALGORITHM /*18401*/:
            case ID_CONTENT_ENCRYPTION_AES_SETTINGS_CIPHER_MODE /*18408*/:
            case ID_CONTENT_ENCODING_ORDER /*20529*/:
            case ID_CONTENT_ENCODING_SCOPE /*20530*/:
            case ID_SEEK_POSITION /*21420*/:
            case ID_STEREO_MODE /*21432*/:
            case ID_DISPLAY_WIDTH /*21680*/:
            case ID_DISPLAY_UNIT /*21682*/:
            case ID_DISPLAY_HEIGHT /*21690*/:
            case ID_FLAG_FORCED /*21930*/:
            case ID_COLOUR_RANGE /*21945*/:
            case ID_COLOUR_TRANSFER /*21946*/:
            case ID_COLOUR_PRIMARIES /*21947*/:
            case ID_MAX_CLL /*21948*/:
            case ID_MAX_FALL /*21949*/:
            case ID_MAX_BLOCK_ADDITION_ID /*21998*/:
            case ID_CODEC_DELAY /*22186*/:
            case ID_SEEK_PRE_ROLL /*22203*/:
            case ID_AUDIO_BIT_DEPTH /*25188*/:
            case ID_PROJECTION_TYPE /*30321*/:
            case ID_DEFAULT_DURATION /*2352003*/:
            case ID_TIMECODE_SCALE /*2807729*/:
                return 2;
            case 134:
            case ID_DOC_TYPE /*17026*/:
            case ID_NAME /*21358*/:
            case ID_LANGUAGE /*2274716*/:
                return 3;
            case ID_BLOCK_GROUP /*160*/:
            case ID_BLOCK_MORE /*166*/:
            case ID_TRACK_ENTRY /*174*/:
            case ID_CUE_TRACK_POSITIONS /*183*/:
            case ID_CUE_POINT /*187*/:
            case 224:
            case ID_AUDIO /*225*/:
            case ID_BLOCK_ADDITION_MAPPING /*16868*/:
            case ID_CONTENT_ENCRYPTION_AES_SETTINGS /*18407*/:
            case ID_SEEK /*19899*/:
            case ID_CONTENT_COMPRESSION /*20532*/:
            case ID_CONTENT_ENCRYPTION /*20533*/:
            case ID_COLOUR /*21936*/:
            case ID_MASTERING_METADATA /*21968*/:
            case ID_CONTENT_ENCODING /*25152*/:
            case ID_CONTENT_ENCODINGS /*28032*/:
            case ID_BLOCK_ADDITIONS /*30113*/:
            case ID_PROJECTION /*30320*/:
            case ID_SEEK_HEAD /*290298740*/:
            case 357149030:
            case ID_TRACKS /*374648427*/:
            case ID_SEGMENT /*408125543*/:
            case ID_EBML /*440786851*/:
            case ID_CUES /*475249515*/:
            case ID_CLUSTER /*524531317*/:
                return 1;
            case ID_BLOCK /*161*/:
            case ID_SIMPLE_BLOCK /*163*/:
            case ID_BLOCK_ADDITIONAL /*165*/:
            case ID_BLOCK_ADD_ID_EXTRA_DATA /*16877*/:
            case ID_CONTENT_COMPRESSION_SETTINGS /*16981*/:
            case ID_CONTENT_ENCRYPTION_KEY_ID /*18402*/:
            case ID_SEEK_ID /*21419*/:
            case ID_CODEC_PRIVATE /*25506*/:
            case ID_PROJECTION_PRIVATE /*30322*/:
                return 4;
            case ID_SAMPLING_FREQUENCY /*181*/:
            case ID_DURATION /*17545*/:
            case ID_PRIMARY_R_CHROMATICITY_X /*21969*/:
            case ID_PRIMARY_R_CHROMATICITY_Y /*21970*/:
            case ID_PRIMARY_G_CHROMATICITY_X /*21971*/:
            case ID_PRIMARY_G_CHROMATICITY_Y /*21972*/:
            case ID_PRIMARY_B_CHROMATICITY_X /*21973*/:
            case ID_PRIMARY_B_CHROMATICITY_Y /*21974*/:
            case ID_WHITE_POINT_CHROMATICITY_X /*21975*/:
            case ID_WHITE_POINT_CHROMATICITY_Y /*21976*/:
            case ID_LUMNINANCE_MAX /*21977*/:
            case ID_LUMNINANCE_MIN /*21978*/:
            case ID_PROJECTION_POSE_YAW /*30323*/:
            case ID_PROJECTION_POSE_PITCH /*30324*/:
            case ID_PROJECTION_POSE_ROLL /*30325*/:
                return 5;
            default:
                return 0;
        }
    }

    /* access modifiers changed from: protected */
    public void handleBlockAddIDExtraData(Track track, ExtractorInput extractorInput, int i) throws IOException {
        if (track.blockAddIdType == 1685485123 || track.blockAddIdType == 1685480259) {
            byte[] bArr = new byte[i];
            track.dolbyVisionConfigBytes = bArr;
            extractorInput.readFully(bArr, 0, i);
            return;
        }
        extractorInput.skipFully(i);
    }

    /* access modifiers changed from: protected */
    public void handleBlockAdditionalData(Track track, int i, ExtractorInput extractorInput, int i2) throws IOException {
        if (i != 4 || !CODEC_ID_VP9.equals(track.codecId)) {
            extractorInput.skipFully(i2);
            return;
        }
        this.blockAdditionalData.reset(i2);
        extractorInput.readFully(this.blockAdditionalData.getData(), 0, i2);
    }

    public final void init(ExtractorOutput extractorOutput2) {
        this.extractorOutput = extractorOutput2;
    }

    /* access modifiers changed from: protected */
    public void integerElement(int i, long j) throws ParserException {
        if (i != ID_CONTENT_ENCODING_ORDER) {
            if (i != ID_CONTENT_ENCODING_SCOPE) {
                boolean z = false;
                switch (i) {
                    case ID_TRACK_TYPE /*131*/:
                        getCurrentTrack(i).type = (int) j;
                        return;
                    case ID_FLAG_DEFAULT /*136*/:
                        Track currentTrack2 = getCurrentTrack(i);
                        if (j == 1) {
                            z = true;
                        }
                        currentTrack2.flagDefault = z;
                        return;
                    case ID_BLOCK_DURATION /*155*/:
                        this.blockDurationUs = scaleTimecodeToUs(j);
                        return;
                    case ID_CHANNELS /*159*/:
                        getCurrentTrack(i).channelCount = (int) j;
                        return;
                    case ID_PIXEL_WIDTH /*176*/:
                        getCurrentTrack(i).width = (int) j;
                        return;
                    case ID_CUE_TIME /*179*/:
                        assertInCues(i);
                        this.cueTimesUs.add(scaleTimecodeToUs(j));
                        return;
                    case ID_PIXEL_HEIGHT /*186*/:
                        getCurrentTrack(i).height = (int) j;
                        return;
                    case ID_TRACK_NUMBER /*215*/:
                        getCurrentTrack(i).number = (int) j;
                        return;
                    case ID_TIME_CODE /*231*/:
                        this.clusterTimecodeUs = scaleTimecodeToUs(j);
                        return;
                    case ID_BLOCK_ADD_ID /*238*/:
                        this.blockAdditionalId = (int) j;
                        return;
                    case ID_CUE_CLUSTER_POSITION /*241*/:
                        if (!this.seenClusterPositionForCurrentCuePoint) {
                            assertInCues(i);
                            this.cueClusterPositions.add(j);
                            this.seenClusterPositionForCurrentCuePoint = true;
                            return;
                        }
                        return;
                    case ID_REFERENCE_BLOCK /*251*/:
                        this.blockHasReferenceBlock = true;
                        return;
                    case ID_BLOCK_ADD_ID_TYPE /*16871*/:
                        int unused = getCurrentTrack(i).blockAddIdType = (int) j;
                        return;
                    case ID_CONTENT_COMPRESSION_ALGORITHM /*16980*/:
                        if (j != 3) {
                            StringBuilder sb = new StringBuilder(50);
                            sb.append("ContentCompAlgo ");
                            sb.append(j);
                            sb.append(" not supported");
                            throw new ParserException(sb.toString());
                        }
                        return;
                    case ID_DOC_TYPE_READ_VERSION /*17029*/:
                        if (j < 1 || j > 2) {
                            StringBuilder sb2 = new StringBuilder(53);
                            sb2.append("DocTypeReadVersion ");
                            sb2.append(j);
                            sb2.append(" not supported");
                            throw new ParserException(sb2.toString());
                        }
                        return;
                    case ID_EBML_READ_VERSION /*17143*/:
                        if (j != 1) {
                            StringBuilder sb3 = new StringBuilder(50);
                            sb3.append("EBMLReadVersion ");
                            sb3.append(j);
                            sb3.append(" not supported");
                            throw new ParserException(sb3.toString());
                        }
                        return;
                    case ID_CONTENT_ENCRYPTION_ALGORITHM /*18401*/:
                        if (j != 5) {
                            StringBuilder sb4 = new StringBuilder(49);
                            sb4.append("ContentEncAlgo ");
                            sb4.append(j);
                            sb4.append(" not supported");
                            throw new ParserException(sb4.toString());
                        }
                        return;
                    case ID_CONTENT_ENCRYPTION_AES_SETTINGS_CIPHER_MODE /*18408*/:
                        if (j != 1) {
                            StringBuilder sb5 = new StringBuilder(56);
                            sb5.append("AESSettingsCipherMode ");
                            sb5.append(j);
                            sb5.append(" not supported");
                            throw new ParserException(sb5.toString());
                        }
                        return;
                    case ID_SEEK_POSITION /*21420*/:
                        this.seekEntryPosition = j + this.segmentContentPosition;
                        return;
                    case ID_STEREO_MODE /*21432*/:
                        int i2 = (int) j;
                        assertInTrackEntry(i);
                        if (i2 == 0) {
                            this.currentTrack.stereoMode = 0;
                            return;
                        } else if (i2 == 1) {
                            this.currentTrack.stereoMode = 2;
                            return;
                        } else if (i2 == 3) {
                            this.currentTrack.stereoMode = 1;
                            return;
                        } else if (i2 == 15) {
                            this.currentTrack.stereoMode = 3;
                            return;
                        } else {
                            return;
                        }
                    case ID_DISPLAY_WIDTH /*21680*/:
                        getCurrentTrack(i).displayWidth = (int) j;
                        return;
                    case ID_DISPLAY_UNIT /*21682*/:
                        getCurrentTrack(i).displayUnit = (int) j;
                        return;
                    case ID_DISPLAY_HEIGHT /*21690*/:
                        getCurrentTrack(i).displayHeight = (int) j;
                        return;
                    case ID_FLAG_FORCED /*21930*/:
                        Track currentTrack3 = getCurrentTrack(i);
                        if (j == 1) {
                            z = true;
                        }
                        currentTrack3.flagForced = z;
                        return;
                    case ID_MAX_BLOCK_ADDITION_ID /*21998*/:
                        getCurrentTrack(i).maxBlockAdditionId = (int) j;
                        return;
                    case ID_CODEC_DELAY /*22186*/:
                        getCurrentTrack(i).codecDelayNs = j;
                        return;
                    case ID_SEEK_PRE_ROLL /*22203*/:
                        getCurrentTrack(i).seekPreRollNs = j;
                        return;
                    case ID_AUDIO_BIT_DEPTH /*25188*/:
                        getCurrentTrack(i).audioBitDepth = (int) j;
                        return;
                    case ID_PROJECTION_TYPE /*30321*/:
                        assertInTrackEntry(i);
                        int i3 = (int) j;
                        if (i3 == 0) {
                            this.currentTrack.projectionType = 0;
                            return;
                        } else if (i3 == 1) {
                            this.currentTrack.projectionType = 1;
                            return;
                        } else if (i3 == 2) {
                            this.currentTrack.projectionType = 2;
                            return;
                        } else if (i3 == 3) {
                            this.currentTrack.projectionType = 3;
                            return;
                        } else {
                            return;
                        }
                    case ID_DEFAULT_DURATION /*2352003*/:
                        getCurrentTrack(i).defaultSampleDurationNs = (int) j;
                        return;
                    case ID_TIMECODE_SCALE /*2807729*/:
                        this.timecodeScale = j;
                        return;
                    default:
                        switch (i) {
                            case ID_COLOUR_RANGE /*21945*/:
                                assertInTrackEntry(i);
                                int i4 = (int) j;
                                if (i4 == 1) {
                                    this.currentTrack.colorRange = 2;
                                    return;
                                } else if (i4 == 2) {
                                    this.currentTrack.colorRange = 1;
                                    return;
                                } else {
                                    return;
                                }
                            case ID_COLOUR_TRANSFER /*21946*/:
                                assertInTrackEntry(i);
                                int i5 = (int) j;
                                if (i5 != 1) {
                                    if (i5 == 16) {
                                        this.currentTrack.colorTransfer = 6;
                                        return;
                                    } else if (i5 == 18) {
                                        this.currentTrack.colorTransfer = 7;
                                        return;
                                    } else if (!(i5 == 6 || i5 == 7)) {
                                        return;
                                    }
                                }
                                this.currentTrack.colorTransfer = 3;
                                return;
                            case ID_COLOUR_PRIMARIES /*21947*/:
                                assertInTrackEntry(i);
                                Track track = this.currentTrack;
                                track.hasColorInfo = true;
                                int i6 = (int) j;
                                if (i6 == 1) {
                                    track.colorSpace = 1;
                                    return;
                                } else if (i6 == 9) {
                                    track.colorSpace = 6;
                                    return;
                                } else if (i6 == 4 || i6 == 5 || i6 == 6 || i6 == 7) {
                                    track.colorSpace = 2;
                                    return;
                                } else {
                                    return;
                                }
                            case ID_MAX_CLL /*21948*/:
                                getCurrentTrack(i).maxContentLuminance = (int) j;
                                return;
                            case ID_MAX_FALL /*21949*/:
                                getCurrentTrack(i).maxFrameAverageLuminance = (int) j;
                                return;
                            default:
                                return;
                        }
                }
            } else if (j != 1) {
                StringBuilder sb6 = new StringBuilder(55);
                sb6.append("ContentEncodingScope ");
                sb6.append(j);
                sb6.append(" not supported");
                throw new ParserException(sb6.toString());
            }
        } else if (j != 0) {
            StringBuilder sb7 = new StringBuilder(55);
            sb7.append("ContentEncodingOrder ");
            sb7.append(j);
            sb7.append(" not supported");
            throw new ParserException(sb7.toString());
        }
    }

    /* access modifiers changed from: protected */
    public boolean isLevel1Element(int i) {
        return i == 357149030 || i == ID_CLUSTER || i == ID_CUES || i == ID_TRACKS;
    }

    public final int read(ExtractorInput extractorInput, PositionHolder positionHolder) throws IOException {
        this.haveOutputSample = false;
        boolean z = true;
        while (z && !this.haveOutputSample) {
            z = this.reader.read(extractorInput);
            if (z && maybeSeekForCues(positionHolder, extractorInput.getPosition())) {
                return 1;
            }
        }
        if (z) {
            return 0;
        }
        for (int i = 0; i < this.tracks.size(); i++) {
            Track valueAt = this.tracks.valueAt(i);
            valueAt.assertOutputInitialized();
            valueAt.outputPendingSampleMetadata();
        }
        return -1;
    }

    public final void release() {
    }

    public void seek(long j, long j2) {
        this.clusterTimecodeUs = C6540C.TIME_UNSET;
        this.blockState = 0;
        this.reader.reset();
        this.varintReader.reset();
        resetWriteSampleData();
        for (int i = 0; i < this.tracks.size(); i++) {
            this.tracks.valueAt(i).reset();
        }
    }

    public final boolean sniff(ExtractorInput extractorInput) throws IOException {
        return new Sniffer().sniff(extractorInput);
    }

    /* access modifiers changed from: protected */
    public void startMasterElement(int i, long j, long j2) throws ParserException {
        assertInitialized();
        if (i == ID_BLOCK_GROUP) {
            this.blockHasReferenceBlock = false;
        } else if (i == ID_TRACK_ENTRY) {
            this.currentTrack = new Track();
        } else if (i == ID_CUE_POINT) {
            this.seenClusterPositionForCurrentCuePoint = false;
        } else if (i == ID_SEEK) {
            this.seekEntryId = -1;
            this.seekEntryPosition = -1;
        } else if (i == ID_CONTENT_ENCRYPTION) {
            getCurrentTrack(i).hasContentEncryption = true;
        } else if (i == ID_MASTERING_METADATA) {
            getCurrentTrack(i).hasColorInfo = true;
        } else if (i == ID_SEGMENT) {
            long j3 = this.segmentContentPosition;
            if (j3 == -1 || j3 == j) {
                this.segmentContentPosition = j;
                this.segmentContentSize = j2;
                return;
            }
            throw new ParserException("Multiple Segment elements not supported");
        } else if (i == ID_CUES) {
            this.cueTimesUs = new LongArray();
            this.cueClusterPositions = new LongArray();
        } else if (i != ID_CLUSTER || this.sentSeekMap) {
        } else {
            if (!this.seekForCuesEnabled || this.cuesContentPosition == -1) {
                this.extractorOutput.seekMap(new SeekMap.Unseekable(this.durationUs));
                this.sentSeekMap = true;
                return;
            }
            this.seekForCues = true;
        }
    }

    /* access modifiers changed from: protected */
    public void stringElement(int i, String str) throws ParserException {
        if (i == 134) {
            getCurrentTrack(i).codecId = str;
        } else if (i != ID_DOC_TYPE) {
            if (i == ID_NAME) {
                getCurrentTrack(i).name = str;
            } else if (i == ID_LANGUAGE) {
                String unused = getCurrentTrack(i).language = str;
            }
        } else if (!DOC_TYPE_WEBM.equals(str) && !DOC_TYPE_MATROSKA.equals(str)) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 22);
            sb.append("DocType ");
            sb.append(str);
            sb.append(" not supported");
            throw new ParserException(sb.toString());
        }
    }

    public MatroskaExtractor(int i) {
        this(new DefaultEbmlReader(), i);
    }

    MatroskaExtractor(EbmlReader ebmlReader, int i) {
        this.segmentContentPosition = -1;
        this.timecodeScale = C6540C.TIME_UNSET;
        this.durationTimecode = C6540C.TIME_UNSET;
        this.durationUs = C6540C.TIME_UNSET;
        this.cuesContentPosition = -1;
        this.seekPositionAfterBuildingCues = -1;
        this.clusterTimecodeUs = C6540C.TIME_UNSET;
        this.reader = ebmlReader;
        ebmlReader.init(new InnerEbmlProcessor());
        this.seekForCuesEnabled = (i & 1) == 0;
        this.varintReader = new VarintReader();
        this.tracks = new SparseArray<>();
        this.scratch = new ParsableByteArray(4);
        this.vorbisNumPageSamples = new ParsableByteArray(ByteBuffer.allocate(4).putInt(-1).array());
        this.seekEntryIdBytes = new ParsableByteArray(4);
        this.nalStartCode = new ParsableByteArray(NalUnitUtil.NAL_START_CODE);
        this.nalLength = new ParsableByteArray(4);
        this.sampleStrippedBytes = new ParsableByteArray();
        this.subtitleSample = new ParsableByteArray();
        this.encryptionInitializationVector = new ParsableByteArray(8);
        this.encryptionSubsampleData = new ParsableByteArray();
        this.blockAdditionalData = new ParsableByteArray();
        this.blockSampleSizes = new int[1];
    }
}
