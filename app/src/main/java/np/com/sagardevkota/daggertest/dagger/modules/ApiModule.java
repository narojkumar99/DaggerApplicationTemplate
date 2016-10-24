package np.com.sagardevkota.daggertest.dagger.modules;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import com.tealbox.app.networking.ApiInterface;
import retrofit2.Retrofit;

/**
 * Created by HP on 10/3/2016.
 */
@Module
public class ApiModule {
    @Provides
    @Singleton
    public ApiInterface providesApiInterface(Retrofit retrofit) {
        return retrofit.create(ApiInterface.class);
    }
}