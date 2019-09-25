package com.crea2dev.mareuced.Views;


import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.crea2dev.mareuced.Model.MeetingModel;
import com.crea2dev.mareuced.Service.MeetingApiService;
import com.crea2dev.mareuced.Service.Injection;

import com.crea2dev.mareuced.R;
import com.crea2dev.mareuced.repositories.MeetingRepository;
import com.crea2dev.mareuced.utils.SortMeetings;

import java.util.function.ToDoubleBiFunction;

import butterknife.ButterKnife;
import butterknife.BindView;

import static com.crea2dev.mareuced.utils.SortMeetings.SortMethods.DATE_ORDER;
import static com.crea2dev.mareuced.utils.SortMeetings.SortMethods.NAME_ORDER;

public class MeetingViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

    private MeetingRepository mMeetingRepository;

    @BindView(R.id.nameInput) TextView mName;
    @BindView(R.id.hourInput) TextView mHour;
    @BindView(R.id.placeInput) TextView mPlace;
    @BindView(R.id.emailsInput) TextView mMail;
    @BindView(R.id.item_list_delete_button) ImageButton mDeleteButton;

    private MeetingModel mmeeting;
    private MeetingApiService meetingApiService;

    //Idem pour autres data

    public MeetingViewHolder(View itemView) {


        super(itemView);
        ButterKnife.bind(this, itemView);

        //TODO : FAIRE onclick listener pout gerer le delete

        mDeleteButton.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
//
//                deleteMeeting();
//                        meetingApiService.deleteMeeting();
//                mDeleteButton.setOnClickListener(w -> finish());

            }
        });

//        public void setSortingOrder(SortMeetings.SortMethods sortingOrder) {
//
//            switch (sortingOrder){
//                case DATE_ORDER:
//                    mMeetings.setValue(SortMeetings.dateOrder(mMeetingRepository.getMeetings()));
//                    break;
//                case NAME_ORDER:
//                    mMeetings.setValue(SortMeetings.nameOrder(mMeetingRepository.getMeetings()));
//                    break;
//
//            }
//        }

    }

    public void updateWithMeeting(MeetingModel meeting){
        this.mName.setText(meeting.getName());
        this.mHour.setText(meeting.getHour());
        this.mPlace.setText(meeting.getPlace());
        this.mMail.setText(meeting.getMails());
    }

    @Override
    public void onClick(View view) {
//        ????????????????
    }



}