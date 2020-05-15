package t7_JSON_peticionesHTTP_con_Retrofit;

import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        /*Nos piden que mediante el JSON que se adjunta a esta actividad, modelar las
        * clases necesarias, modificando las que teniamos en los ejercicios anteriores
        * para realizar una petición Retrofit a la siguiente URL: https://my-json-server.typicode.com/chemaduran/futbolistas_api_demo
        * listFutbolistas: (baseUrl)+jugadores*/
        /*El ejercicio tiene que ser similar al del video que se adjunta, sacando el
        * objeto final con los jugadores rellenos en la petición HTTP*/

        Retrofit retrofit = new Retrofit.Builder().baseUrl("https://my-json-server.typicode.com/chemaduran/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        CentralDeFutbolistas service = retrofit.create(CentralDeFutbolistas.class);
        Futbolista futbolista = null;
        final Integer futbolistaId = 2;

        System.out.println("Obtenemos el listado completo de jugadores");

        try {
            Response<List<Futbolista>> response = service.listFutbolistas().execute();
            if (response.isSuccessful()) {
                List<Futbolista> futbolistas = response.body();
                System.out.println(futbolistas);
            } else {
                System.out.println("Petición no válida: "+response.message());
            }
        } catch(IOException e) {
            System.out.println("Error en la petición: "+e.getMessage());
        }

    }
}
