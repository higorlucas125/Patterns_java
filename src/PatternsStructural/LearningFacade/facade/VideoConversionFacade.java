package PatternsStructural.LearningFacade.facade;

import PatternsStructural.LearningFacade.some_complex_media_library.*;

import java.io.File;

public class VideoConversionFacade {
    public File convertVideo(String fileName, String format){
        System.out.println("VideoConversionFacade: conversion started.");
        VideoFile file = new VideoFile(fileName);
        Codec sourceCodec = CodeFactory.extract(file);
        Codec destinatnionCodec;

        if(format.equals("mp4")){
            destinatnionCodec = new MPEG4CompressionCodec();
        }else {
            destinatnionCodec = new OggCompressionCodec();
        }

        VideoFile buffer = BitrateReader.read(file,sourceCodec);
        VideoFile intermediateResult = BitrateReader.convert(buffer,destinatnionCodec);
        File result = (new AudioMixer()).fix(intermediateResult);
        System.out.println("ideoConversionFacade: conversion completed.");

        return result;
    }
}
