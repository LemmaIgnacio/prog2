public class WallpaperUniversal extends Wallpaper{
    public WallpaperUniversal(String titulo, int descargas, Usuario u, int anio){
        super(titulo,descargas,u,anio);
    }
    @Override
    public boolean contienePalabraClave(String s){
        return true;
    }
}
