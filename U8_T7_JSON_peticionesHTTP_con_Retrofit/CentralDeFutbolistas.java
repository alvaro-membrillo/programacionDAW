package t7_JSON_peticionesHTTP_con_Retrofit;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

import java.util.List;

public interface CentralDeFutbolistas {

    @GET("https://my-json-server.typicode.com/chemaduran/futbolistas_api_demo/jugadores")
    Call<List<Futbolista>> listFutbolistas();

    @GET("https://my-json-server.typicode.com/chemaduran/futbolistas_api_demo/{futbolistaId}")
    Call<Futbolista> getFutbolistaId(@Path("futbolistaId") Integer futbolistaId);
}
