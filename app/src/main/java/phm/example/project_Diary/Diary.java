package phm.example.project_Diary;

import java.io.Serializable;

public class Diary implements Serializable {
    private String id;
    private String username;
    private String imageURL;
    private String title;
    private String timestamp;
    private String mainText;
    private String postId;

    public Diary(String id, String username, String imageURL, String timestamp, String title, String mainText, String postId) {
        this.id = id;
        this.username = username;
        this.imageURL = imageURL;
        this.timestamp= timestamp;
        this.title = title;
        this.mainText = mainText;
        this.postId = postId;
    }
    public Diary(){

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getImageURL() {
        return imageURL;
    }

    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getMainText() {
        return mainText;
    }

    public void setMainText(String mainText) {
        this.mainText = mainText;
    }

    public String getpostId() {
        return postId;
    }

    public void setpostId(String postId) {
        this.postId = postId;
    }

}
