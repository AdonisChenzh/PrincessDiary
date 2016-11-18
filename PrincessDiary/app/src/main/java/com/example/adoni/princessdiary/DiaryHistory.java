package com.example.adoni.princessdiary;

import android.content.Intent;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CalendarView;
import android.widget.DatePicker;
import android.widget.ImageView;
import android.widget.SearchView;
import android.widget.TextView;
import android.widget.Toast;

public class DiaryHistory extends AppCompatActivity {

    // Widgets names
    private ImageView MessageList;
    private ImageView Location;
    private SearchView SearchDiary;
    private ImageView Icon;
    private TextView Name;
    private DatePicker ShowMonth;
    private CalendarView Date;
    private ImageView ButtonDiary;
    private ImageView ButtonSocial;
    private ImageView ButtonAddDiary;
    private ImageView ButtonContacts;
    private ImageView ButtonAccount;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diary_history);

        //name all the widgets
        MessageList = (ImageView) findViewById(R.id.diary_message);
        Location = (ImageView) findViewById(R.id.diary_location);
        SearchDiary = (SearchView) findViewById(R.id.diary_search);
        Icon = (ImageView) findViewById(R.id.diary_icon);
        Name = (TextView) findViewById(R.id.diary_Username);
        ShowMonth = (DatePicker) findViewById(R.id.diary_datePicker);
        Date = (CalendarView) findViewById(R.id.diary_calendarView);
        ButtonDiary = (ImageView) findViewById(R.id.BottomTag_diary);
        ButtonSocial = (ImageView) findViewById(R.id.BottomTag_social);
        ButtonAddDiary = (ImageView) findViewById(R.id.BottomTag_AddDiary);
        ButtonContacts = (ImageView) findViewById(R.id.BottomTag_Contacts);
        ButtonAccount = (ImageView) findViewById(R.id.BottomTag_Account);

        MessageList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(DiaryHistory.this, "This is Message List, coming soon", Toast.LENGTH_SHORT).show();
            }
        });
        Location.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(DiaryHistory.this, "This is Location, coming soon", Toast.LENGTH_SHORT).show();
            }
        });
        Icon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(DiaryHistory.this, "This is User Icon, coming soon", Toast.LENGTH_SHORT).show();
            }
        });
        Name.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(DiaryHistory.this, "This is User's name, coming soon", Toast.LENGTH_SHORT).show();
            }
        });
        SearchDiary.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(DiaryHistory.this, "This is Searching Diary function, coming soon", Toast.LENGTH_SHORT).show();
            }
        });
        ShowMonth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(DiaryHistory.this, "This is Showing Month function, coming soon", Toast.LENGTH_SHORT).show();
            }
        });
        Date.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(DiaryHistory.this, "This is Showing date function, coming soon", Toast.LENGTH_SHORT).show();
            }
        });
        ButtonDiary.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(DiaryHistory.this, "Jump to the DiaryHistory Page", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(DiaryHistory.this, DiaryHistory.class);
                startActivity(intent);
            }
        });
        ButtonSocial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Toast.makeText(DiaryHistory.this, "Jump to the Social Page", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(DiaryHistory.this, Social.class);
                startActivity(intent);
            }
        });
        ButtonAddDiary.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Toast.makeText(DiaryHistory.this, "Jump to the Add Diary Page", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(DiaryHistory.this, AddDiary.class);
                startActivity(intent);
            }
        });
        ButtonContacts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Toast.makeText(DiaryHistory.this, "Jump to the Contacts Page", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(DiaryHistory.this, Contacts.class);
                startActivity(intent);
            }
        });
        ButtonAccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Toast.makeText(DiaryHistory.this, "Jump to the Account Page", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(DiaryHistory.this, Account.class);
                startActivity(intent);
            }
        });




















    }
}
