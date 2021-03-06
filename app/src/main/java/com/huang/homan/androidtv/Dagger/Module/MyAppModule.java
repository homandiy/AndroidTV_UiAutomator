package com.huang.homan.androidtv.Dagger.Module;

import com.huang.homan.androidtv.Dagger.Scope.PerActivity;
import com.huang.homan.androidtv.View.Activity.MainActivity;

import dagger.Module;
import dagger.android.AndroidInjectionModule;
import dagger.android.ContributesAndroidInjector;

@Module(includes = {
        AndroidInjectionModule.class} )
public class MyAppModule {
    /**
     * Category for DB, API, Retrofit, etc.
     */
}
