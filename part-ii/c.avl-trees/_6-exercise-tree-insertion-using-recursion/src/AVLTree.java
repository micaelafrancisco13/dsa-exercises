public class AVLTree {
    private static class AVLNode {
        private final int value;
        private AVLNode leftChild;
        private AVLNode rightChild;

        public AVLNode(int value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return "Value = " + this.value;
        }
    }

    private AVLNode root;

    public void insertUsingRecursion(int value) {
        var node = new AVLNode(value);
        if (root == null) {
            root = node;
        } else {
            var current = root;
            insertUsingRecursion(current, node);
        }
    }

    private void insertUsingRecursion(AVLNode current, AVLNode newNode) {
        if (newNode.value < current.value) {
            if (current.leftChild != null)
                insertUsingRecursion(current.leftChild, newNode);
            else current.leftChild = newNode;
        }
        else {
            if (current.rightChild != null)
                insertUsingRecursion(current.rightChild, newNode);
            else current.rightChild = newNode;
        }
    }
}
