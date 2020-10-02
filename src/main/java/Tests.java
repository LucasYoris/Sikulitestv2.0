import org.junit.Before;
import org.junit.Test;
import org.sikuli.script.ImagePath;
import org.sikuli.script.Screen;


public class Tests extends Methods {
    private Screen screen;

    @Before
    public void setup() throws Exception{
        ImagePath.add(System.getProperty("user.dir"));
        screen = new Screen();
        Methods(screen);
        minimizarIntelliJ();
    }

    @Test
    public void abrirYCerrarArchivo() throws Exception{
        abrirTxt();
        escribirYCerrarTxt();
    }
}
