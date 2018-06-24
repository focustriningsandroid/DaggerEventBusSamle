package android.trainings.focus.com.daggerandeventbusdemo.module;

import android.app.Application;
import android.trainings.focus.com.daggerandeventbusdemo.DaggerEventBusDemo;

import org.greenrobot.eventbus.EventBus;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class AppModule {
    private DaggerEventBusDemo application;

    private EventBus mBus;
    public AppModule(DaggerEventBusDemo application) {
        this.application = application;
    }

    @Provides
    public DaggerEventBusDemo provideAplication() {
        return this.application;
    }

    @Provides
    public EventBus provideEventBus(){
        return  mBus = EventBus.getDefault();
    }
}
