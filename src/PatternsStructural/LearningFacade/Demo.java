package PatternsStructural.LearningFacade;

import PatternsStructural.LearningFacade.facade.VideoConversionFacade;

import java.io.File;

public class Demo {
    public static void main(String[] args) {
        VideoConversionFacade conversionFacade = new VideoConversionFacade();
        File mp4Video = conversionFacade.convertVideo("youtubevideo.ogg","mp4");
    }
}
