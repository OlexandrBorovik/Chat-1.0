import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) {

Telo telo = new Telo();
telo.setAge(25);
        Serializator ser = new Serializator();


        final Class<?> cls = Telo.class;
        Field[] fields = cls.getDeclaredFields();
        for (Field fild: fields)
            if(fild.isAnnotationPresent(Save.class)) {
                ser.serialition(telo);
                Save st = (Save) fild.getAnnotation(Save.class);

                    }

                }
            }




