package exercice1;

public class SumTree {
	
	 boolean isSumTree(Node node) {
	        if (node == null || (node.left == null && node.right == null)) {
	            // Si le nœud est null ou un nœud feuille, alors il est considéré comme SumTree.
	            return true;
	        }
	        
	        // Vérifiez si le nœud est un SumTree en fonction des valeurs des sous-arbres gauche et droit.
	        int left_sum = 0;
	        int right_sum = 0;
	        
	        if (node.left != null) {
	            left_sum = node.left.val;
	            if (node.left.left == null && node.left.right == null) {
	                left_sum = node.left.val;
	            } else {
	                left_sum = 2 * node.left.val;
	            }
	        }
	        
	        if (node.right != null) {
	            right_sum = node.right.val;
	            if (node.right.left == null && node.right.right == null) {
	                right_sum = node.right.val;
	            } else {
	                right_sum = 2 * node.right.val;
	            }
	        }
	        
	        if (node.val == left_sum + right_sum) {
	            return isSumTree(node.left) && isSumTree(node.right);
	        } else {
	            return false;
	        }
	    }

}
