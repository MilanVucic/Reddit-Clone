package com.vucic.redditclone.repository.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class RedditPost {
    @JsonProperty("subreddit")
    private String subreddit;
    @JsonProperty("title")
    private String title;
    @JsonProperty("ups")
    private int upVotes;
    @JsonProperty("downs")
    private int downVotes;
    @JsonProperty("thumbnail")
    private String thumbnailUrl;
    @JsonProperty("author")
    private String author;
    @JsonProperty("is_video")
    private boolean isVideo;
    @JsonProperty("permalink")
    private String permalink;

    public String getSubreddit() {
        return subreddit;
    }

    public void setSubreddit(String subreddit) {
        this.subreddit = subreddit;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getUpVotes() {
        return upVotes;
    }

    public void setUpVotes(int upVotes) {
        this.upVotes = upVotes;
    }

    public int getDownVotes() {
        return downVotes;
    }

    public void setDownVotes(int downVotes) {
        this.downVotes = downVotes;
    }

    public String getThumbnailUrl() {
        return thumbnailUrl;
    }

    public void setThumbnailUrl(String thumbnailUrl) {
        this.thumbnailUrl = thumbnailUrl;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public boolean isVideo() {
        return isVideo;
    }

    public void setVideo(boolean video) {
        isVideo = video;
    }

    public String getPermalink() {
        return permalink;
    }
}
