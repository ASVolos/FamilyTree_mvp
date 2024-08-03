package FamilyTree;

import FamilyTree.model.familyTree.FamilyTree;
import FamilyTree.model.human.Gender;
import FamilyTree.model.human.Human;
import FamilyTree.view.ConsoleUI;
import FamilyTree.view.View;

import java.io.IOException;
import java.time.LocalDate;

import static FamilyTree.model.service.Service.readTree;
import static FamilyTree.model.service.Service.saveTree;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        View view = new ConsoleUI();
        view.start();
    }
}