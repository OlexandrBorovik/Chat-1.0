import java.io.*;
import java.lang.reflect.Field;

public class Serializator {

    public boolean serialition (Telo telo) throws IOException {

        boolean result = false;
        File file = new File ("D:/telo.txt");
        FileWriter fw = new FileWriter(file,true);



                final Class<?> cls = Telo.class;
                Field[] fields = cls.getDeclaredFields();
                for (Field fild: fields)
                   result = reflect(fild);
                  if(result){
                      fw.write("nhgng", true);

                  }


            }
        } catch (FileNotFoundException e) {
           e.printStackTrace();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }finally {
            if(oos!=null){
                try {
                    oos.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }

        return flag;
    }

    public boolean reflect (Field fild){

            if(fild.isAnnotationPresent(Save.class)) {
               return true;

            }
      return false;
    }
}

