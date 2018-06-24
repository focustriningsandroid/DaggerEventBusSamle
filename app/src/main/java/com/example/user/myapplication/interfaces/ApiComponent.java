package com.example.user.myapplication.interfaces;


import com.example.user.myapplication.MainActivity;
import com.example.user.myapplication.module.AppModule;
import com.example.user.myapplication.module.BusProvider;
import com.example.user.myapplication.module.EmployeeProvider;
import com.example.user.myapplication.module.StudentProviders;

import dagger.Component;

@Component(modules = {AppModule.class, EmployeeProvider.class, EmployeeProvider.class})
public interface IEmloyeeComponent {

    void inject(MainActivity mainActivity);

}
