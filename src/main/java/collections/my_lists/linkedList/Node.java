package collections.my_lists.linkedList;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Node {
    private Object element;
    private Node next;
}
