package exercice2;

public class LinkedList {
    Node head; // le nœud principal de la liste chaînée

    static class Node {
        int data; // la donnée stockée dans le nœud
        Node next; // le pointeur vers le nœud suivant

        Node(int d) {
            data = d;
            next = null;
        }
    }

    // fonction pour supprimer les doublons
    void removeDuplicates() {
        Node current = head; // nœud actuel pour comparer
        while (current != null) {
            Node nextNode = current.next; // pointeur vers le nœud suivant
            // comparez les données du nœud actuel avec celles du nœud suivant
            while (nextNode != null && nextNode.data == current.data) {
                nextNode = nextNode.next;
            }
            current.next = nextNode; // supprimez les nœuds en double en mettant à jour les pointeurs
            current = nextNode;
        }
    }

    // fonction pour ajouter un nœud à la liste chaînée
    public void push(int newData) {
        Node newNode = new Node(newData);
        newNode.next = head;
        head = newNode;
    }

    // fonction pour afficher la liste chaînée
    void printList() {
        Node node = head;
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.push(60);
        list.push(43);
        list.push(43);
        list.push(21);
        list.push(11);
        list.push(11);
        list.push(11);

        System.out.println("Liste avant la suppression des doublons : ");
        list.printList();

        list.removeDuplicates();

        System.out.println("Liste après la suppression des doublons : ");
        list.printList();
    }
}
