/*
Search for files in a directory
 */
import java.io.File;
import java.util.Scanner;

public class DirectoryFileSearch {
    public void searchFile(String fileName, File file){
        File[] fileList = file.listFiles();
        if (fileList != null){
            for (File findFile: fileList){
                if (findFile.isDirectory())
                    searchFile(fileName, findFile);
                else if (fileName.equalsIgnoreCase(findFile.getName()))
                    System.out.println(findFile.getParentFile());
            }
        }
    }

    public static void main(String[] args) {

        DirectoryFileSearch directoryFileSearch = new DirectoryFileSearch();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the file to be searched  " );
        String fileName = sc.next();

        System.out.println("Enter the directory where to search  ");
        String directoryName = sc.next();

        directoryFileSearch.searchFile(fileName, new File(directoryName));
    }
}
