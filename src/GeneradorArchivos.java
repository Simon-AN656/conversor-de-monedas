import com.conversor.Conversor;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;

public class GeneradorArchivos {

    public void guardarJson(Conversor conversor) throws IOException {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        FileWriter escritura = new FileWriter(conversor.conversion_rate() + ".json");
        escritura.write(gson.toJson(conversor));
        escritura.close();
    }
}
