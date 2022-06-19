package com.example.valetparking;

import static android.content.ContentValues.TAG;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentValues;
import android.nfc.Tag;
import android.os.Bundle;
import android.util.Log;

import com.huawei.hms.maps.HuaweiMap;
import com.huawei.hms.maps.OnMapReadyCallback;
import com.huawei.hms.maps.SupportMapFragment;

public class MapActivity extends AppCompatActivity implements OnMapReadyCallback {

    private SupportMapFragment mSupportMapFragment;

    

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map);
        mSupportMapFragment = (SupportMapFragment) getSupportFragmentManager().findFragmentById(R.id.mapfragment_mapfragmentdemo);
        mSupportMapFragment.getMapAsync(this);

    }
    public void onMapReady(HuaweiMap huaweiMap) {
        Log.d(ContentValues.TAG, "onMapReady: ");
        HuaweiMap hMap = huaweiMap;
    }


}