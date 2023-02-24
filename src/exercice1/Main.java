package exercice1;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Créez l'arbre binaire d'exemple donné dans la question.
	     Node root = new Node(26);
	     root.left = new Node(10);
	     root.right = new Node(3);
	     root.left.left = new Node(4);
	     root.left.right = new Node(6);
	     root.right.right = new Node(3);

	     // Vérifiez si l'arbre binaire est un SumTree ou non.
	     SumTree sumTree = new SumTree();
	     boolean isSumTree = sumTree.isSumTree(root);
	     
	     // Affichez le résultat.
	     System.out.println(isSumTree);

	}

}
