package FamilyTree.model.service;

import FamilyTree.model.familyTree.FamilyTree;
import FamilyTree.model.human.Gender;
import FamilyTree.model.human.Human;
import FamilyTree.model.writer.FileHandler;

import java.time.LocalDate;

public class Service {
    private FamilyTree familyMembers;

    public static void saveTree(FamilyTree<Human> familyTree) {
        FileHandler fileHandler = new FileHandler();
        fileHandler.serializeFamily(familyTree);
    }

    public static FamilyTree readTree() {
        FileHandler fileHandler = new FileHandler();
        return (FamilyTree) fileHandler.deserializeFamily();
    }

    public void addMember(String name, String secondName, LocalDate birthDate, LocalDate deathDate, Gender gender) {
        Human human = new Human(name, secondName, birthDate, deathDate, gender);
        familyMembers.addMember(human);
        saveTree(familyMembers);
    }

    public void sortByName() {
        familyMembers.sortByName();
    }

    public void sortByAge() {
        familyMembers.sortByAge();
    }
}
