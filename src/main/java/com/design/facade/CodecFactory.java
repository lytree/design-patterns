package com.design.facade;

import com.design.facade.compression_codec.MPEG4CompressionCodec;
import com.design.facade.compression_codec.OggCompressionCodec;
import com.design.facade.some_complex_media_library.Codec;
import com.design.facade.some_complex_media_library.VideoFile;

public class CodecFactory {
    public static Codec extract(VideoFile file) {
        String type = file.getCodecType();
        if (type.equals("mp4")) {
            System.out.println("CodecFactory: extracting mpeg audio...");
            return new MPEG4CompressionCodec();
        }
        else {
            System.out.println("CodecFactory: extracting ogg audio...");
            return new OggCompressionCodec();
        }
    }
}
