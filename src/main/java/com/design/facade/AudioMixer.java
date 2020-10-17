package com.design.facade;

import com.design.facade.some_complex_media_library.VideoFile;

import java.io.File;

public class AudioMixer {
    public File fix(VideoFile result) {
        System.out.println("AudioMixer: fixing audio...");
        return new File("tmp");
    }
}
