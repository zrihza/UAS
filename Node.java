package UAS;

class Node {
    int data;
    String name;
    Node left;
    Node right;

    public Node(int data, String name) {
        this.data = data;
        this.name = name;
        left = right = null;
    }
}