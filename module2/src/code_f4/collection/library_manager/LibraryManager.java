package code_f4.collection.library_manager;

import java.util.ArrayList;

public class LibraryManager {
    private final ArrayList<Document> documentArrayList;


    public LibraryManager (){
        this.documentArrayList = new ArrayList<Document>();
    }

    public void addDocument (Document document ) {
        this.documentArrayList.add(document);
    }

    public void displayDocument (){
        for (Document document : documentArrayList){
            System.out.println(document);
        }
    }

    public boolean deleteDocument (int id) {
        Document doc = this.documentArrayList.stream()
                .filter(document -> document.getIdDocument() == (id))
                .findFirst().orElse(null);
        if (doc == null) {
            System.out.println("Please check your id, It maybe wrong!!!");
            return false ;
        }
        this.documentArrayList.remove(doc);
        return true;
    }

    public void searchByBook (){
        this.documentArrayList.stream().filter(document -> document instanceof Book)
                .forEach(document -> System.out.println(document.toString()));
    }
    public void searchByNewspaper(){
        this.documentArrayList.stream().filter(document -> document instanceof Newspaper)
                .forEach(document -> System.out.println(document.toString()));
    }
    public void searchByJournal(){
        this.documentArrayList.stream().filter(document -> document instanceof Journal)
                .forEach(document -> System.out.println(document.toString()));
    }

}
