package com.uniqueteamseven.videodownloader.interfaces;


import com.uniqueteamseven.videodownloader.model.FBStoryModel.NodeModel;
import com.uniqueteamseven.videodownloader.model.story.TrayModel;

public interface UserListInterface {
    void userListClick(int position, TrayModel trayModel);
    void fbUserListClick(int position, NodeModel trayModel);
}
