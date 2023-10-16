public class Test2 {
    public static void main(String[] args) {
        
        Gallery gallery = new Gallery();
        Video rawVideo1 = gallery.extractFile(100);
        Audio audioFile1 = new Audio(0.2f, 111, ".mp3");
        Image Image1 = new Image(0.2f, 122, ".mp3");
        VideoEditor editor = new VideoEditor(rawVideo1);
        editor.processVideo(rawVideo1, audioFile1, Image1);
    }
}

class Gallery extends Software{

    Video rawVideo1 = new Video(3.5f, 100, ".mp4");
    // Video rawVideo2 = new Video(1.7f, 500, ".mkv");

    Video extractFile(int id){
        return rawVideo1;
    }
}

class File {
    float sizeInGB;
    int id;
    String extention;

    public File(float sizeInGB, int id, String extention) {
        this.sizeInGB = sizeInGB;
        this.id = id;
        this.extention = extention;
    }

    public float getSizeInGB() {
        return sizeInGB;
    }

    public void setSizeInGB(float sizeInGB) {
        this.sizeInGB = sizeInGB;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getExtention() {
        return extention;
    }

    public void setExtention(String extention) {
        this.extention = extention;
    }

}

class Video extends File {

    public Video(float sizeInGB, int id, String extention) {
        super(sizeInGB, id, extention);

    }

    public Video(int id) {
        super(0, id, "");
    }

}

class Audio extends File {

    public Audio(float sizeInGB, int id, String extention) {
        super(sizeInGB, id, extention);

    }

}

class Image extends File {

    public Image(float sizeInGB, int id, String extention) {
        super(sizeInGB, id, extention);

    }

}

class Software {
    float sizeInGB;
    String name;
    String publisher;
}

class VideoEditor extends Software {

    public VideoEditor(Video outputVideo) {
        this.outputVideo = outputVideo;
    }

    Video outputVideo;

    Video processVideo(Video rawVideo, Audio audioFiles, Image imageFiles) {
        System.out.println("Video: " + rawVideo.id + " is edited!! using Audio files: " + audioFiles.id
                + " & Image files:" + imageFiles.id);
        return outputVideo;
    }
}