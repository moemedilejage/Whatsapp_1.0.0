package com.imegga.whatsappdemo;

public class Chat {
    private int profileImage;
    private String fullNames;
    private String timeStamp;
    private String lastChat;
    private boolean isSentByUser;

    private String profilePictureUrl;


    public Chat(int profileImage, String fullNames, String timeStamp, String lastChat){
        this.profileImage = profileImage;
        this.fullNames = fullNames;
        this.timeStamp = timeStamp;
        this.lastChat = lastChat;
    }


    public int getProfileImage(){
        return profileImage;
    }

    public boolean isSentByUser() {
        return isSentByUser;
    }

    public String getFullNames() {
        return fullNames;
    }

    public void setFullNames(String fullNames) {
        this.fullNames = fullNames;
    }

    public String getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(String timeStamp) {
        this.timeStamp = timeStamp;
    }

    public String getLastChat() {
        return lastChat;
    }

    public void setLastChat(String lastChat) {
        this.lastChat = lastChat;
    }
}

