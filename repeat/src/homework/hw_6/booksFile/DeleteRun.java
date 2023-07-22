package homework.hw_6.booksFile;

import homework.hw_6.FileToString;

public class DeleteRun {
    public static void main(String[] args) {
        FileToString file = new FileToString();
        String str = String.valueOf(file.fileToString("WarAndPeace.txt"));

        SaveResultsInFile saveResultsInFile = new SaveResultsInFile();
        SearchInBook search = new SearchInBook();
        str = search.search(str);


        saveResultsInFile.saveResult("rus.txt", str);
        saveResultsInFile.saveResult("фыф.txt", "коыт = ц3");
    }
}
