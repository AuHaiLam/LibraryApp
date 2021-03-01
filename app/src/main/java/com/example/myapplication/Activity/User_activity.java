package com.example.myapplication.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.example.myapplication.Activity.Activity.AddUserActivity;
import com.example.myapplication.Activity.Activity.UserDetailsActivity;
import com.example.myapplication.R;
import com.example.myapplication.adapter.NguoiDungAdapter;
import com.example.myapplication.dao.NguoiDungDAO;
import com.example.myapplication.model.NguoiDung;

import java.util.ArrayList;
import java.util.List;

public class User_activity extends AppCompatActivity {
    public static List<NguoiDung> dsNguoiDung = new ArrayList<>();
    ListView lvNguoiDung;
    NguoiDungAdapter adapter = null;
    NguoiDungDAO nguoiDungDAO;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle("NGƯỜI DÙNG");
        setContentView(R.layout.activity_user_activity);

        lvNguoiDung = findViewById(R.id.lvUser);



        nguoiDungDAO = new NguoiDungDAO(User_activity.this);
        dsNguoiDung = nguoiDungDAO.getAllNguoiDung();
        adapter = new NguoiDungAdapter(this, dsNguoiDung);
        lvNguoiDung.setAdapter(adapter);
        lvNguoiDung.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(User_activity.this, UserDetailsActivity.class);
                Bundle b = new Bundle();
//                b.putString("USERNAME", dsNguoiDung.get(position).getUsername());
//                b.putString("PHONE", dsNguoiDung.get(position).getPhone());
//                b.putString("FULLNAME", dsNguoiDung.get(position).getFullname());
                intent.putExtras(b);
                startActivity(intent);
            }
        });
//        lvNguoiDung.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
//            @Override
//            public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {
//                return false;
//            }
//        });
    }

//    @Override
//    protected void onResume() {
//        super.onResume();
//        dsNguoiDung.clear();
//        dsNguoiDung = nguoiDungDAO.getAllNguoiDung();
//        adapter.changeDataset(nguoiDungDAO.getAllNguoiDung());
//    }



//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        getMenuInflater().inflate(R.menu.menu_user, menu);
//        return super.onCreateOptionsMenu(menu);
//    }
//
//    public void add(MenuItem item) {
//        Intent intent = new Intent(User_activity.this, AddUserActivity.class);
//        startActivity(intent);
//    }
}