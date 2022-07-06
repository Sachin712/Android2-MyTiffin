package com.example.android2_foodapp;

import android.app.Activity;
import android.os.Bundle;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.example.android2_foodapp.customerFoodPanel.CustomerCartFragment;
import com.example.android2_foodapp.customerFoodPanel.CustomerHomeFragment;
import com.example.android2_foodapp.customerFoodPanel.CustomerOrdersFragment;
import com.example.android2_foodapp.customerFoodPanel.CustomerProfileFragment;
import com.example.android2_foodapp.customerFoodPanel.CustomerTrackFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class CustomerFoodPanel_BottomNavigation extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener{

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_customer_food_panel_bottom_navigation);
        BottomNavigationView navigationView = findViewById(R.id.bottom_navigation);
        navigationView.setOnNavigationItemSelectedListener(this);
        String name=getIntent().getStringExtra("PAGE");
        FragmentManager fragmentManager= getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        if(name!=null){
            if(name.equalsIgnoreCase("Homepage")){
                loadcustomerfragment(new CustomerHomeFragment());
            }else if(name.equalsIgnoreCase("Preparingpage")){
                loadcustomerfragment(new CustomerTrackFragment());
            }else if(name.equalsIgnoreCase("DeliveryOrderpage")) {
                loadcustomerfragment(new CustomerTrackFragment());
            }else if(name.equalsIgnoreCase("Thankyoupage")){
                loadcustomerfragment(new CustomerHomeFragment());
            }
        }else{
            loadcustomerfragment(new CustomerHomeFragment());
        }
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        Fragment fragment = null;
        switch (item.getItemId()){
            case R.id.cust_home:
                fragment = new CustomerHomeFragment();
                break;
            case R.id.cart:
                fragment = new CustomerCartFragment();
                break;
            case R.id.cust_profile:
                fragment = new CustomerProfileFragment();
                break;
            case R.id.cust_order:
                fragment = new CustomerOrdersFragment();
                break;

        }
        return loadcustomerfragment(fragment);
    }

    private boolean loadcustomerfragment(Fragment fragment) {
        if(fragment != null){
            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, fragment).commit();
            return true;
        }
        return false;
    }
}
