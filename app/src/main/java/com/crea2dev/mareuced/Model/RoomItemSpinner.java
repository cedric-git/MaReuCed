package com.crea2dev.mareuced.Model;


import com.crea2dev.mareuced.utils.DateItemSpinnerUtil;

public class RoomItemSpinner {

    private String roomName;
    private String meetingDate;////    //  <<<<<
    private int roomImage;

    public RoomItemSpinner(String roomName) {
        this.roomName = roomName;
//        this.roomImage = roomImage;
    }

//    public DateItemSpinnerUtil(String meetingDate) {
//        this.meetingDate = meetingDate;
////        this.roomImage = roomImage;
//    }

    public String getRoomName() {
        return roomName;
    }

//    public int getRoomImage() {
//        return roomImage;
//    }

}