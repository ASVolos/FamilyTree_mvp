package FamilyTree.model.familyTree;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

public interface ItemFamilyTree<T> extends Serializable {

    String getName();
    String getSecondName();
    LocalDate getBirthDate();
    List<T> getFamilyMember(String name);
    void setId(long l);
}