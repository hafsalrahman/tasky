package com.hafsalrahman.tasky.di.module;

import com.hafsalrahman.tasky.signin.SignInContract;
import com.hafsalrahman.tasky.di.extra.CustomScope;

import dagger.Module;
import dagger.Provides;

/**
 * Created by hafsal on 7/23/17.
 */

@Module
public class SignInModule {

    private final SignInContract.View mView;


    public SignInModule(SignInContract.View mView) {
        this.mView = mView;
    }

    @Provides
    @CustomScope
    SignInContract.View providesSignInContractView() {
        return mView;
    }
}
