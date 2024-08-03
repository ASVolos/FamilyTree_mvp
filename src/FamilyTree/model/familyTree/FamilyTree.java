package FamilyTree.model.familyTree;

import FamilyTree.model.human.HumanComparatorByAge;
import FamilyTree.model.human.HumanComparatorByName;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class FamilyTree<E extends ItemFamilyTree<E>> implements Serializable, Iterable<E> {
    private long id;
    private List<E> familyMembers;

    public FamilyTree() {
        familyMembers = new ArrayList<>();
    }

    public List<E> getFamilyMember(String name) {
        List<E> matchingMembers = new ArrayList<>();
        for (E member : familyMembers) {
            if (member.getName().equals(name) || member.getSecondName().equals(name)) {
                matchingMembers.add((member) );
            }
        }
        return matchingMembers;
    }

    public void addMember(E human) {
        familyMembers.add((human));
        human.setId(id++);
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("family tree:\n");
        for (E familyMember : familyMembers) {
            stringBuilder.append(familyMember);
            stringBuilder.append("\n");
        }
        return stringBuilder.toString();
    }

    public void sortByName() {
        familyMembers.sort(new HumanComparatorByName<>());
    }

    public void sortByAge() {
        familyMembers.sort(new HumanComparatorByAge<>());
    }

    @Override
    public Iterator<E> iterator() {
        return familyMembers.iterator();
    }
}