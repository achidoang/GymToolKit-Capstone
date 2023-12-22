package com.dicoding.gymtoolkit;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R+\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068F@BX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR+\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u000e8F@BX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\b\u0014\u0010\r\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013\u00a8\u0006\u0015"}, d2 = {"Lcom/dicoding/gymtoolkit/MainViewModel;", "Landroidx/lifecycle/ViewModel;", "appEntryUseCases", "Lcom/dicoding/gymtoolkit/domain/usecases/app_entry/AppEntryUseCases;", "(Lcom/dicoding/gymtoolkit/domain/usecases/app_entry/AppEntryUseCases;)V", "<set-?>", "", "splashCondition", "getSplashCondition", "()Z", "setSplashCondition", "(Z)V", "splashCondition$delegate", "Landroidx/compose/runtime/MutableState;", "", "startDestination", "getStartDestination", "()Ljava/lang/String;", "setStartDestination", "(Ljava/lang/String;)V", "startDestination$delegate", "app_debug"})
@dagger.hilt.android.lifecycle.HiltViewModel
public final class MainViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull
    private final com.dicoding.gymtoolkit.domain.usecases.app_entry.AppEntryUseCases appEntryUseCases = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.compose.runtime.MutableState splashCondition$delegate = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.compose.runtime.MutableState startDestination$delegate = null;
    
    @javax.inject.Inject
    public MainViewModel(@org.jetbrains.annotations.NotNull
    com.dicoding.gymtoolkit.domain.usecases.app_entry.AppEntryUseCases appEntryUseCases) {
        super();
    }
    
    public final boolean getSplashCondition() {
        return false;
    }
    
    private final void setSplashCondition(boolean p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getStartDestination() {
        return null;
    }
    
    private final void setStartDestination(java.lang.String p0) {
    }
}