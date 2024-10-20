import java.io.File;
import java.io.FileWriter;
import java.io.IOException;


public class Main {
    public static void main(String[] args) {
        File dirSrc = new File("D:\\Games\\src");
        File dirRes = new File("D:\\Games\\res");
        File dirSavegames = new File("D:\\Games\\savegames");
        File dirTemp = new File("D:\\Games\\temp");
        File dirSrcMain = new File("D:\\Games\\src\\main");
        File dirSrcTest = new File("D:\\Games\\src\\test");
        File dirResDrawables = new File("D:\\Games\\res\\drawables");
        File dirResVectors = new File("D:\\Games\\res\\vectors");
        File dirResIcons = new File("D:\\Games\\icons");
        File fileMainJava = new File(dirSrcMain, "main.java");
        File fileMainUtils = new File(dirSrcMain, "mainUtils.java");
        File fileTemp = new File(dirTemp, "temp.txt");
        StringBuilder temp = new StringBuilder();


        if (dirSrc.mkdir()) {
            temp.append("Создан каталог " + dirSrc.getAbsolutePath() + "\n");
        }
        if (dirRes.mkdir()) {
            temp.append("Создан каталог " + dirRes.getAbsolutePath() + "\n");
        }
        if (dirSavegames.mkdir()) {
            temp.append("Создан каталог " + dirSavegames.getAbsolutePath() + "\n");
        }
        if (dirTemp.mkdir()) {
            temp.append("Создан каталог " + dirTemp.getAbsolutePath() + "\n");
        }
        if (dirSrcMain.mkdir()) {
            temp.append("Создан каталог " + dirSrcMain.getAbsolutePath() + "\n");
        }
        if (dirSrcTest.mkdir()) {
            temp.append("Создан каталог " + dirSrcTest.getAbsolutePath() + "\n");
        }
        if (dirResDrawables.mkdir()) {
            temp.append("Создан каталог " + dirResDrawables.getAbsolutePath() + "\n");
        }
        if (dirResVectors.mkdir()) {
            temp.append("Создан каталог " + dirResVectors.getAbsolutePath() + "\n");
        }
        if (dirResIcons.mkdir()) {
            temp.append("Создан каталог " + dirResIcons.getAbsolutePath() + "\n");
        }
        try {
            if (fileMainJava.createNewFile()) {
                System.out.println("Файл main создан");
                temp.append("Создан файл main\n");
            }
            if (fileMainUtils.createNewFile()) {
                System.out.println("Файл utils создан");
                temp.append("Создан файл utils\n");
            }
            if (fileTemp.createNewFile()) {
                System.out.println("Файл temp создан");
                temp.append("Создан файл temp\n");
            }
            FileWriter tempTXT = new FileWriter(fileTemp,false);
            tempTXT.write(temp.toString());
            tempTXT.write("\n");
            tempTXT.write("!");
            tempTXT.flush();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }


        System.out.println(temp);


    }
}