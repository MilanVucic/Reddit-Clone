package com.vucic.redditclone.callbacks;

public interface GeneralCallback<T> {
    void onSuccess(T homePageResponse);

    void onFailure(String message);
}
