import org.sikuli.script.Screen;

import java.beans.PropertyEditor;
import java.util.logging.Level;
import java.util.logging.Logger;

//hereda de ImgPaths
public class Methods extends ImgPaths {
    //declara screen
    private Screen screen;

    //se le pasa un objeto de tipo Screen y se lo pasa al parametro screen
    public void Methods(Screen screen){
        this.screen = screen;
    }

    public void minimizarIntelliJ() throws Exception{
        try{
            //espera 3 segundos y hace click en la img4
            screen.wait(getImg4().similar((float)0.90),2).click();
        }catch(Exception e){
            Logger.getLogger(PropertyEditor.class.getName()).log(Level.SEVERE, null, e);
        }

    }

    public void abrirTxt() throws Exception {
        try {
            //espera 3 segundos y hace click en la img1
            screen.wait(getImg1().similar((float) 0.90), 2).doubleClick();
        } catch (Exception e) {
            Logger.getLogger(PropertyEditor.class.getName()).log(Level.SEVERE, null, e);
        }
    }

    public void escribirYCerrarTxt() throws Exception{
        try{
            screen.type("Esta es una prueba");
            screen.wait(getImg2(),2).click();
            screen.wait(getImg3(),2).click();
        }catch(Exception e){
            Logger.getLogger(PropertyEditor.class.getName()).log(Level.SEVERE, null, e);
        }
    }

}
