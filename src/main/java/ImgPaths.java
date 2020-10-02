import org.sikuli.script.Pattern;


public class ImgPaths {

    //path de las imagenes falta mejorar
    private static final Pattern Img1 = new Pattern("C:\\Users\\Lucas\\Desktop\\Sikulitestv2.0\\src\\main\\resources\\ArchivoTxt.png");
    private static final Pattern Img2 = new Pattern("C:\\Users\\Lucas\\Desktop\\Sikulitestv2.0\\src\\main\\resources\\botonCerrar.png");
    private static final Pattern Img3 = new Pattern("C:\\Users\\Lucas\\Desktop\\Sikulitestv2.0\\src\\main\\resources\\botonGuardar.png");
    private static final Pattern img4 = new Pattern("C:\\Users\\Lucas\\Desktop\\Sikulitestv2.0\\src\\main\\resources\\botonMinimizar.png");
    private static final Pattern img5 = new Pattern("C:\\Users\\Lucas\\Desktop\\Sikulitestv2.0\\src\\main\\resources\\Screenshot_1.png");

    public static Pattern getImg1() {
        return Img1;
    }

    public static Pattern getImg2() {
        return Img2;
    }

    public static Pattern getImg3() {
        return Img3;
    }

    public static Pattern getImg4() {
        return img4;
    }

    public static Pattern getImg5() {
        return img5;
    }
}

